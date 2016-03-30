package com.microsoft.bingads.bulk;

import java.util.List;

/**
 * This exception is thrown when trying to download the result file for an operation that has completed with an error.
 */
public class BulkUploadCouldNotBeCompletedException extends RuntimeException {
    
    private final List<OperationError> errors;

    private final UploadStatus status;

    public BulkUploadCouldNotBeCompletedException(List<OperationError> errors, UploadStatus status) {
        this.errors = errors;

        this.status = status;
    }

    public BulkUploadCouldNotBeCompletedException(List<OperationError> errors, UploadStatus status, String message) {
        super(message);

        this.errors = errors;

        this.status = status;
    }

    public List<OperationError> getErrors() {
        return errors;
    }

    public UploadStatus getStatus() {
        return status;
    }
    
    @Override
    public String toString() {
    	StringBuilder errorsInfo = new StringBuilder();
    	
    	for(OperationError error : errors) {
    		errorsInfo.append(String.format("code=%d, details=%s, errorCode=%s, message=%s; ", error.getCode(), error.getDetails(), error.getErrorCode(), error.getMessage()));
    	}
    	
        return String.format("%s Upload status is %s, errors are %s", super.toString(), status, errorsInfo);    
    }
}
