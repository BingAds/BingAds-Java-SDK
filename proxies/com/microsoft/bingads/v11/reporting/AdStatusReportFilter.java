package com.microsoft.bingads.v11.reporting;

/**
 * Enum class for AdStatusReportFilter.
 */
public enum AdStatusReportFilter {

    ACTIVE("Active"),
    REJECTED("Rejected"),
    DELETED("Deleted"),
    PENDING("Pending"),
    PAUSED("Paused");
        
    private final String value;

    AdStatusReportFilter(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdStatusReportFilter fromValue(String v) {
        for (AdStatusReportFilter c : AdStatusReportFilter.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}