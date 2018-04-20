package com.microsoft.bingads.v12.reporting;

import com.microsoft.bingads.AsyncCallback;
import com.microsoft.bingads.internal.OperationStatusRetry;
import com.microsoft.bingads.internal.ParentCallback;
import com.microsoft.bingads.ServiceClient;
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
/**
 * Track the status of reporting operation.
 */
public class ReportingOperationTracker{
	
    private static final int INITIAL_STATUS_CHECK_INTERVAL_IN_MS = 1000;
    private static final int NUMBER_OF_INITIAL_STATUS_CHECKS = 5;
    
    private int numberOfStatusChecks = 0;
    private ScheduledExecutorService executorService;
    private ReportingStatusProvider statusProvider;
    private boolean stopTracking;
    protected int lastProgressReported;
    private ReportingOperationStatus currentStatus;
    private final int statusCheckIntervalInMs;

    private ResultFuture<ReportingOperationStatus> trackResultFuture;

    private ServiceClient<IReportingService> serviceClient;
    
    private OperationStatusRetry<ReportingOperationStatus, ReportingStatusProvider, IReportingService> operationStatusRetry;
    private int numberOfStatusRetry = 3;

    private final Runnable pollExecutorTask = new Runnable() {
        @Override
        public void run() {
            pollOperationStatus();
        }
    };

    public ReportingOperationTracker(
    		ReportingStatusProvider statusProvider,
            ServiceClient<IReportingService> serviceClient,
            int statusCheckIntervalInMs) {

        this.statusCheckIntervalInMs = statusCheckIntervalInMs;
        this.statusProvider = statusProvider;
        this.serviceClient = serviceClient;
        this.operationStatusRetry = new OperationStatusRetry<ReportingOperationStatus, ReportingStatusProvider, IReportingService>();
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

            refreshStatus(new AsyncCallback<ReportingOperationStatus>() {
                @Override
                public void onCompleted(Future<ReportingOperationStatus> result) {
                    try {
                        result.get();

                        numberOfStatusChecks++;


                        completeTaskIfOperationIsComplete();
                    } catch (InterruptedException ex) {
                        stopTracking();

                        propagateExceptionToCallingThread(new CouldNotGetReportingDownloadStatusException(ex));
                    } catch (ExecutionException ex) {
                        stopTracking();
                        
                        propagateExceptionToCallingThread(new CouldNotGetReportingDownloadStatusException(ex));
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

    private void refreshStatus(AsyncCallback<ReportingOperationStatus> callback) {
        final ResultFuture<ReportingOperationStatus> resultFuture = new ResultFuture<ReportingOperationStatus>(callback);
        
        operationStatusRetry.executeWithRetry(
        	new TriConsumer<ReportingStatusProvider, ServiceClient<IReportingService>, AsyncCallback<ReportingOperationStatus>>() {
                @Override
                public void accept(ReportingStatusProvider statusProvider, ServiceClient<IReportingService> serviceClient, 
                		AsyncCallback<ReportingOperationStatus> callback) {
                    statusProvider.getCurrentStatus(serviceClient, callback);
                }
            },
        	statusProvider,
        	serviceClient,
    		new Consumer<ReportingOperationStatus>() {
    			@Override
    			public void accept(ReportingOperationStatus status) {
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
    
    public Future<ReportingOperationStatus> trackResultFileAsync(AsyncCallback<ReportingOperationStatus> callback) {
        this.trackResultFuture = new ResultFuture<ReportingOperationStatus>(callback);

        this.startTracking();

        return trackResultFuture;
    }

    private void startTracking() {
        executorService = Executors.newSingleThreadScheduledExecutor();
        
        executorService.schedule(pollExecutorTask, INITIAL_STATUS_CHECK_INTERVAL_IN_MS, TimeUnit.MILLISECONDS);
    }
}
