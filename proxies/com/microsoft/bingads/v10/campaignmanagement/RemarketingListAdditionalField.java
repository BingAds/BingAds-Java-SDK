package com.microsoft.bingads.v10.campaignmanagement;

/**
 * Enum class for RemarketingListAdditionalField.
 */
public enum RemarketingListAdditionalField {

    RULE("Rule");
        
    private final String value;

    RemarketingListAdditionalField(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RemarketingListAdditionalField fromValue(String v) {
        for (RemarketingListAdditionalField c : RemarketingListAdditionalField.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}