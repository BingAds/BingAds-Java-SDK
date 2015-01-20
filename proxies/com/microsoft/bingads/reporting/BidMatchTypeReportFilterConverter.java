package com.microsoft.bingads.reporting;

import java.util.ArrayList;
import java.util.List;

public class BidMatchTypeReportFilterConverter {

    public static List<BidMatchTypeReportFilter> convertToList(String entityString) {
        String[] values = entityString.split(" ");

        List<BidMatchTypeReportFilter> result = new ArrayList<BidMatchTypeReportFilter>();

        for (String value : values) {
            result.add(BidMatchTypeReportFilter.fromValue(value));
        }

        return result;
    }

    public static String convertToString(List<BidMatchTypeReportFilter> list) {
        String result = "";

        for (BidMatchTypeReportFilter entity : list) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}