package com.microsoft.bingads.bulk;

import java.util.ArrayList;
import java.util.List;

public class DataScopeConverter {

    public static List<DataScope> convertToList(String entityString) {
        String[] values = entityString.split(" ");

        List<DataScope> result = new ArrayList<DataScope>();

        for (String value : values) {
            result.add(DataScope.fromValue(value));
        }

        return result;
    }

    public static String convertToString(List<DataScope> list) {
        String result = "";

        for (DataScope entity : list) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}