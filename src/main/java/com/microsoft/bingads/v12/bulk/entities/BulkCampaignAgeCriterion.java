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
import com.microsoft.bingads.v12.campaignmanagement.AgeCriterion;
import com.microsoft.bingads.v12.campaignmanagement.AgeRange;
import com.microsoft.bingads.v12.campaignmanagement.BidMultiplier;
import com.microsoft.bingads.v12.campaignmanagement.BiddableCampaignCriterion;
import com.microsoft.bingads.v12.campaignmanagement.CampaignCriterionStatus;
import com.microsoft.bingads.v12.campaignmanagement.CriterionBid;
import com.microsoft.bingads.v12.internal.bulk.BulkMapping;
import com.microsoft.bingads.v12.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v12.internal.bulk.RowValues;
import com.microsoft.bingads.v12.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v12.internal.bulk.StringExtensions;
import com.microsoft.bingads.v12.internal.bulk.StringTable;
import com.microsoft.bingads.v12.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * Represents an age criterion that is assigned to a campaign. Each age criterion can be read or written in a bulk file.
 *
 * <p>
 *     For more information, see Campaign Age Criterion at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127>https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkCampaignAgeCriterion extends SingleRecordBulkEntity {
	
	private BiddableCampaignCriterion biddableCampaignCriterion;
	
	private String campaignName;
	
	private static final List<BulkMapping<BulkCampaignAgeCriterion>> MAPPINGS;

    static {
        List<BulkMapping<BulkCampaignAgeCriterion>> m = new ArrayList<BulkMapping<BulkCampaignAgeCriterion>>();
        
        m.add(new SimpleBulkMapping<BulkCampaignAgeCriterion, String>(StringTable.Status,
                new Function<BulkCampaignAgeCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignAgeCriterion c) {
                    	CampaignCriterionStatus status = c.getBiddableCampaignCriterion().getStatus();
                    	
                        return status == null ? null : status.value();
                    }
                },
                new BiConsumer<String, BulkCampaignAgeCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignAgeCriterion c) {
                        c.getBiddableCampaignCriterion().setStatus(StringExtensions.parseOptional(v, new Function<String, CampaignCriterionStatus>() {
                            @Override
                            public CampaignCriterionStatus apply(String s) {
                                return CampaignCriterionStatus.fromValue(s);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkCampaignAgeCriterion, Long>(StringTable.Id,
                new Function<BulkCampaignAgeCriterion, Long>() {
                    @Override
                    public Long apply(BulkCampaignAgeCriterion c) {
                        return c.getBiddableCampaignCriterion().getId();
                    }
                },
                new BiConsumer<String, BulkCampaignAgeCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignAgeCriterion c) {
                        c.getBiddableCampaignCriterion().setId(StringExtensions.parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String s) {
                                return Long.parseLong(s);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkCampaignAgeCriterion, Long>(StringTable.ParentId,
                new Function<BulkCampaignAgeCriterion, Long>() {
                    @Override
                    public Long apply(BulkCampaignAgeCriterion c) {
                        return c.getBiddableCampaignCriterion().getCampaignId();
                    }
                },
                new BiConsumer<String, BulkCampaignAgeCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignAgeCriterion c) {
                        c.getBiddableCampaignCriterion().setCampaignId(Long.parseLong(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkCampaignAgeCriterion, String>(StringTable.Campaign,
                new Function<BulkCampaignAgeCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignAgeCriterion c) {
                        return c.getCampaignName();
                    }
                },
                new BiConsumer<String, BulkCampaignAgeCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignAgeCriterion c) {
                        c.setCampaignName(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkCampaignAgeCriterion, String>(StringTable.BidAdjustment,
                new Function<BulkCampaignAgeCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignAgeCriterion c) {
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
                new BiConsumer<String, BulkCampaignAgeCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignAgeCriterion c) {
                        if (c.getBiddableCampaignCriterion() instanceof BiddableCampaignCriterion) {
                            ((BidMultiplier) ((BiddableCampaignCriterion) c.getBiddableCampaignCriterion()).getCriterionBid()).setMultiplier(
                                    StringExtensions.nullOrDouble(v)
                            );
                        }
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkCampaignAgeCriterion, String>(StringTable.Target,
                new Function<BulkCampaignAgeCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignAgeCriterion c) { 
                    	if (c.getBiddableCampaignCriterion().getCriterion() instanceof AgeCriterion) {    
                    		AgeRange ageRange = ((AgeCriterion) c.getBiddableCampaignCriterion().getCriterion()).getAgeRange();
                    		return ageRange == null ? null : ageRange.value();
                    	} 
                    	return null;
                    }
                },
                new BiConsumer<String, BulkCampaignAgeCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignAgeCriterion c) {
                    	if (c.getBiddableCampaignCriterion().getCriterion() instanceof AgeCriterion) {
                    		
	                		((AgeCriterion)c.getBiddableCampaignCriterion().getCriterion()).setAgeRange(StringExtensions.parseOptional(v, new Function<String, AgeRange>() {
	                                @Override
	                                public AgeRange apply(String s) {
	                                    return AgeRange.fromValue(s);
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
        
        AgeCriterion ageCriterion = new AgeCriterion();
        
        campaignCriterion.setCriterion(ageCriterion);
        campaignCriterion.getCriterion().setType(AgeCriterion.class.getSimpleName());
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
     * Gets a Campaign Criterion.
     */
    public BiddableCampaignCriterion getBiddableCampaignCriterion() {
        return biddableCampaignCriterion;
    }

    /**
     * Sets a Campaign Criterion
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
