package com.microsoft.bingads.v13.campaignmanagement;

/**
 * Enum class for ExperimentAdditionalField.
 */
public enum ExperimentAdditionalField {

    EXPERIMENT_SUB_TYPE("ExperimentSubType"),
    EXPERIMENT_ARMS("ExperimentArms");
        
    private final String value;

    ExperimentAdditionalField(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExperimentAdditionalField fromValue(String v) {
        for (ExperimentAdditionalField c : ExperimentAdditionalField.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}