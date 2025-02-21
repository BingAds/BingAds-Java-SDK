package com.microsoft.bingads.v13.campaignmanagement;

/**
 * Enum class for AudienceGroupAdditionalField.
 */
public enum AudienceGroupAdditionalField {

    PROFILE_DIMENSION("ProfileDimension");
        
    private final String value;

    AudienceGroupAdditionalField(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AudienceGroupAdditionalField fromValue(String v) {
        for (AudienceGroupAdditionalField c : AudienceGroupAdditionalField.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}