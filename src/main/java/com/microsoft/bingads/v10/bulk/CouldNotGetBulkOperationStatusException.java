package com.microsoft.bingads.v10.bulk;

/**
 * This exception is thrown when failed to get operation status after multiple retries
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
