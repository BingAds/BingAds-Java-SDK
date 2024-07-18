package com.microsoft.bingads.v13.bulk.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.bulk.BulkFileReader;
import com.microsoft.bingads.v13.bulk.BulkFileWriter;
import com.microsoft.bingads.v13.bulk.BulkOperation;
import com.microsoft.bingads.v13.bulk.BulkServiceManager;
import com.microsoft.bingads.v13.campaignmanagement.AdGroupCriterion;
import com.microsoft.bingads.v13.campaignmanagement.AdGroupCriterionStatus;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfWebpageCondition;
import com.microsoft.bingads.v13.campaignmanagement.NegativeAdGroupCriterion;
import com.microsoft.bingads.v13.campaignmanagement.Webpage;
import com.microsoft.bingads.v13.campaignmanagement.WebpageParameter;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.ComplexBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;
import com.microsoft.bingads.v13.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * Represents a negative dynamic search ad target that is assigned to an ad group. Each negative dynamic search ad target can be read or written in a bulk file.
 *
 * <p>
 *     For more information, see Ad Group Negative Dynamic Search Ad Target at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkAdGroupNegativeDynamicSearchAdTarget extends SingleRecordBulkEntity {
	
	private NegativeAdGroupCriterion negativeAdGroupCriterion;
	
	private String campaignName;
	
	private String adGroupName;

	private static final List<BulkMapping<BulkAdGroupNegativeDynamicSearchAdTarget>> MAPPINGS;

    static {
        List<BulkMapping<BulkAdGroupNegativeDynamicSearchAdTarget>> m = new ArrayList<BulkMapping<BulkAdGroupNegativeDynamicSearchAdTarget>>();
        
        m.add(new SimpleBulkMapping<BulkAdGroupNegativeDynamicSearchAdTarget, String>(StringTable.Status,
                new Function<BulkAdGroupNegativeDynamicSearchAdTarget, String>() {
                    @Override
                    public String apply(BulkAdGroupNegativeDynamicSearchAdTarget c) {
                        AdGroupCriterionStatus status = c.getNegativeAdGroupCriterion().getStatus();

                        return status == null ? null : status.value();
                    }
                },
                new BiConsumer<String, BulkAdGroupNegativeDynamicSearchAdTarget>() {
                    @Override
                    public void accept(String v, BulkAdGroupNegativeDynamicSearchAdTarget c) {
                        c.getNegativeAdGroupCriterion().setStatus(StringExtensions.parseOptional(v, new Function<String, AdGroupCriterionStatus>() {
                            @Override
                            public AdGroupCriterionStatus apply(String s) {
                                return StringExtensions.fromValueOptional(s, AdGroupCriterionStatus.class);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupNegativeDynamicSearchAdTarget, Long>(StringTable.Id,
                new Function<BulkAdGroupNegativeDynamicSearchAdTarget, Long>() {
                    @Override
                    public Long apply(BulkAdGroupNegativeDynamicSearchAdTarget c) {
                        return c.getNegativeAdGroupCriterion().getId();
                    }
                },
                new BiConsumer<String, BulkAdGroupNegativeDynamicSearchAdTarget>() {
                    @Override
                    public void accept(String v, BulkAdGroupNegativeDynamicSearchAdTarget c) {
                        c.getNegativeAdGroupCriterion().setId(StringExtensions.parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String s) {
                                return Long.parseLong(s);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupNegativeDynamicSearchAdTarget, Long>(StringTable.ParentId,
                new Function<BulkAdGroupNegativeDynamicSearchAdTarget, Long>() {
                    @Override
                    public Long apply(BulkAdGroupNegativeDynamicSearchAdTarget c) {
                        return c.getNegativeAdGroupCriterion().getAdGroupId();
                    }
                },
                new BiConsumer<String, BulkAdGroupNegativeDynamicSearchAdTarget>() {
                    @Override
                    public void accept(String v, BulkAdGroupNegativeDynamicSearchAdTarget c) {
                        c.getNegativeAdGroupCriterion().setAdGroupId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupNegativeDynamicSearchAdTarget, String>(StringTable.Campaign,
                new Function<BulkAdGroupNegativeDynamicSearchAdTarget, String>() {
                    @Override
                    public String apply(BulkAdGroupNegativeDynamicSearchAdTarget c) {
                        return c.getCampaignName();
                    }
                },
                new BiConsumer<String, BulkAdGroupNegativeDynamicSearchAdTarget>() {
                    @Override
                    public void accept(String v, BulkAdGroupNegativeDynamicSearchAdTarget c) {
                        c.setCampaignName(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroupNegativeDynamicSearchAdTarget, String>(StringTable.AdGroup,
                new Function<BulkAdGroupNegativeDynamicSearchAdTarget, String>() {
                    @Override
                    public String apply(BulkAdGroupNegativeDynamicSearchAdTarget c) {
                        return c.getAdGroupName();
                    }
                },
                new BiConsumer<String, BulkAdGroupNegativeDynamicSearchAdTarget>() {
                    @Override
                    public void accept(String v, BulkAdGroupNegativeDynamicSearchAdTarget c) {
                        c.setAdGroupName(v);
                    }
                }
        ));

        m.add(new ComplexBulkMapping<BulkAdGroupNegativeDynamicSearchAdTarget>(
                new BiConsumer<BulkAdGroupNegativeDynamicSearchAdTarget, RowValues>() {
                    @Override
                    public void accept(BulkAdGroupNegativeDynamicSearchAdTarget c, RowValues v) {
                    	if (c.getNegativeAdGroupCriterion().getCriterion() instanceof Webpage) {
                    		WebpageParameter webpageParameter = ((Webpage) c.getNegativeAdGroupCriterion().getCriterion()).getParameter();                   	
	                        if (webpageParameter == null || webpageParameter.getConditions() == null) {
	                            return;
	                        }	                        
	                        WebpageConditionHelper.addRowValuesFromConditions(webpageParameter.getConditions(), v);
                    	};
                    }
                },
                new BiConsumer<RowValues, BulkAdGroupNegativeDynamicSearchAdTarget>() {
                    @Override
                    public void accept(RowValues v, BulkAdGroupNegativeDynamicSearchAdTarget c) {
                    	if (c.getNegativeAdGroupCriterion().getCriterion() instanceof Webpage) {
                    		WebpageParameter webpageParameter = ((Webpage) c.getNegativeAdGroupCriterion().getCriterion()).getParameter();
                    		if (webpageParameter != null) {
                    			webpageParameter.setConditions(new ArrayOfWebpageCondition());                        
                        		WebpageConditionHelper.addConditionsFromRowValues(v, webpageParameter.getConditions());
                    		}   
                    	}
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroupNegativeDynamicSearchAdTarget, String>(StringTable.Name,
                new Function<BulkAdGroupNegativeDynamicSearchAdTarget, String>() {
                    @Override
                    public String apply(BulkAdGroupNegativeDynamicSearchAdTarget c) {
                    	if (c.getNegativeAdGroupCriterion().getCriterion() instanceof Webpage) {    
                    		WebpageParameter webpageParameter = ((Webpage) c.getNegativeAdGroupCriterion().getCriterion()).getParameter();
                    		return StringExtensions.toCriterionNameBulkString(webpageParameter, c.getNegativeAdGroupCriterion().getId());
                    	} 
                    	return null; 
                    }
                },
                new BiConsumer<String, BulkAdGroupNegativeDynamicSearchAdTarget>() {
                    @Override
                    public void accept(String v, BulkAdGroupNegativeDynamicSearchAdTarget c) {
                    	if (c.getNegativeAdGroupCriterion().getCriterion() instanceof Webpage) {
                    		WebpageParameter webpageParameter = ((Webpage) c.getNegativeAdGroupCriterion().getCriterion()).getParameter();                        	
                        	if (webpageParameter != null) {
                        		webpageParameter.setCriterionName(StringExtensions.parseCriterionName(v));
                            }
                    	}
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
    	NegativeAdGroupCriterion adGroupCriterion = new NegativeAdGroupCriterion();

    	Webpage webpage = new Webpage();
        webpage.setParameter(new WebpageParameter());
        
    	adGroupCriterion.setCriterion(webpage);
    	adGroupCriterion.getCriterion().setType(Webpage.class.getSimpleName());
    	adGroupCriterion.setType("NegativeAdGroupCriterion");
    	
    	setNegativeAdGroupCriterion(adGroupCriterion);

        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getNegativeAdGroupCriterion(), AdGroupCriterion.class.getSimpleName());

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
