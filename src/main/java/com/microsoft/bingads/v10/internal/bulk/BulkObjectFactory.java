package com.microsoft.bingads.v10.internal.bulk;

public interface BulkObjectFactory {

    /**
     * Create a {@link BulkObject} of the appropriate type from a row of values.
     * Uses the "Type" column value to determine the type that it should return
     *
     * @param values a set of column data
     * @return an empty bulk object of the appropriate type
     */
    BulkObject createBulkObject(RowValues values);

    /**
     * Returns the type string which corresponds to the type of
     * {@link BulkObject} provided
     *
     * @param bulkObject object to determine type string for
     * @return the name of the type
     */
    String getBulkRowType(BulkObject bulkObject);

}
