package com.microsoft.bingads.v11.reporting;

/**
 * Enum class for DynamicAdTargetStatusReportFilter.
 */
public enum DynamicAdTargetStatusReportFilter {

    ACTIVE("Active"),
    PAUSED("Paused"),
    DELETED("Deleted");
        
    private final String value;

    DynamicAdTargetStatusReportFilter(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DynamicAdTargetStatusReportFilter fromValue(String v) {
        for (DynamicAdTargetStatusReportFilter c : DynamicAdTargetStatusReportFilter.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}