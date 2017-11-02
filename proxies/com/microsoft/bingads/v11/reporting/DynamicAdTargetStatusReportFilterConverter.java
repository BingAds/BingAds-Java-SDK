package com.microsoft.bingads.v11.reporting;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class DynamicAdTargetStatusReportFilterConverter {

    public static Collection<DynamicAdTargetStatusReportFilter> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<DynamicAdTargetStatusReportFilter> result = new ArrayList<DynamicAdTargetStatusReportFilter>();

        for (String value : values) {
            result.add(DynamicAdTargetStatusReportFilter.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<DynamicAdTargetStatusReportFilter> enums) {
        String result = "";

        for (DynamicAdTargetStatusReportFilter entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}