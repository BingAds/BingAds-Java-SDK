/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microsoft.bingads.bulk;

public class EntityReadException extends RuntimeException {
    
    private final String columnValues;
    
    public EntityReadException(String message, String columnValues, Throwable cause) {
        super(message, cause);
        
        this.columnValues = columnValues;
    }
    
    public String getColumnValues() {
        return columnValues;
    }
    
    @Override
    public String toString() {
        return String.format("Column values are %s", columnValues);    
    }
}
