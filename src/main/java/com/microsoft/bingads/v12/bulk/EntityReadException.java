package com.microsoft.bingads.v12.bulk;

/**
 * This exception is thrown when attempting to read entities from a bulk file using BulkFileReader.readEntities.
 * To resolve this exception you can first check the stack trace to see the error details, in case there is some action you can take to resolve the issue.
 * For example the bulk file that you are attempting to read from might have an invalid value in one of the fields.
 */
public class EntityReadException extends RuntimeException {
    
    private final String columnValues;
    
    /**
     * Initializes a new instance of the EntityReadException class.
     *
     * @param message the error message
     * @param columnValues the column values
     * @param cause the cause
     */
    public EntityReadException(String message, String columnValues, Throwable cause) {
        super(message, cause);
        
        this.columnValues = columnValues;
    }
    
    /**
     * Gets the comma separated column values of the record that  caused the exception.
     */
    public String getColumnValues() {
        return columnValues;
    }
    
    @Override
    public String toString() {
        return String.format("%s Column values are %s", super.toString(), columnValues);    
    }
}
