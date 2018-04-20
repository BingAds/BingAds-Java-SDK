package com.microsoft.bingads.v12.reporting;

/**
 * Enum class for DeviceOSReportFilter.
 */
public enum DeviceOSReportFilter {

    OTHER("Other"),
    WINDOWS("Windows"),
    I_O_S("iOS"),
    ANDROID("Android"),
    BLACK_BERRY("BlackBerry");
        
    private final String value;

    DeviceOSReportFilter(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeviceOSReportFilter fromValue(String v) {
        for (DeviceOSReportFilter c : DeviceOSReportFilter.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}