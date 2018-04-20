package com.microsoft.bingads.v12.reporting;

/**
 * Enum class for ChangeEntityReportFilter.
 */
public enum ChangeEntityReportFilter {

    ACCOUNT("Account"),
    CAMPAIGN("Campaign"),
    AD_GROUP("AdGroup"),
    AD("Ad"),
    KEYWORD("Keyword");
        
    private final String value;

    ChangeEntityReportFilter(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChangeEntityReportFilter fromValue(String v) {
        for (ChangeEntityReportFilter c : ChangeEntityReportFilter.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}