package com.microsoft.bingads.v13.bulk.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.microsoft.bingads.v13.bulk.BulkFileReader;
import com.microsoft.bingads.v13.bulk.BulkFileWriter;
import com.microsoft.bingads.v13.bulk.BulkOperation;
import com.microsoft.bingads.v13.bulk.BulkServiceManager;
import com.microsoft.bingads.v13.campaignmanagement.ConversionGoal;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;

/**
 * Represents a instorevisit goal that can be read or written in a bulk file.
 *
 * This class exposes the {@link BulkInStoreVisitGoal#setInStoreVisitGoal} and {@link BulkInStoreVisitGoal#getInStoreVisitGoal}
 * methods that can be used to read and write fields of the InStoreVisit Goal record in a bulk file.
 *
 * <p>
 *     For more information, see InStoreVisit Goal at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkInStoreVisitGoal extends BulkConversionGoal {


    private static final List<BulkMapping<BulkInStoreVisitGoal>> MAPPINGS;

    static {
        List<BulkMapping<BulkInStoreVisitGoal>> m = new ArrayList<BulkMapping<BulkInStoreVisitGoal>>();
        
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

    @Override
    public ConversionGoal createConversionGoal() {
        return new ConversionGoal();
    }

}
