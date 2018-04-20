package com.microsoft.bingads.v12.bulk.entities;

import com.microsoft.bingads.v12.bulk.BulkServiceManager;
import com.microsoft.bingads.v12.campaignmanagement.BidMultiplier;
import com.microsoft.bingads.v12.campaignmanagement.BiddableCampaignCriterion;
import com.microsoft.bingads.v12.campaignmanagement.CampaignCriterionStatus;
import com.microsoft.bingads.v12.campaignmanagement.CriterionBid;
import com.microsoft.bingads.v12.campaignmanagement.DistanceUnit;
import com.microsoft.bingads.v12.campaignmanagement.RadiusCriterion;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v12.bulk.BulkFileReader;
import com.microsoft.bingads.v12.bulk.BulkFileWriter;
import com.microsoft.bingads.v12.bulk.BulkOperation;
import com.microsoft.bingads.v12.internal.bulk.BulkMapping;
import com.microsoft.bingads.v12.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v12.internal.bulk.RowValues;
import com.microsoft.bingads.v12.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v12.internal.bulk.StringExtensions;
import com.microsoft.bingads.v12.internal.bulk.StringTable;
import com.microsoft.bingads.v12.internal.bulk.entities.SingleRecordBulkEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
public class BulkCampaignRadiusCriterion extends SingleRecordBulkEntity {
	
	private BiddableCampaignCriterion biddableCampaignCriterion;
	
	private String campaignName;

	private static final List<BulkMapping<BulkCampaignRadiusCriterion>> MAPPINGS;

    static {
        List<BulkMapping<BulkCampaignRadiusCriterion>> m = new ArrayList<BulkMapping<BulkCampaignRadiusCriterion>>();
        
        m.add(new SimpleBulkMapping<BulkCampaignRadiusCriterion, String>(StringTable.Status,
                new Function<BulkCampaignRadiusCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignRadiusCriterion c) {
                    	CampaignCriterionStatus status = c.getBiddableCampaignCriterion().getStatus();
                    	
                        return status == null ? null : status.value();
                    }
                },
                new BiConsumer<String, BulkCampaignRadiusCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignRadiusCriterion c) {
                        c.getBiddableCampaignCriterion().setStatus(StringExtensions.parseOptional(v, new Function<String, CampaignCriterionStatus>() {
                            @Override
                            public CampaignCriterionStatus apply(String s) {
                                return CampaignCriterionStatus.fromValue(s);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkCampaignRadiusCriterion, Long>(StringTable.Id,
                new Function<BulkCampaignRadiusCriterion, Long>() {
                    @Override
                    public Long apply(BulkCampaignRadiusCriterion c) {
                        return c.getBiddableCampaignCriterion().getId();
                    }
                },
                new BiConsumer<String, BulkCampaignRadiusCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignRadiusCriterion c) {
                        c.getBiddableCampaignCriterion().setId(StringExtensions.parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String s) {
                                return Long.parseLong(s);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkCampaignRadiusCriterion, Long>(StringTable.ParentId,
                new Function<BulkCampaignRadiusCriterion, Long>() {
                    @Override
                    public Long apply(BulkCampaignRadiusCriterion c) {
                        return c.getBiddableCampaignCriterion().getCampaignId();
                    }
                },
                new BiConsumer<String, BulkCampaignRadiusCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignRadiusCriterion c) {
                        c.getBiddableCampaignCriterion().setCampaignId(Long.parseLong(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkCampaignRadiusCriterion, String>(StringTable.Campaign,
                new Function<BulkCampaignRadiusCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignRadiusCriterion c) {
                        return c.getCampaignName();
                    }
                },
                new BiConsumer<String, BulkCampaignRadiusCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignRadiusCriterion c) {
                        c.setCampaignName(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkCampaignRadiusCriterion, String>(StringTable.BidAdjustment,
                new Function<BulkCampaignRadiusCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignRadiusCriterion c) {
                        if (c.getBiddableCampaignCriterion() instanceof BiddableCampaignCriterion) {
                            CriterionBid bid = ((BiddableCampaignCriterion) c.getBiddableCampaignCriterion()).getCriterionBid();
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
                new BiConsumer<String, BulkCampaignRadiusCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignRadiusCriterion c) {
                        if (c.getBiddableCampaignCriterion() instanceof BiddableCampaignCriterion) {
                            ((BidMultiplier) ((BiddableCampaignCriterion) c.getBiddableCampaignCriterion()).getCriterionBid()).setMultiplier(
                                    StringExtensions.nullOrDouble(v)
                            );
                        }
                    }
                }
        ));
        
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
        BiddableCampaignCriterion campaignCriterion = new BiddableCampaignCriterion();  
        
        BidMultiplier bidMultiplier = new BidMultiplier();       
        bidMultiplier.setType(BidMultiplier.class.getSimpleName());
        
        RadiusCriterion radiusCriterion = new RadiusCriterion();
        
    	campaignCriterion.setCriterion(radiusCriterion);
    	campaignCriterion.getCriterion().setType(RadiusCriterion.class.getSimpleName());
    	campaignCriterion.setCriterionBid(bidMultiplier);
    	campaignCriterion.setType("BiddableCampaignCriterion");
    	
    	setBiddableCampaignCriterion(campaignCriterion);  
    	
    	MappingHelpers.convertToEntity(values, MAPPINGS, this);   
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getBiddableCampaignCriterion(), BiddableCampaignCriterion.class.getSimpleName());
        
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    /**
     * Gets an Campaign Criterion.
     */
    public BiddableCampaignCriterion getBiddableCampaignCriterion() {
        return biddableCampaignCriterion;
    }

    /**
     * Sets an Campaign Criterion
     */
    public void setBiddableCampaignCriterion(BiddableCampaignCriterion biddableCampaignCriterion) {
        this.biddableCampaignCriterion = biddableCampaignCriterion;
    }

    /**
     * Gets the name of the campaign.
     * Corresponds to the 'Campaign' field in the bulk file.
     */
    public String getCampaignName() {
        return campaignName;
    }

    /**
     * Sets the name of the campaign.
     * Corresponds to the 'Campaign' field in the bulk file.
     */
    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }
}
