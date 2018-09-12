package com.microsoft.bingads.v12.campaignmanagement;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class AdAdditionalFieldConverter {

    public static Collection<AdAdditionalField> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<AdAdditionalField> result = new ArrayList<AdAdditionalField>();

        for (String value : values) {
            result.add(AdAdditionalField.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<AdAdditionalField> enums) {
        String result = "";

        for (AdAdditionalField entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}