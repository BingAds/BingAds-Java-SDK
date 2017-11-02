package com.microsoft.bingads.v11.reporting;

/**
 * This exception is thrown by the ReportingServiceManager when the SubmitGenerateReport service operation that it called does not return a valid response.
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
