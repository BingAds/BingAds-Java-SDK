package com.microsoft.bingads.v13.campaignmanagement;

/**
 * Enum class for BrandKitAdditionalField.
 */
public enum BrandKitAdditionalField {

    BUSINESS_NAME("BusinessName");
        
    private final String value;

    BrandKitAdditionalField(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BrandKitAdditionalField fromValue(String v) {
        for (BrandKitAdditionalField c : BrandKitAdditionalField.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}