package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class ProductAudienceTypeConverter {

    public static Collection<ProductAudienceType> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<ProductAudienceType> result = new ArrayList<ProductAudienceType>();

        for (String value : values) {
            result.add(ProductAudienceType.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<ProductAudienceType> enums) {
        String result = "";

        for (ProductAudienceType entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}