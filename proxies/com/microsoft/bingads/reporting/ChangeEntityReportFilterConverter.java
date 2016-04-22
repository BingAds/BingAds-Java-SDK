package com.microsoft.bingads.reporting;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class ChangeEntityReportFilterConverter {

    private ChangeEntityReportFilterConverter() {
    }

    public static Collection<ChangeEntityReportFilter> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<ChangeEntityReportFilter> result = new ArrayList<ChangeEntityReportFilter>();

        for (String value : values) {
            result.add(ChangeEntityReportFilter.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<ChangeEntityReportFilter> enums) {
        String result = "";

        for (ChangeEntityReportFilter entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}