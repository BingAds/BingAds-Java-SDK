package com.microsoft.bingads.bulk;

/**
 * This exception is thrown when attempting to write entities to a bulk file using BulkFileWriter.writeEntity.
 */
public class EntityWriteException extends RuntimeException {

    /**
     * Initializes a new instance of the EntityWriteException class.
     * @param message
     * @param cause
     */
    public EntityWriteException(String message, Throwable cause) {
        super(message, cause);
    }
}
