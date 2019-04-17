package com.microsoft.bingads.v13.bulk;

import java.util.List;

/**
 * This exception is thrown if an attempt was made to poll for a completed bulk download results file and the bulk service returns a failed status.
 */
public class BulkDownloadCouldNotBeCompletedException extends RuntimeException {

    private final List<OperationError> errors;

    private final DownloadStatus status;

    public BulkDownloadCouldNotBeCompletedException(List<OperationError> errors, DownloadStatus status) {
        this.errors = errors;

        this.status = status;
    }

    public BulkDownloadCouldNotBeCompletedException(List<OperationError> errors, DownloadStatus status, String message) {
        super(message);
        
        this.errors = errors;

        this.status = status;
    }

    public List<OperationError> getErrors() {
        return errors;
    }

    public DownloadStatus getStatus() {
        return status;
    }
    
    @Override
    public String toString() {
    	StringBuilder errorsInfo = new StringBuilder();
    	
    	for(OperationError error : errors) {
    		errorsInfo.append(String.format("code=%d, details=%s, errorCode=%s, message=%s; ", error.getCode(), error.getDetails(), error.getErrorCode(), error.getMessage()));
    	}
    	
        return String.format("%s Download status is %s, errors are %s", super.toString(), status, errorsInfo);    
    }
}
