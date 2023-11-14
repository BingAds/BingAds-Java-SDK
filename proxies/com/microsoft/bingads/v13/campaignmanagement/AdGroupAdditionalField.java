package com.microsoft.bingads.v13.campaignmanagement;

/**
 * Enum class for AdGroupAdditionalField.
 */
public enum AdGroupAdditionalField {

    AD_SCHEDULE_USE_SEARCHER_TIME_ZONE("AdScheduleUseSearcherTimeZone"),
    AD_GROUP_TYPE("AdGroupType"),
    CPV_BID("CpvBid"),
    CPM_BID("CpmBid"),
    MULTIMEDIA_ADS_BID_ADJUSTMENT("MultimediaAdsBidAdjustment"),
    COMMISSION_RATE("CommissionRate"),
    PERCENT_CPC_BID("PercentCpcBid"),
    MCPA_BID("McpaBid"),
    USE_OPTIMIZED_TARGETING("UseOptimizedTargeting"),
    FREQUENCY_CAP_SETTINGS("FrequencyCapSettings"),
    USE_PREDICTIVE_TARGETING("UsePredictiveTargeting");
        
    private final String value;

    AdGroupAdditionalField(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdGroupAdditionalField fromValue(String v) {
        for (AdGroupAdditionalField c : AdGroupAdditionalField.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}