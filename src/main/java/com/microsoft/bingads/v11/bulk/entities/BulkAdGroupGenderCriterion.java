package com.microsoft.bingads.v11.bulk.entities;

import com.microsoft.bingads.v11.bulk.BulkServiceManager;
import com.microsoft.bingads.v11.campaignmanagement.AdGroupCriterionStatus;
import com.microsoft.bingads.v11.campaignmanagement.BidMultiplier;
import com.microsoft.bingads.v11.campaignmanagement.BiddableAdGroupCriterion;
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
 * Represents a gender criterion that is assigned to an ad group. Each gender criterion can be read or written in a bulk file.
 *
 * <p>
 *     For more information, see Ad Group Gender Criterion at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127>https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkAdGroupGenderCriterion extends SingleRecordBulkEntity {
	
	private BiddableAdGroupCriterion adGroupCriterion;
	
	private String campaignName;
	
	private String adGroupName;

	private static final List<BulkMapping<BulkAdGroupGenderCriterion>> MAPPINGS;

    static {
        List<BulkMapping<BulkAdGroupGenderCriterion>> m = new ArrayList<BulkMapping<BulkAdGroupGenderCriterion>>();
        
        m.add(new SimpleBulkMapping<BulkAdGroupGenderCriterion, String>(StringTable.Status,
                new Function<BulkAdGroupGenderCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupGenderCriterion c) {
                        AdGroupCriterionStatus status = c.getAdGroupCriterion().getStatus();

                        return status == null ? null : status.value();
                    }
                },
                new BiConsumer<String, BulkAdGroupGenderCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupGenderCriterion c) {
                        c.getAdGroupCriterion().setStatus(StringExtensions.parseOptional(v, new Function<String, AdGroupCriterionStatus>() {
                            @Override
                            public AdGroupCriterionStatus apply(String s) {
                                return AdGroupCriterionStatus.fromValue(s);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupGenderCriterion, Long>(StringTable.Id,
                new Function<BulkAdGroupGenderCriterion, Long>() {
                    @Override
                    public Long apply(BulkAdGroupGenderCriterion c) {
                        return c.getAdGroupCriterion().getId();
                    }
                },
                new BiConsumer<String, BulkAdGroupGenderCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupGenderCriterion c) {
                        c.getAdGroupCriterion().setId(StringExtensions.parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String s) {
                                return Long.parseLong(s);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupGenderCriterion, Long>(StringTable.ParentId,
                new Function<BulkAdGroupGenderCriterion, Long>() {
                    @Override
                    public Long apply(BulkAdGroupGenderCriterion c) {
                        return c.getAdGroupCriterion().getAdGroupId();
                    }
                },
                new BiConsumer<String, BulkAdGroupGenderCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupGenderCriterion c) {
                        c.getAdGroupCriterion().setAdGroupId(Long.parseLong(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupGenderCriterion, String>(StringTable.Campaign,
                new Function<BulkAdGroupGenderCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupGenderCriterion c) {
                        return c.getCampaignName();
                    }
                },
                new BiConsumer<String, BulkAdGroupGenderCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupGenderCriterion c) {
                        c.setCampaignName(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroupGenderCriterion, String>(StringTable.AdGroup,
                new Function<BulkAdGroupGenderCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupGenderCriterion c) {
                        return c.getAdGroupName();
                    }
                },
                new BiConsumer<String, BulkAdGroupGenderCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupGenderCriterion c) {
                        c.setAdGroupName(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroupGenderCriterion, String>(StringTable.BidAdjustment,
                new Function<BulkAdGroupGenderCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupGenderCriterion c) {
                        if (c.getAdGroupCriterion() instanceof BiddableAdGroupCriterion) {
                            CriterionBid bid = ((BiddableAdGroupCriterion) c.getAdGroupCriterion()).getCriterionBid();
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
                new BiConsumer<String, BulkAdGroupGenderCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupGenderCriterion c) {
                        if (c.getAdGroupCriterion() instanceof BiddableAdGroupCriterion) {
                            ((BidMultiplier) ((BiddableAdGroupCriterion) c.getAdGroupCriterion()).getCriterionBid()).setMultiplier(
                                    StringExtensions.nullOrDouble(v)
                            );
                        }
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroupGenderCriterion, String>(StringTable.Target,
                new Function<BulkAdGroupGenderCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupGenderCriterion c) { 
                    	if (c.getAdGroupCriterion().getCriterion() instanceof GenderCriterion) {    
                    		GenderType genderType = ((GenderCriterion) c.getAdGroupCriterion().getCriterion()).getGenderType();
                    		return genderType == null ? null : genderType.value();
                    	} 
                    	return null;
                    }
                },
                new BiConsumer<String, BulkAdGroupGenderCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupGenderCriterion c) {
                    	if (c.getAdGroupCriterion().getCriterion() instanceof GenderCriterion) {
                    		
	                		((GenderCriterion)c.getAdGroupCriterion().getCriterion()).setGenderType(StringExtensions.parseOptional(v, new Function<String, GenderType>() {
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
        BiddableAdGroupCriterion adGroupCriterion = new BiddableAdGroupCriterion();  
        
        BidMultiplier bidMultiplier = new BidMultiplier();       
        bidMultiplier.setType(BidMultiplier.class.getSimpleName());
        
        GenderCriterion genderCriterion = new GenderCriterion();
        
    	adGroupCriterion.setCriterion(genderCriterion);
    	adGroupCriterion.getCriterion().setType(GenderCriterion.class.getSimpleName());
    	adGroupCriterion.setCriterionBid(bidMultiplier);
    	adGroupCriterion.setType("BiddableAdGroupCriterion");
    	
    	setAdGroupCriterion(adGroupCriterion);  
    	
    	MappingHelpers.convertToEntity(values, MAPPINGS, this);   
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getAdGroupCriterion(), BiddableAdGroupCriterion.class.getSimpleName());
        
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    /**
     * Gets an Ad Group Criterion.
     */
    public BiddableAdGroupCriterion getAdGroupCriterion() {
        return adGroupCriterion;
    }

    /**
     * Sets an Ad Group Criterion
     */
    public void setAdGroupCriterion(BiddableAdGroupCriterion adGroupCriterion) {
        this.adGroupCriterion = adGroupCriterion;
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
