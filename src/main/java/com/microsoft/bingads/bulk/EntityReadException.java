/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microsoft.bingads.bulk;

/**
 * This exception is thrown when attempting to read entities from a bulk file using BulkFileReader.ReadEntities.
 */
public class EntityReadException extends RuntimeException {
    
    private final String columnValues;
    
    /**
     * Initializes a new instance of the EntityReadException class.
     * @param message
     * @param columnValues
     * @param cause
     */
    public EntityReadException(String message, String columnValues, Throwable cause) {
        super(message, cause);
        
        this.columnValues = columnValues;
    }
    
    /**
     * Gets the comma separated column values of the record that  caused the exception.
     * @return
     */
    public String getColumnValues() {
        return columnValues;
    }
    
    @Override
    public String toString() {
        return String.format("Column values are %s", columnValues);    
    }
}
