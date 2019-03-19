package com.microsoft.bingads.v12.campaignmanagement;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class AdGroupCriterionAdditionalFieldConverter {

    public static Collection<AdGroupCriterionAdditionalField> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<AdGroupCriterionAdditionalField> result = new ArrayList<AdGroupCriterionAdditionalField>();

        for (String value : values) {
            result.add(AdGroupCriterionAdditionalField.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<AdGroupCriterionAdditionalField> enums) {
        String result = "";

        for (AdGroupCriterionAdditionalField entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}