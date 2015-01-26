package com.microsoft.bingads.internal.bulk;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;

/**
 * A bulk mapping which accepts a function to dynamically determine the column
 * for data to be stored at based on the entity
 *
 * @param <TEntity> The type of {@link BulkEntity} that the binding is for
 * @param <TProperty> The type of the property on the {@link BulkEntity} that is
 * being managed by this mapping
 */
public class DynamicColumnNameMapping<TEntity, TProperty> extends
        SingleFieldBulkMapping<TEntity, TProperty> {

    private Function<TEntity, String> fetchColumnName;

    /**
     * Constructor for read only mappings
     *
     * @param fetchColumnName Function to determine header for data to be stored
     * at
     * @param csvToField Function to set the value from CSV on an object
     */
    public DynamicColumnNameMapping(Function<TEntity, String> fetchColumnName,
            BiConsumer<String, TEntity> csvToField) {
        this(fetchColumnName, null, csvToField);
    }

    /**
     * Constructor for mappings both directions
     *
     * @param fetchColumnName Function to determine header for data to be stored
     * at
     * @param fieldToCsv Function to get the value from an entity
     * @param csvToField Function to set the value from CSV on an object
     */
    public DynamicColumnNameMapping(Function<TEntity, String> fetchColumnName, Function<TEntity, TProperty> fieldToCsv, BiConsumer<String, TEntity> csvToField) {
        super(fieldToCsv, csvToField);

        this.fetchColumnName = fetchColumnName;
    }

    @Override
    public String getHeader(TEntity entity) {
        return this.fetchColumnName.apply(entity);
    }
}
