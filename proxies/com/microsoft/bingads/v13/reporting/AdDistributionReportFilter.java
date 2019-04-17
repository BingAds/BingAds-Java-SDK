package com.microsoft.bingads.v13.reporting;

/**
 * Enum class for AdDistributionReportFilter.
 */
public enum AdDistributionReportFilter {

    SEARCH("Search"),
    AUDIENCE("Audience");
        
    private final String value;

    AdDistributionReportFilter(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdDistributionReportFilter fromValue(String v) {
        for (AdDistributionReportFilter c : AdDistributionReportFilter.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}