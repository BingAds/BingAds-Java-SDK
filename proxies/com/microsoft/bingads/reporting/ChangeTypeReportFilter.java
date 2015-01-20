package com.microsoft.bingads.reporting;

public enum ChangeTypeReportFilter {

    ADDED("Added"),
    DELETED("Deleted"),
    CHANGED("Changed");
        
    private final String value;

    ChangeTypeReportFilter(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChangeTypeReportFilter fromValue(String v) {
        for (ChangeTypeReportFilter c : ChangeTypeReportFilter.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}