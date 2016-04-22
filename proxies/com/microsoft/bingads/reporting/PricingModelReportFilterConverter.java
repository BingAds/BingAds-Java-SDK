package com.microsoft.bingads.reporting;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class PricingModelReportFilterConverter {

    private PricingModelReportFilterConverter() {
    }

    public static Collection<PricingModelReportFilter> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<PricingModelReportFilter> result = new ArrayList<PricingModelReportFilter>();

        for (String value : values) {
            result.add(PricingModelReportFilter.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<PricingModelReportFilter> enums) {
        String result = "";

        for (PricingModelReportFilter entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}