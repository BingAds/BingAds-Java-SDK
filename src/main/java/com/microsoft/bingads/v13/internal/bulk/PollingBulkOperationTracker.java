package com.microsoft.bingads.v13.internal.bulk;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;

import com.microsoft.bingads.AsyncCallback;
import com.microsoft.bingads.internal.OperationStatusRetry;
import com.microsoft.bingads.internal.ResultFuture;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Consumer;
import com.microsoft.bingads.internal.utilities.ThreadPool;
import com.microsoft.bingads.v13.bulk.AdApiFaultDetail_Exception;
import com.microsoft.bingads.v13.bulk.BulkOperationProgressInfo;
import com.microsoft.bingads.v13.bulk.BulkOperationStatus;
import com.microsoft.bingads.v13.bulk.CouldNotGetBulkOperationStatusException;
import com.microsoft.bingads.v13.bulk.IBulkService;
import com.microsoft.bingads.v13.bulk.Progress;

public class PollingBulkOperationTracker<TStatus> implements BulkOperationTracker<TStatus> {

    private static final int INITIAL_STATUS_CHECK_INTERVAL_IN_MS = 1000;
    private static final int NUMBER_OF_INITIAL_STATUS_CHECKS = 5;
    private int numberOfStatusChecks = 0;
    private ScheduledExecutorService executorService;
    private BulkOperationStatusProvider<TStatus> statusProvider;
    private Progress<BulkOperationProgressInfo> progress;
    private boolean stopTracking;
    protected int lastProgressReported;
    private BulkOperationStatus<TStatus> currentStatus;

    private ResultFuture<BulkOperationStatus<TStatus>> trackResultFuture;

    private OperationStatusRetry<BulkOperationStatus<TStatus>, BulkOperationStatusProvider<TStatus>, IBulkService> operationStatusRetry;
    private int numberOfStatusRetry = 4;

    private final Runnable pollExecutorTask = new Runnable() {
        @Override
        public void run() {
            pollOperationStatus();
        }
    };

    public PollingBulkOperationTracker(
            BulkOperationStatusProvider<TStatus> statusProvider,
            Progress<BulkOperationProgressInfo> progress) {

        this.statusProvider = statusProvider;
        this.progress = progress;
        this.operationStatusRetry = new OperationStatusRetry<BulkOperationStatus<TStatus>, BulkOperationStatusProvider<TStatus>, IBulkService>(
                new Function<Exception, Integer>() {

                    @Override
                    public Integer apply(Exception exception) {

                        Throwable cause = exception.getCause();
                        int errorCode = -1;
                        try {
                            errorCode = ((AdApiFaultDetail_Exception) cause).getFaultInfo().getErrors().getAdApiErrors()
                                    .get(0).getCode();
                        } catch (Exception e) {
                            // Ignore
                        }

                        return errorCode;
                    }

                });
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

                        numberOfStatusChecks++;

                        reportProgressIfNeeded();

                        completeTaskIfOperationIsComplete();
                    } catch (InterruptedException ex) {
                        stopTracking();

                        propagateExceptionToCallingThread(new CouldNotGetBulkOperationStatusException(ex));
                    } catch (ExecutionException ex) {
                        stopTracking();

                        propagateExceptionToCallingThread(new CouldNotGetBulkOperationStatusException(ex));
                    } finally {
                        statusUpdateInProgress.set(false);

                        if (!stopTracking) {
                            int interval = INITIAL_STATUS_CHECK_INTERVAL_IN_MS;

                            if (numberOfStatusChecks >= NUMBER_OF_INITIAL_STATUS_CHECKS) {
                                interval = statusProvider.getStatusPollIntervalInMilliseconds();
                            }

                            executorService.schedule(pollExecutorTask, interval, TimeUnit.MILLISECONDS);
                        }
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
        final int percentage = currentStatus.getPercentComplete();
        ThreadPool.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    progress.report(new BulkOperationProgressInfo(percentage));

                    updateLastProgressReported(percentage);
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

    private void updateLastProgressReported(int per) {
        this.lastProgressReported = per;
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
        final ResultFuture<BulkOperationStatus<TStatus>> resultFuture = new ResultFuture<BulkOperationStatus<TStatus>>(
                callback);

        operationStatusRetry.executeWithRetry(
                new BiConsumer<BulkOperationStatusProvider<TStatus>, AsyncCallback<BulkOperationStatus<TStatus>>>() {
                    @Override
                    public void accept(
                            BulkOperationStatusProvider<TStatus> statusProvider,
                            AsyncCallback<BulkOperationStatus<TStatus>> callback) {
                        statusProvider.getCurrentStatus(callback);
                    }
                }, statusProvider, new Consumer<BulkOperationStatus<TStatus>>() {
                    @Override
                    public void accept(BulkOperationStatus<TStatus> status) {
                        currentStatus = status;

                        resultFuture.setResult(currentStatus);
                    }
                }, new Consumer<Exception>() {
                    @Override
                    public void accept(Exception exception) {
                        resultFuture.setException(exception);
                    }
                }, numberOfStatusRetry);
    }

    private boolean trackingWasStopped() {
        return this.stopTracking;
    }

    private void stopTracking() {
        this.stopTracking = true;

        this.executorService.shutdown();
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.microsoft.bingads.api.internal.bulk.operations.BulkOperationTracker#
     * trackResultFileAsync()
     */
    @Override
    public Future<BulkOperationStatus<TStatus>> trackResultFileAsync(
            AsyncCallback<BulkOperationStatus<TStatus>> callback) {
        this.trackResultFuture = new ResultFuture<BulkOperationStatus<TStatus>>(callback);

        this.startTracking();

        return trackResultFuture;
    }

    private void startTracking() {
        executorService = Executors.newSingleThreadScheduledExecutor();

        executorService.schedule(pollExecutorTask, INITIAL_STATUS_CHECK_INTERVAL_IN_MS, TimeUnit.MILLISECONDS);
    }
}
