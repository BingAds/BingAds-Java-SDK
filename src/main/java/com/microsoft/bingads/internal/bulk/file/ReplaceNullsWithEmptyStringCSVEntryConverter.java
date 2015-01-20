package com.microsoft.bingads.internal.bulk.file;

import java.util.Arrays;
import com.microsoft.bingads.internal.functionalInterfaces.Function;
import com.googlecode.jcsv.writer.CSVEntryConverter;

/**
 * An entry converter which replaces nulls in the input with empty strings
 *
 */
public class ReplaceNullsWithEmptyStringCSVEntryConverter implements CSVEntryConverter<String[]> {

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
