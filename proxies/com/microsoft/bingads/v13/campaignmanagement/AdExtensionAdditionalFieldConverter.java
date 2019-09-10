package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class AdExtensionAdditionalFieldConverter {

    public static Collection<AdExtensionAdditionalField> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<AdExtensionAdditionalField> result = new ArrayList<AdExtensionAdditionalField>();

        for (String value : values) {
            result.add(AdExtensionAdditionalField.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<AdExtensionAdditionalField> enums) {
        String result = "";

        for (AdExtensionAdditionalField entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}