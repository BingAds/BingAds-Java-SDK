package com.microsoft.bingads.v11.reporting;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class DeviceOSReportFilterConverter {

    public static Collection<DeviceOSReportFilter> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<DeviceOSReportFilter> result = new ArrayList<DeviceOSReportFilter>();

        for (String value : values) {
            result.add(DeviceOSReportFilter.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<DeviceOSReportFilter> enums) {
        String result = "";

        for (DeviceOSReportFilter entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}