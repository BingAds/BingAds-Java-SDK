package com.microsoft.bingads.v11.internal.bulk;

import com.microsoft.bingads.AsyncCallback;
import com.microsoft.bingads.ServiceClient;
import com.microsoft.bingads.v11.bulk.BulkOperationStatus;
import com.microsoft.bingads.v11.bulk.IBulkService;
import java.util.concurrent.Future;

public interface BulkOperationStatusProvider<TStatus> {

    Future<BulkOperationStatus<TStatus>> getCurrentStatus(ServiceClient<IBulkService> serviceClient, AsyncCallback<BulkOperationStatus<TStatus>> callback);

    boolean isFinalStatus(BulkOperationStatus<TStatus> currentStatus);

    boolean isSuccessStatus(TStatus status);
}
