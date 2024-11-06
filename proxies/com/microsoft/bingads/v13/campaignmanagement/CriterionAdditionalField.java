package com.microsoft.bingads.v13.campaignmanagement;

/**
 * Enum class for CriterionAdditionalField.
 */
public enum CriterionAdditionalField {

    CRITERION_CASHBACK("CriterionCashback"),
    OPERATOR("Operator"),
    PLACEMENT("Placement");
        
    private final String value;

    CriterionAdditionalField(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CriterionAdditionalField fromValue(String v) {
        for (CriterionAdditionalField c : CriterionAdditionalField.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}