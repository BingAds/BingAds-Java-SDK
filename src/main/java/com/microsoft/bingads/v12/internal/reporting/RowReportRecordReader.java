package com.microsoft.bingads.v12.internal.reporting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;

import com.microsoft.bingads.internal.RowValues;

/**
 * Provides a method to read one row from bulk file and return the corresponding
 * <see cref="ReportRecord"/>
 *
 */
class RowReportRecordReader implements Iterator<RowReportRecord>, AutoCloseable {

    private Iterator<String[]> lineIterator;
    private Map<String, Integer> columnMapping;
    private CsvReportRecordReader reader;
    private RowReportRecord nextRecord;

    private static final Pattern footerPattern = Pattern.compile("Total|©\\d+ Microsoft Corporation. All rights reserved.*");


    RowReportRecordReader(CsvReportRecordReader reader) {
        this.reader = reader;
        this.lineIterator = reader.iterator();
    }

    @Override
    public boolean hasNext() {
        return nextRecord != null;
    }

    @Override
    public void close() throws Exception {
        reader.close();
    }

    @Override
    public RowReportRecord next() {
        RowReportRecord ret = nextRecord;
        nextRecord = null;
        peek();
        return ret;
    }

    private void peek() {
        if (lineIterator.hasNext()) {
            String[] fields = lineIterator.next();
            if (!validateRecord(fields)) {
                peek();
                return;
            }
            nextRecord = new RowReportRecord(new RowValues(fields, columnMapping));
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    boolean readNextHeader(RowReportHeaderParser parser) {
        if (!lineIterator.hasNext()) {
            return false;
        }

        String[] fields = lineIterator.next();
        if (!validateHeader(fields)) {
            return readNextHeader(parser);
        }

        long validValueCount = Arrays.stream(fields).map(s -> s.trim()).filter(s -> s != null && s.length() > 0)
                .count();

        if (validValueCount == 0) {
            return false;
        } else {
            boolean header = parser.parseHeader(fields);
            if (validValueCount > 1) {
                if (header) {
                    columnMapping = generateColumnMapping(fields);
                    peek();
                } else {
                    // when ExcludeColumnHeader is set, this line is a record indeed
                    nextRecord = new RowReportRecord(new RowValues(fields, columnMapping));
                }
                return false;
            }
        }
        return true;

    }

    private Map<String, Integer> generateColumnMapping(String[] headers) {
        Map<String, Integer> mapping = new HashMap<String, Integer>();

        for (int i = 0; i < headers.length; i++) {
            mapping.put(headers[i], i);
        }

        return mapping;
    }

    private boolean validateHeader(String[] fields) {
        if (fields == null)
            return false;

        long validValues = Arrays.stream(fields).map(s -> s.replace("-", "")).map(s -> s.trim())
                .filter(s -> s != null && s.length() > 0).count();
        return validValues >= 1;
    }

    private boolean validateRecord(String[] fields) {
        if (fields == null)
            return false;

        long validValues = Arrays.stream(fields).map(s -> s.replace("-", "")).map(s -> s.trim())
                .filter(s -> s != null && s.length() > 0).count();
        if (validValues == 0)
            return false;
        if (footerPattern.matcher(fields[0]).matches()) {
            return false;
        }
        return true;

    }

}
