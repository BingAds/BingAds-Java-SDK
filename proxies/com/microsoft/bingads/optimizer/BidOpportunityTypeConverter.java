package com.microsoft.bingads.optimizer;

import java.util.ArrayList;
import java.util.List;

public class BidOpportunityTypeConverter {

    public static List<BidOpportunityType> convertToList(String entityString) {
        String[] values = entityString.split(" ");

        List<BidOpportunityType> result = new ArrayList<BidOpportunityType>();

        for (String value : values) {
            result.add(BidOpportunityType.fromValue(value));
        }

        return result;
    }

    public static String convertToString(List<BidOpportunityType> list) {
        String result = "";

        for (BidOpportunityType entity : list) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}