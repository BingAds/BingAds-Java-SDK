package com.microsoft.bingads.internal.bulk.operations;

import java.util.concurrent.Future;

import com.microsoft.bingads.AsyncCallback;
import com.microsoft.bingads.ServiceClient;
import com.microsoft.bingads.bulk.BulkOperationStatus;
import com.microsoft.bingads.bulk.IBulkService;

public interface BulkOperationStatusProvider<TStatus> {

    public Future<BulkOperationStatus<TStatus>> getCurrentStatus(ServiceClient<IBulkService> serviceClient, AsyncCallback<BulkOperationStatus<TStatus>> callback);

    public boolean isFinalStatus(BulkOperationStatus<TStatus> currentStatus);
}
