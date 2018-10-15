package com.microsoft.bingads.v12.bulk.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v12.bulk.BulkFileReader;
import com.microsoft.bingads.v12.bulk.BulkFileWriter;
import com.microsoft.bingads.v12.bulk.BulkOperation;
import com.microsoft.bingads.v12.bulk.BulkServiceManager;
import com.microsoft.bingads.v12.campaignmanagement.AdGroupCriterionStatus;
import com.microsoft.bingads.v12.campaignmanagement.BidMultiplier;
import com.microsoft.bingads.v12.campaignmanagement.BiddableAdGroupCriterion;
import com.microsoft.bingads.v12.campaignmanagement.CriterionBid;
import com.microsoft.bingads.v12.campaignmanagement.DistanceUnit;
import com.microsoft.bingads.v12.campaignmanagement.RadiusCriterion;
import com.microsoft.bingads.v12.internal.bulk.BulkMapping;
import com.microsoft.bingads.v12.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v12.internal.bulk.RowValues;
import com.microsoft.bingads.v12.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v12.internal.bulk.StringExtensions;
import com.microsoft.bingads.v12.internal.bulk.StringTable;
import com.microsoft.bingads.v12.internal.bulk.entities.SingleRecordBulkEntity;

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
public class BulkAdGroupRadiusCriterion extends SingleRecordBulkEntity {
	
	private BiddableAdGroupCriterion biddableAdGroupCriterion;
	
	private String campaignName;
	
	private String adGroupName;

	private static final List<BulkMapping<BulkAdGroupRadiusCriterion>> MAPPINGS;

    static {
        List<BulkMapping<BulkAdGroupRadiusCriterion>> m = new ArrayList<BulkMapping<BulkAdGroupRadiusCriterion>>();
        
        m.add(new SimpleBulkMapping<BulkAdGroupRadiusCriterion, String>(StringTable.Status,
                new Function<BulkAdGroupRadiusCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupRadiusCriterion c) {
                        AdGroupCriterionStatus status = c.getBiddableAdGroupCriterion().getStatus();

                        return status == null ? null : status.value();
                    }
                },
                new BiConsumer<String, BulkAdGroupRadiusCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupRadiusCriterion c) {
                        c.getBiddableAdGroupCriterion().setStatus(StringExtensions.parseOptional(v, new Function<String, AdGroupCriterionStatus>() {
                            @Override
                            public AdGroupCriterionStatus apply(String s) {
                                return AdGroupCriterionStatus.fromValue(s);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupRadiusCriterion, Long>(StringTable.Id,
                new Function<BulkAdGroupRadiusCriterion, Long>() {
                    @Override
                    public Long apply(BulkAdGroupRadiusCriterion c) {
                        return c.getBiddableAdGroupCriterion().getId();
                    }
                },
                new BiConsumer<String, BulkAdGroupRadiusCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupRadiusCriterion c) {
                        c.getBiddableAdGroupCriterion().setId(StringExtensions.parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String s) {
                                return Long.parseLong(s);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupRadiusCriterion, Long>(StringTable.ParentId,
                new Function<BulkAdGroupRadiusCriterion, Long>() {
                    @Override
                    public Long apply(BulkAdGroupRadiusCriterion c) {
                        return c.getBiddableAdGroupCriterion().getAdGroupId();
                    }
                },
                new BiConsumer<String, BulkAdGroupRadiusCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupRadiusCriterion c) {
                        c.getBiddableAdGroupCriterion().setAdGroupId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupRadiusCriterion, String>(StringTable.Campaign,
                new Function<BulkAdGroupRadiusCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupRadiusCriterion c) {
                        return c.getCampaignName();
                    }
                },
                new BiConsumer<String, BulkAdGroupRadiusCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupRadiusCriterion c) {
                        c.setCampaignName(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroupRadiusCriterion, String>(StringTable.AdGroup,
                new Function<BulkAdGroupRadiusCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupRadiusCriterion c) {
                        return c.getAdGroupName();
                    }
                },
                new BiConsumer<String, BulkAdGroupRadiusCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupRadiusCriterion c) {
                        c.setAdGroupName(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroupRadiusCriterion, String>(StringTable.BidAdjustment,
                new Function<BulkAdGroupRadiusCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupRadiusCriterion c) {
                        if (c.getBiddableAdGroupCriterion() instanceof BiddableAdGroupCriterion) {
                            CriterionBid bid = ((BiddableAdGroupCriterion) c.getBiddableAdGroupCriterion()).getCriterionBid();
                            if (bid == null) {
                                return null;
                            } else {
                                return StringExtensions.toCriterionBidMultiplierBulkString(((BidMultiplier) bid).getMultiplier());
                            }
                        } else {
                            return null;
                        }
                    }
                },
                new BiConsumer<String, BulkAdGroupRadiusCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupRadiusCriterion c) {
                        if (c.getBiddableAdGroupCriterion() instanceof BiddableAdGroupCriterion) {
                            ((BidMultiplier) ((BiddableAdGroupCriterion) c.getBiddableAdGroupCriterion()).getCriterionBid()).setMultiplier(
                                    StringExtensions.nullOrDouble(v)
                            );
                        }
                    }
                }
        ));
        
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
        BiddableAdGroupCriterion adGroupCriterion = new BiddableAdGroupCriterion();  
        
        BidMultiplier bidMultiplier = new BidMultiplier();       
        bidMultiplier.setType(BidMultiplier.class.getSimpleName());
        
        RadiusCriterion radiusCriterion = new RadiusCriterion();
        
    	adGroupCriterion.setCriterion(radiusCriterion);
    	adGroupCriterion.getCriterion().setType(RadiusCriterion.class.getSimpleName());
    	adGroupCriterion.setCriterionBid(bidMultiplier);
    	adGroupCriterion.setType("BiddableAdGroupCriterion");
    	
    	setBiddableAdGroupCriterion(adGroupCriterion);  
    	
    	MappingHelpers.convertToEntity(values, MAPPINGS, this);   
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getBiddableAdGroupCriterion(), BiddableAdGroupCriterion.class.getSimpleName());
        
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    /**
     * Gets an Ad Group Criterion.
     */
    public BiddableAdGroupCriterion getBiddableAdGroupCriterion() {
        return biddableAdGroupCriterion;
    }

    /**
     * Sets an Ad Group Criterion
     */
    public void setBiddableAdGroupCriterion(BiddableAdGroupCriterion biddableAdGroupCriterion) {
        this.biddableAdGroupCriterion = biddableAdGroupCriterion;
    }

    /**
     * Gets the name of the campaign.
     * Corresponds to the 'Campaign' field in the bulk file.
     */
    public String getCampaignName() {
        return campaignName;
    }

    /**
     * Sets the name of the ad group.
     * Corresponds to the 'Ad Group' field in the bulk file.
     */
    public void setAdGroupName(String adGroupName) {
        this.adGroupName = adGroupName;
    }
    
    /**
     * Gets the name of the ad group.
     * Corresponds to the 'Ad Group' field in the bulk file.
     */
    public String getAdGroupName() {
        return adGroupName;
    }

    /**
     * Sets the name of the campaign.
     * Corresponds to the 'Campaign' field in the bulk file.
     */
    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }
}
