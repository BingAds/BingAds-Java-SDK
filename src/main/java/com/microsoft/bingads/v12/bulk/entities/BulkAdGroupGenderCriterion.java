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
import com.microsoft.bingads.v12.campaignmanagement.GenderCriterion;
import com.microsoft.bingads.v12.campaignmanagement.GenderType;
import com.microsoft.bingads.v12.internal.bulk.BulkMapping;
import com.microsoft.bingads.v12.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v12.internal.bulk.RowValues;
import com.microsoft.bingads.v12.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v12.internal.bulk.StringExtensions;
import com.microsoft.bingads.v12.internal.bulk.StringTable;
import com.microsoft.bingads.v12.internal.bulk.entities.SingleRecordBulkEntity;

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
	
	private BiddableAdGroupCriterion biddableAdGroupCriterion;
	
	private String campaignName;
	
	private String adGroupName;

	private static final List<BulkMapping<BulkAdGroupGenderCriterion>> MAPPINGS;

    static {
        List<BulkMapping<BulkAdGroupGenderCriterion>> m = new ArrayList<BulkMapping<BulkAdGroupGenderCriterion>>();
        
        m.add(new SimpleBulkMapping<BulkAdGroupGenderCriterion, String>(StringTable.Status,
                new Function<BulkAdGroupGenderCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupGenderCriterion c) {
                        AdGroupCriterionStatus status = c.getBiddableAdGroupCriterion().getStatus();

                        return status == null ? null : status.value();
                    }
                },
                new BiConsumer<String, BulkAdGroupGenderCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupGenderCriterion c) {
                        c.getBiddableAdGroupCriterion().setStatus(StringExtensions.parseOptional(v, new Function<String, AdGroupCriterionStatus>() {
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
                        return c.getBiddableAdGroupCriterion().getId();
                    }
                },
                new BiConsumer<String, BulkAdGroupGenderCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupGenderCriterion c) {
                        c.getBiddableAdGroupCriterion().setId(StringExtensions.parseOptional(v, new Function<String, Long>() {
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
                        return c.getBiddableAdGroupCriterion().getAdGroupId();
                    }
                },
                new BiConsumer<String, BulkAdGroupGenderCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupGenderCriterion c) {
                        c.getBiddableAdGroupCriterion().setAdGroupId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
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
                new BiConsumer<String, BulkAdGroupGenderCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupGenderCriterion c) {
                        if (c.getBiddableAdGroupCriterion() instanceof BiddableAdGroupCriterion) {
                            ((BidMultiplier) ((BiddableAdGroupCriterion) c.getBiddableAdGroupCriterion()).getCriterionBid()).setMultiplier(
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
                    	if (c.getBiddableAdGroupCriterion().getCriterion() instanceof GenderCriterion) {    
                    		GenderType genderType = ((GenderCriterion) c.getBiddableAdGroupCriterion().getCriterion()).getGenderType();
                    		return genderType == null ? null : genderType.value();
                    	} 
                    	return null;
                    }
                },
                new BiConsumer<String, BulkAdGroupGenderCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupGenderCriterion c) {
                    	if (c.getBiddableAdGroupCriterion().getCriterion() instanceof GenderCriterion) {
                    		
	                		((GenderCriterion)c.getBiddableAdGroupCriterion().getCriterion()).setGenderType(StringExtensions.parseOptional(v, new Function<String, GenderType>() {
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
