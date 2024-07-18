package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class MediaAdditionalFieldConverter {

    public static Collection<MediaAdditionalField> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<MediaAdditionalField> result = new ArrayList<MediaAdditionalField>();

        for (String value : values) {
            result.add(MediaAdditionalField.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<MediaAdditionalField> enums) {
        String result = "";

        for (MediaAdditionalField entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}