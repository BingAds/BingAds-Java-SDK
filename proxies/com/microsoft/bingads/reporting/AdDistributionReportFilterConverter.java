package com.microsoft.bingads.reporting;

import java.util.ArrayList;
import java.util.List;

public class AdDistributionReportFilterConverter {

    public static List<AdDistributionReportFilter> convertToList(String entityString) {
        String[] values = entityString.split(" ");

        List<AdDistributionReportFilter> result = new ArrayList<AdDistributionReportFilter>();

        for (String value : values) {
            result.add(AdDistributionReportFilter.fromValue(value));
        }

        return result;
    }

    public static String convertToString(List<AdDistributionReportFilter> list) {
        String result = "";

        for (AdDistributionReportFilter entity : list) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}