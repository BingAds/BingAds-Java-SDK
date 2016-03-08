package com.microsoft.bingads.reporting;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class RichAdSubTypeFilterConverter {

    private RichAdSubTypeFilterConverter() {
    }

    public static Collection<RichAdSubTypeFilter> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<RichAdSubTypeFilter> result = new ArrayList<RichAdSubTypeFilter>();

        for (String value : values) {
            result.add(RichAdSubTypeFilter.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<RichAdSubTypeFilter> enums) {
        String result = "";

        for (RichAdSubTypeFilter entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}