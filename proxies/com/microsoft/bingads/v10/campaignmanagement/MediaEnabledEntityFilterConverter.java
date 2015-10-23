package com.microsoft.bingads.v10.campaignmanagement;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class MediaEnabledEntityFilterConverter {

    public static Collection<MediaEnabledEntityFilter> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<MediaEnabledEntityFilter> result = new ArrayList<MediaEnabledEntityFilter>();

        for (String value : values) {
            result.add(MediaEnabledEntityFilter.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<MediaEnabledEntityFilter> enums) {
        String result = "";

        for (MediaEnabledEntityFilter entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}