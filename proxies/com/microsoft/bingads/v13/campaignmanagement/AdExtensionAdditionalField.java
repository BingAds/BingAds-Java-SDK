package com.microsoft.bingads.v13.campaignmanagement;

/**
 * Enum class for AdExtensionAdditionalField.
 */
public enum AdExtensionAdditionalField {

    IMAGES("Images"),
    DISPLAY_TEXT("DisplayText"),
    LAYOUTS("Layouts"),
    ACTION_TYPES_PHASE3("ActionTypesPhase3"),
    ACTION_TYPES_PHASE4("ActionTypesPhase4");
        
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