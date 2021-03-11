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
    TRADITIONAL_CHINESE("TraditionalChinese"),
    GREEK("Greek"),
    POLISH("Polish"),
    CZECH("Czech"),
    ROMANIAN("Romanian"),
    HUNGARIAN("Hungarian"),
    SLOVAK("Slovak"),
    BULGARIAN("Bulgarian"),
    CROATIAN("Croatian"),
    LITHUANIAN("Lithuanian"),
    SLOVENIAN("Slovenian"),
    ESTONIAN("Estonian"),
    LATVIAN("Latvian"),
    MALTESE("Maltese");
        
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