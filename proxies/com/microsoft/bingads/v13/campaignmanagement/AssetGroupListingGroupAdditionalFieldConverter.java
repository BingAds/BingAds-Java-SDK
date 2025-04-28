package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class AssetGroupListingGroupAdditionalFieldConverter {

    public static Collection<AssetGroupListingGroupAdditionalField> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<AssetGroupListingGroupAdditionalField> result = new ArrayList<AssetGroupListingGroupAdditionalField>();

        for (String value : values) {
            result.add(AssetGroupListingGroupAdditionalField.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<AssetGroupListingGroupAdditionalField> enums) {
        String result = "";

        for (AssetGroupListingGroupAdditionalField entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}