package com.microsoft.bingads.v11.bulk.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v11.bulk.BulkFileReader;
import com.microsoft.bingads.v11.bulk.BulkFileWriter;
import com.microsoft.bingads.v11.bulk.BulkOperation;
import com.microsoft.bingads.v11.bulk.BulkServiceManager;
import com.microsoft.bingads.v11.campaignmanagement.AdGroupCriterionStatus;
import com.microsoft.bingads.v11.campaignmanagement.GenderCriterion;
import com.microsoft.bingads.v11.campaignmanagement.GenderType;
import com.microsoft.bingads.v11.campaignmanagement.NegativeAdGroupCriterion;
import com.microsoft.bingads.v11.internal.bulk.BulkMapping;
import com.microsoft.bingads.v11.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v11.internal.bulk.RowValues;
import com.microsoft.bingads.v11.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v11.internal.bulk.StringExtensions;
import com.microsoft.bingads.v11.internal.bulk.StringTable;
import com.microsoft.bingads.v11.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * Represents a negative gender criterion that is assigned to an ad group. Each gender location criterion can be read or written in a bulk file.
 *
 * <p>
 *     For more information, see Ad Group Negative Gender Criterion at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127>https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkAdGroupNegativeGenderCriterion extends SingleRecordBulkEntity {
	
	private NegativeAdGroupCriterion negativeAdGroupCriterion;
	
	private String campaignName;
	
	private String adGroupName;

	private static final List<BulkMapping<BulkAdGroupNegativeGenderCriterion>> MAPPINGS;

    static {
        List<BulkMapping<BulkAdGroupNegativeGenderCriterion>> m = new ArrayList<BulkMapping<BulkAdGroupNegativeGenderCriterion>>();
        
        m.add(new SimpleBulkMapping<BulkAdGroupNegativeGenderCriterion, String>(StringTable.Status,
                new Function<BulkAdGroupNegativeGenderCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupNegativeGenderCriterion c) {
                        AdGroupCriterionStatus status = c.getNegativeAdGroupCriterion().getStatus();

                        return status == null ? null : status.value();
                    }
                },
                new BiConsumer<String, BulkAdGroupNegativeGenderCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupNegativeGenderCriterion c) {
                        c.getNegativeAdGroupCriterion().setStatus(StringExtensions.parseOptional(v, new Function<String, AdGroupCriterionStatus>() {
                            @Override
                            public AdGroupCriterionStatus apply(String s) {
                                return AdGroupCriterionStatus.fromValue(s);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupNegativeGenderCriterion, Long>(StringTable.Id,
                new Function<BulkAdGroupNegativeGenderCriterion, Long>() {
                    @Override
                    public Long apply(BulkAdGroupNegativeGenderCriterion c) {
                        return c.getNegativeAdGroupCriterion().getId();
                    }
                },
                new BiConsumer<String, BulkAdGroupNegativeGenderCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupNegativeGenderCriterion c) {
                        c.getNegativeAdGroupCriterion().setId(StringExtensions.parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String s) {
                                return Long.parseLong(s);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupNegativeGenderCriterion, Long>(StringTable.ParentId,
                new Function<BulkAdGroupNegativeGenderCriterion, Long>() {
                    @Override
                    public Long apply(BulkAdGroupNegativeGenderCriterion c) {
                        return c.getNegativeAdGroupCriterion().getAdGroupId();
                    }
                },
                new BiConsumer<String, BulkAdGroupNegativeGenderCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupNegativeGenderCriterion c) {
                        c.getNegativeAdGroupCriterion().setAdGroupId(Long.parseLong(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupNegativeGenderCriterion, String>(StringTable.Campaign,
                new Function<BulkAdGroupNegativeGenderCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupNegativeGenderCriterion c) {
                        return c.getCampaignName();
                    }
                },
                new BiConsumer<String, BulkAdGroupNegativeGenderCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupNegativeGenderCriterion c) {
                        c.setCampaignName(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroupNegativeGenderCriterion, String>(StringTable.AdGroup,
                new Function<BulkAdGroupNegativeGenderCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupNegativeGenderCriterion c) {
                        return c.getAdGroupName();
                    }
                },
                new BiConsumer<String, BulkAdGroupNegativeGenderCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupNegativeGenderCriterion c) {
                        c.setAdGroupName(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroupNegativeGenderCriterion, String>(StringTable.Target,
                new Function<BulkAdGroupNegativeGenderCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupNegativeGenderCriterion c) { 
                    	if (c.getNegativeAdGroupCriterion().getCriterion() instanceof GenderCriterion) {    
                    		return ((GenderCriterion) c.getNegativeAdGroupCriterion().getCriterion()).getGenderType().value();
                    	} 
                    	return null;
                    }
                },
                new BiConsumer<String, BulkAdGroupNegativeGenderCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupNegativeGenderCriterion c) {
                    	if (c.getNegativeAdGroupCriterion().getCriterion() instanceof GenderCriterion) {                   		
	                		((GenderCriterion)c.getNegativeAdGroupCriterion().getCriterion()).setGenderType(GenderType.fromValue(v));
                    	}
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
    	NegativeAdGroupCriterion adGroupCriterion = new NegativeAdGroupCriterion();  
                
        GenderCriterion criterion = new GenderCriterion();
        
    	adGroupCriterion.setCriterion(criterion);
    	adGroupCriterion.getCriterion().setType(GenderCriterion.class.getSimpleName());
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
