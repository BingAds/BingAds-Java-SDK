package com.microsoft.bingads.v11.reporting;

/**
 * Enum class for AdGroupStatusReportFilter.
 */
public enum AdGroupStatusReportFilter {

    ACTIVE("Active"),
    DELETED("Deleted"),
    EXPIRED("Expired"),
    PAUSED("Paused");
        
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