/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microsoft.bingads.bulk;

import java.util.List;

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
}
