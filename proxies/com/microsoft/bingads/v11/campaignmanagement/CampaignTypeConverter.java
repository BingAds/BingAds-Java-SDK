package com.microsoft.bingads.v11.campaignmanagement;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class CampaignTypeConverter {

    public static Collection<CampaignType> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<CampaignType> result = new ArrayList<CampaignType>();

        for (String value : values) {
            result.add(CampaignType.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<CampaignType> enums) {
        String result = "";

        for (CampaignType entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}