package com.microsoft.bingads.v12.internal.bulk;

import com.googlecode.jcsv.writer.CSVEntryConverter;

/**
 * An entry converter which replaces nulls in the input with empty strings
 *
 */
class ReplaceNullsWithEmptyStringCSVEntryConverter implements CSVEntryConverter<String[]> {

    @Override
    public String[] convertEntry(String[] values) {
        String[] resultValues = new String[values.length];

        for (int i = 0; i < values.length; i++) {
            if (values[i] == null) {
                resultValues[i] = "";
            } else {
                resultValues[i] = values[i];
            }
        }

        return resultValues;
    }
}
