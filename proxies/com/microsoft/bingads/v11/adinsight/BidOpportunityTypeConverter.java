package com.microsoft.bingads.v11.adinsight;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class BidOpportunityTypeConverter {

    public static Collection<BidOpportunityType> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<BidOpportunityType> result = new ArrayList<BidOpportunityType>();

        for (String value : values) {
            result.add(BidOpportunityType.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<BidOpportunityType> enums) {
        String result = "";

        for (BidOpportunityType entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}