package com.microsoft.bingads.v13.campaignmanagement;

/**
 * Enum class for AdGroupAdditionalField.
 */
public enum AdGroupAdditionalField {

    AD_SCHEDULE_USE_SEARCHER_TIME_ZONE("AdScheduleUseSearcherTimeZone"),
    AD_GROUP_TYPE("AdGroupType"),
    CPV_BID("CpvBid"),
    CPM_BID("CpmBid");
        
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