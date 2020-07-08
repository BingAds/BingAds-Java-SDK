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
import com.microsoft.bingads.v13.campaignmanagement.CombinedList;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;

/**
 * Represents a Combined List that can be read or written in a bulk file.
 *
 * This class exposes the {@link BulkCombinedList#setCombinedList} and {@link BulkCombinedList#getCombinedList}
 * methods that can be used to read and write fields of the Combined List Audience record in a bulk file.
 *
 * <p>
 *     For more information, see Combined List Audience at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkCombinedList extends BulkAudience<CombinedList> {


    private static final List<BulkMapping<BulkCombinedList>> MAPPINGS;

    static {
        List<BulkMapping<BulkCombinedList>> m = new ArrayList<BulkMapping<BulkCombinedList>>();

        m.add(new SimpleBulkMapping<BulkCombinedList, String>(StringTable.CombinationRule,
                new Function<BulkCombinedList, String>() {
                    @Override
                    public String apply(BulkCombinedList c) {
                        return StringExtensions.writeCombinationRulesBulkString(c.getCombinedList().getCombinationRules());
                    }
                },
                new BiConsumer<String, BulkCombinedList>() {
                    @Override
                    public void accept(String v, BulkCombinedList c) {
                        c.getCombinedList().setCombinationRules(StringExtensions.parseCombinationRules(v));
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
     * Gets the combined list.
     */
    public CombinedList getCombinedList() {
        return this.getAudience();
    }

    /**
     * Sets the combined list.
     */
    public void setCombinedList(CombinedList combinedList) {
        this.setAudience(combinedList);
    }

    @Override
    public CombinedList createAudience() {
        return new CombinedList();
    }
}
