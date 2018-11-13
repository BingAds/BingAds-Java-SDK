package com.microsoft.bingads.v12.campaignmanagement;

/**
 * Enum class for CampaignAdditionalField.
 */
public enum CampaignAdditionalField {

    EXPERIMENT_ID("ExperimentId");
        
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