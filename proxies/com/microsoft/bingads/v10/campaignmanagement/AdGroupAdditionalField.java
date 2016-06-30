package com.microsoft.bingads.v10.campaignmanagement;

/**
 * Enum class for AdGroupAdditionalField.
 */
public enum AdGroupAdditionalField {

    BIDDING_SCHEME("BiddingScheme"),
    REMARKETING_TARGETING_SETTING("RemarketingTargetingSetting");
        
    private final String value;

    AdGroupAdditionalField(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdGroupAdditionalField fromValue(String v) {
        for (AdGroupAdditionalField c : AdGroupAdditionalField.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}