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
import com.microsoft.bingads.v12.campaignmanagement.AgeCriterion;
import com.microsoft.bingads.v12.campaignmanagement.AgeRange;
import com.microsoft.bingads.v12.campaignmanagement.NegativeAdGroupCriterion;
import com.microsoft.bingads.v12.internal.bulk.BulkMapping;
import com.microsoft.bingads.v12.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v12.internal.bulk.RowValues;
import com.microsoft.bingads.v12.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v12.internal.bulk.StringExtensions;
import com.microsoft.bingads.v12.internal.bulk.StringTable;
import com.microsoft.bingads.v12.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * Represents a negative age criterion that is assigned to an ad group. Each age location criterion can be read or written in a bulk file.
 *
 * <p>
 *     For more information, see Ad Group Negative Age Criterion at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127>https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkAdGroupNegativeAgeCriterion extends SingleRecordBulkEntity {
	
	private NegativeAdGroupCriterion negativeAdGroupCriterion;
	
	private String campaignName;
	
	private String adGroupName;

	private static final List<BulkMapping<BulkAdGroupNegativeAgeCriterion>> MAPPINGS;

    static {
        List<BulkMapping<BulkAdGroupNegativeAgeCriterion>> m = new ArrayList<BulkMapping<BulkAdGroupNegativeAgeCriterion>>();
        
        m.add(new SimpleBulkMapping<BulkAdGroupNegativeAgeCriterion, String>(StringTable.Status,
                new Function<BulkAdGroupNegativeAgeCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupNegativeAgeCriterion c) {
                        AdGroupCriterionStatus status = c.getNegativeAdGroupCriterion().getStatus();

                        return status == null ? null : status.value();
                    }
                },
                new BiConsumer<String, BulkAdGroupNegativeAgeCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupNegativeAgeCriterion c) {
                        c.getNegativeAdGroupCriterion().setStatus(StringExtensions.parseOptional(v, new Function<String, AdGroupCriterionStatus>() {
                            @Override
                            public AdGroupCriterionStatus apply(String s) {
                                return AdGroupCriterionStatus.fromValue(s);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupNegativeAgeCriterion, Long>(StringTable.Id,
                new Function<BulkAdGroupNegativeAgeCriterion, Long>() {
                    @Override
                    public Long apply(BulkAdGroupNegativeAgeCriterion c) {
                        return c.getNegativeAdGroupCriterion().getId();
                    }
                },
                new BiConsumer<String, BulkAdGroupNegativeAgeCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupNegativeAgeCriterion c) {
                        c.getNegativeAdGroupCriterion().setId(StringExtensions.parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String s) {
                                return Long.parseLong(s);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupNegativeAgeCriterion, Long>(StringTable.ParentId,
                new Function<BulkAdGroupNegativeAgeCriterion, Long>() {
                    @Override
                    public Long apply(BulkAdGroupNegativeAgeCriterion c) {
                        return c.getNegativeAdGroupCriterion().getAdGroupId();
                    }
                },
                new BiConsumer<String, BulkAdGroupNegativeAgeCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupNegativeAgeCriterion c) {
                        c.getNegativeAdGroupCriterion().setAdGroupId(Long.parseLong(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupNegativeAgeCriterion, String>(StringTable.Campaign,
                new Function<BulkAdGroupNegativeAgeCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupNegativeAgeCriterion c) {
                        return c.getCampaignName();
                    }
                },
                new BiConsumer<String, BulkAdGroupNegativeAgeCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupNegativeAgeCriterion c) {
                        c.setCampaignName(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroupNegativeAgeCriterion, String>(StringTable.AdGroup,
                new Function<BulkAdGroupNegativeAgeCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupNegativeAgeCriterion c) {
                        return c.getAdGroupName();
                    }
                },
                new BiConsumer<String, BulkAdGroupNegativeAgeCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupNegativeAgeCriterion c) {
                        c.setAdGroupName(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroupNegativeAgeCriterion, String>(StringTable.Target,
                new Function<BulkAdGroupNegativeAgeCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupNegativeAgeCriterion c) { 
                    	if (c.getNegativeAdGroupCriterion().getCriterion() instanceof AgeCriterion) {    
                    		AgeRange ageRange = ((AgeCriterion) c.getNegativeAdGroupCriterion().getCriterion()).getAgeRange();
                    		return ageRange == null ? null : ageRange.value();
                    	} 
                    	return null;
                    }
                },
                new BiConsumer<String, BulkAdGroupNegativeAgeCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupNegativeAgeCriterion c) {
                    	if (c.getNegativeAdGroupCriterion().getCriterion() instanceof AgeCriterion) {                   		
	                		((AgeCriterion)c.getNegativeAdGroupCriterion().getCriterion()).setAgeRange(AgeRange.fromValue(v));
                    	}
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
    	NegativeAdGroupCriterion adGroupCriterion = new NegativeAdGroupCriterion();  
                
        AgeCriterion criterion = new AgeCriterion();
        
    	adGroupCriterion.setCriterion(criterion);
    	adGroupCriterion.getCriterion().setType(AgeCriterion.class.getSimpleName());
    	adGroupCriterion.setType("NegativeAdGroupCriterion");
    	
    	setNegativeAdGroupCriterion(adGroupCriterion);  
    	
    	MappingHelpers.convertToEntity(values, MAPPINGS, this);   
    }

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
}
