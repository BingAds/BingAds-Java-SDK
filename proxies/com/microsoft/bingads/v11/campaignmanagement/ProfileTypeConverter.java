package com.microsoft.bingads.v11.campaignmanagement;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class ProfileTypeConverter {

    public static Collection<ProfileType> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<ProfileType> result = new ArrayList<ProfileType>();

        for (String value : values) {
            result.add(ProfileType.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<ProfileType> enums) {
        String result = "";

        for (ProfileType entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}