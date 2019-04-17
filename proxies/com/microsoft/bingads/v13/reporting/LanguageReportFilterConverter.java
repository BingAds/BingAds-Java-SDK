package com.microsoft.bingads.v13.reporting;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class LanguageReportFilterConverter {

    public static Collection<LanguageReportFilter> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<LanguageReportFilter> result = new ArrayList<LanguageReportFilter>();

        for (String value : values) {
            result.add(LanguageReportFilter.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<LanguageReportFilter> enums) {
        String result = "";

        for (LanguageReportFilter entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}