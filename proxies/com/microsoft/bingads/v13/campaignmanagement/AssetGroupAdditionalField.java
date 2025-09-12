package com.microsoft.bingads.v13.campaignmanagement;

/**
 * Enum class for AssetGroupAdditionalField.
 */
public enum AssetGroupAdditionalField {

    ASSET_GROUP_SEARCH_THEMES("AssetGroupSearchThemes"),
    ASSET_GROUP_URL_TARGETS("AssetGroupUrlTargets"),
    TRACKING_URL_TEMPLATE("TrackingUrlTemplate"),
    FINAL_URL_SUFFIX("FinalUrlSuffix"),
    URL_CUSTOM_PARAMETERS("UrlCustomParameters");
        
    private final String value;

    AssetGroupAdditionalField(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AssetGroupAdditionalField fromValue(String v) {
        for (AssetGroupAdditionalField c : AssetGroupAdditionalField.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}