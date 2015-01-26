package com.microsoft.bingads.internal.bulk;

import com.microsoft.bingads.AsyncCallback;
import com.microsoft.bingads.bulk.BulkOperationStatus;
import java.util.concurrent.Future;

public interface BulkOperationTracker<TStatus> {

    Future<BulkOperationStatus<TStatus>> trackResultFileAsync(AsyncCallback<BulkOperationStatus<TStatus>> callback);
}
