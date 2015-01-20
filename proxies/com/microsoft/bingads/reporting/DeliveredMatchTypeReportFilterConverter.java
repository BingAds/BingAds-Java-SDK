package com.microsoft.bingads.reporting;

import java.util.ArrayList;
import java.util.List;

public class DeliveredMatchTypeReportFilterConverter {

    public static List<DeliveredMatchTypeReportFilter> convertToList(String entityString) {
        String[] values = entityString.split(" ");

        List<DeliveredMatchTypeReportFilter> result = new ArrayList<DeliveredMatchTypeReportFilter>();

        for (String value : values) {
            result.add(DeliveredMatchTypeReportFilter.fromValue(value));
        }

        return result;
    }

    public static String convertToString(List<DeliveredMatchTypeReportFilter> list) {
        String result = "";

        for (DeliveredMatchTypeReportFilter entity : list) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}