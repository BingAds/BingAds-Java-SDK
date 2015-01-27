package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.internal.bulk.RowValues;
import com.microsoft.bingads.internal.bulk.entities.SingleRecordBulkEntity;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Describes an entity whose type is unknown
 *
 */
public class UnknownBulkEntity extends SingleRecordBulkEntity {

    private Map<String, String> values;

    public Map<String, String> getValues() {
        return values;
    }

    void setValues(Map<String, String> values) {
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
