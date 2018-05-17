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
import com.microsoft.bingads.v12.campaignmanagement.ProfileCriterion;
import com.microsoft.bingads.v12.internal.bulk.BulkMapping;
import com.microsoft.bingads.v12.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v12.internal.bulk.RowValues;
import com.microsoft.bingads.v12.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v12.internal.bulk.StringExtensions;
import com.microsoft.bingads.v12.internal.bulk.StringTable;
import com.microsoft.bingads.v12.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * Represents a profile criterion that is assigned to an ad group. Each profile criterion can be read or written in a bulk file.
 *
 * <p>
 *     For more information, see Ad Group Profile Criterion at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127>https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public abstract class BulkAdGroupProfileCriterion extends SingleRecordBulkEntity {
	
	private BiddableAdGroupCriterion biddableAdGroupCriterion;
	
	private String campaignName;
	
	private String adGroupName;
	
	private String profileName;

	private static final List<BulkMapping<BulkAdGroupProfileCriterion>> MAPPINGS;

    static {
        List<BulkMapping<BulkAdGroupProfileCriterion>> m = new ArrayList<BulkMapping<BulkAdGroupProfileCriterion>>();
        
        m.add(new SimpleBulkMapping<BulkAdGroupProfileCriterion, String>(StringTable.Status,
                new Function<BulkAdGroupProfileCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupProfileCriterion c) {
                        AdGroupCriterionStatus status = c.getBiddableAdGroupCriterion().getStatus();

                        return status == null ? null : status.value();
                    }
                },
                new BiConsumer<String, BulkAdGroupProfileCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupProfileCriterion c) {
                        c.getBiddableAdGroupCriterion().setStatus(StringExtensions.parseOptional(v, new Function<String, AdGroupCriterionStatus>() {
                            @Override
                            public AdGroupCriterionStatus apply(String s) {
                                return AdGroupCriterionStatus.fromValue(s);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupProfileCriterion, Long>(StringTable.Id,
                new Function<BulkAdGroupProfileCriterion, Long>() {
                    @Override
                    public Long apply(BulkAdGroupProfileCriterion c) {
                        return c.getBiddableAdGroupCriterion().getId();
                    }
                },
                new BiConsumer<String, BulkAdGroupProfileCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupProfileCriterion c) {
                        c.getBiddableAdGroupCriterion().setId(StringExtensions.parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String s) {
                                return Long.parseLong(s);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupProfileCriterion, Long>(StringTable.ParentId,
                new Function<BulkAdGroupProfileCriterion, Long>() {
                    @Override
                    public Long apply(BulkAdGroupProfileCriterion c) {
                        return c.getBiddableAdGroupCriterion().getAdGroupId();
                    }
                },
                new BiConsumer<String, BulkAdGroupProfileCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupProfileCriterion c) {
                        c.getBiddableAdGroupCriterion().setAdGroupId(Long.parseLong(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupProfileCriterion, String>(StringTable.Campaign,
                new Function<BulkAdGroupProfileCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupProfileCriterion c) {
                        return c.getCampaignName();
                    }
                },
                new BiConsumer<String, BulkAdGroupProfileCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupProfileCriterion c) {
                        c.setCampaignName(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroupProfileCriterion, String>(StringTable.AdGroup,
                new Function<BulkAdGroupProfileCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupProfileCriterion c) {
                        return c.getAdGroupName();
                    }
                },
                new BiConsumer<String, BulkAdGroupProfileCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupProfileCriterion c) {
                        c.setAdGroupName(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroupProfileCriterion, String>(StringTable.BidAdjustment,
                new Function<BulkAdGroupProfileCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupProfileCriterion c) {
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
                new BiConsumer<String, BulkAdGroupProfileCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupProfileCriterion c) {
                        if (c.getBiddableAdGroupCriterion() instanceof BiddableAdGroupCriterion) {
                            ((BidMultiplier) ((BiddableAdGroupCriterion) c.getBiddableAdGroupCriterion()).getCriterionBid()).setMultiplier(
                                    StringExtensions.nullOrDouble(v)
                            );
                        }
                    }
                }
        ));
        

        m.add(new SimpleBulkMapping<BulkAdGroupProfileCriterion, String>(StringTable.Profile,
                new Function<BulkAdGroupProfileCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupProfileCriterion c) {
                        return c.getProfileName();
                    }
                },
                new BiConsumer<String, BulkAdGroupProfileCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupProfileCriterion c) {
                        c.setProfileName(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroupProfileCriterion, Long>(StringTable.ProfileId,
                new Function<BulkAdGroupProfileCriterion, Long>() {
                    @Override
                    public Long apply(BulkAdGroupProfileCriterion c) { 
                    	if (c.getBiddableAdGroupCriterion().getCriterion() instanceof ProfileCriterion) {    
                    		return ((ProfileCriterion) c.getBiddableAdGroupCriterion().getCriterion()).getProfileId();
                    	}
                    	return null;
                    }
                },
                new BiConsumer<String, BulkAdGroupProfileCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupProfileCriterion c) {
                    	if (c.getBiddableAdGroupCriterion().getCriterion() instanceof ProfileCriterion) {
                    	    ((ProfileCriterion)c.getBiddableAdGroupCriterion().getCriterion()).setProfileId(StringExtensions.parseOptional(v, new Function<String, Long>() {
                                @Override
                                public Long apply(String s) {
                                    return Long.parseLong(s);
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
        
        ProfileCriterion criterion = new ProfileCriterion();
        setProfileType(criterion);
        
    	adGroupCriterion.setCriterion(criterion);
    	adGroupCriterion.getCriterion().setType(ProfileCriterion.class.getSimpleName());
    	adGroupCriterion.setCriterionBid(bidMultiplier);
    	adGroupCriterion.setType("BiddableAdGroupCriterion");
    	
    	setBiddableAdGroupCriterion(adGroupCriterion);  
    	
    	MappingHelpers.convertToEntity(values, MAPPINGS, this);   
    }

    public abstract void setProfileType(ProfileCriterion criterion);

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

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }
    
    
}
