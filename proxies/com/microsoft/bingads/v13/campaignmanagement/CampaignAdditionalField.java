package com.microsoft.bingads.v13.campaignmanagement;

/**
 * Enum class for CampaignAdditionalField.
 */
public enum CampaignAdditionalField {

    AD_SCHEDULE_USE_SEARCHER_TIME_ZONE("AdScheduleUseSearcherTimeZone"),
    MAX_CONVERSION_VALUE_BIDDING_SCHEME("MaxConversionValueBiddingScheme");
        
    private final String value;

    CampaignAdditionalField(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CampaignAdditionalField fromValue(String v) {
        for (CampaignAdditionalField c : CampaignAdditionalField.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}