package com.microsoft.bingads.campaignmanagement;

public enum CriterionType {

    PRODUCT("Product");
        
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