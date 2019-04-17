package com.microsoft.bingads.v13.reporting;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class DeviceTypeReportFilterConverter {

    public static Collection<DeviceTypeReportFilter> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<DeviceTypeReportFilter> result = new ArrayList<DeviceTypeReportFilter>();

        for (String value : values) {
            result.add(DeviceTypeReportFilter.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<DeviceTypeReportFilter> enums) {
        String result = "";

        for (DeviceTypeReportFilter entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}