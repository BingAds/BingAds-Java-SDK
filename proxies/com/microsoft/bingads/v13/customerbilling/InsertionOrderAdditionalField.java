package com.microsoft.bingads.v13.customerbilling;

/**
 * Enum class for InsertionOrderAdditionalField.
 */
public enum InsertionOrderAdditionalField {

    NONE("None"),
    UNLIMITED_AND_ENDLESS_FLAGS("UnlimitedAndEndlessFlags");
        
    private final String value;

    InsertionOrderAdditionalField(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InsertionOrderAdditionalField fromValue(String v) {
        for (InsertionOrderAdditionalField c : InsertionOrderAdditionalField.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}