package com.microsoft.bingads.v13.campaignmanagement;

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
    LOCATION_INTENT("LocationIntent"),
    AUDIENCE("Audience"),
    CUSTOM_AUDIENCE("CustomAudience"),
    IN_MARKET_AUDIENCE("InMarketAudience"),
    REMARKETING_LIST("RemarketingList"),
    COMPANY_NAME("CompanyName"),
    JOB_FUNCTION("JobFunction"),
    INDUSTRY("Industry"),
    PRODUCT_AUDIENCE("ProductAudience"),
    SIMILAR_REMARKETING_LIST("SimilarRemarketingList"),
    STORE("Store"),
    COMBINED_LIST("CombinedList"),
    CUSTOMER_LIST("CustomerList");
        
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