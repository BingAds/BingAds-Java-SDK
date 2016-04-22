package com.microsoft.bingads.v10.campaignmanagement;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class AdDistributionConverter {

    private AdDistributionConverter() {
    }

    public static Collection<AdDistribution> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<AdDistribution> result = new ArrayList<AdDistribution>();

        for (String value : values) {
            result.add(AdDistribution.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<AdDistribution> enums) {
        String result = "";

        for (AdDistribution entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}