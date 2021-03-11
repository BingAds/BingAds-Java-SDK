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
 * Represents a location criterion that is assigned to an ad group. Each location criterion can be read or written in a bulk file.
 *
 * <p>
 *     For more information, see Ad Group Location Criterion at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127>https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkAdGroupLocationCriterion extends BulkAdGroupBiddableCriterion {
	
	private static final List<BulkMapping<BulkAdGroupLocationCriterion>> MAPPINGS;

    static {
        List<BulkMapping<BulkAdGroupLocationCriterion>> m = new ArrayList<BulkMapping<BulkAdGroupLocationCriterion>>();
        
        m.add(new SimpleBulkMapping<BulkAdGroupLocationCriterion, String>(StringTable.Target,
                new Function<BulkAdGroupLocationCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupLocationCriterion c) { 
                    	if (c.getBiddableAdGroupCriterion().getCriterion() instanceof LocationCriterion) {    
                    		Long locationId = ((LocationCriterion) c.getBiddableAdGroupCriterion().getCriterion()).getLocationId();
                    		return locationId == null ? null : locationId.toString();
                    	} 
                    	return null;
                    }
                },
                new BiConsumer<String, BulkAdGroupLocationCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupLocationCriterion c) {
                    	if (c.getBiddableAdGroupCriterion().getCriterion() instanceof LocationCriterion) {                   		
	                		((LocationCriterion)c.getBiddableAdGroupCriterion().getCriterion()).setLocationId(Long.parseLong(v));
                    	}
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroupLocationCriterion, String>(StringTable.SubType,
                new Function<BulkAdGroupLocationCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupLocationCriterion c) { 
                    	if (c.getBiddableAdGroupCriterion().getCriterion() instanceof LocationCriterion) {    
                    		return ((LocationCriterion) c.getBiddableAdGroupCriterion().getCriterion()).getLocationType();
                    	} 
                    	return null;
                    }
                },
                new BiConsumer<String, BulkAdGroupLocationCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupLocationCriterion c) {
                    	if (c.getBiddableAdGroupCriterion().getCriterion() instanceof LocationCriterion) {                   		
	                		((LocationCriterion)c.getBiddableAdGroupCriterion().getCriterion()).setLocationType(v);
                    	}
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroupLocationCriterion, String>(StringTable.Name,
                new Function<BulkAdGroupLocationCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupLocationCriterion c) { 
                    	if (c.getBiddableAdGroupCriterion().getCriterion() instanceof LocationCriterion) {    
                    		return ((LocationCriterion) c.getBiddableAdGroupCriterion().getCriterion()).getDisplayName();
                    	} 
                    	return null;
                    }
                },
                new BiConsumer<String, BulkAdGroupLocationCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupLocationCriterion c) {
                    	if (c.getBiddableAdGroupCriterion().getCriterion() instanceof LocationCriterion) {                   		
	                		((LocationCriterion)c.getBiddableAdGroupCriterion().getCriterion()).setDisplayName(v);
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
        return new LocationCriterion();
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        super.processMappingsToRowValues(values, excludeReadonlyData);
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

}
