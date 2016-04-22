package com.microsoft.bingads.reporting;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class AdGroupStatusReportFilterConverter {

    private AdGroupStatusReportFilterConverter() {
    }

    public static Collection<AdGroupStatusReportFilter> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<AdGroupStatusReportFilter> result = new ArrayList<AdGroupStatusReportFilter>();

        for (String value : values) {
            result.add(AdGroupStatusReportFilter.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<AdGroupStatusReportFilter> enums) {
        String result = "";

        for (AdGroupStatusReportFilter entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}