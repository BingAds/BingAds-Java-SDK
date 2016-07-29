package com.microsoft.bingads.reporting;

/**
 * Enum class for AdTypeReportFilter.
 */
public enum AdTypeReportFilter {

    TEXT("Text"),
    MOBILE("Mobile"),
    IMAGE("Image"),
    LOCAL("Local"),
    RICH_MEDIA("RichMedia"),
    THIRD_PARTY_CREATIVE("ThirdPartyCreative"),
    RICH_AD("RichAd"),
    PRODUCT("Product"),
    APP_INSTALL("AppInstall"),
    EXPANDED_TEXT("ExpandedText");
        
    private final String value;

    AdTypeReportFilter(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdTypeReportFilter fromValue(String v) {
        for (AdTypeReportFilter c : AdTypeReportFilter.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}