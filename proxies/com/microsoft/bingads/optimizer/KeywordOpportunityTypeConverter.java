package com.microsoft.bingads.optimizer;

import java.util.ArrayList;
import java.util.List;

public class KeywordOpportunityTypeConverter {

    public static List<KeywordOpportunityType> convertToList(String entityString) {
        String[] values = entityString.split(" ");

        List<KeywordOpportunityType> result = new ArrayList<KeywordOpportunityType>();

        for (String value : values) {
            result.add(KeywordOpportunityType.fromValue(value));
        }

        return result;
    }

    public static String convertToString(List<KeywordOpportunityType> list) {
        String result = "";

        for (KeywordOpportunityType entity : list) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}