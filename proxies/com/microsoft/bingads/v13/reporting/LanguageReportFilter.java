package com.microsoft.bingads.v13.reporting;

/**
 * Enum class for LanguageReportFilter.
 */
public enum LanguageReportFilter {

    DANISH("Danish"),
    DUTCH("Dutch"),
    ENGLISH("English"),
    FINNISH("Finnish"),
    FRENCH("French"),
    GERMAN("German"),
    ITALIAN("Italian"),
    JAPANESE("Japanese"),
    NORWEGIAN("Norwegian"),
    PORTUGUESE("Portuguese"),
    SWEDISH("Swedish"),
    SPANISH("Spanish"),
    ARABIC("Arabic"),
    HEBREW("Hebrew"),
    KOREAN("Korean"),
    RUSSIAN("Russian"),
    TRADITIONAL_CHINESE("TraditionalChinese");
        
    private final String value;

    LanguageReportFilter(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LanguageReportFilter fromValue(String v) {
        for (LanguageReportFilter c : LanguageReportFilter.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}