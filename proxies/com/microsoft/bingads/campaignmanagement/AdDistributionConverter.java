package com.microsoft.bingads.campaignmanagement;

import java.util.ArrayList;
import java.util.List;

public class AdDistributionConverter {

    public static List<AdDistribution> convertToList(String entityString) {
        String[] values = entityString.split(" ");

        List<AdDistribution> result = new ArrayList<AdDistribution>();

        for (String value : values) {
            result.add(AdDistribution.fromValue(value));
        }

        return result;
    }

    public static String convertToString(List<AdDistribution> list) {
        String result = "";

        for (AdDistribution entity : list) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}