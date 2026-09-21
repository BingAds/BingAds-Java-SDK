package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class LinkedInSegmentTypeConverter {

    public static Collection<LinkedInSegmentType> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<LinkedInSegmentType> result = new ArrayList<LinkedInSegmentType>();

        for (String value : values) {
            result.add(LinkedInSegmentType.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<LinkedInSegmentType> enums) {
        String result = "";

        for (LinkedInSegmentType entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}