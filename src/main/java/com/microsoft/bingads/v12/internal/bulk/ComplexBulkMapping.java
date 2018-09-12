package com.microsoft.bingads.v12.internal.bulk;


import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;

/**
 * A bulk mapping with which to do complex transformation usually involving more
 * than one field
 *
 * @param <TEntity>
 */
public class ComplexBulkMapping<TEntity> implements BulkMapping<TEntity> {

    private BiConsumer<TEntity, RowValues> entityToCsv;
    private BiConsumer<RowValues, TEntity> csvToEntity;

    /**
     * @param entityToCsv Function describing reading an entity and setting the
     * appropriate columns
     * @param csvToEntity Function describes getting values from CSV columns and
     * setting the correct values on
     */
    public ComplexBulkMapping(BiConsumer<TEntity, RowValues> entityToCsv,
            BiConsumer<RowValues, TEntity> csvToEntity) {
        this.entityToCsv = entityToCsv;
        this.csvToEntity = csvToEntity;
    }

    /**
     * Calls the custom function provided for csv to entity translation
     */
    @Override
    public void convertToEntity(RowValues values, TEntity entity) {
        this.csvToEntity.accept(values, entity);
    }

    /**
     * Calls the custom function provided for entity to csv translation
     */
    @Override
    public void convertToCsv(TEntity entity, RowValues values) {
        if (this.entityToCsv == null) {
            return; //This mapping is read only
        }
        this.entityToCsv.accept(entity, values);
    }

}
