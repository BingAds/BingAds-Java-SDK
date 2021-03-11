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
import com.microsoft.bingads.v13.campaignmanagement.AgeCriterion;
import com.microsoft.bingads.v13.campaignmanagement.AgeRange;
import com.microsoft.bingads.v13.campaignmanagement.Criterion;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;

/**
 * Represents a negative age criterion that is assigned to an ad group. Each age location criterion can be read or written in a bulk file.
 *
 * <p>
 *     For more information, see Ad Group Negative Age Criterion at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127>https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkAdGroupNegativeAgeCriterion extends BulkAdGroupNegativeCriterion {
	
	private static final List<BulkMapping<BulkAdGroupNegativeAgeCriterion>> MAPPINGS;

    static {
        List<BulkMapping<BulkAdGroupNegativeAgeCriterion>> m = new ArrayList<BulkMapping<BulkAdGroupNegativeAgeCriterion>>();
        
        
        m.add(new SimpleBulkMapping<BulkAdGroupNegativeAgeCriterion, String>(StringTable.Target,
                new Function<BulkAdGroupNegativeAgeCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupNegativeAgeCriterion c) { 
                    	if (c.getNegativeAdGroupCriterion().getCriterion() instanceof AgeCriterion) {    
                    		AgeRange ageRange = ((AgeCriterion) c.getNegativeAdGroupCriterion().getCriterion()).getAgeRange();
                    		return ageRange == null ? null : ageRange.value();
                    	} 
                    	return null;
                    }
                },
                new BiConsumer<String, BulkAdGroupNegativeAgeCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupNegativeAgeCriterion c) {
                        if (c.getNegativeAdGroupCriterion().getCriterion() instanceof AgeCriterion) {
                            ((AgeCriterion) c.getNegativeAdGroupCriterion().getCriterion())
                                    .setAgeRange(StringExtensions.parseOptional(v, new Function<String, AgeRange>() {
                                        @Override
                                        public AgeRange apply(String s) {
                                            return AgeRange.fromValue(s);
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
    protected Criterion createCriterion() {
        return new AgeCriterion();
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        super.processMappingsToRowValues(values, excludeReadonlyData);
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }
}
