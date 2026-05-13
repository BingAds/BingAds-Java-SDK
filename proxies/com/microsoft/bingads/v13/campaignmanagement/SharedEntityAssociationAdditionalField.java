package com.microsoft.bingads.v13.campaignmanagement;

/**
 * Enum class for SharedEntityAssociationAdditionalField.
 */
public enum SharedEntityAssociationAdditionalField {

    BRAND_LIST_FIELDS("BrandListFields");
        
    private final String value;

    SharedEntityAssociationAdditionalField(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SharedEntityAssociationAdditionalField fromValue(String v) {
        for (SharedEntityAssociationAdditionalField c : SharedEntityAssociationAdditionalField.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}