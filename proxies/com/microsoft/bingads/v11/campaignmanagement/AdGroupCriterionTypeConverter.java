package com.microsoft.bingads.v11.campaignmanagement;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class AdGroupCriterionTypeConverter {

    public static Collection<AdGroupCriterionType> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<AdGroupCriterionType> result = new ArrayList<AdGroupCriterionType>();

        for (String value : values) {
            result.add(AdGroupCriterionType.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<AdGroupCriterionType> enums) {
        String result = "";

        for (AdGroupCriterionType entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}