package com.microsoft.bingads.v13.bulk;

/**
 * This exception is thrown by the BulkServiceManager when the DownloadCampaignsByAccountIds service operation that it called does not return a valid response.
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
