package com.microsoft.bingads;

/**
 * This exception is thrown when trying to upload file.
 */
public class CouldNotUploadFileException extends RuntimeException {
    
	public CouldNotUploadFileException(Exception exception) {
        super(exception);
    }

    public CouldNotUploadFileException(String message) {
        super(message);
    }
    
    public CouldNotUploadFileException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
