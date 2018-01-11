package com.microsoft.bingads.v11.campaignmanagement;

/**
 * Enum class for AudienceAdditionalField.
 */
public enum AudienceAdditionalField {

    SEARCH_SIZE("SearchSize");
        
    private final String value;

    AudienceAdditionalField(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AudienceAdditionalField fromValue(String v) {
        for (AudienceAdditionalField c : AudienceAdditionalField.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}