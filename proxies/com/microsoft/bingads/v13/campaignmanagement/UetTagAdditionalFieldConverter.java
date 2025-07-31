package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class UetTagAdditionalFieldConverter {

    public static Collection<UetTagAdditionalField> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<UetTagAdditionalField> result = new ArrayList<UetTagAdditionalField>();

        for (String value : values) {
            result.add(UetTagAdditionalField.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<UetTagAdditionalField> enums) {
        String result = "";

        for (UetTagAdditionalField entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}