package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class BrandKitAdditionalFieldConverter {

    public static Collection<BrandKitAdditionalField> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<BrandKitAdditionalField> result = new ArrayList<BrandKitAdditionalField>();

        for (String value : values) {
            result.add(BrandKitAdditionalField.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<BrandKitAdditionalField> enums) {
        String result = "";

        for (BrandKitAdditionalField entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}