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
import com.microsoft.bingads.v12.campaignmanagement.NegativeAdGroupCriterion;
import com.microsoft.bingads.v12.campaignmanagement.ProfileCriterion;
import com.microsoft.bingads.v12.internal.bulk.BulkMapping;
import com.microsoft.bingads.v12.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v12.internal.bulk.RowValues;
import com.microsoft.bingads.v12.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v12.internal.bulk.StringExtensions;
import com.microsoft.bingads.v12.internal.bulk.StringTable;
import com.microsoft.bingads.v12.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * Represents a negative profile criterion that is assigned to an ad group. Each negative profile criterion can be read or written in a bulk file.
 *
 * <p>
 *     For more information, see Bulk File Schema at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127>https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public abstract class BulkAdGroupNegativeProfileCriterion extends SingleRecordBulkEntity {
	
	private NegativeAdGroupCriterion negativeAdGroupCriterion;
	
	private String campaignName;
	
	private String adGroupName;
	
	private String profileName;

	private static final List<BulkMapping<BulkAdGroupNegativeProfileCriterion>> MAPPINGS;

    static {
        List<BulkMapping<BulkAdGroupNegativeProfileCriterion>> m = new ArrayList<BulkMapping<BulkAdGroupNegativeProfileCriterion>>();
        
        m.add(new SimpleBulkMapping<BulkAdGroupNegativeProfileCriterion, String>(StringTable.Status,
                new Function<BulkAdGroupNegativeProfileCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupNegativeProfileCriterion c) {
                        AdGroupCriterionStatus status = c.getNegativeAdGroupCriterion().getStatus();

                        return status == null ? null : status.value();
                    }
                },
                new BiConsumer<String, BulkAdGroupNegativeProfileCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupNegativeProfileCriterion c) {
                        c.getNegativeAdGroupCriterion().setStatus(StringExtensions.parseOptional(v, new Function<String, AdGroupCriterionStatus>() {
                            @Override
                            public AdGroupCriterionStatus apply(String s) {
                                return AdGroupCriterionStatus.fromValue(s);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupNegativeProfileCriterion, Long>(StringTable.Id,
                new Function<BulkAdGroupNegativeProfileCriterion, Long>() {
                    @Override
                    public Long apply(BulkAdGroupNegativeProfileCriterion c) {
                        return c.getNegativeAdGroupCriterion().getId();
                    }
                },
                new BiConsumer<String, BulkAdGroupNegativeProfileCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupNegativeProfileCriterion c) {
                        c.getNegativeAdGroupCriterion().setId(StringExtensions.parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String s) {
                                return Long.parseLong(s);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupNegativeProfileCriterion, Long>(StringTable.ParentId,
                new Function<BulkAdGroupNegativeProfileCriterion, Long>() {
                    @Override
                    public Long apply(BulkAdGroupNegativeProfileCriterion c) {
                        return c.getNegativeAdGroupCriterion().getAdGroupId();
                    }
                },
                new BiConsumer<String, BulkAdGroupNegativeProfileCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupNegativeProfileCriterion c) {
                        c.getNegativeAdGroupCriterion().setAdGroupId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupNegativeProfileCriterion, String>(StringTable.Campaign,
                new Function<BulkAdGroupNegativeProfileCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupNegativeProfileCriterion c) {
                        return c.getCampaignName();
                    }
                },
                new BiConsumer<String, BulkAdGroupNegativeProfileCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupNegativeProfileCriterion c) {
                        c.setCampaignName(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroupNegativeProfileCriterion, String>(StringTable.AdGroup,
                new Function<BulkAdGroupNegativeProfileCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupNegativeProfileCriterion c) {
                        return c.getAdGroupName();
                    }
                },
                new BiConsumer<String, BulkAdGroupNegativeProfileCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupNegativeProfileCriterion c) {
                        c.setAdGroupName(v);
                    }
                }
        ));
        

        m.add(new SimpleBulkMapping<BulkAdGroupNegativeProfileCriterion, String>(StringTable.Profile,
                new Function<BulkAdGroupNegativeProfileCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupNegativeProfileCriterion c) {
                        return c.getProfileName();
                    }
                },
                new BiConsumer<String, BulkAdGroupNegativeProfileCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupNegativeProfileCriterion c) {
                        c.setProfileName(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroupNegativeProfileCriterion, Long>(StringTable.ProfileId,
                new Function<BulkAdGroupNegativeProfileCriterion, Long>() {
                    @Override
                    public Long apply(BulkAdGroupNegativeProfileCriterion c) { 
                        if (c.getNegativeAdGroupCriterion().getCriterion() instanceof ProfileCriterion) {    
                            return ((ProfileCriterion) c.getNegativeAdGroupCriterion().getCriterion()).getProfileId();
                        }
                        return null;
                    }
                },
                new BiConsumer<String, BulkAdGroupNegativeProfileCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupNegativeProfileCriterion c) {
                        if (c.getNegativeAdGroupCriterion().getCriterion() instanceof ProfileCriterion) {
                            ((ProfileCriterion)c.getNegativeAdGroupCriterion().getCriterion()).setProfileId(StringExtensions.parseOptional(v, new Function<String, Long>() {
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
    	NegativeAdGroupCriterion adGroupCriterion = new NegativeAdGroupCriterion();  
                
        ProfileCriterion criterion = new ProfileCriterion();
        
    	adGroupCriterion.setCriterion(criterion);
    	adGroupCriterion.getCriterion().setType(ProfileCriterion.class.getSimpleName());
    	adGroupCriterion.setType("NegativeAdGroupCriterion");
    	setProfileType(criterion);
    	
    	setNegativeAdGroupCriterion(adGroupCriterion);  
    	
    	MappingHelpers.convertToEntity(values, MAPPINGS, this);   
    }

    public abstract void setProfileType(ProfileCriterion criterion);

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getNegativeAdGroupCriterion(), NegativeAdGroupCriterion.class.getSimpleName());
        
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    /**
     * Gets an Ad Group Criterion.
     */
    public NegativeAdGroupCriterion getNegativeAdGroupCriterion() {
        return negativeAdGroupCriterion;
    }

    /**
     * Sets an Ad Group Criterion
     */
    public void setNegativeAdGroupCriterion(NegativeAdGroupCriterion negativeAdGroupCriterion) {
        this.negativeAdGroupCriterion = negativeAdGroupCriterion;
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
