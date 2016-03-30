package com.microsoft.bingads.reporting;

/**
 * This exception is thrown when failed to get download status after multiple retries
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
