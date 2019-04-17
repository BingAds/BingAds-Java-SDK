package com.microsoft.bingads.v13.reporting;

public interface ReportRecord {
    public Double getDoubleValue(String header) throws InvalidColumnException, NumberFormatException;

    public Long getLongValue(String header) throws InvalidColumnException, NumberFormatException ;
    
    public Integer getIntegerValue(String header) throws InvalidColumnException, NumberFormatException;
    
    public String getStringValue(String header) throws InvalidColumnException;
}
