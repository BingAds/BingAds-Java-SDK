package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class AdSubTypeConverter {

    public static Collection<AdSubType> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<AdSubType> result = new ArrayList<AdSubType>();

        for (String value : values) {
            result.add(AdSubType.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<AdSubType> enums) {
        String result = "";

        for (AdSubType entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}