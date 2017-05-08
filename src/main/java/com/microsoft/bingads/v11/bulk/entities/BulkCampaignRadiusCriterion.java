package com.microsoft.bingads.v11.bulk.entities;

import com.microsoft.bingads.v11.bulk.BulkServiceManager;
import com.microsoft.bingads.v11.campaignmanagement.BidMultiplier;
import com.microsoft.bingads.v11.campaignmanagement.BiddableCampaignCriterion;
import com.microsoft.bingads.v11.campaignmanagement.CampaignCriterionStatus;
import com.microsoft.bingads.v11.campaignmanagement.CriterionBid;
import com.microsoft.bingads.v11.campaignmanagement.DistanceUnit;
import com.microsoft.bingads.v11.campaignmanagement.RadiusCriterion;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v11.bulk.BulkFileReader;
import com.microsoft.bingads.v11.bulk.BulkFileWriter;
import com.microsoft.bingads.v11.bulk.BulkOperation;
import com.microsoft.bingads.v11.internal.bulk.BulkMapping;
import com.microsoft.bingads.v11.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v11.internal.bulk.RowValues;
import com.microsoft.bingads.v11.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v11.internal.bulk.StringExtensions;
import com.microsoft.bingads.v11.internal.bulk.StringTable;
import com.microsoft.bingads.v11.internal.bulk.entities.SingleRecordBulkEntity;
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
	
	private BiddableCampaignCriterion campaignCriterion;
	
	private String campaignName;

	private static final List<BulkMapping<BulkCampaignRadiusCriterion>> MAPPINGS;

    static {
        List<BulkMapping<BulkCampaignRadiusCriterion>> m = new ArrayList<BulkMapping<BulkCampaignRadiusCriterion>>();
        
        m.add(new SimpleBulkMapping<BulkCampaignRadiusCriterion, String>(StringTable.Status,
                new Function<BulkCampaignRadiusCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignRadiusCriterion c) {
                    	CampaignCriterionStatus status = c.getCampaignCriterion().getStatus();
                    	
                        return status == null ? null : status.value();
                    }
                },
                new BiConsumer<String, BulkCampaignRadiusCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignRadiusCriterion c) {
                        c.getCampaignCriterion().setStatus(StringExtensions.parseOptional(v, new Function<String, CampaignCriterionStatus>() {
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
                        return c.getCampaignCriterion().getId();
                    }
                },
                new BiConsumer<String, BulkCampaignRadiusCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignRadiusCriterion c) {
                        c.getCampaignCriterion().setId(StringExtensions.parseOptional(v, new Function<String, Long>() {
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
                        return c.getCampaignCriterion().getCampaignId();
                    }
                },
                new BiConsumer<String, BulkCampaignRadiusCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignRadiusCriterion c) {
                        c.getCampaignCriterion().setCampaignId(Long.parseLong(v));
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
                        if (c.getCampaignCriterion() instanceof BiddableCampaignCriterion) {
                            CriterionBid bid = ((BiddableCampaignCriterion) c.getCampaignCriterion()).getCriterionBid();
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
                        if (c.getCampaignCriterion() instanceof BiddableCampaignCriterion) {
                            ((BidMultiplier) ((BiddableCampaignCriterion) c.getCampaignCriterion()).getCriterionBid()).setMultiplier(
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
                    	if (c.getCampaignCriterion().getCriterion() instanceof RadiusCriterion) {    
                    		return ((RadiusCriterion) c.getCampaignCriterion().getCriterion()).getName();
                    	} 
                    	return null;
                    }
                },
                new BiConsumer<String, BulkCampaignRadiusCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignRadiusCriterion c) {
                    	if (c.getCampaignCriterion().getCriterion() instanceof RadiusCriterion) {                   		
	                		((RadiusCriterion)c.getCampaignCriterion().getCriterion()).setName(v);
                    	}
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkCampaignRadiusCriterion, String>(StringTable.Latitude,
                new Function<BulkCampaignRadiusCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignRadiusCriterion c) { 
                    	if (c.getCampaignCriterion().getCriterion() instanceof RadiusCriterion) {    
                    		Double latitude = ((RadiusCriterion) c.getCampaignCriterion().getCriterion()).getLatitudeDegrees();
                    		return latitude == null ? null: latitude.toString();
                    	} 
                    	return null;
                    }
                },
                new BiConsumer<String, BulkCampaignRadiusCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignRadiusCriterion c) {
                    	if (c.getCampaignCriterion().getCriterion() instanceof RadiusCriterion) {                   		
	                		((RadiusCriterion)c.getCampaignCriterion().getCriterion()).setLatitudeDegrees(StringExtensions.nullOrDouble(v));
                    	}
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkCampaignRadiusCriterion, String>(StringTable.Longitude,
                new Function<BulkCampaignRadiusCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignRadiusCriterion c) { 
                    	if (c.getCampaignCriterion().getCriterion() instanceof RadiusCriterion) {    
                    		Double longitude = ((RadiusCriterion) c.getCampaignCriterion().getCriterion()).getLongitudeDegrees();
                    		return longitude == null ? null: longitude.toString();
                    	} 
                    	return null;
                    }
                },
                new BiConsumer<String, BulkCampaignRadiusCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignRadiusCriterion c) {
                    	if (c.getCampaignCriterion().getCriterion() instanceof RadiusCriterion) {                   		
	                		((RadiusCriterion)c.getCampaignCriterion().getCriterion()).setLongitudeDegrees(StringExtensions.nullOrDouble(v));
                    	}
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkCampaignRadiusCriterion, String>(StringTable.Radius,
                new Function<BulkCampaignRadiusCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignRadiusCriterion c) { 
                    	if (c.getCampaignCriterion().getCriterion() instanceof RadiusCriterion) {    
                    		Long radius = ((RadiusCriterion) c.getCampaignCriterion().getCriterion()).getRadius();
                    		return radius == null ? null: radius.toString();
                    	} 
                    	return null;
                    }
                },
                new BiConsumer<String, BulkCampaignRadiusCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignRadiusCriterion c) {
                    	if (c.getCampaignCriterion().getCriterion() instanceof RadiusCriterion) {                   		
	                		((RadiusCriterion)c.getCampaignCriterion().getCriterion()).setRadius(StringExtensions.nullOrLong(v));
                    	}
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkCampaignRadiusCriterion, String>(StringTable.Unit,
                new Function<BulkCampaignRadiusCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignRadiusCriterion c) { 
                    	if (c.getCampaignCriterion().getCriterion() instanceof RadiusCriterion) {    
                    		DistanceUnit radiusUnit = ((RadiusCriterion) c.getCampaignCriterion().getCriterion()).getRadiusUnit();
                    		return radiusUnit == null ? null: radiusUnit.value();
                    	} 
                    	return null;
                    }
                },
                new BiConsumer<String, BulkCampaignRadiusCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignRadiusCriterion c) {
                    	if (c.getCampaignCriterion().getCriterion() instanceof RadiusCriterion) {                   		
	                		((RadiusCriterion)c.getCampaignCriterion().getCriterion()).setRadiusUnit(StringExtensions.parseOptional(v, new Function<String, DistanceUnit>() {
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
    	
    	setCampaignCriterion(campaignCriterion);  
    	
    	MappingHelpers.convertToEntity(values, MAPPINGS, this);   
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getCampaignCriterion(), BiddableCampaignCriterion.class.getSimpleName());
        
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    /**
     * Gets an Campaign Criterion.
     */
    public BiddableCampaignCriterion getCampaignCriterion() {
        return campaignCriterion;
    }

    /**
     * Sets an Campaign Criterion
     */
    public void setCampaignCriterion(BiddableCampaignCriterion campaignCriterion) {
        this.campaignCriterion = campaignCriterion;
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
