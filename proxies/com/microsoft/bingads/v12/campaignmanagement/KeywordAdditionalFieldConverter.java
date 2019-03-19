package com.microsoft.bingads.v12.campaignmanagement;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class KeywordAdditionalFieldConverter {

    public static Collection<KeywordAdditionalField> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<KeywordAdditionalField> result = new ArrayList<KeywordAdditionalField>();

        for (String value : values) {
            result.add(KeywordAdditionalField.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<KeywordAdditionalField> enums) {
        String result = "";

        for (KeywordAdditionalField entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}