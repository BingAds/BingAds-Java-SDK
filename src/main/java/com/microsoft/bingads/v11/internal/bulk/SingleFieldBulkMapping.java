package com.microsoft.bingads.v11.internal.bulk;

import com.microsoft.bingads.v11.bulk.entities.BulkEntity;
import com.microsoft.bingads.v11.internal.bulk.StringExtensions;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;

abstract class SingleFieldBulkMapping<TEntity, TProperty> implements BulkMapping<TEntity> {

    protected Function<TEntity, TProperty> fieldToCsv;
    protected BiConsumer<String, TEntity> csvToField;
    protected Function<TProperty, String> bulkToString;
    private boolean passNulls;

    public SingleFieldBulkMapping(Function<TEntity, TProperty> fieldToCsv,
            BiConsumer<String, TEntity> csvToField) {
        this(fieldToCsv, csvToField, false);
    }

    public SingleFieldBulkMapping(Function<TEntity, TProperty> fieldToCsv,
            BiConsumer<String, TEntity> csvToField, boolean passNulls) {
        this.fieldToCsv = fieldToCsv;
        this.csvToField = csvToField;
        this.passNulls = passNulls;
    }

    @Override
    public void convertToEntity(RowValues values, TEntity entity) {
        String header = this.getHeader(entity);

        if (values.containsHeader(header) && (values.get(header) != null || this.passNulls)) {
            csvToField.accept(values.get(header), entity);
        }
    }

    @Override
    public void convertToCsv(TEntity entity, RowValues values) {
        if (this.fieldToCsv == null) {
            return; //This mapping is read only.
        }

        TProperty value = this.fieldToCsv.apply(entity);
        values.put(this.getHeader(entity), StringExtensions.toBulkString(value));
    }

    /**
     *
     * @param value A {@link BulkEntity} containing data
     * @return the header to store/read data from
     */
    public abstract String getHeader(TEntity value);
}
