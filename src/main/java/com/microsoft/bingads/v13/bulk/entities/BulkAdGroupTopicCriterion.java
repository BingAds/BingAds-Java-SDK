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
import com.microsoft.bingads.v13.campaignmanagement.TopicCriterion;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;

/**
 * Represents a topic criterion that is assigned to an ad group. Each topic criterion can be read or written in a bulk file.
 *
 * <p>
 *     For more information, see Ad Group Topic Criterion at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127>https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkAdGroupTopicCriterion extends BulkAdGroupBiddableCriterion {
	
	private static final List<BulkMapping<BulkAdGroupTopicCriterion>> MAPPINGS;

    static {
        List<BulkMapping<BulkAdGroupTopicCriterion>> m = new ArrayList<BulkMapping<BulkAdGroupTopicCriterion>>();
        
        
        m.add(new SimpleBulkMapping<BulkAdGroupTopicCriterion, Long>(StringTable.Target,
                new Function<BulkAdGroupTopicCriterion, Long>() {
                    @Override
                    public Long apply(BulkAdGroupTopicCriterion c) { 
                    	if (c.getBiddableAdGroupCriterion().getCriterion() instanceof TopicCriterion) {    
                    		return ((TopicCriterion) c.getBiddableAdGroupCriterion().getCriterion()).getTopicId();
                    	} 
                    	return null;
                    }
                },
                new BiConsumer<String, BulkAdGroupTopicCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupTopicCriterion c) {
                    	if (c.getBiddableAdGroupCriterion().getCriterion() instanceof TopicCriterion) {
                    		
	                		((TopicCriterion)c.getBiddableAdGroupCriterion().getCriterion()).setTopicId(StringExtensions.parseOptional(v, new Function<String, Long>() {
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
        return new TopicCriterion();
    }
}
