package com.microsoft.bingads.campaignmanagement;

/**
 * Enum class for CampaignType.
 */
public enum CampaignType {

    SEARCH_AND_CONTENT("SearchAndContent"),
    SHOPPING_CAMPAIGN("ShoppingCampaign");
        
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