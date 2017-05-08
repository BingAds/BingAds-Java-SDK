package com.microsoft.bingads.v11.adinsight;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class KeywordOpportunityTypeConverter {

    public static Collection<KeywordOpportunityType> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<KeywordOpportunityType> result = new ArrayList<KeywordOpportunityType>();

        for (String value : values) {
            result.add(KeywordOpportunityType.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<KeywordOpportunityType> enums) {
        String result = "";

        for (KeywordOpportunityType entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}