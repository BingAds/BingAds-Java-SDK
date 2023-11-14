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
    DYNAMIC_DESCRIPTION_SETTING("DynamicDescriptionSetting"),
    DISCLAIMER_SETTING("DisclaimerSetting"),
    CAMPAIGN_CONVERSION_GOAL("CampaignConversionGoal"),
    TARGET_CPA_IN_MAX_CONVERSION("TargetCpaInMaxConversion"),
    RESPONSIVE_SEARCH_ADS_SETTING("ResponsiveSearchAdsSetting"),
    COST_PER_SALE_BIDDING_SCHEME("CostPerSaleBiddingScheme"),
    SHOPPING_SETTING_SHOPPABLE_ADS_ENABLED("ShoppingSettingShoppableAdsEnabled"),
    SHOPPING_SETTING_FEED_LABEL("ShoppingSettingFeedLabel"),
    CALL_TO_ACTION_SETTING("CallToActionSetting"),
    PAGE_FEED_IN_PERFORMANCE_MAX_SETTINGS("PageFeedInPerformanceMaxSettings");
        
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