package com.microsoft.bingads.v10.bulk.entities;

import com.microsoft.bingads.v10.bulk.BulkServiceManager;
import com.microsoft.bingads.v10.campaignmanagement.AdGroupCriterion;
import com.microsoft.bingads.v10.campaignmanagement.AdGroupCriterionStatus;
import com.microsoft.bingads.v10.campaignmanagement.ArrayOfWebpageCondition;
import com.microsoft.bingads.v10.campaignmanagement.NegativeAdGroupCriterion;
import com.microsoft.bingads.v10.campaignmanagement.Webpage;
import com.microsoft.bingads.v10.campaignmanagement.WebpageParameter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v10.bulk.BulkFileReader;
import com.microsoft.bingads.v10.bulk.BulkFileWriter;
import com.microsoft.bingads.v10.bulk.BulkOperation;
import com.microsoft.bingads.v10.internal.bulk.BulkMapping;
import com.microsoft.bingads.v10.internal.bulk.ComplexBulkMapping;
import com.microsoft.bingads.v10.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v10.internal.bulk.RowValues;
import com.microsoft.bingads.v10.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v10.internal.bulk.StringExtensions;
import com.microsoft.bingads.v10.internal.bulk.StringTable;
import com.microsoft.bingads.v10.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * Represents a negative dynamic search ad target that is assigned to an ad group. Each negative dynamic search ad target can be read or written in a bulk file.
 *
 * <p>
 *     For more information, see Ad Group Negative Dynamic Search Ad Target at
 *     <a href="http://go.microsoft.com/fwlink/?LinkID=836838">http://go.microsoft.com/fwlink/?LinkID=836838</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkAdGroupNegativeDynamicSearchAdTarget extends SingleRecordBulkEntity {
	
	private AdGroupCriterion adGroupCriterion;
	
	private String campaignName;
	
	private String adGroupName;

	private static final List<BulkMapping<BulkAdGroupNegativeDynamicSearchAdTarget>> MAPPINGS;

    static {
        List<BulkMapping<BulkAdGroupNegativeDynamicSearchAdTarget>> m = new ArrayList<BulkMapping<BulkAdGroupNegativeDynamicSearchAdTarget>>();
        
        m.add(new SimpleBulkMapping<BulkAdGroupNegativeDynamicSearchAdTarget, String>(StringTable.Status,
                new Function<BulkAdGroupNegativeDynamicSearchAdTarget, String>() {
                    @Override
                    public String apply(BulkAdGroupNegativeDynamicSearchAdTarget c) {
                        AdGroupCriterionStatus status = c.getAdGroupCriterion().getStatus();

                        return status == null ? null : status.value();
                    }
                },
                new BiConsumer<String, BulkAdGroupNegativeDynamicSearchAdTarget>() {
                    @Override
                    public void accept(String v, BulkAdGroupNegativeDynamicSearchAdTarget c) {
                        c.getAdGroupCriterion().setStatus(StringExtensions.parseOptional(v, new Function<String, AdGroupCriterionStatus>() {
                            @Override
                            public AdGroupCriterionStatus apply(String s) {
                                return AdGroupCriterionStatus.fromValue(s);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupNegativeDynamicSearchAdTarget, Long>(StringTable.Id,
                new Function<BulkAdGroupNegativeDynamicSearchAdTarget, Long>() {
                    @Override
                    public Long apply(BulkAdGroupNegativeDynamicSearchAdTarget c) {
                        return c.getAdGroupCriterion().getId();
                    }
                },
                new BiConsumer<String, BulkAdGroupNegativeDynamicSearchAdTarget>() {
                    @Override
                    public void accept(String v, BulkAdGroupNegativeDynamicSearchAdTarget c) {
                        c.getAdGroupCriterion().setId(StringExtensions.parseOptional(v, new Function<String, Long>() {
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
                        return c.getAdGroupCriterion().getAdGroupId();
                    }
                },
                new BiConsumer<String, BulkAdGroupNegativeDynamicSearchAdTarget>() {
                    @Override
                    public void accept(String v, BulkAdGroupNegativeDynamicSearchAdTarget c) {
                        c.getAdGroupCriterion().setAdGroupId(Long.parseLong(v));
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
                    	if (c.getAdGroupCriterion().getCriterion() instanceof Webpage) {
                    		WebpageParameter webpageParameter = ((Webpage) c.getAdGroupCriterion().getCriterion()).getParameter();                   	
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
                    	if (c.getAdGroupCriterion().getCriterion() instanceof Webpage) {
                    		WebpageParameter webpageParameter = ((Webpage) c.getAdGroupCriterion().getCriterion()).getParameter();
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
                    	if (c.getAdGroupCriterion().getCriterion() instanceof Webpage) {    
                    		WebpageParameter webpageParameter = ((Webpage) c.getAdGroupCriterion().getCriterion()).getParameter();
                    		return StringExtensions.toCriterionNameBulkString(webpageParameter);
                    	} 
                    	return null; 
                    }
                },
                new BiConsumer<String, BulkAdGroupNegativeDynamicSearchAdTarget>() {
                    @Override
                    public void accept(String v, BulkAdGroupNegativeDynamicSearchAdTarget c) {
                    	if (c.getAdGroupCriterion().getCriterion() instanceof Webpage) {
                    		WebpageParameter webpageParameter = ((Webpage) c.getAdGroupCriterion().getCriterion()).getParameter();                        	
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
    	AdGroupCriterion adGroupCriterion = new NegativeAdGroupCriterion();

    	Webpage webpage = new Webpage();
        webpage.setParameter(new WebpageParameter());
        
    	adGroupCriterion.setCriterion(webpage);
    	adGroupCriterion.getCriterion().setType(Webpage.class.getSimpleName());
    	adGroupCriterion.setType("NegativeAdGroupCriterion");
    	
    	setAdGroupCriterion(adGroupCriterion);

        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getAdGroupCriterion(), AdGroupCriterion.class.getSimpleName());

        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    /**
     * Gets an Ad Group Criterion.
     */
    public AdGroupCriterion getAdGroupCriterion() {
        return adGroupCriterion;
    }

    /**
     * Sets an Ad Group Criterion
     */
    public void setAdGroupCriterion(AdGroupCriterion adGroupCriterion) {
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
