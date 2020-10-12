package com.microsoft.bingads.v13.campaignmanagement;

/**
 * Enum class for ImportAdditionalField.
 */
public enum ImportAdditionalField {

    NONE("None");
        
    private final String value;

    ImportAdditionalField(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ImportAdditionalField fromValue(String v) {
        for (ImportAdditionalField c : ImportAdditionalField.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}