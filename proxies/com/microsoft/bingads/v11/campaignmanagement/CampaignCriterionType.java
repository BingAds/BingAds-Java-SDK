package com.microsoft.bingads.v11.campaignmanagement;

/**
 * Enum class for CampaignCriterionType.
 */
public enum CampaignCriterionType {

    PRODUCT_SCOPE("ProductScope"),
    WEBPAGE("Webpage"),
    TARGETS("Targets"),
    AGE("Age"),
    DAY_TIME("DayTime"),
    GENDER("Gender"),
    LOCATION("Location"),
    RADIUS("Radius"),
    DEVICE("Device"),
    LOCATION_INTENT("LocationIntent");
        
    private final String value;

    CampaignCriterionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CampaignCriterionType fromValue(String v) {
        for (CampaignCriterionType c : CampaignCriterionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}