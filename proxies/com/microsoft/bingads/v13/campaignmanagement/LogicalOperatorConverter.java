package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class LogicalOperatorConverter {

    public static Collection<LogicalOperator> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<LogicalOperator> result = new ArrayList<LogicalOperator>();

        for (String value : values) {
            result.add(LogicalOperator.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<LogicalOperator> enums) {
        String result = "";

        for (LogicalOperator entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}