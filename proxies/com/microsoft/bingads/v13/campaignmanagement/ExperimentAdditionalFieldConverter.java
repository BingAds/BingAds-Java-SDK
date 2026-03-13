package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class ExperimentAdditionalFieldConverter {

    public static Collection<ExperimentAdditionalField> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<ExperimentAdditionalField> result = new ArrayList<ExperimentAdditionalField>();

        for (String value : values) {
            result.add(ExperimentAdditionalField.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<ExperimentAdditionalField> enums) {
        String result = "";

        for (ExperimentAdditionalField entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}