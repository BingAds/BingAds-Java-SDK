package com.microsoft.bingads.campaignmanagement;

import java.util.ArrayList;
import java.util.List;

public class CriterionTypeConverter {

    public static List<CriterionType> convertToList(String entityString) {
        String[] values = entityString.split(" ");

        List<CriterionType> result = new ArrayList<CriterionType>();

        for (String value : values) {
            result.add(CriterionType.fromValue(value));
        }

        return result;
    }

    public static String convertToString(List<CriterionType> list) {
        String result = "";

        for (CriterionType entity : list) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}