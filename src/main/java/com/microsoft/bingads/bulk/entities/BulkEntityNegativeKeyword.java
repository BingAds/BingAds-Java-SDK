package com.microsoft.bingads.bulk.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.microsoft.bingads.internal.functionalInterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalInterfaces.Function;

import com.microsoft.bingads.internal.bulk.file.RowValues;
import com.microsoft.bingads.internal.bulk.mapping.BulkMapping;
import com.microsoft.bingads.internal.bulk.mapping.DynamicColumnNameMapping;
import com.microsoft.bingads.internal.bulk.mapping.MappingHelpers;

public abstract class BulkEntityNegativeKeyword extends BulkNegativeKeyword {

    private String entityName;

    private static List<BulkMapping<BulkEntityNegativeKeyword>> MAPPINGS;

    static {
        List<BulkMapping<BulkEntityNegativeKeyword>> m = new ArrayList<BulkMapping<BulkEntityNegativeKeyword>>();

        m.add(new DynamicColumnNameMapping<BulkEntityNegativeKeyword, String>(new Function<BulkEntityNegativeKeyword, String>() {
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

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public abstract String getEntityColumnName();
}
