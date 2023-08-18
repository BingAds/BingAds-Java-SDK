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
import com.microsoft.bingads.v13.campaignmanagement.DealCriterion;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringTable;

/**
 * Represents a deal criterion that is assigned to a campaign. Each deal criterion can be read or written in a bulk file.
 *
 * <p>
 *     For more information, see Campaign Location Criterion at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127>https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkCampaignDealCriterion extends BulkCampaignBiddableCriterion {
	
	private static final List<BulkMapping<BulkCampaignDealCriterion>> MAPPINGS;

    static {
        List<BulkMapping<BulkCampaignDealCriterion>> m = new ArrayList<BulkMapping<BulkCampaignDealCriterion>>();
        
        m.add(new SimpleBulkMapping<BulkCampaignDealCriterion, String>(StringTable.Target,
                new Function<BulkCampaignDealCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignDealCriterion c) { 
                    	if (c.getBiddableCampaignCriterion().getCriterion() instanceof DealCriterion) {    
                    		Long dealId = ((DealCriterion) c.getBiddableCampaignCriterion().getCriterion()).getDealId();
                    		return dealId == null ? null : dealId.toString();
                    	} 
                    	return null;
                    }
                },
                new BiConsumer<String, BulkCampaignDealCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignDealCriterion c) {
                    	if (c.getBiddableCampaignCriterion().getCriterion() instanceof DealCriterion) {                   		
	                		((DealCriterion)c.getBiddableCampaignCriterion().getCriterion()).setDealId(Long.parseLong(v));
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
        return new DealCriterion();
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        super.processMappingsToRowValues(values, excludeReadonlyData);
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }
}
