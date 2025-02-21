package com.microsoft.bingads.v13.reporting;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class CampaignTypeReportFilterConverter {

    public static Collection<CampaignTypeReportFilter> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<CampaignTypeReportFilter> result = new ArrayList<CampaignTypeReportFilter>();

        for (String value : values) {
            result.add(CampaignTypeReportFilter.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<CampaignTypeReportFilter> enums) {
        String result = "";

        for (CampaignTypeReportFilter entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}