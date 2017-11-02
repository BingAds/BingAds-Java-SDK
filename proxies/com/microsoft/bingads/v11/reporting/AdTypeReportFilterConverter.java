package com.microsoft.bingads.v11.reporting;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class AdTypeReportFilterConverter {

    public static Collection<AdTypeReportFilter> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<AdTypeReportFilter> result = new ArrayList<AdTypeReportFilter>();

        for (String value : values) {
            result.add(AdTypeReportFilter.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<AdTypeReportFilter> enums) {
        String result = "";

        for (AdTypeReportFilter entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}