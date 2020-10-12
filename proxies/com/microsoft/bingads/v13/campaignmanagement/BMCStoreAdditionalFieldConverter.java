package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class BMCStoreAdditionalFieldConverter {

    public static Collection<BMCStoreAdditionalField> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<BMCStoreAdditionalField> result = new ArrayList<BMCStoreAdditionalField>();

        for (String value : values) {
            result.add(BMCStoreAdditionalField.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<BMCStoreAdditionalField> enums) {
        String result = "";

        for (BMCStoreAdditionalField entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}