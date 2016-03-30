package com.microsoft.bingads.reporting;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class BidStrategyTypeReportFilterConverter {

    public static Collection<BidStrategyTypeReportFilter> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<BidStrategyTypeReportFilter> result = new ArrayList<BidStrategyTypeReportFilter>();

        for (String value : values) {
            result.add(BidStrategyTypeReportFilter.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<BidStrategyTypeReportFilter> enums) {
        String result = "";

        for (BidStrategyTypeReportFilter entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}