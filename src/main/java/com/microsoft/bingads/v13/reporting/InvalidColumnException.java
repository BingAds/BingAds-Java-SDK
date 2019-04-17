package com.microsoft.bingads.v13.reporting;

@SuppressWarnings("serial")
public class InvalidColumnException extends Exception {
    public InvalidColumnException(String columnName) {
        super(String.format("Column %s does not exist in the report file", columnName));
    }
    
    public InvalidColumnException(String columnName, Throwable cause){
        super(String.format("Column %s does not exist in the report file", columnName), cause);
    }
}
