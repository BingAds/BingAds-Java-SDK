package com.microsoft.bingads.v13.campaignmanagement;

/**
 * Enum class for MediaAdditionalField.
 */
public enum MediaAdditionalField {

    TEXT("Text");
        
    private final String value;

    MediaAdditionalField(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MediaAdditionalField fromValue(String v) {
        for (MediaAdditionalField c : MediaAdditionalField.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}