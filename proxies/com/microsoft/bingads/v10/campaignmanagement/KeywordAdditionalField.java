package com.microsoft.bingads.v10.campaignmanagement;

/**
 * Enum class for KeywordAdditionalField.
 */
public enum KeywordAdditionalField {

    BIDDING_SCHEME("BiddingScheme");
        
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