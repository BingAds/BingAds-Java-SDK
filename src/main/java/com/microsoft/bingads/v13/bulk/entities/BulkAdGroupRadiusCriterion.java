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
 * Represents a radius criterion that is assigned to an ad group. Each radius criterion can be read or written in a bulk file.
 *
 * <p>
 *     For more information, see Ad Group Radius Criterion at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127>https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkAdGroupRadiusCriterion extends BulkAdGroupBiddableCriterion {
	
	private static final List<BulkMapping<BulkAdGroupRadiusCriterion>> MAPPINGS;

    static {
        List<BulkMapping<BulkAdGroupRadiusCriterion>> m = new ArrayList<BulkMapping<BulkAdGroupRadiusCriterion>>();
        
        m.add(new SimpleBulkMapping<BulkAdGroupRadiusCriterion, String>(StringTable.Name,
                new Function<BulkAdGroupRadiusCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupRadiusCriterion c) { 
                    	if (c.getBiddableAdGroupCriterion().getCriterion() instanceof RadiusCriterion) {    
                    		return ((RadiusCriterion) c.getBiddableAdGroupCriterion().getCriterion()).getName();
                    	} 
                    	return null;
                    }
                },
                new BiConsumer<String, BulkAdGroupRadiusCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupRadiusCriterion c) {
                    	if (c.getBiddableAdGroupCriterion().getCriterion() instanceof RadiusCriterion) {                   		
	                		((RadiusCriterion)c.getBiddableAdGroupCriterion().getCriterion()).setName(v);
                    	}
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroupRadiusCriterion, String>(StringTable.Latitude,
                new Function<BulkAdGroupRadiusCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupRadiusCriterion c) { 
                    	if (c.getBiddableAdGroupCriterion().getCriterion() instanceof RadiusCriterion) {    
                    		Double latitude = ((RadiusCriterion) c.getBiddableAdGroupCriterion().getCriterion()).getLatitudeDegrees();
                    		return latitude == null ? null: latitude.toString();
                    	} 
                    	return null;
                    }
                },
                new BiConsumer<String, BulkAdGroupRadiusCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupRadiusCriterion c) {
                    	if (c.getBiddableAdGroupCriterion().getCriterion() instanceof RadiusCriterion) {                   		
	                		((RadiusCriterion)c.getBiddableAdGroupCriterion().getCriterion()).setLatitudeDegrees(StringExtensions.nullOrDouble(v));
                    	}
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroupRadiusCriterion, String>(StringTable.Longitude,
                new Function<BulkAdGroupRadiusCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupRadiusCriterion c) { 
                    	if (c.getBiddableAdGroupCriterion().getCriterion() instanceof RadiusCriterion) {    
                    		Double longitude = ((RadiusCriterion) c.getBiddableAdGroupCriterion().getCriterion()).getLongitudeDegrees();
                    		return longitude == null ? null: longitude.toString();
                    	} 
                    	return null;
                    }
                },
                new BiConsumer<String, BulkAdGroupRadiusCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupRadiusCriterion c) {
                    	if (c.getBiddableAdGroupCriterion().getCriterion() instanceof RadiusCriterion) {                   		
	                		((RadiusCriterion)c.getBiddableAdGroupCriterion().getCriterion()).setLongitudeDegrees(StringExtensions.nullOrDouble(v));
                    	}
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroupRadiusCriterion, String>(StringTable.Radius,
                new Function<BulkAdGroupRadiusCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupRadiusCriterion c) { 
                    	if (c.getBiddableAdGroupCriterion().getCriterion() instanceof RadiusCriterion) {    
                    		Long radius = ((RadiusCriterion) c.getBiddableAdGroupCriterion().getCriterion()).getRadius();
                    		return radius == null ? null: radius.toString();
                    	} 
                    	return null;
                    }
                },
                new BiConsumer<String, BulkAdGroupRadiusCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupRadiusCriterion c) {
                    	if (c.getBiddableAdGroupCriterion().getCriterion() instanceof RadiusCriterion) {                   		
	                		((RadiusCriterion)c.getBiddableAdGroupCriterion().getCriterion()).setRadius(StringExtensions.nullOrLong(v));
                    	}
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroupRadiusCriterion, String>(StringTable.Unit,
                new Function<BulkAdGroupRadiusCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupRadiusCriterion c) { 
                    	if (c.getBiddableAdGroupCriterion().getCriterion() instanceof RadiusCriterion) {    
                    		DistanceUnit radiusUnit = ((RadiusCriterion) c.getBiddableAdGroupCriterion().getCriterion()).getRadiusUnit();
                    		return radiusUnit == null ? null: radiusUnit.value();
                    	} 
                    	return null;
                    }
                },
                new BiConsumer<String, BulkAdGroupRadiusCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupRadiusCriterion c) {
                    	if (c.getBiddableAdGroupCriterion().getCriterion() instanceof RadiusCriterion) {                   		
	                		((RadiusCriterion)c.getBiddableAdGroupCriterion().getCriterion()).setRadiusUnit(StringExtensions.parseOptional(v, new Function<String, DistanceUnit>() {
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
