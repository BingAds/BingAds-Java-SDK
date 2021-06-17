package com.microsoft.bingads.v13.campaignmanagement;

/**
 * Enum class for CampaignAdditionalField.
 */
public enum CampaignAdditionalField {

    AD_SCHEDULE_USE_SEARCHER_TIME_ZONE("AdScheduleUseSearcherTimeZone"),
    MAX_CONVERSION_VALUE_BIDDING_SCHEME("MaxConversionValueBiddingScheme"),
    TARGET_IMPRESSION_SHARE_BIDDING_SCHEME("TargetImpressionShareBiddingScheme"),
    TARGET_SETTING("TargetSetting"),
    BID_STRATEGY_ID("BidStrategyId"),
    CPV_CPM_BIDDING_SCHEME("CpvCpmBiddingScheme"),
    DYNAMIC_FEED_SETTING("DynamicFeedSetting"),
    MULTIMEDIA_ADS_BID_ADJUSTMENT("MultimediaAdsBidAdjustment"),
    VERIFIED_TRACKING_SETTING("VerifiedTrackingSetting"),
    DYNAMIC_DESCRIPTION_SETTING("DynamicDescriptionSetting");
        
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