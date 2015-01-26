package com.microsoft.bingads.bulk;

/**
 * Contains percent complete progress information for the bulk operation.
 */
public class BulkOperationProgressInfo {

    private final int percentComplete;

    /**
     * Gets progress information for the bulk operation in percent.
     * @return
     */
    public int getPercentComplete() {
        return percentComplete;
    }

    public BulkOperationProgressInfo(Integer percentComplete) {
        this.percentComplete = percentComplete;
    }
}
