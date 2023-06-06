package com.microsoft.bingads.v13.internal.bulk;

import java.util.HashMap;
import java.util.Map;

/**
 * Encapsulates a row of csv values and the corresponding header mappings for that array
 *
 */
public class RowValues extends com.microsoft.bingads.internal.RowValues {

    public RowValues() {
        this(new HashMap<String, String>());
    }
    
    public RowValues(Map<String, String> rowValues) {
        super(new String[CsvHeaders.getMappings().keySet().size()], CsvHeaders.getMappings());

        for (String key : rowValues.keySet()) {
            this.put(key, rowValues.get(key));
        }
    }

    public RowValues(String[] columns, Map<String, Integer> mappings) {
        super(columns, mappings);
    }

}
