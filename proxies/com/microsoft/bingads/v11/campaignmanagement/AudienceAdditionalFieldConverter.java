package com.microsoft.bingads.v11.campaignmanagement;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class AudienceAdditionalFieldConverter {

    public static Collection<AudienceAdditionalField> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<AudienceAdditionalField> result = new ArrayList<AudienceAdditionalField>();

        for (String value : values) {
            result.add(AudienceAdditionalField.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<AudienceAdditionalField> enums) {
        String result = "";

        for (AudienceAdditionalField entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}