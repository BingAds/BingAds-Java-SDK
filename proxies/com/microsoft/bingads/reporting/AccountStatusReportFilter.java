package com.microsoft.bingads.reporting;

/**
 * Enum class for AccountStatusReportFilter.
 */
public enum AccountStatusReportFilter {

    ACTIVE("Active"),
    PAUSED("Paused"),
    INACTIVE("Inactive");
        
    private final String value;

    AccountStatusReportFilter(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccountStatusReportFilter fromValue(String v) {
        for (AccountStatusReportFilter c : AccountStatusReportFilter.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}