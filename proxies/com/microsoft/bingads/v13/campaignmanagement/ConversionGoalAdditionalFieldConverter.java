package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class ConversionGoalAdditionalFieldConverter {

    public static Collection<ConversionGoalAdditionalField> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<ConversionGoalAdditionalField> result = new ArrayList<ConversionGoalAdditionalField>();

        for (String value : values) {
            result.add(ConversionGoalAdditionalField.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<ConversionGoalAdditionalField> enums) {
        String result = "";

        for (ConversionGoalAdditionalField entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}