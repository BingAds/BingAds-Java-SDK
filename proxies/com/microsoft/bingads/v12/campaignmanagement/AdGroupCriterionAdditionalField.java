package com.microsoft.bingads.v12.campaignmanagement;

/**
 * Enum class for AdGroupCriterionAdditionalField.
 */
public enum AdGroupCriterionAdditionalField {

    FINAL_URL_SUFFIX("FinalUrlSuffix");
        
    private final String value;

    AdGroupCriterionAdditionalField(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdGroupCriterionAdditionalField fromValue(String v) {
        for (AdGroupCriterionAdditionalField c : AdGroupCriterionAdditionalField.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}