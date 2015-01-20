package com.microsoft.bingads.reporting;

import java.util.ArrayList;
import java.util.List;

public class DeviceTypeReportFilterConverter {

    public static List<DeviceTypeReportFilter> convertToList(String entityString) {
        String[] values = entityString.split(" ");

        List<DeviceTypeReportFilter> result = new ArrayList<DeviceTypeReportFilter>();

        for (String value : values) {
            result.add(DeviceTypeReportFilter.fromValue(value));
        }

        return result;
    }

    public static String convertToString(List<DeviceTypeReportFilter> list) {
        String result = "";

        for (DeviceTypeReportFilter entity : list) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}