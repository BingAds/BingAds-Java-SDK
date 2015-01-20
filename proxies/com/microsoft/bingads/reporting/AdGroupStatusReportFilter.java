package com.microsoft.bingads.reporting;

public enum AdGroupStatusReportFilter {

    SUBMITTED("Submitted"),
    DELETED("Deleted"),
    EXPIRED("Expired"),
    DRAFT("Draft"),
    PAUSED("Paused"),
    ACTIVE("Active");
        
    private final String value;

    AdGroupStatusReportFilter(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdGroupStatusReportFilter fromValue(String v) {
        for (AdGroupStatusReportFilter c : AdGroupStatusReportFilter.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}