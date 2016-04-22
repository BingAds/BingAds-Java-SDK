package com.microsoft.bingads.v10.campaignmanagement;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class CampaignCriterionTypeConverter {

    private CampaignCriterionTypeConverter() {
    }

    public static Collection<CampaignCriterionType> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<CampaignCriterionType> result = new ArrayList<CampaignCriterionType>();

        for (String value : values) {
            result.add(CampaignCriterionType.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<CampaignCriterionType> enums) {
        String result = "";

        for (CampaignCriterionType entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}