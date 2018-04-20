package com.microsoft.bingads.v12.internal.bulk;

import com.microsoft.bingads.AsyncCallback;
import com.microsoft.bingads.v12.bulk.BulkOperationStatus;
import java.util.concurrent.Future;

public interface BulkOperationTracker<TStatus> {

    Future<BulkOperationStatus<TStatus>> trackResultFileAsync(AsyncCallback<BulkOperationStatus<TStatus>> callback);
}
