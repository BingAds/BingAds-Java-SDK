package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class PortfolioBidStrategyAdditionalFieldConverter {

    public static Collection<PortfolioBidStrategyAdditionalField> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<PortfolioBidStrategyAdditionalField> result = new ArrayList<PortfolioBidStrategyAdditionalField>();

        for (String value : values) {
            result.add(PortfolioBidStrategyAdditionalField.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<PortfolioBidStrategyAdditionalField> enums) {
        String result = "";

        for (PortfolioBidStrategyAdditionalField entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}