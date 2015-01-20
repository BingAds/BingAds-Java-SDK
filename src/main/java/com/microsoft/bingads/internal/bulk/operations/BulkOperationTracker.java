package com.microsoft.bingads.internal.bulk.operations;

import java.util.concurrent.Future;

import com.microsoft.bingads.AsyncCallback;
import com.microsoft.bingads.bulk.BulkOperationStatus;

public interface BulkOperationTracker<TStatus> {

    Future<BulkOperationStatus<TStatus>> trackResultFileAsync(AsyncCallback<BulkOperationStatus<TStatus>> callback);
}
