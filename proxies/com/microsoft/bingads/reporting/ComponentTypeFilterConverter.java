package com.microsoft.bingads.reporting;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class ComponentTypeFilterConverter {

    private ComponentTypeFilterConverter() {
    }

    public static Collection<ComponentTypeFilter> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<ComponentTypeFilter> result = new ArrayList<ComponentTypeFilter>();

        for (String value : values) {
            result.add(ComponentTypeFilter.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<ComponentTypeFilter> enums) {
        String result = "";

        for (ComponentTypeFilter entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}