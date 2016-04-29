package com.microsoft.bingads.bulk;

/**
 * This exception is thrown if the BulkServiceManager failed to get the upload or download operation status after multiple retries.
 */
public class CouldNotGetBulkOperationStatusException extends RuntimeException {
    
	public CouldNotGetBulkOperationStatusException(Exception exception) {
        super(exception);
    }
	
	public CouldNotGetBulkOperationStatusException(String message) {
        super(message);
    }
    
    public CouldNotGetBulkOperationStatusException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
