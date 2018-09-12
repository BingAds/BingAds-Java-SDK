package com.microsoft.bingads.v12.campaignmanagement;

/**
 * Enum class for AdAdditionalField.
 */
public enum AdAdditionalField {

    TITLE_PART3("TitlePart3"),
    TEXT_PART2("TextPart2");
        
    private final String value;

    AdAdditionalField(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdAdditionalField fromValue(String v) {
        for (AdAdditionalField c : AdAdditionalField.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}