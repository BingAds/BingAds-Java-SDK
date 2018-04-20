package com.microsoft.bingads.v12.reporting;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class BidMatchTypeReportFilterConverter {

    public static Collection<BidMatchTypeReportFilter> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<BidMatchTypeReportFilter> result = new ArrayList<BidMatchTypeReportFilter>();

        for (String value : values) {
            result.add(BidMatchTypeReportFilter.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<BidMatchTypeReportFilter> enums) {
        String result = "";

        for (BidMatchTypeReportFilter entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}