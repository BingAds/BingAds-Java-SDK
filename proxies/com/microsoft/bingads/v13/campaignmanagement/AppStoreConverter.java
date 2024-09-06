package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class AppStoreConverter {

    public static Collection<AppStore> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<AppStore> result = new ArrayList<AppStore>();

        for (String value : values) {
            result.add(AppStore.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<AppStore> enums) {
        String result = "";

        for (AppStore entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}