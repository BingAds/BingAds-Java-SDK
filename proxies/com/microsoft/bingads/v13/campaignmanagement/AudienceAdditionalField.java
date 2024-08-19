package com.microsoft.bingads.v13.campaignmanagement;

/**
 * Enum class for AudienceAdditionalField.
 */
public enum AudienceAdditionalField {

    NORMAL_FORM("NormalForm"),
    NUMBER_RULE_ITEM("NumberRuleItem"),
    IMPRESSION_BASED_REMARKETING_LIST("ImpressionBasedRemarketingList");
        
    private final String value;

    AudienceAdditionalField(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AudienceAdditionalField fromValue(String v) {
        for (AudienceAdditionalField c : AudienceAdditionalField.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}