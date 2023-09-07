package com.microsoft.bingads.v13.reporting;

/**
 * Enum class for AssetGroupStatusReportFilter.
 */
public enum AssetGroupStatusReportFilter {

    ACTIVE("Active"),
    PAUSED("Paused"),
    DELETED("Deleted");
        
    private final String value;

    AssetGroupStatusReportFilter(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AssetGroupStatusReportFilter fromValue(String v) {
        for (AssetGroupStatusReportFilter c : AssetGroupStatusReportFilter.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}