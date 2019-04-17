package com.microsoft.bingads.v13.adinsight;

/**
 * Enum class for BidOpportunityType.
 */
public enum BidOpportunityType {

    FIRST_PAGE("FirstPage"),
    MAIN_LINE("MainLine"),
    MAIN_LINE1("MainLine1");
        
    private final String value;

    BidOpportunityType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BidOpportunityType fromValue(String v) {
        for (BidOpportunityType c : BidOpportunityType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}