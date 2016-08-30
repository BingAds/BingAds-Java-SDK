package com.microsoft.bingads.v10.campaignmanagement;

/**
 * Enum class for AdExtensionAdditionalField.
 */
public enum AdExtensionAdditionalField {

    SCHEDULING("Scheduling");
        
    private final String value;

    AdExtensionAdditionalField(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdExtensionAdditionalField fromValue(String v) {
        for (AdExtensionAdditionalField c : AdExtensionAdditionalField.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}