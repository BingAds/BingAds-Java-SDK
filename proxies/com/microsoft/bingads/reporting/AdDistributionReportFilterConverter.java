package com.microsoft.bingads.reporting;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class AdDistributionReportFilterConverter {

    private AdDistributionReportFilterConverter() {
    }

    public static Collection<AdDistributionReportFilter> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<AdDistributionReportFilter> result = new ArrayList<AdDistributionReportFilter>();

        for (String value : values) {
            result.add(AdDistributionReportFilter.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<AdDistributionReportFilter> enums) {
        String result = "";

        for (AdDistributionReportFilter entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}