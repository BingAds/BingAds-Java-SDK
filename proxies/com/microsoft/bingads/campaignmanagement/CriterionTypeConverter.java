package com.microsoft.bingads.campaignmanagement;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class CriterionTypeConverter {

    private CriterionTypeConverter() {
    }

    public static Collection<CriterionType> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<CriterionType> result = new ArrayList<CriterionType>();

        for (String value : values) {
            result.add(CriterionType.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<CriterionType> enums) {
        String result = "";

        for (CriterionType entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}