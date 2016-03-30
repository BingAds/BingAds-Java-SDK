package com.microsoft.bingads.v10.bulk;

/**
 * This exception is thrown when calling API related with bulk download
 */
public class CouldNotSubmitBulkDownloadException extends RuntimeException {
    
	public CouldNotSubmitBulkDownloadException(Exception exception) {
        super(exception);
    }
	
	public CouldNotSubmitBulkDownloadException(String message) {
        super(message);
    }
    
    public CouldNotSubmitBulkDownloadException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
