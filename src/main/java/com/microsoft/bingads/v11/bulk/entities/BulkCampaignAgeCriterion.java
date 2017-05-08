package com.microsoft.bingads.v11.bulk.entities;

import com.microsoft.bingads.v11.bulk.BulkServiceManager;
import com.microsoft.bingads.v11.campaignmanagement.AgeCriterion;
import com.microsoft.bingads.v11.campaignmanagement.AgeRange;
import com.microsoft.bingads.v11.campaignmanagement.BidMultiplier;
import com.microsoft.bingads.v11.campaignmanagement.BiddableCampaignCriterion;
import com.microsoft.bingads.v11.campaignmanagement.CampaignCriterionStatus;
import com.microsoft.bingads.v11.campaignmanagement.CriterionBid;
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
	
	private BiddableCampaignCriterion campaignCriterion;
	
	private String campaignName;
	
	private static final List<BulkMapping<BulkCampaignAgeCriterion>> MAPPINGS;

    static {
        List<BulkMapping<BulkCampaignAgeCriterion>> m = new ArrayList<BulkMapping<BulkCampaignAgeCriterion>>();
        
        m.add(new SimpleBulkMapping<BulkCampaignAgeCriterion, String>(StringTable.Status,
                new Function<BulkCampaignAgeCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignAgeCriterion c) {
                    	CampaignCriterionStatus status = c.getCampaignCriterion().getStatus();
                    	
                        return status == null ? null : status.value();
                    }
                },
                new BiConsumer<String, BulkCampaignAgeCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignAgeCriterion c) {
                        c.getCampaignCriterion().setStatus(StringExtensions.parseOptional(v, new Function<String, CampaignCriterionStatus>() {
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
                        return c.getCampaignCriterion().getId();
                    }
                },
                new BiConsumer<String, BulkCampaignAgeCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignAgeCriterion c) {
                        c.getCampaignCriterion().setId(StringExtensions.parseOptional(v, new Function<String, Long>() {
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
                        return c.getCampaignCriterion().getCampaignId();
                    }
                },
                new BiConsumer<String, BulkCampaignAgeCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignAgeCriterion c) {
                        c.getCampaignCriterion().setCampaignId(Long.parseLong(v));
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
                new BiConsumer<String, BulkCampaignAgeCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignAgeCriterion c) {
                        if (c.getCampaignCriterion() instanceof BiddableCampaignCriterion) {
                            ((BidMultiplier) ((BiddableCampaignCriterion) c.getCampaignCriterion()).getCriterionBid()).setMultiplier(
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
                    	if (c.getCampaignCriterion().getCriterion() instanceof AgeCriterion) {    
                    		AgeRange ageRange = ((AgeCriterion) c.getCampaignCriterion().getCriterion()).getAgeRange();
                    		return ageRange == null ? null : ageRange.value();
                    	} 
                    	return null;
                    }
                },
                new BiConsumer<String, BulkCampaignAgeCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignAgeCriterion c) {
                    	if (c.getCampaignCriterion().getCriterion() instanceof AgeCriterion) {
                    		
	                		((AgeCriterion)c.getCampaignCriterion().getCriterion()).setAgeRange(StringExtensions.parseOptional(v, new Function<String, AgeRange>() {
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
    	
    	setCampaignCriterion(campaignCriterion);  
    	
    	MappingHelpers.convertToEntity(values, MAPPINGS, this);   
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getCampaignCriterion(), BiddableCampaignCriterion.class.getSimpleName());
        
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    /**
     * Gets a Campaign Criterion.
     */
    public BiddableCampaignCriterion getCampaignCriterion() {
        return campaignCriterion;
    }

    /**
     * Sets a Campaign Criterion
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
