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
 * Represents a device criterion that is assigned to an ad group. Each device criterion can be read or written in a bulk file.
 *
 * <p>
 *     For more information, see Ad Group DeviceOS Criterion at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127>https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkAdGroupDeviceCriterion extends BulkAdGroupBiddableCriterion {
	

	private static final List<BulkMapping<BulkAdGroupDeviceCriterion>> MAPPINGS;

    static {
        List<BulkMapping<BulkAdGroupDeviceCriterion>> m = new ArrayList<BulkMapping<BulkAdGroupDeviceCriterion>>();
        
        
        m.add(new SimpleBulkMapping<BulkAdGroupDeviceCriterion, String>(StringTable.Target,
                new Function<BulkAdGroupDeviceCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupDeviceCriterion c) { 
                    	if (c.getBiddableAdGroupCriterion().getCriterion() instanceof DeviceCriterion) {    
                    		return ((DeviceCriterion) c.getBiddableAdGroupCriterion().getCriterion()).getDeviceName();
                    	}
                    	return null;
                    }
                },
                new BiConsumer<String, BulkAdGroupDeviceCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupDeviceCriterion c) {
                    	if (c.getBiddableAdGroupCriterion().getCriterion() instanceof DeviceCriterion) {                   		
	                		((DeviceCriterion)c.getBiddableAdGroupCriterion().getCriterion()).setDeviceName(v);
                    	}
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroupDeviceCriterion, String>(StringTable.OsNames,
                new Function<BulkAdGroupDeviceCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupDeviceCriterion c) { 
                    	if (c.getBiddableAdGroupCriterion().getCriterion() instanceof DeviceCriterion) {    
                    		return ((DeviceCriterion) c.getBiddableAdGroupCriterion().getCriterion()).getOSName();
                    	}
                    	return null;
                    }
                },
                new BiConsumer<String, BulkAdGroupDeviceCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupDeviceCriterion c) {
                    	if (c.getBiddableAdGroupCriterion().getCriterion() instanceof DeviceCriterion) {                   		
	                		((DeviceCriterion)c.getBiddableAdGroupCriterion().getCriterion()).setOSName(v);
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
    public Criterion createCriterion() {
        return new DeviceCriterion();
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        super.processMappingsToRowValues(values, excludeReadonlyData);
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }
}
