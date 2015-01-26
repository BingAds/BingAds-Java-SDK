package com.microsoft.bingads.internal.bulk;

import com.microsoft.bingads.AsyncCallback;
import com.microsoft.bingads.ParentCallback;
import com.microsoft.bingads.ServiceClient;
import com.microsoft.bingads.bulk.BulkOperationProgressInfo;
import com.microsoft.bingads.bulk.BulkOperationStatus;
import com.microsoft.bingads.bulk.IBulkService;
import com.microsoft.bingads.bulk.Progress;
import com.microsoft.bingads.internal.ResultFuture;
import com.microsoft.bingads.internal.utilities.ThreadPool;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class PollingBulkOperationTracker<TStatus> implements BulkOperationTracker<TStatus> {
    
    private static final int FIRST_TIME_STATUS_CHECK_INTERVAL_IN_MS = 0;
    private ScheduledExecutorService executorService;
    private BulkOperationStatusProvider<TStatus> statusProvider;
    private Progress<BulkOperationProgressInfo> progress;
    private boolean stopTracking;
    protected int lastProgressReported;
    private BulkOperationStatus<TStatus> currentStatus;
    private final int statusCheckIntervalInMs;

    private ResultFuture<BulkOperationStatus<TStatus>> trackResultFuture;

    private ServiceClient<IBulkService> serviceClient;

    private final Runnable pollExecutorTask = new Runnable() {
        @Override
        public void run() {
            pollOperationStatus();
        }
    };

    public PollingBulkOperationTracker(
            BulkOperationStatusProvider<TStatus> statusProvider,
            ServiceClient<IBulkService> serviceClient,
            Progress<BulkOperationProgressInfo> progress,
            int statusCheckIntervalInMs) {

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
                    } catch (InterruptedException ex) {
                        stopTracking();

                        propagateExceptionToCallingThread(ex);
                    } catch (ExecutionException ex) {
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
        if (trackResultFuture.isCancelled()) {
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
        ThreadPool.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    progress.report(new BulkOperationProgressInfo(currentStatus.getPercentComplete()));
                
                    updateLastProgressReported();
                } catch (Exception ex) {
                    // ignore exceptions from progress update thread
                }
            }
        });       
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
        trackResultFuture.setException(ex);
    }

    private void completeTaskIfOperationIsComplete() {
        if (operationIsComplete()) {
            stopTracking();
            completeTaskWithResult();
        }
    }

    private void completeTaskWithResult() {
        trackResultFuture.setResult(currentStatus);
    }

    private boolean operationIsComplete() {
        return statusProvider.isFinalStatus(currentStatus);
    }

    private void refreshStatus(AsyncCallback<BulkOperationStatus<TStatus>> callback) {
        final ResultFuture<BulkOperationStatus<TStatus>> resultFuture = new ResultFuture<BulkOperationStatus<TStatus>>(callback);

        statusProvider.getCurrentStatus(this.serviceClient, new ParentCallback<BulkOperationStatus<TStatus>>(resultFuture) {
            @Override
            public void onSuccess(BulkOperationStatus<TStatus> result) {
                currentStatus = result;

                resultFuture.setResult(currentStatus);
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
        this.trackResultFuture = new ResultFuture<BulkOperationStatus<TStatus>>(callback);

        this.startTracking();

        return trackResultFuture;
    }

    private void startTracking() {
        executorService = Executors.newSingleThreadScheduledExecutor();
        
        executorService.scheduleAtFixedRate(pollExecutorTask, FIRST_TIME_STATUS_CHECK_INTERVAL_IN_MS, this.statusCheckIntervalInMs, TimeUnit.MILLISECONDS);
    }
}
