package com.microsoft.bingads.v11.internal.bulk;

/**
 * Maps from a field on entity to a column in a CSV data row
 *
 * @param <TEntity>
 */
public interface BulkMapping<TEntity> {

    /**
     * Moves a value from csv column to a field on an entity
     *
     * @param values CSV values
     * @param entity entity to modify
     */
    void convertToEntity(RowValues values,
            TEntity entity);

    /**
     * Moves a value from an object to a column in the CSV
     *
     * @param entity entity to pull value from
     * @param values CSV columns data to modify
     */
    void convertToCsv(TEntity entity, RowValues values);
}
