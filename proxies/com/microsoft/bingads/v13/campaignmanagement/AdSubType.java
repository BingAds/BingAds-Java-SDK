package com.microsoft.bingads.v13.campaignmanagement;

/**
 * Enum class for AdSubType.
 */
public enum AdSubType {

    VIDEO("Video"),
    DISPLAY("Display"),
    H_T_M_L5("HTML5");
        
    private final String value;

    AdSubType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdSubType fromValue(String v) {
        for (AdSubType c : AdSubType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}