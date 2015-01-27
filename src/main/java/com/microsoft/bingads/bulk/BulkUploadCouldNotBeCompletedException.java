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
}
