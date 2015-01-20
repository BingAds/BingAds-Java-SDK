package com.microsoft.bingads.bulk;

public class BulkOperationStatus<TStatus> {

    private TStatus status;
    private int percentComplete;
    private String resultFileUrl;
    private String trackingId;
    private ArrayOfOperationError errors;

    public TStatus getStatus() {
        return status;
    }

    public void setStatus(TStatus status) {
        this.status = status;
    }

    public int getPercentComplete() {
        return percentComplete;
    }

    public void setPercentComplete(int percentComplete) {
        this.percentComplete = percentComplete;
    }

    public String getResultFileUrl() {
        return resultFileUrl;
    }

    public void setResultFileUrl(String resultFileUrl) {
        this.resultFileUrl = resultFileUrl;
    }

    public String getTrackingId() {
        return this.trackingId;
    }

    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

    public ArrayOfOperationError getErrors() {
        return errors;
    }

    public void setErrors(ArrayOfOperationError errors) {
        this.errors = errors;
    }
}
