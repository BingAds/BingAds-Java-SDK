package com.microsoft.bingads.v10.campaignmanagement;

/**
 * Enum class for CampaignAdditionalField.
 */
public enum CampaignAdditionalField {

    BIDDING_SCHEME("BiddingScheme"),
    BUDGET_ID("BudgetId"),
    LANGUAGES("Languages");
        
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