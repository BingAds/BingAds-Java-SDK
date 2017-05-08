package com.microsoft.bingads.v11.bulk.entities;

import com.microsoft.bingads.v11.bulk.BulkServiceManager;
import com.microsoft.bingads.v11.campaignmanagement.AdGroupCriterion;
import com.microsoft.bingads.v11.campaignmanagement.AdGroupCriterionStatus;
import com.microsoft.bingads.v11.campaignmanagement.ArrayOfWebpageCondition;
import com.microsoft.bingads.v11.campaignmanagement.BiddableAdGroupCriterion;
import com.microsoft.bingads.v11.campaignmanagement.CriterionBid;
import com.microsoft.bingads.v11.campaignmanagement.FixedBid;
import com.microsoft.bingads.v11.campaignmanagement.Webpage;
import com.microsoft.bingads.v11.campaignmanagement.WebpageParameter;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v11.bulk.BulkFileReader;
import com.microsoft.bingads.v11.bulk.BulkFileWriter;
import com.microsoft.bingads.v11.bulk.BulkOperation;
import com.microsoft.bingads.v11.internal.bulk.BulkMapping;
import com.microsoft.bingads.v11.internal.bulk.ComplexBulkMapping;
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
 * Represents a dynamic search ad target that is assigned to an ad group. Each dynamic search ad target can be read or written in a bulk file.
 *
 * <p>
 *     For more information, see Ad Group Dynamic Search Ad Target at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkAdGroupDynamicSearchAdTarget extends SingleRecordBulkEntity {
	
	private AdGroupCriterion adGroupCriterion;
	
	private String campaignName;
	
	private String adGroupName;
	
	private PerformanceData performanceData;

	private static final List<BulkMapping<BulkAdGroupDynamicSearchAdTarget>> MAPPINGS;

    static {
        List<BulkMapping<BulkAdGroupDynamicSearchAdTarget>> m = new ArrayList<BulkMapping<BulkAdGroupDynamicSearchAdTarget>>();
        
        m.add(new SimpleBulkMapping<BulkAdGroupDynamicSearchAdTarget, String>(StringTable.Status,
                new Function<BulkAdGroupDynamicSearchAdTarget, String>() {
                    @Override
                    public String apply(BulkAdGroupDynamicSearchAdTarget c) {
                        AdGroupCriterionStatus status = c.getAdGroupCriterion().getStatus();

                        return status == null ? null : status.value();
                    }
                },
                new BiConsumer<String, BulkAdGroupDynamicSearchAdTarget>() {
                    @Override
                    public void accept(String v, BulkAdGroupDynamicSearchAdTarget c) {
                        c.getAdGroupCriterion().setStatus(StringExtensions.parseOptional(v, new Function<String, AdGroupCriterionStatus>() {
                            @Override
                            public AdGroupCriterionStatus apply(String s) {
                                return AdGroupCriterionStatus.fromValue(s);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupDynamicSearchAdTarget, Long>(StringTable.Id,
                new Function<BulkAdGroupDynamicSearchAdTarget, Long>() {
                    @Override
                    public Long apply(BulkAdGroupDynamicSearchAdTarget c) {
                        return c.getAdGroupCriterion().getId();
                    }
                },
                new BiConsumer<String, BulkAdGroupDynamicSearchAdTarget>() {
                    @Override
                    public void accept(String v, BulkAdGroupDynamicSearchAdTarget c) {
                        c.getAdGroupCriterion().setId(StringExtensions.parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String s) {
                                return Long.parseLong(s);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupDynamicSearchAdTarget, Long>(StringTable.ParentId,
                new Function<BulkAdGroupDynamicSearchAdTarget, Long>() {
                    @Override
                    public Long apply(BulkAdGroupDynamicSearchAdTarget c) {
                        return c.getAdGroupCriterion().getAdGroupId();
                    }
                },
                new BiConsumer<String, BulkAdGroupDynamicSearchAdTarget>() {
                    @Override
                    public void accept(String v, BulkAdGroupDynamicSearchAdTarget c) {
                        c.getAdGroupCriterion().setAdGroupId(Long.parseLong(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupDynamicSearchAdTarget, String>(StringTable.Campaign,
                new Function<BulkAdGroupDynamicSearchAdTarget, String>() {
                    @Override
                    public String apply(BulkAdGroupDynamicSearchAdTarget c) {
                        return c.getCampaignName();
                    }
                },
                new BiConsumer<String, BulkAdGroupDynamicSearchAdTarget>() {
                    @Override
                    public void accept(String v, BulkAdGroupDynamicSearchAdTarget c) {
                        c.setCampaignName(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroupDynamicSearchAdTarget, String>(StringTable.AdGroup,
                new Function<BulkAdGroupDynamicSearchAdTarget, String>() {
                    @Override
                    public String apply(BulkAdGroupDynamicSearchAdTarget c) {
                        return c.getAdGroupName();
                    }
                },
                new BiConsumer<String, BulkAdGroupDynamicSearchAdTarget>() {
                    @Override
                    public void accept(String v, BulkAdGroupDynamicSearchAdTarget c) {
                        c.setAdGroupName(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroupDynamicSearchAdTarget, String>(StringTable.Bid,
                new Function<BulkAdGroupDynamicSearchAdTarget, String>() {
                    @Override
                    public String apply(BulkAdGroupDynamicSearchAdTarget c) {
                        if (c.getAdGroupCriterion() instanceof BiddableAdGroupCriterion) {
                            CriterionBid bid = ((BiddableAdGroupCriterion) c.getAdGroupCriterion()).getCriterionBid();
                            if (bid == null) {
                                return null;
                            } else {
                                return StringExtensions.toAdGroupCriterionFixedBidBulkString((FixedBid) bid);
                            }
                        } else {
                            return null;
                        }
                    }
                },
                new BiConsumer<String, BulkAdGroupDynamicSearchAdTarget>() {
                    @Override
                    public void accept(String v, BulkAdGroupDynamicSearchAdTarget c) {
                        if (c.getAdGroupCriterion() instanceof BiddableAdGroupCriterion) {
                            ((FixedBid) ((BiddableAdGroupCriterion) c.getAdGroupCriterion()).getCriterionBid()).setAmount((
                                    StringExtensions.nullOrDouble(v))
                            );
                        }
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroupDynamicSearchAdTarget, String>(StringTable.TrackingTemplate,
                new Function<BulkAdGroupDynamicSearchAdTarget, String>() {
                    @Override
                    public String apply(BulkAdGroupDynamicSearchAdTarget c) {
                        if (c.getAdGroupCriterion() instanceof BiddableAdGroupCriterion) {
                            return StringExtensions.toOptionalBulkString(((BiddableAdGroupCriterion) c.getAdGroupCriterion()).getTrackingUrlTemplate());
                        } else {
                            return null;
                        }
                    }
                },
                new BiConsumer<String, BulkAdGroupDynamicSearchAdTarget>() {
                    @Override
                    public void accept(String v, BulkAdGroupDynamicSearchAdTarget c) {
                        if (c.getAdGroupCriterion() instanceof BiddableAdGroupCriterion) {
                            ((BiddableAdGroupCriterion) c.getAdGroupCriterion()).setTrackingUrlTemplate(StringExtensions.getValueOrEmptyString(v));;
                        }
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroupDynamicSearchAdTarget, String>(StringTable.CustomParameter,
                new Function<BulkAdGroupDynamicSearchAdTarget, String>() {
                    @Override
                    public String apply(BulkAdGroupDynamicSearchAdTarget c) {
                        if (c.getAdGroupCriterion() instanceof BiddableAdGroupCriterion) {
                            return StringExtensions.toCustomParaBulkString(((BiddableAdGroupCriterion) c.getAdGroupCriterion()).getUrlCustomParameters());
                        } else {
                            return null;
                        }
                    }
                },
                new BiConsumer<String, BulkAdGroupDynamicSearchAdTarget>() {
                    @Override
                    public void accept(String v, BulkAdGroupDynamicSearchAdTarget c) {
                        if (c.getAdGroupCriterion() instanceof BiddableAdGroupCriterion) {
                            try {
								((BiddableAdGroupCriterion) c.getAdGroupCriterion()).setUrlCustomParameters(StringExtensions.parseCustomParameters(v));
							} catch (Exception e) {
								e.printStackTrace();
							}
                        }
                    }
                }
        ));

        m.add(new ComplexBulkMapping<BulkAdGroupDynamicSearchAdTarget>(
                new BiConsumer<BulkAdGroupDynamicSearchAdTarget, RowValues>() {
                    @Override
                    public void accept(BulkAdGroupDynamicSearchAdTarget c, RowValues v) {
                    	if (c.getAdGroupCriterion().getCriterion() instanceof Webpage) {
                    		WebpageParameter webpageParameter = ((Webpage) c.getAdGroupCriterion().getCriterion()).getParameter();                   	
	                        if (webpageParameter == null || webpageParameter.getConditions() == null) {
	                            return;
	                        }	                        
	                        WebpageConditionHelper.addRowValuesFromConditions(webpageParameter.getConditions(), v);
                    	}
                    }
                },
                new BiConsumer<RowValues, BulkAdGroupDynamicSearchAdTarget>() {
                    @Override
                    public void accept(RowValues v, BulkAdGroupDynamicSearchAdTarget c) {
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
        
        m.add(new SimpleBulkMapping<BulkAdGroupDynamicSearchAdTarget, String>(StringTable.Name,
                new Function<BulkAdGroupDynamicSearchAdTarget, String>() {
                    @Override
                    public String apply(BulkAdGroupDynamicSearchAdTarget c) { 
                    	if (c.getAdGroupCriterion().getCriterion() instanceof Webpage) {    
                    		WebpageParameter webpageParameter = ((Webpage) c.getAdGroupCriterion().getCriterion()).getParameter();
                    		return StringExtensions.toCriterionNameBulkString(webpageParameter);
                    	} 
                    	return null;
                    }
                },
                new BiConsumer<String, BulkAdGroupDynamicSearchAdTarget>() {
                    @Override
                    public void accept(String v, BulkAdGroupDynamicSearchAdTarget c) {
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
        BiddableAdGroupCriterion adGroupCriterion = new BiddableAdGroupCriterion();  
        
        FixedBid fixedBid = new FixedBid();       
        fixedBid.setType(FixedBid.class.getSimpleName());
        
        Webpage webpage = new Webpage();
        webpage.setParameter(new WebpageParameter());
        
    	adGroupCriterion.setCriterion(webpage);
    	adGroupCriterion.getCriterion().setType(Webpage.class.getSimpleName());
    	adGroupCriterion.setCriterionBid(fixedBid);
    	adGroupCriterion.setType("BiddableAdGroupCriterion");
    	
    	setAdGroupCriterion(adGroupCriterion);  
    	
    	MappingHelpers.convertToEntity(values, MAPPINGS, this);    	
    	performanceData = PerformanceData.readFromRowValuesOrNull(values);   
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getAdGroupCriterion(), AdGroupCriterion.class.getSimpleName());
        
        MappingHelpers.convertToValues(this, values, MAPPINGS);        
        if (!excludeReadonlyData) {
            PerformanceData.writeToRowValuesIfNotNull(getPerformanceData(), values);
        }
        
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
    
    /**
     * Gets the historical performance data.
     */
    public PerformanceData getPerformanceData() {
        return performanceData;
    }
}
