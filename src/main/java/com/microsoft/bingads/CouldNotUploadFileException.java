package com.microsoft.bingads;

/**
 * This exception is thrown by the internal SDK HttpService after a failed attempt to upload a bulk file.
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
