package com.microsoft.bingads.v12.bulk;

/**
 * Contains percent complete progress information for the bulk operation.
 */
public class BulkOperationProgressInfo {

    private final int percentComplete;

    /**
     * Gets progress information for the bulk operation in percent.
     */
    public int getPercentComplete() {
        return percentComplete;
    }

    public BulkOperationProgressInfo(Integer percentComplete) {
        this.percentComplete = percentComplete;
    }
}
