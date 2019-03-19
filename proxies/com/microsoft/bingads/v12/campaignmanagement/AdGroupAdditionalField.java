package com.microsoft.bingads.v12.campaignmanagement;

/**
 * Enum class for AdGroupAdditionalField.
 */
public enum AdGroupAdditionalField {

    FINAL_URL_SUFFIX("FinalUrlSuffix");
        
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