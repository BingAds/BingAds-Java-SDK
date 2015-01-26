package com.microsoft.bingads.bulk;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class DataScopeConverter {

    public static Collection<DataScope> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<DataScope> result = new ArrayList<DataScope>();

        for (String value : values) {
            result.add(DataScope.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<DataScope> enums) {
        String result = "";

        for (DataScope entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}