package com.microsoft.bingads.v10.campaignmanagement;

/**
 * Enum class for CriterionType.
 */
public enum CriterionType {

    PRODUCT_PARTITION("ProductPartition"),
    WEBPAGE("Webpage");
        
    private final String value;

    CriterionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CriterionType fromValue(String v) {
        for (CriterionType c : CriterionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}