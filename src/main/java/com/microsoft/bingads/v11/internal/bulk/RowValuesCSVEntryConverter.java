package com.microsoft.bingads.v11.internal.bulk;

import com.googlecode.jcsv.writer.CSVEntryConverter;

/**
 * An entry converter which converts a RowValues object to a String array by
 * fetching the internal columns array
 *
 */
public class RowValuesCSVEntryConverter implements CSVEntryConverter<RowValues> {

    @Override
    public String[] convertEntry(RowValues values) {
        return values.getColumns();
    }

}
