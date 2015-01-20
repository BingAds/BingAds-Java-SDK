package com.microsoft.bingads.reporting;

import java.util.ArrayList;
import java.util.List;

public class ChangeEntityReportFilterConverter {

    public static List<ChangeEntityReportFilter> convertToList(String entityString) {
        String[] values = entityString.split(" ");

        List<ChangeEntityReportFilter> result = new ArrayList<ChangeEntityReportFilter>();

        for (String value : values) {
            result.add(ChangeEntityReportFilter.fromValue(value));
        }

        return result;
    }

    public static String convertToString(List<ChangeEntityReportFilter> list) {
        String result = "";

        for (ChangeEntityReportFilter entity : list) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}