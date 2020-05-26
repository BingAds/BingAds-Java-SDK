package com.microsoft.bingads.v13.campaignmanagement;

/**
 * Enum class for LogicalOperator.
 */
public enum LogicalOperator {

    AND("And"),
    OR("Or"),
    NOT("Not");
        
    private final String value;

    LogicalOperator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LogicalOperator fromValue(String v) {
        for (LogicalOperator c : LogicalOperator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}