package com.microsoft.bingads.v12.campaignmanagement;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class CampaignAdditionalFieldConverter {

    public static Collection<CampaignAdditionalField> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<CampaignAdditionalField> result = new ArrayList<CampaignAdditionalField>();

        for (String value : values) {
            result.add(CampaignAdditionalField.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<CampaignAdditionalField> enums) {
        String result = "";

        for (CampaignAdditionalField entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}