package com.microsoft.bingads.v11.campaignmanagement;

/**
 * Enum class for AdExtensionsTypeFilter.
 */
public enum AdExtensionsTypeFilter {

    SITE_LINKS_AD_EXTENSION("SiteLinksAdExtension"),
    LOCATION_AD_EXTENSION("LocationAdExtension"),
    CALL_AD_EXTENSION("CallAdExtension"),
    IMAGE_AD_EXTENSION("ImageAdExtension"),
    APP_AD_EXTENSION("AppAdExtension"),
    REVIEW_AD_EXTENSION("ReviewAdExtension"),
    CALLOUT_AD_EXTENSION("CalloutAdExtension"),
    SITELINK2_AD_EXTENSION("Sitelink2AdExtension"),
    STRUCTURED_SNIPPET_AD_EXTENSION("StructuredSnippetAdExtension"),
    PRICE_AD_EXTENSION("PriceAdExtension");
        
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