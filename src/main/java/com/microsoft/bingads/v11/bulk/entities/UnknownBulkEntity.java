package com.microsoft.bingads.v11.bulk.entities;

import com.microsoft.bingads.v11.internal.bulk.RowValues;
import com.microsoft.bingads.v11.internal.bulk.entities.SingleRecordBulkEntity;
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
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        for (Entry<String, String> entry : this.values.entrySet()) {
            values.put(entry.getKey(), entry.getValue());
        }
    }
}
