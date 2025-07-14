package com.microsoft.bingads.v13.campaignmanagement;

/**
 * Enum class for KeywordAdditionalField.
 */
public enum KeywordAdditionalField {

    MAX_CONVERSION_VALUE_WITH_MAX_CPC("MaxConversionValueWithMaxCpc");
        
    private final String value;

    KeywordAdditionalField(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static KeywordAdditionalField fromValue(String v) {
        for (KeywordAdditionalField c : KeywordAdditionalField.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}