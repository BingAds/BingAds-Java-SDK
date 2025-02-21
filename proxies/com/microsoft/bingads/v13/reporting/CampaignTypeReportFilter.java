package com.microsoft.bingads.v13.reporting;

/**
 * Enum class for CampaignTypeReportFilter.
 */
public enum CampaignTypeReportFilter {

    SEARCH_AND_CONTENT("SearchAndContent"),
    SHOPPING("Shopping"),
    DYNAMIC_SEARCH("DynamicSearch"),
    AUDIENCE("Audience"),
    SMART("Smart"),
    HOTEL("Hotel"),
    PERFORMANCE_MAX("PerformanceMax"),
    APP("App");
        
    private final String value;

    CampaignTypeReportFilter(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CampaignTypeReportFilter fromValue(String v) {
        for (CampaignTypeReportFilter c : CampaignTypeReportFilter.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}