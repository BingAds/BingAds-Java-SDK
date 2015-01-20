package com.microsoft.bingads.reporting;

import java.util.ArrayList;
import java.util.List;

public class AdTypeReportFilterConverter {

    public static List<AdTypeReportFilter> convertToList(String entityString) {
        String[] values = entityString.split(" ");

        List<AdTypeReportFilter> result = new ArrayList<AdTypeReportFilter>();

        for (String value : values) {
            result.add(AdTypeReportFilter.fromValue(value));
        }

        return result;
    }

    public static String convertToString(List<AdTypeReportFilter> list) {
        String result = "";

        for (AdTypeReportFilter entity : list) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}