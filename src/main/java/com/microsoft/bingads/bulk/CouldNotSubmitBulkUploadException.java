package com.microsoft.bingads.bulk;

/**
 * This exception is thrown when calling API related with bulk upload 
 */
public class CouldNotSubmitBulkUploadException extends RuntimeException {
    
	public CouldNotSubmitBulkUploadException(Exception exception) {
        super(exception);
    }
	
	public CouldNotSubmitBulkUploadException(String message) {
        super(message);
    }
    
    public CouldNotSubmitBulkUploadException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
