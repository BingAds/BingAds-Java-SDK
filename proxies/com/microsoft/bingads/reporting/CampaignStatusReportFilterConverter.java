package com.microsoft.bingads.reporting;

import java.util.ArrayList;
import java.util.List;

public class CampaignStatusReportFilterConverter {

    public static List<CampaignStatusReportFilter> convertToList(String entityString) {
        String[] values = entityString.split(" ");

        List<CampaignStatusReportFilter> result = new ArrayList<CampaignStatusReportFilter>();

        for (String value : values) {
            result.add(CampaignStatusReportFilter.fromValue(value));
        }

        return result;
    }

    public static String convertToString(List<CampaignStatusReportFilter> list) {
        String result = "";

        for (CampaignStatusReportFilter entity : list) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}