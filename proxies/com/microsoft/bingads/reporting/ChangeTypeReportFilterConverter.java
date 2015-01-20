package com.microsoft.bingads.reporting;

import java.util.ArrayList;
import java.util.List;

public class ChangeTypeReportFilterConverter {

    public static List<ChangeTypeReportFilter> convertToList(String entityString) {
        String[] values = entityString.split(" ");

        List<ChangeTypeReportFilter> result = new ArrayList<ChangeTypeReportFilter>();

        for (String value : values) {
            result.add(ChangeTypeReportFilter.fromValue(value));
        }

        return result;
    }

    public static String convertToString(List<ChangeTypeReportFilter> list) {
        String result = "";

        for (ChangeTypeReportFilter entity : list) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}