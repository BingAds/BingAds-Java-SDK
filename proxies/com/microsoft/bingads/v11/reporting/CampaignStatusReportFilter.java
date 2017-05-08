package com.microsoft.bingads.v11.reporting;

/**
 * Enum class for CampaignStatusReportFilter.
 */
public enum CampaignStatusReportFilter {

    ACTIVE("Active"),
    CANCELLED("Cancelled"),
    DELETED("Deleted"),
    PAUSED("Paused"),
    BUDGET_PAUSED("BudgetPaused"),
    SUSPENDED("Suspended");
        
    private final String value;

    CampaignStatusReportFilter(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CampaignStatusReportFilter fromValue(String v) {
        for (CampaignStatusReportFilter c : CampaignStatusReportFilter.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}