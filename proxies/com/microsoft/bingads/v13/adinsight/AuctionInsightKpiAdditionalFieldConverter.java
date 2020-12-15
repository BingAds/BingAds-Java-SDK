package com.microsoft.bingads.v13.adinsight;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class AuctionInsightKpiAdditionalFieldConverter {

    public static Collection<AuctionInsightKpiAdditionalField> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<AuctionInsightKpiAdditionalField> result = new ArrayList<AuctionInsightKpiAdditionalField>();

        for (String value : values) {
            result.add(AuctionInsightKpiAdditionalField.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<AuctionInsightKpiAdditionalField> enums) {
        String result = "";

        for (AuctionInsightKpiAdditionalField entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}