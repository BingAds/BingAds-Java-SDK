package com.microsoft.bingads.v12.reporting;

/**
 * This exception is thrown if the ReportingServiceManager failed to get the download operation status after multiple retries.
 */
public class CouldNotGetReportingDownloadStatusException extends Exception {
    
	public CouldNotGetReportingDownloadStatusException(Exception exception) {
        super(exception);
    }
	
	public CouldNotGetReportingDownloadStatusException(String message) {
        super(message);
    }
    
    public CouldNotGetReportingDownloadStatusException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
