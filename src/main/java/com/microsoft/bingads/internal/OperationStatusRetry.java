package com.microsoft.bingads.internal;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import com.microsoft.bingads.AsyncCallback;
import com.microsoft.bingads.ServiceClient;
import com.microsoft.bingads.internal.functionalinterfaces.Consumer;
import com.microsoft.bingads.internal.functionalinterfaces.TriConsumer;

public class OperationStatusRetry<TOperationStatus, TOperationStatusProvider, TService> {
    private static final int INTERVAL_OF_RETRY = 1000; // TimeUnit Milliseconds

    private static final int[] INTERVAL_OF_RETRY_RATE_LIMIT = { 15000, 20000, 25000, 30000 }; // TimeUnit

    private static final int RATELIMIT_CODE = 117;

    private ScheduledExecutorService executor;

    private Function<Exception, Integer> errorCodeFunc;

    public OperationStatusRetry(Function<Exception, Integer> f) {
        errorCodeFunc = f;
    }

    public void executeWithRetry(
            final TriConsumer<TOperationStatusProvider, ServiceClient<TService>, AsyncCallback<TOperationStatus>> action,
            final TOperationStatusProvider statusProvider, final ServiceClient<TService> serviceClient,
            final Consumer<TOperationStatus> statusConsumer, final Consumer<Exception> exceptionConsumer,
            final int maxRetryCount) {
        executor = Executors.newSingleThreadScheduledExecutor();
        doPollOperationStatus(action, statusProvider, serviceClient, statusConsumer, exceptionConsumer, maxRetryCount);
    }

    private void doPollOperationStatus(
            final TriConsumer<TOperationStatusProvider, ServiceClient<TService>, AsyncCallback<TOperationStatus>> action,
            final TOperationStatusProvider statusProvider, final ServiceClient<TService> serviceClient,
            final Consumer<TOperationStatus> statusConsumer, final Consumer<Exception> exceptionConsumer,
            final int maxRetryCount) {
        action.accept(statusProvider, serviceClient, new AsyncCallback<TOperationStatus>() {

            @Override
            public void onCompleted(Future<TOperationStatus> result) {
                try {
                    statusConsumer.accept(result.get());
                    executor.shutdown();
                } catch (InterruptedException exception) {
                    retryWhenException(action, statusProvider, serviceClient, statusConsumer, exceptionConsumer,
                            maxRetryCount, exception);
                } catch (ExecutionException exception) {
                    retryWhenException(action, statusProvider, serviceClient, statusConsumer, exceptionConsumer,
                            maxRetryCount, exception);
                }
            }

            private void retryWhenException(
                    final TriConsumer<TOperationStatusProvider, ServiceClient<TService>, AsyncCallback<TOperationStatus>> action,
                    final TOperationStatusProvider statusProvider, final ServiceClient<TService> serviceClient,
                    final Consumer<TOperationStatus> statusConsumer, final Consumer<Exception> exceptionConsumer,
                    final int maxRetryCount, Exception exception) {
                if (maxRetryCount > 0) {
                    retry(action, statusProvider, serviceClient, statusConsumer, exceptionConsumer, maxRetryCount - 1,
                            exception);
                } else {
                    executor.shutdown();
                    exceptionConsumer.accept(exception);
                }
            }
        });
    }

    private void retry(
            final TriConsumer<TOperationStatusProvider, ServiceClient<TService>, AsyncCallback<TOperationStatus>> action,
            final TOperationStatusProvider statusProvider, final ServiceClient<TService> serviceClient,
            final Consumer<TOperationStatus> statusConsumer, final Consumer<Exception> exceptionConsumer,
            final int maxRetryCount, Exception exception) {
        int interval = getInterval(exception, maxRetryCount);
        executor.schedule(new Runnable() {
            @Override
            public void run() {
                doPollOperationStatus(action, statusProvider, serviceClient, statusConsumer, exceptionConsumer,
                        maxRetryCount);
            }
        }, interval, TimeUnit.MILLISECONDS);

    }

    private int getInterval(Exception exception, int maxRetryCount) {
        int errorCode  = errorCodeFunc.apply(exception);
        if (errorCode == RATELIMIT_CODE) {
            return INTERVAL_OF_RETRY_RATE_LIMIT[INTERVAL_OF_RETRY_RATE_LIMIT.length - 1 - maxRetryCount];
        } else {
            return INTERVAL_OF_RETRY;
        }
    }

}
