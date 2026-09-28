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
import com.microsoft.bingads.v13.campaignmanagement.BiddableAdGroupCriterion;
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
 * Represents an Ad Group Url Target (AIMax URL Inclusions) that is assigned to an ad group. Each ad group url target can be read or written in a bulk file.
 *
 * <p>
 *     It is the AI Max counterpart of the Ad Group Dynamic Search Ad Target record and shares the same BiddableAdGroupCriterion shape.
 *     It uses a different record type and webpage-condition column headers (Ad Group Url Target Condition/Value/Operator N),
 *     and does not map bid or URL tracking fields.
 *     For more information, see Ad Group Dynamic Search Ad Target at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkAdGroupUrlTarget extends SingleRecordBulkEntity {

	private BiddableAdGroupCriterion biddableAdGroupCriterion;
	
	private String campaignName;
	
	private String adGroupName;
	
	private static final List<BulkMapping<BulkAdGroupUrlTarget>> MAPPINGS;

    static {
        List<BulkMapping<BulkAdGroupUrlTarget>> m = new ArrayList<BulkMapping<BulkAdGroupUrlTarget>>();
        
        m.add(new SimpleBulkMapping<BulkAdGroupUrlTarget, String>(StringTable.Status,
                new Function<BulkAdGroupUrlTarget, String>() {
                    @Override
                    public String apply(BulkAdGroupUrlTarget c) {
                        AdGroupCriterionStatus status = c.getBiddableAdGroupCriterion().getStatus();

                        return status == null ? null : status.value();
                    }
                },
                new BiConsumer<String, BulkAdGroupUrlTarget>() {
                    @Override
                    public void accept(String v, BulkAdGroupUrlTarget c) {
                        c.getBiddableAdGroupCriterion().setStatus(StringExtensions.parseOptional(v, new Function<String, AdGroupCriterionStatus>() {
                            @Override
                            public AdGroupCriterionStatus apply(String s) {
                                return StringExtensions.fromValueOptional(s, AdGroupCriterionStatus.class);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupUrlTarget, Long>(StringTable.Id,
                new Function<BulkAdGroupUrlTarget, Long>() {
                    @Override
                    public Long apply(BulkAdGroupUrlTarget c) {
                        return c.getBiddableAdGroupCriterion().getId();
                    }
                },
                new BiConsumer<String, BulkAdGroupUrlTarget>() {
                    @Override
                    public void accept(String v, BulkAdGroupUrlTarget c) {
                        c.getBiddableAdGroupCriterion().setId(StringExtensions.parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String s) {
                                return Long.parseLong(s);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupUrlTarget, Long>(StringTable.ParentId,
                new Function<BulkAdGroupUrlTarget, Long>() {
                    @Override
                    public Long apply(BulkAdGroupUrlTarget c) {
                        return c.getBiddableAdGroupCriterion().getAdGroupId();
                    }
                },
                new BiConsumer<String, BulkAdGroupUrlTarget>() {
                    @Override
                    public void accept(String v, BulkAdGroupUrlTarget c) {
                        c.getBiddableAdGroupCriterion().setAdGroupId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupUrlTarget, String>(StringTable.Campaign,
                new Function<BulkAdGroupUrlTarget, String>() {
                    @Override
                    public String apply(BulkAdGroupUrlTarget c) {
                        return c.getCampaignName();
                    }
                },
                new BiConsumer<String, BulkAdGroupUrlTarget>() {
                    @Override
                    public void accept(String v, BulkAdGroupUrlTarget c) {
                        c.setCampaignName(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroupUrlTarget, String>(StringTable.AdGroup,
                new Function<BulkAdGroupUrlTarget, String>() {
                    @Override
                    public String apply(BulkAdGroupUrlTarget c) {
                        return c.getAdGroupName();
                    }
                },
                new BiConsumer<String, BulkAdGroupUrlTarget>() {
                    @Override
                    public void accept(String v, BulkAdGroupUrlTarget c) {
                        c.setAdGroupName(v);
                    }
                }
        ));
        
        m.add(new ComplexBulkMapping<BulkAdGroupUrlTarget>(
                new BiConsumer<BulkAdGroupUrlTarget, RowValues>() {
                    @Override
                    public void accept(BulkAdGroupUrlTarget c, RowValues v) {
                    	if (c.getBiddableAdGroupCriterion().getCriterion() instanceof Webpage) {
                    		WebpageParameter webpageParameter = ((Webpage) c.getBiddableAdGroupCriterion().getCriterion()).getParameter();                   	
	                        if (webpageParameter == null || webpageParameter.getConditions() == null) {
	                            return;
	                        }	                        
	                        WebpageConditionHelper.addRowValuesFromConditions(
	                        		webpageParameter.getConditions(),
	                        		v,
	                        		StringTable.AdGroupUrlTargetCondition1,
	                        		StringTable.AdGroupUrlTargetValue1,
	                        		StringTable.AdGroupUrlTargetOperator1);
                    	}
                    }
                },
                new BiConsumer<RowValues, BulkAdGroupUrlTarget>() {
                    @Override
                    public void accept(RowValues v, BulkAdGroupUrlTarget c) {
                    	if (c.getBiddableAdGroupCriterion().getCriterion() instanceof Webpage) {
                    		WebpageParameter webpageParameter = ((Webpage) c.getBiddableAdGroupCriterion().getCriterion()).getParameter();
                    		if (webpageParameter != null) {
                    			webpageParameter.setConditions(new ArrayOfWebpageCondition());                        
                        		WebpageConditionHelper.addConditionsFromRowValues(
                        				v,
                        				webpageParameter.getConditions(),
                        				StringTable.AdGroupUrlTargetCondition1,
                        				StringTable.AdGroupUrlTargetValue1,
                        				StringTable.AdGroupUrlTargetOperator1);
                    		}	  
                    	}
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroupUrlTarget, String>(StringTable.Name,
                new Function<BulkAdGroupUrlTarget, String>() {
                    @Override
                    public String apply(BulkAdGroupUrlTarget c) { 
                    	if (c.getBiddableAdGroupCriterion().getCriterion() instanceof Webpage) {    
                    		WebpageParameter webpageParameter = ((Webpage) c.getBiddableAdGroupCriterion().getCriterion()).getParameter();
                    		return StringExtensions.toCriterionNameBulkString(webpageParameter, c.getBiddableAdGroupCriterion().getId());
                    	} 
                    	return null;
                    }
                },
                new BiConsumer<String, BulkAdGroupUrlTarget>() {
                    @Override
                    public void accept(String v, BulkAdGroupUrlTarget c) {
                    	if (c.getBiddableAdGroupCriterion().getCriterion() instanceof Webpage) {
                    		WebpageParameter webpageParameter = ((Webpage) c.getBiddableAdGroupCriterion().getCriterion()).getParameter();                        	
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
        
        Webpage webpage = new Webpage();
        webpage.setParameter(new WebpageParameter());
        
    	adGroupCriterion.setCriterion(webpage);
    	adGroupCriterion.getCriterion().setType(Webpage.class.getSimpleName());
    	adGroupCriterion.setType("BiddableAdGroupCriterion");
    	
    	setBiddableAdGroupCriterion(adGroupCriterion);  
    	
    	MappingHelpers.convertToEntity(values, MAPPINGS, this);    	
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getBiddableAdGroupCriterion(), AdGroupCriterion.class.getSimpleName());
        
        MappingHelpers.convertToValues(this, values, MAPPINGS);        
    }

    /**
     * Gets an Ad Group Criterion.
     */
    public AdGroupCriterion getBiddableAdGroupCriterion() {
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
