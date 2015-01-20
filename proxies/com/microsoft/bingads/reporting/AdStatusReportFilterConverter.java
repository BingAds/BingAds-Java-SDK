package com.microsoft.bingads.reporting;

import java.util.ArrayList;
import java.util.List;

public class AdStatusReportFilterConverter {

    public static List<AdStatusReportFilter> convertToList(String entityString) {
        String[] values = entityString.split(" ");

        List<AdStatusReportFilter> result = new ArrayList<AdStatusReportFilter>();

        for (String value : values) {
            result.add(AdStatusReportFilter.fromValue(value));
        }

        return result;
    }

    public static String convertToString(List<AdStatusReportFilter> list) {
        String result = "";

        for (AdStatusReportFilter entity : list) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}