package com.microsoft.bingads.reporting;

import java.util.ArrayList;
import java.util.List;

public class RichAdSubTypeFilterConverter {

    public static List<RichAdSubTypeFilter> convertToList(String entityString) {
        String[] values = entityString.split(" ");

        List<RichAdSubTypeFilter> result = new ArrayList<RichAdSubTypeFilter>();

        for (String value : values) {
            result.add(RichAdSubTypeFilter.fromValue(value));
        }

        return result;
    }

    public static String convertToString(List<RichAdSubTypeFilter> list) {
        String result = "";

        for (RichAdSubTypeFilter entity : list) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}