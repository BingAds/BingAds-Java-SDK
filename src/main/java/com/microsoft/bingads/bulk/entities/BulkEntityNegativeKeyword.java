package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.internal.bulk.BulkMapping;
import com.microsoft.bingads.internal.bulk.DynamicColumnNameMapping;
import com.microsoft.bingads.internal.bulk.MappingHelpers;
import com.microsoft.bingads.internal.bulk.RowValues;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

abstract class BulkEntityNegativeKeyword extends BulkNegativeKeyword {

    private String entityName;

    private static final List<BulkMapping<BulkEntityNegativeKeyword>> MAPPINGS;

    static {
        List<BulkMapping<BulkEntityNegativeKeyword>> m = new ArrayList<BulkMapping<BulkEntityNegativeKeyword>>();

        m.add(new DynamicColumnNameMapping<BulkEntityNegativeKeyword, String>(
                new Function<BulkEntityNegativeKeyword, String>() {
                    @Override
                    public String apply(BulkEntityNegativeKeyword c) {
                        return c.getEntityColumnName();
                    }
                },
                new Function<BulkEntityNegativeKeyword, String>() {
                    @Override
                    public String apply(BulkEntityNegativeKeyword c) {
                        return c.getEntityName();
                    }
                },
                new BiConsumer<String, BulkEntityNegativeKeyword>() {
                    @Override
                    public void accept(String v, BulkEntityNegativeKeyword c) {
                        c.setEntityName(v);
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        super.processMappingsFromRowValues(values);

        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values) {
        super.processMappingsToRowValues(values);

        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    String getEntityName() {
        return entityName;
    }

    void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    abstract String getEntityColumnName();
}
