package com.microsoft.bingads.v13.campaignmanagement;

/**
 * Enum class for UetTagAdditionalField.
 */
public enum UetTagAdditionalField {

    INDUSTRY("Industry");
        
    private final String value;

    UetTagAdditionalField(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UetTagAdditionalField fromValue(String v) {
        for (UetTagAdditionalField c : UetTagAdditionalField.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}