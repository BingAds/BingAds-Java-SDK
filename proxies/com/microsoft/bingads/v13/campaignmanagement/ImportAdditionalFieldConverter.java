package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class ImportAdditionalFieldConverter {

    public static Collection<ImportAdditionalField> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<ImportAdditionalField> result = new ArrayList<ImportAdditionalField>();

        for (String value : values) {
            result.add(ImportAdditionalField.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<ImportAdditionalField> enums) {
        String result = "";

        for (ImportAdditionalField entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}