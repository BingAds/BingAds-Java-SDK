package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class AssetGroupAdditionalFieldConverter {

    public static Collection<AssetGroupAdditionalField> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<AssetGroupAdditionalField> result = new ArrayList<AssetGroupAdditionalField>();

        for (String value : values) {
            result.add(AssetGroupAdditionalField.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<AssetGroupAdditionalField> enums) {
        String result = "";

        for (AssetGroupAdditionalField entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}