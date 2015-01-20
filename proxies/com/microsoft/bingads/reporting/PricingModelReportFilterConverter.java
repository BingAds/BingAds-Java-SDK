package com.microsoft.bingads.reporting;

import java.util.ArrayList;
import java.util.List;

public class PricingModelReportFilterConverter {

    public static List<PricingModelReportFilter> convertToList(String entityString) {
        String[] values = entityString.split(" ");

        List<PricingModelReportFilter> result = new ArrayList<PricingModelReportFilter>();

        for (String value : values) {
            result.add(PricingModelReportFilter.fromValue(value));
        }

        return result;
    }

    public static String convertToString(List<PricingModelReportFilter> list) {
        String result = "";

        for (PricingModelReportFilter entity : list) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}