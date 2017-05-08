package com.microsoft.bingads.v11.bulk.entities;

import com.microsoft.bingads.v11.bulk.BulkServiceManager;
import com.microsoft.bingads.v11.campaignmanagement.BidMultiplier;
import com.microsoft.bingads.v11.campaignmanagement.BiddableCampaignCriterion;
import com.microsoft.bingads.v11.campaignmanagement.CampaignCriterionStatus;
import com.microsoft.bingads.v11.campaignmanagement.CriterionBid;
import com.microsoft.bingads.v11.campaignmanagement.GenderCriterion;
import com.microsoft.bingads.v11.campaignmanagement.GenderType;
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
 * Represents a gender criterion that is assigned to a campaign. Each gender criterion can be read or written in a bulk file.
 *
 * <p>
 *     For more information, see Campaign Gender Criterion at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127>https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkCampaignGenderCriterion extends SingleRecordBulkEntity {
	
	private BiddableCampaignCriterion campaignCriterion;
	
	private String campaignName;

	private static final List<BulkMapping<BulkCampaignGenderCriterion>> MAPPINGS;

    static {
        List<BulkMapping<BulkCampaignGenderCriterion>> m = new ArrayList<BulkMapping<BulkCampaignGenderCriterion>>();
        
        m.add(new SimpleBulkMapping<BulkCampaignGenderCriterion, String>(StringTable.Status,
                new Function<BulkCampaignGenderCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignGenderCriterion c) {
                    	CampaignCriterionStatus status = c.getCampaignCriterion().getStatus();
                    	
                        return status == null ? null : status.value();
                    }
                },
                new BiConsumer<String, BulkCampaignGenderCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignGenderCriterion c) {
                        c.getCampaignCriterion().setStatus(StringExtensions.parseOptional(v, new Function<String, CampaignCriterionStatus>() {
                            @Override
                            public CampaignCriterionStatus apply(String s) {
                                return CampaignCriterionStatus.fromValue(s);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkCampaignGenderCriterion, Long>(StringTable.Id,
                new Function<BulkCampaignGenderCriterion, Long>() {
                    @Override
                    public Long apply(BulkCampaignGenderCriterion c) {
                        return c.getCampaignCriterion().getId();
                    }
                },
                new BiConsumer<String, BulkCampaignGenderCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignGenderCriterion c) {
                        c.getCampaignCriterion().setId(StringExtensions.parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String s) {
                                return Long.parseLong(s);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkCampaignGenderCriterion, Long>(StringTable.ParentId,
                new Function<BulkCampaignGenderCriterion, Long>() {
                    @Override
                    public Long apply(BulkCampaignGenderCriterion c) {
                        return c.getCampaignCriterion().getCampaignId();
                    }
                },
                new BiConsumer<String, BulkCampaignGenderCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignGenderCriterion c) {
                        c.getCampaignCriterion().setCampaignId(Long.parseLong(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkCampaignGenderCriterion, String>(StringTable.Campaign,
                new Function<BulkCampaignGenderCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignGenderCriterion c) {
                        return c.getCampaignName();
                    }
                },
                new BiConsumer<String, BulkCampaignGenderCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignGenderCriterion c) {
                        c.setCampaignName(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkCampaignGenderCriterion, String>(StringTable.BidAdjustment,
                new Function<BulkCampaignGenderCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignGenderCriterion c) {
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
                new BiConsumer<String, BulkCampaignGenderCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignGenderCriterion c) {
                        if (c.getCampaignCriterion() instanceof BiddableCampaignCriterion) {
                            ((BidMultiplier) ((BiddableCampaignCriterion) c.getCampaignCriterion()).getCriterionBid()).setMultiplier(
                                    StringExtensions.nullOrDouble(v)
                            );
                        }
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkCampaignGenderCriterion, String>(StringTable.Target,
                new Function<BulkCampaignGenderCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignGenderCriterion c) { 
                    	if (c.getCampaignCriterion().getCriterion() instanceof GenderCriterion) {    
                    		GenderType genderType = ((GenderCriterion) c.getCampaignCriterion().getCriterion()).getGenderType();
                    		return genderType == null ? null : genderType.value();
                    	} 
                    	return null;
                    }
                },
                new BiConsumer<String, BulkCampaignGenderCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignGenderCriterion c) {
                    	if (c.getCampaignCriterion().getCriterion() instanceof GenderCriterion) {
                    		
	                		((GenderCriterion)c.getCampaignCriterion().getCriterion()).setGenderType(StringExtensions.parseOptional(v, new Function<String, GenderType>() {
	                                @Override
	                                public GenderType apply(String s) {
	                                    return GenderType.fromValue(s);
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
        
        GenderCriterion genderCriterion = new GenderCriterion();
        
    	campaignCriterion.setCriterion(genderCriterion);
    	campaignCriterion.getCriterion().setType(GenderCriterion.class.getSimpleName());
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
