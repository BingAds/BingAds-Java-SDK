package com.microsoft.bingads.v11.reporting;

/**
 * Enum class for DeviceTypeReportFilter.
 */
public enum DeviceTypeReportFilter {

    COMPUTER("Computer"),
    SMART_PHONE("SmartPhone"),
    NON_SMART_PHONE("NonSmartPhone"),
    TABLET("Tablet");
        
    private final String value;

    DeviceTypeReportFilter(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeviceTypeReportFilter fromValue(String v) {
        for (DeviceTypeReportFilter c : DeviceTypeReportFilter.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}