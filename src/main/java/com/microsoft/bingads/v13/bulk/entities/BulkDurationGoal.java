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
import com.microsoft.bingads.v13.campaignmanagement.DurationGoal;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;

/**
 * Represents a duration goal that can be read or written in a bulk file.
 *
 * This class exposes the {@link BulkDurationGoal#setDurationGoal} and {@link BulkDurationGoal#getDurationGoal}
 * methods that can be used to read and write fields of the Duration Goal record in a bulk file.
 *
 * <p>
 *     For more information, see Duration Goal at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkDurationGoal extends BulkConversionGoal<DurationGoal> {


    private static final List<BulkMapping<BulkDurationGoal>> MAPPINGS;

    static {
        List<BulkMapping<BulkDurationGoal>> m = new ArrayList<BulkMapping<BulkDurationGoal>>();
        
        m.add(new SimpleBulkMapping<BulkDurationGoal, Integer>(StringTable.MinimumDurationInSecond,
                new Function<BulkDurationGoal, Integer>() {
                    @Override
                    public Integer apply(BulkDurationGoal c) {
                        return c.getConversionGoal().getMinimumDurationInSeconds();
                    }
                },
                new BiConsumer<String, BulkDurationGoal>() {
                    @Override
                    public void accept(String v, BulkDurationGoal c) {
                        c.getConversionGoal().setMinimumDurationInSeconds(StringExtensions.<Integer>parseOptional(v, new Function<String, Integer>() {
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
     * Get the duration goal.
     */
    public DurationGoal getDurationGoal() {
        return this.getConversionGoal();
    }

    /**
     * Set the duration goal.
     */
    public void setDurationGoal(DurationGoal DurationGoal) {
        this.setConversionGoal(DurationGoal);
    }

    @Override
    public DurationGoal createConversionGoal() {
        return new DurationGoal();
    }

}
