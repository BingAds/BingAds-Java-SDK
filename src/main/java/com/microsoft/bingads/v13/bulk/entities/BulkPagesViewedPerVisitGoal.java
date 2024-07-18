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
import com.microsoft.bingads.v13.campaignmanagement.PagesViewedPerVisitGoal;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;

/**
 * Represents a pagesviewedpervisit goal that can be read or written in a bulk file.
 *
 * This class exposes the {@link BulkPagesViewedPerVisitGoal#setPagesViewedPerVisitGoal} and {@link BulkPagesViewedPerVisitGoal#getPagesViewedPerVisitGoal}
 * methods that can be used to read and write fields of the PagesViewedPerVisit Goal record in a bulk file.
 *
 * <p>
 *     For more information, see PagesViewedPerVisit Goal at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkPagesViewedPerVisitGoal extends BulkConversionGoal<PagesViewedPerVisitGoal> {


    private static final List<BulkMapping<BulkPagesViewedPerVisitGoal>> MAPPINGS;

    static {
        List<BulkMapping<BulkPagesViewedPerVisitGoal>> m = new ArrayList<BulkMapping<BulkPagesViewedPerVisitGoal>>();
        
        m.add(new SimpleBulkMapping<BulkPagesViewedPerVisitGoal, Integer>(StringTable.MinimumPagesViewed,
                new Function<BulkPagesViewedPerVisitGoal, Integer>() {
                    @Override
                    public Integer apply(BulkPagesViewedPerVisitGoal c) {
                        return c.getConversionGoal().getMinimumPagesViewed();
                    }
                },
                new BiConsumer<String, BulkPagesViewedPerVisitGoal>() {
                    @Override
                    public void accept(String v, BulkPagesViewedPerVisitGoal c) {
                        c.getConversionGoal().setMinimumPagesViewed(StringExtensions.<Integer>parseOptional(v, new Function<String, Integer>() {
                            @Override
                            public Integer apply(String value) {
                                return Integer.parseInt(value);
                            }
                        }));
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
     * Get the pagesviewedpervisit goal.
     */
    public PagesViewedPerVisitGoal getPagesViewedPerVisitGoal() {
        return this.getConversionGoal();
    }

    /**
     * Set the pagesviewedpervisit goal.
     */
    public void setPagesViewedPerVisitGoal(PagesViewedPerVisitGoal PagesViewedPerVisitGoal) {
        this.setConversionGoal(PagesViewedPerVisitGoal);
    }

    @Override
    public PagesViewedPerVisitGoal createConversionGoal() {
        return new PagesViewedPerVisitGoal();
    }

}
