package com.microsoft.bingads.internal.bulk.operations;

import java.util.concurrent.Future;

import com.microsoft.bingads.ServiceClient;
import com.microsoft.bingads.bulk.BulkOperationProgressInfo;
import com.microsoft.bingads.bulk.BulkOperationStatus;
import com.microsoft.bingads.bulk.IBulkService;
import com.microsoft.bingads.bulk.Progress;
import com.microsoft.bingads.internal.ResponseFuture;
import com.microsoft.bingads.AsyncCallback;
import com.microsoft.bingads.ParentCallback;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class PollingBulkOperationTracker<TStatus> implements BulkOperationTracker<TStatus> {

    private static final int DEFAULT_STATUS_CHECK_INTERVAL_IN_MS = 1000;
    private static final int FIRST_TIME_STATUS_CHECK_INTERVAL_IN_MS = 0;
    private ScheduledExecutorService executorService;
    private BulkOperationStatusProvider<TStatus> statusProvider;
    private Progress<BulkOperationProgressInfo> progress;
    private boolean stopTracking;
    protected int lastProgressReported;
    private BulkOperationStatus<TStatus> currentStatus;
    private Integer statusCheckIntervalInMs;

    private ResponseFuture<BulkOperationStatus<TStatus>> trackResponseFuture;

    private ServiceClient<IBulkService> serviceClient;

    private final Runnable pollExecutorTask = new Runnable() {
        @Override
        public void run() {
            pollOperationStatus();
        }
    };

    public PollingBulkOperationTracker(BulkOperationStatusProvider<TStatus> statusProvider, ServiceClient<IBulkService> serviceClient, Progress<BulkOperationProgressInfo> progress) {
        this(statusProvider, serviceClient, progress, DEFAULT_STATUS_CHECK_INTERVAL_IN_MS);
    }

    public PollingBulkOperationTracker(
            BulkOperationStatusProvider<TStatus> statusProvider,
            ServiceClient<IBulkService> serviceClient,
            Progress<BulkOperationProgressInfo> progress,
            Integer statusCheckIntervalInMs) {

        this.statusCheckIntervalInMs = statusCheckIntervalInMs;
        this.statusProvider = statusProvider;
        this.serviceClient = serviceClient;
        this.progress = progress;
    }

    AtomicBoolean statusUpdateInProgress = new AtomicBoolean(false);

    public void pollOperationStatus() {
        try {
            if (!statusUpdateInProgress.compareAndSet(false, true)) {
                return;
            }

            if (trackingWasStopped()) {
                return;
            }

            if (cancelPollingIfRequestedByUser()) {
                return;
            }

            refreshStatus(new AsyncCallback<BulkOperationStatus<TStatus>>() {
                @Override
                public void onCompleted(Future<BulkOperationStatus<TStatus>> result) {
                    try {
                        result.get();

                        reportProgressIfNeeded();

                        completeTaskIfOperationIsComplete();
                    } catch (Throwable ex) {
                        stopTracking();

                        propagateExceptionToCallingThread(ex);
                    } finally {
                        statusUpdateInProgress.set(false);
                    }
                }
            });
        } catch (Throwable ex) {
            stopTracking();

            propagateExceptionToCallingThread(ex);
        }
    }

    private boolean cancelPollingIfRequestedByUser() {
        if (trackResponseFuture.isCancelled()) {
            stopTracking();

            return true;
        }
        return false;
    }

    private void reportProgressIfNeeded() {
        if (!userRequestedProgressReports()) {
            return;
        }

        if (progressChangedSinceLastReport()) {
            reportProgress();
        }
    }

    private void reportProgress() {
        progress.report(new BulkOperationProgressInfo(currentStatus.getPercentComplete()));
        updateLastProgressReported();
    }

    private boolean userRequestedProgressReports() {
        return this.progress != null;
    }

    private boolean progressChangedSinceLastReport() {
        return currentStatus.getPercentComplete() != lastProgressReported;
    }

    private void updateLastProgressReported() {
        this.lastProgressReported = currentStatus.getPercentComplete();
    }

    private void propagateExceptionToCallingThread(Throwable ex) {
        trackResponseFuture.setException(ex);
    }

    private void completeTaskIfOperationIsComplete() {
        if (operationIsComplete()) {
            stopTracking();
            completeTaskWithResult();
        }
    }

    private void completeTaskWithResult() {
        trackResponseFuture.setResult(currentStatus);
    }

    private boolean operationIsComplete() {
        return statusProvider.isFinalStatus(currentStatus);
    }

    private void refreshStatus(AsyncCallback<BulkOperationStatus<TStatus>> callback) {
        final ResponseFuture<BulkOperationStatus<TStatus>> responseFuture = new ResponseFuture<BulkOperationStatus<TStatus>>(callback);

        statusProvider.getCurrentStatus(this.serviceClient, new ParentCallback<BulkOperationStatus<TStatus>>(responseFuture) {
            @Override
            public void onSuccess(BulkOperationStatus<TStatus> result) {
                currentStatus = result;

                responseFuture.setResult(currentStatus);
            }
        });
    }

    private boolean trackingWasStopped() {
        return this.stopTracking;
    }

    private void stopTracking() {
        this.stopTracking = true;

        this.executorService.shutdown();
    }

    /* (non-Javadoc)
     * @see com.microsoft.bingads.api.internal.bulk.operations.BulkOperationTracker#trackResultFileAsync()
     */
    @Override
    public Future<BulkOperationStatus<TStatus>> trackResultFileAsync(AsyncCallback<BulkOperationStatus<TStatus>> callback) {
        this.trackResponseFuture = new ResponseFuture<BulkOperationStatus<TStatus>>(callback);

        this.startTracking();

        return trackResponseFuture;
    }

    private void startTracking() {
        executorService = Executors.newSingleThreadScheduledExecutor();
        
        executorService.scheduleAtFixedRate(pollExecutorTask, FIRST_TIME_STATUS_CHECK_INTERVAL_IN_MS, this.statusCheckIntervalInMs, TimeUnit.MILLISECONDS);
    }
}
