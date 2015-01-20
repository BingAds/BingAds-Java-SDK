package com.microsoft.bingads.internal.bulk.file;

import java.util.Map;
import java.util.Map.Entry;

import com.microsoft.bingads.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * Describes an entity whose type is unknown
 *
 */
public class UnknownBulkEntity extends SingleRecordBulkEntity {

    private Map<String, String> values;

    public Map<String, String> getValues() {
        return values;
    }

    public void setValues(Map<String, String> values) {
        this.values = values;
    }

    @Override
    public void processMappingsFromRowValues(RowValues rowValues) {
        values = rowValues.toMap();
    }

    @Override
    public void processMappingsToRowValues(RowValues rowValues) {
        for (Entry<String, String> entry : this.values.entrySet()) {
            rowValues.put(entry.getKey(), entry.getValue());
        }
    }
}
