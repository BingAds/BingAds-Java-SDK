package com.microsoft.bingads.v13.bulk.entities;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.bulk.BulkFileReader;
import com.microsoft.bingads.v13.bulk.BulkFileWriter;
import com.microsoft.bingads.v13.bulk.BulkOperation;
import com.microsoft.bingads.v13.bulk.BulkServiceManager;
import com.microsoft.bingads.v13.campaignmanagement.Audience;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringTable;

/**
 * Represents a Customer List that can be read or written in a bulk file.
 *
 * This class exposes the {@link BulkCustomerList#setCustomerList} and {@link BulkCustomerList#getCustomerList}
 * methods that can be used to read and write fields of the Customer List Audience record in a bulk file.
 *
 * <p>
 *     For more information, see Customer List Audience at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkCustomerList extends BulkAudience<Audience> {

    private String actionType;

    private static final List<BulkMapping<BulkCustomerList>> MAPPINGS;

    static {
        List<BulkMapping<BulkCustomerList>> m = new ArrayList<BulkMapping<BulkCustomerList>>();

        m.add(new SimpleBulkMapping<BulkCustomerList, String>(StringTable.ActionType,
                new Function<BulkCustomerList, String>() {
                    @Override
                    public String apply(BulkCustomerList c) {
                        return c.getActionType();
                    }
                },
                new BiConsumer<String, BulkCustomerList>() {
                    @Override
                    public void accept(String v, BulkCustomerList c) {
                        c.setActionType(v);
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
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        super.processMappingsToRowValues(values, excludeReadonlyData);
        
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    /**
     * Gets the Customer list.
     */
    public Audience getCustomerList() {
        return this.getAudience();
    }

    /**
     * Sets the Customer list.
     */
    public void setCustomerList(Audience CustomerList) {
        this.setAudience(CustomerList);
    }

    @Override
    public Audience createAudience() {
        return new Audience();
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }
    
    
}
