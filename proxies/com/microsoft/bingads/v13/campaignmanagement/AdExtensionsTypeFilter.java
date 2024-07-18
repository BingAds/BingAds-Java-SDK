package com.microsoft.bingads.v13.campaignmanagement;

/**
 * Enum class for AdExtensionsTypeFilter.
 */
public enum AdExtensionsTypeFilter {

    LOCATION_AD_EXTENSION("LocationAdExtension"),
    CALL_AD_EXTENSION("CallAdExtension"),
    IMAGE_AD_EXTENSION("ImageAdExtension"),
    APP_AD_EXTENSION("AppAdExtension"),
    REVIEW_AD_EXTENSION("ReviewAdExtension"),
    CALLOUT_AD_EXTENSION("CalloutAdExtension"),
    SITELINK_AD_EXTENSION("SitelinkAdExtension"),
    STRUCTURED_SNIPPET_AD_EXTENSION("StructuredSnippetAdExtension"),
    PRICE_AD_EXTENSION("PriceAdExtension"),
    ACTION_AD_EXTENSION("ActionAdExtension"),
    PROMOTION_AD_EXTENSION("PromotionAdExtension"),
    FILTER_LINK_AD_EXTENSION("FilterLinkAdExtension"),
    FLYER_AD_EXTENSION("FlyerAdExtension"),
    VIDEO_AD_EXTENSION("VideoAdExtension"),
    DISCLAIMER_AD_EXTENSION("DisclaimerAdExtension"),
    LOGO_AD_EXTENSION("LogoAdExtension");
        
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