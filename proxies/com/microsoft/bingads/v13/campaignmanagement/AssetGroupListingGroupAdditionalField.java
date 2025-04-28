package com.microsoft.bingads.v13.campaignmanagement;

/**
 * Enum class for AssetGroupListingGroupAdditionalField.
 */
public enum AssetGroupListingGroupAdditionalField {

    LISTING_GROUP_PATH("ListingGroupPath");
        
    private final String value;

    AssetGroupListingGroupAdditionalField(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AssetGroupListingGroupAdditionalField fromValue(String v) {
        for (AssetGroupListingGroupAdditionalField c : AssetGroupListingGroupAdditionalField.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}