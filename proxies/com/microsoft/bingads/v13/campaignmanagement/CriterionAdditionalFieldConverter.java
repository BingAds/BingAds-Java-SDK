package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class CriterionAdditionalFieldConverter {

    public static Collection<CriterionAdditionalField> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<CriterionAdditionalField> result = new ArrayList<CriterionAdditionalField>();

        for (String value : values) {
            result.add(CriterionAdditionalField.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<CriterionAdditionalField> enums) {
        String result = "";

        for (CriterionAdditionalField entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}