package com.microsoft.bingads;

/**
 * This exception is thrown when trying to download result file.
 */
public class CouldNotDownloadResultFileException extends RuntimeException {
    
	public CouldNotDownloadResultFileException(Exception exception) {
        super(exception);
    }

	public CouldNotDownloadResultFileException(String message) {
        super(message);
    }
	
    public CouldNotDownloadResultFileException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
