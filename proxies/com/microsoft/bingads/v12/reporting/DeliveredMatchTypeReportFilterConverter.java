package com.microsoft.bingads.v12.reporting;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class DeliveredMatchTypeReportFilterConverter {

    public static Collection<DeliveredMatchTypeReportFilter> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<DeliveredMatchTypeReportFilter> result = new ArrayList<DeliveredMatchTypeReportFilter>();

        for (String value : values) {
            result.add(DeliveredMatchTypeReportFilter.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<DeliveredMatchTypeReportFilter> enums) {
        String result = "";

        for (DeliveredMatchTypeReportFilter entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}