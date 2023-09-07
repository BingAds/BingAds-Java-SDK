package com.microsoft.bingads.v13.reporting;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class AssetGroupStatusReportFilterConverter {

    public static Collection<AssetGroupStatusReportFilter> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<AssetGroupStatusReportFilter> result = new ArrayList<AssetGroupStatusReportFilter>();

        for (String value : values) {
            result.add(AssetGroupStatusReportFilter.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<AssetGroupStatusReportFilter> enums) {
        String result = "";

        for (AssetGroupStatusReportFilter entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}