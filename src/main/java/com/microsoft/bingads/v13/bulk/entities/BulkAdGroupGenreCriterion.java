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
import com.microsoft.bingads.v13.campaignmanagement.Criterion;
import com.microsoft.bingads.v13.campaignmanagement.GenreCriterion;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;

/**
 * Represents a genre criterion that is assigned to an ad group. Each genre criterion can be read or written in a bulk file.
 *
 * <p>
 *     For more information, see Ad Group Genre Criterion at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127>https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkAdGroupGenreCriterion extends BulkAdGroupBiddableCriterion {
	
	private static final List<BulkMapping<BulkAdGroupGenreCriterion>> MAPPINGS;

    static {
        List<BulkMapping<BulkAdGroupGenreCriterion>> m = new ArrayList<BulkMapping<BulkAdGroupGenreCriterion>>();
        
        
        m.add(new SimpleBulkMapping<BulkAdGroupGenreCriterion, Long>(StringTable.Target,
                new Function<BulkAdGroupGenreCriterion, Long>() {
                    @Override
                    public Long apply(BulkAdGroupGenreCriterion c) { 
                    	if (c.getBiddableAdGroupCriterion().getCriterion() instanceof GenreCriterion) {    
                    		return ((GenreCriterion) c.getBiddableAdGroupCriterion().getCriterion()).getGenreId();
                    	} 
                    	return null;
                    }
                },
                new BiConsumer<String, BulkAdGroupGenreCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupGenreCriterion c) {
                    	if (c.getBiddableAdGroupCriterion().getCriterion() instanceof GenreCriterion) {
                    		
	                		((GenreCriterion)c.getBiddableAdGroupCriterion().getCriterion()).setGenreId(StringExtensions.parseOptional(v, new Function<String, Long>() {
	                                @Override
	                                public Long apply(String s) {
	                                    return Long.parseLong(s);
	                                }
	                            }));
                    	}
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

    @Override
    protected Criterion createCriterion() {
        return new GenreCriterion();
    }
}
