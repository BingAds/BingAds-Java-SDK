package com.microsoft.bingads.v13.campaignmanagement;

/**
 * Enum class for CampaignType.
 */
public enum CampaignType {

    SEARCH("Search"),
    SHOPPING("Shopping"),
    DYNAMIC_SEARCH_ADS("DynamicSearchAds"),
    AUDIENCE("Audience"),
    HOTEL("Hotel"),
    PERFORMANCE_MAX("PerformanceMax"),
    APP("App");
        
    private final String value;

    CampaignType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CampaignType fromValue(String v) {
        for (CampaignType c : CampaignType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}