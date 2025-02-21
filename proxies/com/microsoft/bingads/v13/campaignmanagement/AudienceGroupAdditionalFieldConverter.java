package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class AudienceGroupAdditionalFieldConverter {

    public static Collection<AudienceGroupAdditionalField> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<AudienceGroupAdditionalField> result = new ArrayList<AudienceGroupAdditionalField>();

        for (String value : values) {
            result.add(AudienceGroupAdditionalField.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<AudienceGroupAdditionalField> enums) {
        String result = "";

        for (AudienceGroupAdditionalField entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}