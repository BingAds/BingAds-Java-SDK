/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microsoft.bingads.bulk;

import java.util.List;

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
