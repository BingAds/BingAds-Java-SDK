package com.microsoft.bingads.campaignmanagement;

import java.util.ArrayList;
import java.util.List;

public class AdExtensionsTypeFilterConverter {

    public static List<AdExtensionsTypeFilter> convertToList(String entityString) {
        String[] values = entityString.split(" ");

        List<AdExtensionsTypeFilter> result = new ArrayList<AdExtensionsTypeFilter>();

        for (String value : values) {
            result.add(AdExtensionsTypeFilter.fromValue(value));
        }

        return result;
    }

    public static String convertToString(List<AdExtensionsTypeFilter> list) {
        String result = "";

        for (AdExtensionsTypeFilter entity : list) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}