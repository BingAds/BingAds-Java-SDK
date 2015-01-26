package com.microsoft.bingads.campaignmanagement;

/**
 * Enum class for AdExtensionsTypeFilter.
 */
public enum AdExtensionsTypeFilter {

    SITE_LINKS_AD_EXTENSION("SiteLinksAdExtension"),
    LOCATION_AD_EXTENSION("LocationAdExtension"),
    CALL_AD_EXTENSION("CallAdExtension"),
    PRODUCTS_AD_EXTENSION("ProductsAdExtension"),
    IMAGE_AD_EXTENSION("ImageAdExtension"),
    APP_AD_EXTENSION("AppAdExtension");
        
    private final String value;

    AdExtensionsTypeFilter(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdExtensionsTypeFilter fromValue(String v) {
        for (AdExtensionsTypeFilter c : AdExtensionsTypeFilter.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}