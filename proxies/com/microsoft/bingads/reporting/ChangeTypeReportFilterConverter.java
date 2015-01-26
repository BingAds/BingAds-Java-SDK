package com.microsoft.bingads.reporting;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class ChangeTypeReportFilterConverter {

    public static Collection<ChangeTypeReportFilter> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<ChangeTypeReportFilter> result = new ArrayList<ChangeTypeReportFilter>();

        for (String value : values) {
            result.add(ChangeTypeReportFilter.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<ChangeTypeReportFilter> enums) {
        String result = "";

        for (ChangeTypeReportFilter entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}