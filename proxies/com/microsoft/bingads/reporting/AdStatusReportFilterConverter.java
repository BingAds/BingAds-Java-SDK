package com.microsoft.bingads.reporting;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class AdStatusReportFilterConverter {

    private AdStatusReportFilterConverter() {
    }

    public static Collection<AdStatusReportFilter> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<AdStatusReportFilter> result = new ArrayList<AdStatusReportFilter>();

        for (String value : values) {
            result.add(AdStatusReportFilter.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<AdStatusReportFilter> enums) {
        String result = "";

        for (AdStatusReportFilter entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}