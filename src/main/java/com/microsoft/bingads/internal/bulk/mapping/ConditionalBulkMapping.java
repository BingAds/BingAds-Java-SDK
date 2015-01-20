/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microsoft.bingads.internal.bulk.mapping;

import com.microsoft.bingads.internal.bulk.file.RowValues;
import com.microsoft.bingads.internal.functionalInterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalInterfaces.Function;

public class ConditionalBulkMapping<TEntity, TProperty> implements BulkMapping<TEntity> {
    
    private SimpleBulkMapping<TEntity, TProperty> simpleMapping;
    
    private Function<TEntity, Boolean> condition;
    
    public ConditionalBulkMapping(String csvHeader, Function<TEntity, Boolean> condition, Function<TEntity, TProperty> fieldToCsv, BiConsumer<String, TEntity> csvToField) {
        simpleMapping = new SimpleBulkMapping<TEntity, TProperty>(csvHeader, fieldToCsv, csvToField);
        
        this.condition = condition;
    }

    @Override
    public void convertToCsv(TEntity entity, RowValues values) {
        if (condition.apply(entity)) {
            simpleMapping.convertToCsv(entity, values);
        }
    }

    @Override
    public void convertToEntity(RowValues values, TEntity entity) {
        if (condition.apply(entity)) {
            simpleMapping.convertToEntity(values, entity);
        }
    }    
}
