package com.microsoft.bingads.v13.campaignmanagement;

/**
 * Enum class for ConversionGoalAdditionalField.
 */
public enum ConversionGoalAdditionalField {

    VIEW_THROUGH_CONVERSION_WINDOW_IN_MINUTES("ViewThroughConversionWindowInMinutes"),
    IS_EXTERNALLY_ATTRIBUTED("IsExternallyAttributed"),
    GOAL_CATEGORY("GoalCategory"),
    INACTIVE_DUE_TO_TAG_UNAVAILABLE("InactiveDueToTagUnavailable"),
    ATTRIBUTION_MODEL_TYPE("AttributionModelType"),
    IS_ENHANCED_CONVERSIONS_ENABLED("IsEnhancedConversionsEnabled"),
    IS_AUTO_GOAL("IsAutoGoal"),
    DATA_DRIVEN_ATTRIBUTE("DataDrivenAttribute");
        
    private final String value;

    ConversionGoalAdditionalField(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConversionGoalAdditionalField fromValue(String v) {
        for (ConversionGoalAdditionalField c : ConversionGoalAdditionalField.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}