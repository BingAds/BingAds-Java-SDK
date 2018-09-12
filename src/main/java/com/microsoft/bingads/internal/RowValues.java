package com.microsoft.bingads.internal;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Encapsulates a row of csv values and the corresponding header mappings for that array
 *
 */
public class RowValues {

    protected String[] columns;
    protected Map<String, Integer> mappings;

    public RowValues(String[] columns, Map<String, Integer> mappings) {
        this.columns = columns;
        this.mappings = mappings;
    }

    public String get(String header) {
        return columns[this.mappings.get(header)];
    }

    public String tryGet(String header) {
        if (!this.mappings.containsKey(header) || this.mappings.get(header) == null) {
            return null;
        }

        return this.get(header);
    }

    public void put(String header, String value) {
        columns[mappings.get(header)] = value;
    }

    public boolean containsHeader(String header) {
        return mappings.containsKey(header);
    }

    public String[] getColumns() {
        return this.columns;
    }

    public Map<String, String> toMap() {
        Map<String, String> values = new HashMap<String, String>();

        for (Entry<String, Integer> entry : this.mappings.entrySet()) {
            String value = this.columns[entry.getValue()];

            values.put(entry.getKey(), value);
        }

        return values;
    }

    public String toDebugString() {
        String result = "";

        for (Entry<String, Integer> entry : this.mappings.entrySet()) {
            String value = this.columns[entry.getValue()];

            result += String.format("%s = '%s'", entry.getKey(), value) + "; ";
        }

        return result;
    }

}
