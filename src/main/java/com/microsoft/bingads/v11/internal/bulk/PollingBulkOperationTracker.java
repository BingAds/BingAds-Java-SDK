package com.microsoft.bingads.v11.internal.bulk;

import com.microsoft.bingads.AsyncCallback;
import com.microsoft.bingads.internal.OperationStatusRetry;
import com.microsoft.bingads.internal.ParentCallback;
import com.microsoft.bingads.ServiceClient;
import com.microsoft.bingads.v11.bulk.CouldNotGetBulkOperationStatusException;
import com.microsoft.bingads.v11.bulk.BulkOperationProgressInfo;
import com.microsoft.bingads.v11.bulk.BulkOperationStatus;
import com.microsoft.bingads.v11.bulk.IBulkService;
import com.microsoft.bingads.v11.bulk.Progress;
import com.microsoft.bingads.internal.ResultFuture;
import com.microsoft.bingads.internal.functionalinterfaces.Consumer;
import com.microsoft.bingads.internal.functionalinterfaces.TriConsumer;
import com.microsoft.bingads.internal.utilities.ThreadPool;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

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
    private final int statusCheckIntervalInMs;

    private ResultFuture<BulkOperationStatus<TStatus>> trackResultFuture;

    private ServiceClient<IBulkService> serviceClient;
    
    private OperationStatusRetry<BulkOperationStatus<TStatus>, BulkOperationStatusProvider<TStatus>, IBulkService> operationStatusRetry;
    private int numberOfStatusRetry = 3;

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
        this.operationStatusRetry = new OperationStatusRetry<BulkOperationStatus<TStatus>, BulkOperationStatusProvider<TStatus>, IBulkService>();
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
                                interval = statusCheckIntervalInMs;
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
        
		operationStatusRetry.executeWithRetry(
			new TriConsumer<BulkOperationStatusProvider<TStatus>, ServiceClient<IBulkService>, AsyncCallback<BulkOperationStatus<TStatus>>>() {
				@Override
				public void accept(BulkOperationStatusProvider<TStatus> statusProvider,
						ServiceClient<IBulkService> serviceClient,
						AsyncCallback<BulkOperationStatus<TStatus>> callback) {
					statusProvider.getCurrentStatus(serviceClient, callback);
				}
			}, 
			statusProvider,
			serviceClient,
			new Consumer<BulkOperationStatus<TStatus>>() {
				@Override
				public void accept(BulkOperationStatus<TStatus> status) {
					currentStatus = status;

					resultFuture.setResult(currentStatus);
				}
			}, 
			new Consumer<Exception>() {
				@Override
				public void accept(Exception exception) {
					resultFuture.setException(exception);
				}
			}, 
			numberOfStatusRetry
		);
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
        
        executorService.schedule(pollExecutorTask, INITIAL_STATUS_CHECK_INTERVAL_IN_MS, TimeUnit.MILLISECONDS);
    }
}
