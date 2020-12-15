package com.microsoft.bingads.v13.adinsight;

/**
 * Enum class for AuctionInsightKpiAdditionalField.
 */
public enum AuctionInsightKpiAdditionalField {

    ABSOLUTE_TOP_OF_PAGE_RATE("AbsoluteTopOfPageRate");
        
    private final String value;

    AuctionInsightKpiAdditionalField(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AuctionInsightKpiAdditionalField fromValue(String v) {
        for (AuctionInsightKpiAdditionalField c : AuctionInsightKpiAdditionalField.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}