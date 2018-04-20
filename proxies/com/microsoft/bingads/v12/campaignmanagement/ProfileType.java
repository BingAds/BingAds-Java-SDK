package com.microsoft.bingads.v12.campaignmanagement;

/**
 * Enum class for ProfileType.
 */
public enum ProfileType {

    COMPANY_NAME("CompanyName"),
    JOB_FUNCTION("JobFunction"),
    INDUSTRY("Industry");
        
    private final String value;

    ProfileType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProfileType fromValue(String v) {
        for (ProfileType c : ProfileType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}