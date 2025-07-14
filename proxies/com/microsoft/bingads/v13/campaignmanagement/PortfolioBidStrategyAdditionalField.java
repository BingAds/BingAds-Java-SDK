package com.microsoft.bingads.v13.campaignmanagement;

/**
 * Enum class for PortfolioBidStrategyAdditionalField.
 */
public enum PortfolioBidStrategyAdditionalField {

    MAX_CONVERSION_VALUE_WITH_MAX_CPC("MaxConversionValueWithMaxCpc");
        
    private final String value;

    PortfolioBidStrategyAdditionalField(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PortfolioBidStrategyAdditionalField fromValue(String v) {
        for (PortfolioBidStrategyAdditionalField c : PortfolioBidStrategyAdditionalField.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}