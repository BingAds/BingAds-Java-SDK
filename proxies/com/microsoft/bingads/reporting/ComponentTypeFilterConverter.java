package com.microsoft.bingads.reporting;

import java.util.ArrayList;
import java.util.List;

public class ComponentTypeFilterConverter {

    public static List<ComponentTypeFilter> convertToList(String entityString) {
        String[] values = entityString.split(" ");

        List<ComponentTypeFilter> result = new ArrayList<ComponentTypeFilter>();

        for (String value : values) {
            result.add(ComponentTypeFilter.fromValue(value));
        }

        return result;
    }

    public static String convertToString(List<ComponentTypeFilter> list) {
        String result = "";

        for (ComponentTypeFilter entity : list) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}