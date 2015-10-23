package com.microsoft.bingads.v10.campaignmanagement;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class AdExtensionsTypeFilterConverter {

    public static Collection<AdExtensionsTypeFilter> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<AdExtensionsTypeFilter> result = new ArrayList<AdExtensionsTypeFilter>();

        for (String value : values) {
            result.add(AdExtensionsTypeFilter.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<AdExtensionsTypeFilter> enums) {
        String result = "";

        for (AdExtensionsTypeFilter entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}