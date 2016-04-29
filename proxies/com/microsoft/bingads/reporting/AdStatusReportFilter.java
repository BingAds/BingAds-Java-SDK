package com.microsoft.bingads.reporting;

/**
 * Enum class for AdStatusReportFilter.
 */
public enum AdStatusReportFilter {

    SUBMITTED("Submitted"),
    REJECTED("Rejected"),
    DELETED("Deleted"),
    PENDING("Pending"),
    ACTIVE("Active"),
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