package com.microsoft.bingads.bulk;

public class BulkOperationProgressInfo {

    private final int percentComplete;

    public int getPercentComplete() {
        return percentComplete;
    }

    public BulkOperationProgressInfo(Integer percentComplete) {
        this.percentComplete = percentComplete;
    }
}
