package com.microsoft.bingads.v13.campaignmanagement;

/**
 * Enum class for DeviceType.
 */
public enum DeviceType {

    NONE("None"),
    COMPUTERS("Computers"),
    SMARTPHONES("Smartphones"),
    TABLETS("Tablets"),
    ALL("All");
        
    private final String value;

    DeviceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeviceType fromValue(String v) {
        for (DeviceType c : DeviceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}