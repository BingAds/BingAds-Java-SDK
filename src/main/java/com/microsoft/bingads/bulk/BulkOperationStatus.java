package com.microsoft.bingads.bulk;

/**
 * Contains tracking details about the results and status of the corresponding bulk operation. 
 * @param <TStatus>
 */
public class BulkOperationStatus<TStatus> {

    private TStatus status;
    private int percentComplete;
    private String resultFileUrl;
    private String trackingId;
    private ArrayOfOperationError errors;

    /**
     * Gets current status of the operation.
     * @return
     */
    public TStatus getStatus() {
        return status;
    }

    /**
     * Sets current status of the operation.
     * @param status
     */
    public void setStatus(TStatus status) {
        this.status = status;
    }

    /**
     * Gets progress of the operation in percent.
     * @return
     */
    public int getPercentComplete() {
        return percentComplete;
    }

    /**
     * Sets progress of the operation in percent.
     * @param percentComplete
     */
    public void setPercentComplete(int percentComplete) {
        this.percentComplete = percentComplete;
    }

    /**
     * Gets the result file URL for the operation.
     * @return
     */
    public String getResultFileUrl() {
        return resultFileUrl;
    }

    /**
     * Sets the result file URL for the operation.
     * @param resultFileUrl
     */
    public void setResultFileUrl(String resultFileUrl) {
        this.resultFileUrl = resultFileUrl;
    }

    /**
     * Gets the tracking Id for the operation.
     * @return
     */
    public String getTrackingId() {
        return this.trackingId;
    }

    /**
     * Sets the tracking Id for the operation.
     * @param trackingId
     */
    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

    /**
     * Gets the list of errors for the operation.
     * @return
     */
    public ArrayOfOperationError getErrors() {
        return errors;
    }

    /**
     * Sets the list of errors for the operation.
     * @param errors
     */
    public void setErrors(ArrayOfOperationError errors) {
        this.errors = errors;
    }
}
