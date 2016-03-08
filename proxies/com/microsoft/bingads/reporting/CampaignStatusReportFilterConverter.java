package com.microsoft.bingads.reporting;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class CampaignStatusReportFilterConverter {

    private CampaignStatusReportFilterConverter() {
    }

    public static Collection<CampaignStatusReportFilter> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<CampaignStatusReportFilter> result = new ArrayList<CampaignStatusReportFilter>();

        for (String value : values) {
            result.add(CampaignStatusReportFilter.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<CampaignStatusReportFilter> enums) {
        String result = "";

        for (CampaignStatusReportFilter entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}