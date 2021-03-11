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
import com.microsoft.bingads.v13.campaignmanagement.DeviceCriterion;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringTable;

/**
 * Represents a device criterion that is assigned to a campaign. Each device criterion can be read or written in a bulk file.
 *
 * <p>
 *     For more information, see Campaign DeviceOS Criterion at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127>https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkCampaignDeviceCriterion extends BulkCampaignBiddableCriterion {
	
	private static final List<BulkMapping<BulkCampaignDeviceCriterion>> MAPPINGS;

    static {
        List<BulkMapping<BulkCampaignDeviceCriterion>> m = new ArrayList<BulkMapping<BulkCampaignDeviceCriterion>>();
        
        
        m.add(new SimpleBulkMapping<BulkCampaignDeviceCriterion, String>(StringTable.Target,
                new Function<BulkCampaignDeviceCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignDeviceCriterion c) { 
                    	if (c.getBiddableCampaignCriterion().getCriterion() instanceof DeviceCriterion) {    
                    		return ((DeviceCriterion) c.getBiddableCampaignCriterion().getCriterion()).getDeviceName();
                    	}
                    	return null;
                    }
                },
                new BiConsumer<String, BulkCampaignDeviceCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignDeviceCriterion c) {
                    	if (c.getBiddableCampaignCriterion().getCriterion() instanceof DeviceCriterion) {                   		
	                		((DeviceCriterion)c.getBiddableCampaignCriterion().getCriterion()).setDeviceName(v);
                    	}
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkCampaignDeviceCriterion, String>(StringTable.OsNames,
                new Function<BulkCampaignDeviceCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignDeviceCriterion c) { 
                    	if (c.getBiddableCampaignCriterion().getCriterion() instanceof DeviceCriterion) {    
                    		return ((DeviceCriterion) c.getBiddableCampaignCriterion().getCriterion()).getOSName();
                    	}
                    	return null;
                    }
                },
                new BiConsumer<String, BulkCampaignDeviceCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignDeviceCriterion c) {
                    	if (c.getBiddableCampaignCriterion().getCriterion() instanceof DeviceCriterion) {                   		
	                		((DeviceCriterion)c.getBiddableCampaignCriterion().getCriterion()).setOSName(v);
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
        return new DeviceCriterion();
    }
    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        super.processMappingsToRowValues(values, excludeReadonlyData);
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

}
