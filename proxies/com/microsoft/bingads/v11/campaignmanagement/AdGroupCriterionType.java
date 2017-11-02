package com.microsoft.bingads.v11.campaignmanagement;

/**
 * Enum class for AdGroupCriterionType.
 */
public enum AdGroupCriterionType {

    PRODUCT_PARTITION("ProductPartition"),
    WEBPAGE("Webpage"),
    TARGETS("Targets"),
    AGE("Age"),
    GENDER("Gender"),
    DAY_TIME("DayTime"),
    DEVICE("Device"),
    LOCATION("Location"),
    LOCATION_INTENT("LocationIntent"),
    RADIUS("Radius"),
    AUDIENCE("Audience"),
    CUSTOM_AUDIENCE("CustomAudience"),
    IN_MARKET_AUDIENCE("InMarketAudience"),
    REMARKETING_LIST("RemarketingList");
        
    private final String value;

    AdGroupCriterionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdGroupCriterionType fromValue(String v) {
        for (AdGroupCriterionType c : AdGroupCriterionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}