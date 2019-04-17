package com.microsoft.bingads.v13.internal.reporting;

import com.microsoft.bingads.internal.RowValues;
import com.microsoft.bingads.v13.reporting.InvalidColumnException;
import com.microsoft.bingads.v13.reporting.ReportRecord;

class RowReportRecord implements ReportRecord {
    private final RowValues rowValues;

    RowReportRecord(RowValues rowValues) {
        this.rowValues = rowValues;
    }
    
    @Override
    public Double getDoubleValue(String header) throws InvalidColumnException, NumberFormatException {
        String value = rowValues.tryGet(header);
        if (value == null) {
            throw new InvalidColumnException(header);
        }
        
        value = value.trim();
        if (value.isEmpty()) return 0.0;
        if (value.equals("--")) return 0.0;
        if (value.endsWith("%")) {
            value = value.replace("%", "");
            Double result = Double.parseDouble(value) / 100.0;
            return result;
        } else {
            Double result = Double.parseDouble(value);
            return result;
        }
    }

    @Override
    public Long getLongValue(String header) throws InvalidColumnException, NumberFormatException {
        String value = rowValues.tryGet(header);
        if (value == null) {
            throw new InvalidColumnException(header);
        }
        
        if (value.isEmpty()) return 0L;
        if (value.equals("--")) return 0L;
        
        Long result = Long.parseLong(value.trim());
        return result;
    }
    
    @Override
    public Integer getIntegerValue(String header) throws InvalidColumnException, NumberFormatException {
        String value = rowValues.tryGet(header);
        if (value == null) {
            throw new InvalidColumnException(header);
        }
        if (value.isEmpty()) return 0;
        if (value.equals("--")) return 0;
        Integer result = Integer.parseInt(value.trim());
        return result;
    }
    
    @Override
    public String getStringValue(String header) throws InvalidColumnException {
        
        String value = rowValues.tryGet(header);
        if (value == null) {
            throw new InvalidColumnException(header);
        }
        return value;
    }
    
}
