package com.microsoft.bingads.reporting;

import java.util.ArrayList;
import java.util.List;

public class AdGroupStatusReportFilterConverter {

    public static List<AdGroupStatusReportFilter> convertToList(String entityString) {
        String[] values = entityString.split(" ");

        List<AdGroupStatusReportFilter> result = new ArrayList<AdGroupStatusReportFilter>();

        for (String value : values) {
            result.add(AdGroupStatusReportFilter.fromValue(value));
        }

        return result;
    }

    public static String convertToString(List<AdGroupStatusReportFilter> list) {
        String result = "";

        for (AdGroupStatusReportFilter entity : list) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}