package com.microsoft.bingads.reporting;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class AccountStatusReportFilterConverter {

    public static Collection<AccountStatusReportFilter> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<AccountStatusReportFilter> result = new ArrayList<AccountStatusReportFilter>();

        for (String value : values) {
            result.add(AccountStatusReportFilter.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<AccountStatusReportFilter> enums) {
        String result = "";

        for (AccountStatusReportFilter entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}