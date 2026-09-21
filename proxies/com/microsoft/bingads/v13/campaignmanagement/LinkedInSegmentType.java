package com.microsoft.bingads.v13.campaignmanagement;

/**
 * Enum class for LinkedInSegmentType.
 */
public enum LinkedInSegmentType {

    COMPANY_LIST("CompanyList");
        
    private final String value;

    LinkedInSegmentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LinkedInSegmentType fromValue(String v) {
        for (LinkedInSegmentType c : LinkedInSegmentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}