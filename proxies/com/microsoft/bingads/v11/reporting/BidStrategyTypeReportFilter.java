package com.microsoft.bingads.v11.reporting;

/**
 * Enum class for BidStrategyTypeReportFilter.
 */
public enum BidStrategyTypeReportFilter {

    MANUAL_CPC("ManualCpc"),
    ENHANCED_CPC("EnhancedCpc");
        
    private final String value;

    BidStrategyTypeReportFilter(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BidStrategyTypeReportFilter fromValue(String v) {
        for (BidStrategyTypeReportFilter c : BidStrategyTypeReportFilter.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}