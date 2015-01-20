package com.microsoft.bingads.reporting;

import java.util.ArrayList;
import java.util.List;

public class DeviceOSReportFilterConverter {

    public static List<DeviceOSReportFilter> convertToList(String entityString) {
        String[] values = entityString.split(" ");

        List<DeviceOSReportFilter> result = new ArrayList<DeviceOSReportFilter>();

        for (String value : values) {
            result.add(DeviceOSReportFilter.fromValue(value));
        }

        return result;
    }

    public static String convertToString(List<DeviceOSReportFilter> list) {
        String result = "";

        for (DeviceOSReportFilter entity : list) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}