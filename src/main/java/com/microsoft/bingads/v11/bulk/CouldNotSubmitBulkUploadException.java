package com.microsoft.bingads.v11.bulk;

/**
 * This exception is thrown by the BulkServiceManager when the GetBulkUploadUrl service operation that it called does not return a valid response.
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
