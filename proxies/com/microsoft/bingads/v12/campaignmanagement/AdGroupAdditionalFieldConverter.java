package com.microsoft.bingads.v12.campaignmanagement;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class AdGroupAdditionalFieldConverter {

    public static Collection<AdGroupAdditionalField> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<AdGroupAdditionalField> result = new ArrayList<AdGroupAdditionalField>();

        for (String value : values) {
            result.add(AdGroupAdditionalField.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<AdGroupAdditionalField> enums) {
        String result = "";

        for (AdGroupAdditionalField entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}