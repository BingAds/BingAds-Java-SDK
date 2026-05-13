package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class SharedEntityAssociationAdditionalFieldConverter {

    public static Collection<SharedEntityAssociationAdditionalField> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<SharedEntityAssociationAdditionalField> result = new ArrayList<SharedEntityAssociationAdditionalField>();

        for (String value : values) {
            result.add(SharedEntityAssociationAdditionalField.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<SharedEntityAssociationAdditionalField> enums) {
        String result = "";

        for (SharedEntityAssociationAdditionalField entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}