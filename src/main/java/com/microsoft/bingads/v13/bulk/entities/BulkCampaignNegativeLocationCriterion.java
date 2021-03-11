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
import com.microsoft.bingads.v13.campaignmanagement.LocationCriterion;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringTable;

/**
 * Represents a negative location criterion that is assigned to a campaign. Each negative location criterion can be read or written in a bulk file.
 *
 * <p>
 *     For more information, see Campaign Negative Location Criterion at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127>https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkCampaignNegativeLocationCriterion extends BulkCampaignNegativeCriterion {
	
	private static final List<BulkMapping<BulkCampaignNegativeLocationCriterion>> MAPPINGS;

    static {
        List<BulkMapping<BulkCampaignNegativeLocationCriterion>> m = new ArrayList<BulkMapping<BulkCampaignNegativeLocationCriterion>>();
        
        m.add(new SimpleBulkMapping<BulkCampaignNegativeLocationCriterion, String>(StringTable.Target,
                new Function<BulkCampaignNegativeLocationCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignNegativeLocationCriterion c) { 
                    	if (c.getNegativeCampaignCriterion().getCriterion() instanceof LocationCriterion) {    
                    		Long locationId = ((LocationCriterion) c.getNegativeCampaignCriterion().getCriterion()).getLocationId();
                    		return locationId == null ? null : locationId.toString();
                    	} 
                    	return null;
                    }
                },
                new BiConsumer<String, BulkCampaignNegativeLocationCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignNegativeLocationCriterion c) {
                    	if (c.getNegativeCampaignCriterion().getCriterion() instanceof LocationCriterion) {                   		
	                		((LocationCriterion)c.getNegativeCampaignCriterion().getCriterion()).setLocationId(Long.parseLong(v));
                    	}
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkCampaignNegativeLocationCriterion, String>(StringTable.SubType,
                new Function<BulkCampaignNegativeLocationCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignNegativeLocationCriterion c) { 
                    	if (c.getNegativeCampaignCriterion().getCriterion() instanceof LocationCriterion) {    
                    		return ((LocationCriterion) c.getNegativeCampaignCriterion().getCriterion()).getLocationType();
                    	} 
                    	return null;
                    }
                },
                new BiConsumer<String, BulkCampaignNegativeLocationCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignNegativeLocationCriterion c) {
                    	if (c.getNegativeCampaignCriterion().getCriterion() instanceof LocationCriterion) {                   		
	                		((LocationCriterion)c.getNegativeCampaignCriterion().getCriterion()).setLocationType(v);
                    	}
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkCampaignNegativeLocationCriterion, String>(StringTable.Name,
                new Function<BulkCampaignNegativeLocationCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignNegativeLocationCriterion c) { 
                    	if (c.getNegativeCampaignCriterion().getCriterion() instanceof LocationCriterion) {    
                    		return ((LocationCriterion) c.getNegativeCampaignCriterion().getCriterion()).getDisplayName();
                    	} 
                    	return null;
                    }
                },
                new BiConsumer<String, BulkCampaignNegativeLocationCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignNegativeLocationCriterion c) {
                    	if (c.getNegativeCampaignCriterion().getCriterion() instanceof LocationCriterion) {                   		
	                		((LocationCriterion)c.getNegativeCampaignCriterion().getCriterion()).setDisplayName(v);
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
        return new LocationCriterion();
    }

}
