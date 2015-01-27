package com.microsoft.bingads.bulk;

import java.util.List;

/**
 * Contains tracking details about the results and status of the corresponding bulk operation. 
 * @param <TStatus>
 */
public class BulkOperationStatus<TStatus> {

    private final TStatus status;

    private final int percentComplete;

    private final String resultFileUrl;

    private final String trackingId;
    
    private final List<OperationError> errors;

    public BulkOperationStatus(TStatus status, int percentComplete, String resultFileUrl, String trackingId, List<OperationError> errors) {
        this.status = status;

        this.percentComplete = percentComplete;

        this.resultFileUrl = resultFileUrl;

        this.trackingId = trackingId;

        this.errors = errors;
    }

    /**
     * Gets current status of the operation.
     * @return
     */
    public TStatus getStatus() {
        return status;
    } 

    /**
     * Gets progress of the operation in percent.
     * @return
     */
    public int getPercentComplete() {
        return percentComplete;
    }
   
    /**
     * Gets the result file URL for the operation.
     * @return
     */
    public String getResultFileUrl() {
        return resultFileUrl;
    }
   
    /**
     * Gets the tracking Id for the operation.
     * @return
     */
    public String getTrackingId() {
        return this.trackingId;
    }   

    /**
     * Gets the list of errors for the operation.
     * @return
     */
    public List<OperationError> getErrors() {
        return errors;
    }   
}
