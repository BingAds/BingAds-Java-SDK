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
import com.microsoft.bingads.v13.campaignmanagement.DistanceUnit;
import com.microsoft.bingads.v13.campaignmanagement.RadiusCriterion;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;

/**
 * Represents a radius criterion that is assigned to a campaign. Each radius criterion can be read or written in a bulk file.
 *
 * <p>
 *     For more information, see Campaign Radius Criterion at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127>https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkCampaignRadiusCriterion extends BulkCampaignBiddableCriterion {
	
	private static final List<BulkMapping<BulkCampaignRadiusCriterion>> MAPPINGS;

    static {
        List<BulkMapping<BulkCampaignRadiusCriterion>> m = new ArrayList<BulkMapping<BulkCampaignRadiusCriterion>>();
        
        
        m.add(new SimpleBulkMapping<BulkCampaignRadiusCriterion, String>(StringTable.Name,
                new Function<BulkCampaignRadiusCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignRadiusCriterion c) { 
                    	if (c.getBiddableCampaignCriterion().getCriterion() instanceof RadiusCriterion) {    
                    		return ((RadiusCriterion) c.getBiddableCampaignCriterion().getCriterion()).getName();
                    	} 
                    	return null;
                    }
                },
                new BiConsumer<String, BulkCampaignRadiusCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignRadiusCriterion c) {
                    	if (c.getBiddableCampaignCriterion().getCriterion() instanceof RadiusCriterion) {                   		
	                		((RadiusCriterion)c.getBiddableCampaignCriterion().getCriterion()).setName(v);
                    	}
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkCampaignRadiusCriterion, String>(StringTable.Latitude,
                new Function<BulkCampaignRadiusCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignRadiusCriterion c) { 
                    	if (c.getBiddableCampaignCriterion().getCriterion() instanceof RadiusCriterion) {    
                    		Double latitude = ((RadiusCriterion) c.getBiddableCampaignCriterion().getCriterion()).getLatitudeDegrees();
                    		return latitude == null ? null: latitude.toString();
                    	} 
                    	return null;
                    }
                },
                new BiConsumer<String, BulkCampaignRadiusCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignRadiusCriterion c) {
                    	if (c.getBiddableCampaignCriterion().getCriterion() instanceof RadiusCriterion) {                   		
	                		((RadiusCriterion)c.getBiddableCampaignCriterion().getCriterion()).setLatitudeDegrees(StringExtensions.nullOrDouble(v));
                    	}
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkCampaignRadiusCriterion, String>(StringTable.Longitude,
                new Function<BulkCampaignRadiusCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignRadiusCriterion c) { 
                    	if (c.getBiddableCampaignCriterion().getCriterion() instanceof RadiusCriterion) {    
                    		Double longitude = ((RadiusCriterion) c.getBiddableCampaignCriterion().getCriterion()).getLongitudeDegrees();
                    		return longitude == null ? null: longitude.toString();
                    	} 
                    	return null;
                    }
                },
                new BiConsumer<String, BulkCampaignRadiusCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignRadiusCriterion c) {
                    	if (c.getBiddableCampaignCriterion().getCriterion() instanceof RadiusCriterion) {                   		
	                		((RadiusCriterion)c.getBiddableCampaignCriterion().getCriterion()).setLongitudeDegrees(StringExtensions.nullOrDouble(v));
                    	}
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkCampaignRadiusCriterion, String>(StringTable.Radius,
                new Function<BulkCampaignRadiusCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignRadiusCriterion c) { 
                    	if (c.getBiddableCampaignCriterion().getCriterion() instanceof RadiusCriterion) {    
                    		Long radius = ((RadiusCriterion) c.getBiddableCampaignCriterion().getCriterion()).getRadius();
                    		return radius == null ? null: radius.toString();
                    	} 
                    	return null;
                    }
                },
                new BiConsumer<String, BulkCampaignRadiusCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignRadiusCriterion c) {
                    	if (c.getBiddableCampaignCriterion().getCriterion() instanceof RadiusCriterion) {                   		
	                		((RadiusCriterion)c.getBiddableCampaignCriterion().getCriterion()).setRadius(StringExtensions.nullOrLong(v));
                    	}
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkCampaignRadiusCriterion, String>(StringTable.Unit,
                new Function<BulkCampaignRadiusCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignRadiusCriterion c) { 
                    	if (c.getBiddableCampaignCriterion().getCriterion() instanceof RadiusCriterion) {    
                    		DistanceUnit radiusUnit = ((RadiusCriterion) c.getBiddableCampaignCriterion().getCriterion()).getRadiusUnit();
                    		return radiusUnit == null ? null: radiusUnit.value();
                    	} 
                    	return null;
                    }
                },
                new BiConsumer<String, BulkCampaignRadiusCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignRadiusCriterion c) {
                    	if (c.getBiddableCampaignCriterion().getCriterion() instanceof RadiusCriterion) {                   		
	                		((RadiusCriterion)c.getBiddableCampaignCriterion().getCriterion()).setRadiusUnit(StringExtensions.parseOptional(v, new Function<String, DistanceUnit>() {
	                            @Override
	                            public DistanceUnit apply(String s) {
	                                return DistanceUnit.fromValue(s);
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
        return new RadiusCriterion();
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        super.processMappingsToRowValues(values, excludeReadonlyData);
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

}
