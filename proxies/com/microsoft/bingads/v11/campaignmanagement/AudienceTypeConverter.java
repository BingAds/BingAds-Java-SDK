package com.microsoft.bingads.v11.campaignmanagement;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class AudienceTypeConverter {

    public static Collection<AudienceType> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<AudienceType> result = new ArrayList<AudienceType>();

        for (String value : values) {
            result.add(AudienceType.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<AudienceType> enums) {
        String result = "";

        for (AudienceType entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}