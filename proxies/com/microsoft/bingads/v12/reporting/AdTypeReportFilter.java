package com.microsoft.bingads.v12.reporting;

/**
 * Enum class for AdTypeReportFilter.
 */
public enum AdTypeReportFilter {

    TEXT("Text"),
    LOCAL("Local"),
    PRODUCT("Product"),
    APP_INSTALL("AppInstall"),
    DYNAMIC_SEARCH_AD("DynamicSearchAd"),
    EXPANDED_TEXT("ExpandedText"),
    RESPONSIVE_AD("ResponsiveAd"),
    RESPONSIVE_SEARCH_AD("ResponsiveSearchAd");
        
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