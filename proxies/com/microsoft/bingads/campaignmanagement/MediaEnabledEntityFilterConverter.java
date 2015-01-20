package com.microsoft.bingads.campaignmanagement;

import java.util.ArrayList;
import java.util.List;

public class MediaEnabledEntityFilterConverter {

    public static List<MediaEnabledEntityFilter> convertToList(String entityString) {
        String[] values = entityString.split(" ");

        List<MediaEnabledEntityFilter> result = new ArrayList<MediaEnabledEntityFilter>();

        for (String value : values) {
            result.add(MediaEnabledEntityFilter.fromValue(value));
        }

        return result;
    }

    public static String convertToString(List<MediaEnabledEntityFilter> list) {
        String result = "";

        for (MediaEnabledEntityFilter entity : list) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}