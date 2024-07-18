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
import com.microsoft.bingads.v13.campaignmanagement.InStoreTransactionGoal;
import com.microsoft.bingads.v13.campaignmanagement.ExpressionOperator;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;

/**
 * Represents a instoretransaction goal that can be read or written in a bulk file.
 *
 * This class exposes the {@link BulkInStoreTransactionGoal#setInStoreTransactionGoal} and {@link BulkInStoreTransactionGoal#getInStoreTransactionGoal}
 * methods that can be used to read and write fields of the InStoreTransaction Goal record in a bulk file.
 *
 * <p>
 *     For more information, see InStoreTransaction Goal at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkInStoreTransactionGoal extends BulkConversionGoal<InStoreTransactionGoal> {


    private static final List<BulkMapping<BulkInStoreTransactionGoal>> MAPPINGS;

    static {
        List<BulkMapping<BulkInStoreTransactionGoal>> m = new ArrayList<BulkMapping<BulkInStoreTransactionGoal>>();
        
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
     * Get the instoretransaction goal.
     */
    public InStoreTransactionGoal getInStoreTransactionGoal() {
        return this.getConversionGoal();
    }

    /**
     * Set the instoretransaction goal.
     */
    public void setInStoreTransactionGoal(InStoreTransactionGoal InStoreTransactionGoal) {
        this.setConversionGoal(InStoreTransactionGoal);
    }

    @Override
    public InStoreTransactionGoal createConversionGoal() {
        return new InStoreTransactionGoal();
    }

}
