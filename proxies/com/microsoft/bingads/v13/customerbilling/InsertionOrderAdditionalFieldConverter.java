package com.microsoft.bingads.v13.customerbilling;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class InsertionOrderAdditionalFieldConverter {

    public static Collection<InsertionOrderAdditionalField> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<InsertionOrderAdditionalField> result = new ArrayList<InsertionOrderAdditionalField>();

        for (String value : values) {
            result.add(InsertionOrderAdditionalField.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<InsertionOrderAdditionalField> enums) {
        String result = "";

        for (InsertionOrderAdditionalField entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}