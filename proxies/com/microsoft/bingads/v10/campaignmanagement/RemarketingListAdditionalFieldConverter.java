package com.microsoft.bingads.v10.campaignmanagement;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class RemarketingListAdditionalFieldConverter {

    public static Collection<RemarketingListAdditionalField> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<RemarketingListAdditionalField> result = new ArrayList<RemarketingListAdditionalField>();

        for (String value : values) {
            result.add(RemarketingListAdditionalField.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<RemarketingListAdditionalField> enums) {
        String result = "";

        for (RemarketingListAdditionalField entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}