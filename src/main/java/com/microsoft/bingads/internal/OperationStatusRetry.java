package com.microsoft.bingads.internal;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import com.microsoft.bingads.AsyncCallback;
import com.microsoft.bingads.ServiceClient;
import com.microsoft.bingads.internal.functionalinterfaces.Consumer;
import com.microsoft.bingads.internal.functionalinterfaces.TriConsumer;

public class OperationStatusRetry<TOperationStatus, TOperationStatusProvider, TService> {

	private final int INTERVAL_OF_RETRY = 1000; // TimeUnit Milliseconds

	public void executeWithRetry(
			final TriConsumer<TOperationStatusProvider, ServiceClient<TService>, AsyncCallback<TOperationStatus>> action,
			final TOperationStatusProvider statusProvider, final ServiceClient<TService> serviceClient,
			final Consumer<TOperationStatus> statusConsumer, final Consumer<Exception> exceptionConsumer,
			final int maxRetryCount) {
		action.accept(statusProvider, serviceClient, new AsyncCallback<TOperationStatus>() {

			@Override
			public void onCompleted(Future<TOperationStatus> result) {
				try {
					statusConsumer.accept(result.get());
				} catch (InterruptedException exception) {
					if (maxRetryCount > 0) {						
						retry(action, statusProvider, serviceClient, statusConsumer,exceptionConsumer, maxRetryCount - 1);							
					} else {
						exceptionConsumer.accept(exception);
					}
				} catch (ExecutionException exception) {
					if (maxRetryCount > 0) {
						retry(action, statusProvider, serviceClient, statusConsumer,exceptionConsumer, maxRetryCount - 1);
					} else {
						exceptionConsumer.accept(exception);
					}
				}
			}
		});
	}
	
	private void retry(final TriConsumer<TOperationStatusProvider, ServiceClient<TService>, AsyncCallback<TOperationStatus>> action,
			final TOperationStatusProvider statusProvider, final ServiceClient<TService> serviceClient,
			final Consumer<TOperationStatus> statusConsumer, final Consumer<Exception> exceptionConsumer,
			final int maxRetryCount) {
		
			ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();

			executor.schedule(new Runnable() {
				@Override
				public void run() {
					executeWithRetry(action, statusProvider, serviceClient, statusConsumer,
							exceptionConsumer, maxRetryCount - 1);
				}
			}, INTERVAL_OF_RETRY, TimeUnit.MILLISECONDS);
		
	}
	
}
