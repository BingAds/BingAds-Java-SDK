package com.microsoft.bingads.v13.campaignmanagement;

/**
 * Enum class for AudienceType.
 */
public enum AudienceType {

    REMARKETING_LIST("RemarketingList"),
    CUSTOM("Custom"),
    IN_MARKET("InMarket"),
    PRODUCT("Product"),
    SIMILAR_REMARKETING_LIST("SimilarRemarketingList"),
    COMBINED_LIST("CombinedList"),
    CUSTOMER_LIST("CustomerList"),
    IMPRESSION_BASED_REMARKETING_LIST("ImpressionBasedRemarketingList");
        
    private final String value;

    AudienceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AudienceType fromValue(String v) {
        for (AudienceType c : AudienceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}