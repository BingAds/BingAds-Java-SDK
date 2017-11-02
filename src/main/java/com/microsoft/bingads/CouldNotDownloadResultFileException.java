package com.microsoft.bingads;

/**
 * This exception is thrown by the internal SDK HttpService after a failed attempt to download a bulk or reporting result file.
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
