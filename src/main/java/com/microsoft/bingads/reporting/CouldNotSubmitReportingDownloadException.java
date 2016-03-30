package com.microsoft.bingads.reporting;

/**
 * This exception is thrown when calling API related with reporting download
 */
public class CouldNotSubmitReportingDownloadException extends Exception {
    
	public CouldNotSubmitReportingDownloadException(Exception exception) {
        super(exception);
    }
	
	public CouldNotSubmitReportingDownloadException(String message) {
        super(message);
    }
    
    public CouldNotSubmitReportingDownloadException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
