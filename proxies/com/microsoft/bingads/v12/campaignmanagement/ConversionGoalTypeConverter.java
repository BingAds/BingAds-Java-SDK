package com.microsoft.bingads.v12.campaignmanagement;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class ConversionGoalTypeConverter {

    public static Collection<ConversionGoalType> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<ConversionGoalType> result = new ArrayList<ConversionGoalType>();

        for (String value : values) {
            result.add(ConversionGoalType.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<ConversionGoalType> enums) {
        String result = "";

        for (ConversionGoalType entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}