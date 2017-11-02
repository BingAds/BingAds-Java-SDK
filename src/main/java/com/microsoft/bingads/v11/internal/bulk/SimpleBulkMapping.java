package com.microsoft.bingads.v11.internal.bulk;

import com.microsoft.bingads.v11.bulk.entities.BulkEntity;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;

/**
 * A simple bulk mapping which translates values from a single field to a single
 * column
 *
 * @param <TEntity> The type of {@link BulkEntity} that the binding is for
 * @param <TProperty> The type of the property on the {@link BulkEntity} that is
 * being managed by this mapping
 */
public class SimpleBulkMapping<TEntity, TProperty> extends SingleFieldBulkMapping<TEntity, TProperty> {

    private String csvHeader;

    public SimpleBulkMapping(String csvHeader, Function<TEntity, TProperty> fieldToCsv, BiConsumer<String, TEntity> csvToField, boolean passNulls) {
        super(fieldToCsv, csvToField, passNulls);
        this.csvHeader = csvHeader;
    }

    /**
     * Constructor for mappings
     *
     * @param csvHeader Name of the header
     * @param fieldToCsv Function to get the value from an entity
     * @param csvToField Function to set the value from CSV on an entity
     */
    public SimpleBulkMapping(String csvHeader, Function<TEntity, TProperty> fieldToCsv, BiConsumer<String, TEntity> csvToField) {
        this(csvHeader, fieldToCsv, csvToField, false);
    }

    @Override
    public String getHeader(TEntity entity) {
        return this.csvHeader;
    }
}
