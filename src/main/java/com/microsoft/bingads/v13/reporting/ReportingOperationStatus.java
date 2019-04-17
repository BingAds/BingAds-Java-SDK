package com.microsoft.bingads.v13.reporting;

import java.util.List;


/**
 * Contains tracking details about the results and status of the corresponding reporting operation.
 *
 */
public class ReportingOperationStatus {

	/**
     * The status of the reporting operation request.
     */
	private final ReportRequestStatusType status;

	/**
     * The url of the result file.
     */
    private final String resultFileUrl;

    /**
     * The identifier of the log entry that contains the details of the download request.
     */
    private final String trackingId;
    
    public ReportingOperationStatus(ReportRequestStatusType status, String resultFileUrl, String trackingId) {
        this.status = status;

        this.resultFileUrl = resultFileUrl;

        this.trackingId = trackingId;

    }

    /**
     * Gets current status of the operation.
     */
    public ReportRequestStatusType getStatus() {
        return status;
    } 
   
    /**
     * Gets the result file URL for the operation.
     */
    public String getResultFileUrl() {
        return resultFileUrl;
    }
   
    /**
     * Gets the tracking Id for the operation.
     */
    public String getTrackingId() {
        return this.trackingId;
    }   
}
