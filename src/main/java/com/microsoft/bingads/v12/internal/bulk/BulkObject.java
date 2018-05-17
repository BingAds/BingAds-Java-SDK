package com.microsoft.bingads.v12.internal.bulk;

import com.microsoft.bingads.v12.internal.bulk.entities.MultiRecordBulkEntity;
import java.io.IOException;

/**
 * A representation of a block of data (set of csv lines) provided in the
 *
 * <a href="https://docs.microsoft.com/en-us/bingads/bulk-service/bulk-file-schema?view=bingads-12">Bulk
 * File Schema</a>.
 *
 */
public abstract class BulkObject {

    /**
     * Reads object data from consecutive rows.
     * <ul>
     * <li>SingleLineBulkEntity: reads entity errors.</li>
     * <li>MultilineBulkEntity: reads child entities.</li>
     * </ul>
     *
     * @param reader
     */
    public void readRelatedDataFromStream(BulkStreamReader reader) {
    }

    /**
     * Read object data from a single row.
     *
     * <ul>
     * <li>SingleLineBulkEntity: reads entity fields.</li>
     * <li>BulkError: reads error fields.</li>
     * <li>BulkEntityIdentifier: reads identifier fields (Id, status etc.).</li>
     * </ul>
     *
     * @param values
     */
    public void readFromRowValues(RowValues values) {
        throw new UnsupportedOperationException();
    }

    /**
     * Writes object data to a single row.
     *
     * <ul>
     * <li>SingleLineBulkEntity: writes entity fields.</li>
     * <li>BulkEntityIdentifier: writes identifier fields (Id, status etc.)</li>
     * </ul>
     *
     * @param values
     */
    public void writeToRowValues(RowValues values, boolean excludeReadonlyData) {
        throw new UnsupportedOperationException();
    }

    /**
     * Writes object data to consecutive rows.
     *
     * <ul>
     * <li>SingleLineBulkEntity: writes entity.</li>
     * <li>MultilineBulkEntity: writes child entities.</li>
     * <li>BulkEntityIdentifier: writes identifier information (Id, status
     * etc.)</li>
     * </ul>
     *
     * @param rowWriter
     * @throws IOException
     */
    public void writeToStream(BulkObjectWriter rowWriter, boolean excludeReadonlyData) throws IOException {
        throw new UnsupportedOperationException();
    }

    public boolean canEncloseInMultilineEntity() {
        return false;
    }

    public MultiRecordBulkEntity encloseInMultilineEntity() {
        throw new UnsupportedOperationException();
    }
;
}
