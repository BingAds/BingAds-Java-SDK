package com.microsoft.bingads.v11.bulk;

/**
 * This exception is thrown when attempting to write entities to a bulk file using BulkFileWriter.writeEntity.
 * To resolve this exception you can first check the stack trace to see the error details, in case there is some action you can take to resolve the issue.
 * For example you might have specified an invalid value for one of the upload entities.
 */
public class EntityWriteException extends RuntimeException {

    /**
     * Initializes a new instance of the EntityWriteException class.
     *
     * @param message the error message
     * @param cause the cause
     */
    public EntityWriteException(String message, Throwable cause) {
        super(message, cause);
    }
}
