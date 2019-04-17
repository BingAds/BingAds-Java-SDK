package com.microsoft.bingads.v12.campaignmanagement;

/**
 * Enum class for AdExtensionAdditionalField.
 */
public enum AdExtensionAdditionalField {

    FINAL_URL_SUFFIX("FinalUrlSuffix"),
    ACTION_TYPES_PHASE2("ActionTypesPhase2");
        
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