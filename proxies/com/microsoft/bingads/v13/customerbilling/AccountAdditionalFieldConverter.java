package com.microsoft.bingads.v13.customerbilling;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class AccountAdditionalFieldConverter {

    public static Collection<AccountAdditionalField> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<AccountAdditionalField> result = new ArrayList<AccountAdditionalField>();

        for (String value : values) {
            result.add(AccountAdditionalField.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<AccountAdditionalField> enums) {
        String result = "";

        for (AccountAdditionalField entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}