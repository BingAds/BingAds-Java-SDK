package com.microsoft.bingads.v10.campaignmanagement;

/**
 * Enum class for ConversionGoalType.
 */
public enum ConversionGoalType {

    URL("Url"),
    DURATION("Duration"),
    PAGES_VIEWED_PER_VISIT("PagesViewedPerVisit"),
    EVENT("Event"),
    APP_INSTALL("AppInstall");
        
    private final String value;

    ConversionGoalType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConversionGoalType fromValue(String v) {
        for (ConversionGoalType c : ConversionGoalType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}