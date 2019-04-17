package com.microsoft.bingads.v13.reporting;

/**
 * Enum class for KeywordStatusReportFilter.
 */
public enum KeywordStatusReportFilter {

    ACTIVE("Active"),
    PAUSED("Paused"),
    DELETED("Deleted");
        
    private final String value;

    KeywordStatusReportFilter(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static KeywordStatusReportFilter fromValue(String v) {
        for (KeywordStatusReportFilter c : KeywordStatusReportFilter.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}