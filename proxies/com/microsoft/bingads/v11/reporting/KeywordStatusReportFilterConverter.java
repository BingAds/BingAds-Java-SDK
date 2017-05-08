package com.microsoft.bingads.v11.reporting;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class KeywordStatusReportFilterConverter {

    public static Collection<KeywordStatusReportFilter> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<KeywordStatusReportFilter> result = new ArrayList<KeywordStatusReportFilter>();

        for (String value : values) {
            result.add(KeywordStatusReportFilter.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<KeywordStatusReportFilter> enums) {
        String result = "";

        for (KeywordStatusReportFilter entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}