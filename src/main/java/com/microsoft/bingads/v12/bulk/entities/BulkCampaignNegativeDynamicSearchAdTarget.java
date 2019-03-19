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
import com.microsoft.bingads.v12.campaignmanagement.ArrayOfWebpageCondition;
import com.microsoft.bingads.v12.campaignmanagement.NegativeCampaignCriterion;
import com.microsoft.bingads.v12.campaignmanagement.Webpage;
import com.microsoft.bingads.v12.campaignmanagement.WebpageParameter;
import com.microsoft.bingads.v12.internal.bulk.BulkMapping;
import com.microsoft.bingads.v12.internal.bulk.ComplexBulkMapping;
import com.microsoft.bingads.v12.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v12.internal.bulk.RowValues;
import com.microsoft.bingads.v12.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v12.internal.bulk.StringExtensions;
import com.microsoft.bingads.v12.internal.bulk.StringTable;
import com.microsoft.bingads.v12.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * Represents a negative dynamic search ad target that is assigned to a campaign. Each negative dynamic search ad target can be read or written in a bulk file.
 *
 * <p>
 *     For more information, see Campaign Negative Dynamic Search Ad Target at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkCampaignNegativeDynamicSearchAdTarget extends SingleRecordBulkEntity {
	
	private NegativeCampaignCriterion negativeCampaignCriterion;
	
	private Status status; 
	
	private String campaignName;

	private static final List<BulkMapping<BulkCampaignNegativeDynamicSearchAdTarget>> MAPPINGS;

    static {
        List<BulkMapping<BulkCampaignNegativeDynamicSearchAdTarget>> m = new ArrayList<BulkMapping<BulkCampaignNegativeDynamicSearchAdTarget>>();

        m.add(new SimpleBulkMapping<BulkCampaignNegativeDynamicSearchAdTarget, String>(StringTable.Status,
                new Function<BulkCampaignNegativeDynamicSearchAdTarget, String>() {
                    @Override
                    public String apply(BulkCampaignNegativeDynamicSearchAdTarget c) {
                        return c.getStatus() != null ? c.getStatus().value() : null;
                    }
                },
                new BiConsumer<String, BulkCampaignNegativeDynamicSearchAdTarget>() {
                    @Override
                    public void accept(String v, BulkCampaignNegativeDynamicSearchAdTarget c) {
                        c.setStatus(StringExtensions.parseOptional(v, new Function<String, Status>() {
                            @Override
                            public Status apply(String value) {
                                return Status.fromValue(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkCampaignNegativeDynamicSearchAdTarget, Long>(StringTable.Id,
                new Function<BulkCampaignNegativeDynamicSearchAdTarget, Long>() {
                    @Override
                    public Long apply(BulkCampaignNegativeDynamicSearchAdTarget c) {
                        return c.getNegativeCampaignCriterion().getId();
                    }
                },
                new BiConsumer<String, BulkCampaignNegativeDynamicSearchAdTarget>() {
                    @Override
                    public void accept(String v, BulkCampaignNegativeDynamicSearchAdTarget c) {
                        c.getNegativeCampaignCriterion().setId(StringExtensions.parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String s) {
                                return Long.parseLong(s);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkCampaignNegativeDynamicSearchAdTarget, Long>(StringTable.ParentId,
                new Function<BulkCampaignNegativeDynamicSearchAdTarget, Long>() {
                    @Override
                    public Long apply(BulkCampaignNegativeDynamicSearchAdTarget c) {
                        return c.getNegativeCampaignCriterion().getCampaignId();
                    }
                },
                new BiConsumer<String, BulkCampaignNegativeDynamicSearchAdTarget>() {
                    @Override
                    public void accept(String v, BulkCampaignNegativeDynamicSearchAdTarget c) {
                        c.getNegativeCampaignCriterion().setCampaignId(StringExtensions.nullOrLong(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkCampaignNegativeDynamicSearchAdTarget, String>(StringTable.Campaign,
                new Function<BulkCampaignNegativeDynamicSearchAdTarget, String>() {
                    @Override
                    public String apply(BulkCampaignNegativeDynamicSearchAdTarget c) {
                        return c.getCampaignName();
                    }
                },
                new BiConsumer<String, BulkCampaignNegativeDynamicSearchAdTarget>() {
                    @Override
                    public void accept(String v, BulkCampaignNegativeDynamicSearchAdTarget c) {
                        c.setCampaignName(v);
                    }
                }
        ));

        m.add(new ComplexBulkMapping<BulkCampaignNegativeDynamicSearchAdTarget>(
                new BiConsumer<BulkCampaignNegativeDynamicSearchAdTarget, RowValues>() {
                    @Override
                    public void accept(BulkCampaignNegativeDynamicSearchAdTarget c, RowValues v) {
                    	if (c.getNegativeCampaignCriterion().getCriterion() instanceof Webpage) {
                    		WebpageParameter webpageParameter = ((Webpage) c.getNegativeCampaignCriterion().getCriterion()).getParameter();                   	
	                        if (webpageParameter == null || webpageParameter.getConditions() == null) {
	                            return;
	                        }	                        
	                        WebpageConditionHelper.addRowValuesFromConditions(webpageParameter.getConditions(), v);
                    	}
                    }
                },
                new BiConsumer<RowValues, BulkCampaignNegativeDynamicSearchAdTarget>() {
                    @Override
                    public void accept(RowValues v, BulkCampaignNegativeDynamicSearchAdTarget c) {
                    	if (c.getNegativeCampaignCriterion().getCriterion() instanceof Webpage) {
                    		WebpageParameter webpageParameter = ((Webpage) c.getNegativeCampaignCriterion().getCriterion()).getParameter();
                    		if (webpageParameter != null) {
                    			webpageParameter.setConditions(new ArrayOfWebpageCondition());                        
                        		WebpageConditionHelper.addConditionsFromRowValues(v, webpageParameter.getConditions());
                    		}	   
                    	}
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkCampaignNegativeDynamicSearchAdTarget, String>(StringTable.Name,
                new Function<BulkCampaignNegativeDynamicSearchAdTarget, String>() {
                    @Override
                    public String apply(BulkCampaignNegativeDynamicSearchAdTarget c) {
                    	if (c.getNegativeCampaignCriterion().getCriterion() instanceof Webpage) {    
                    		WebpageParameter webpageParameter = ((Webpage) c.getNegativeCampaignCriterion().getCriterion()).getParameter();
                    		return StringExtensions.toCriterionNameBulkString(webpageParameter, c.getNegativeCampaignCriterion().getId());
                    	} 
                    	return null;
                    }
                },
                new BiConsumer<String, BulkCampaignNegativeDynamicSearchAdTarget>() {
                    @Override
                    public void accept(String v, BulkCampaignNegativeDynamicSearchAdTarget c) {
                    	if (c.getNegativeCampaignCriterion().getCriterion() instanceof Webpage) {
                    		WebpageParameter webpageParameter = ((Webpage) c.getNegativeCampaignCriterion().getCriterion()).getParameter();                        	
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
    	NegativeCampaignCriterion negativeCampaignCriterion = new NegativeCampaignCriterion();
    	
    	Webpage webpage = new Webpage();
        webpage.setParameter(new WebpageParameter());

    	negativeCampaignCriterion.setCriterion(webpage);
    	negativeCampaignCriterion.setType(NegativeCampaignCriterion.class.getSimpleName());
    	negativeCampaignCriterion.getCriterion().setType(Webpage.class.getSimpleName());

        setNegativeCampaignCriterion(negativeCampaignCriterion);

        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getNegativeCampaignCriterion(), NegativeCampaignCriterion.class.getSimpleName());

        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    /**
     * Gets a Negative Campaign Criterion.
     */
    public NegativeCampaignCriterion getNegativeCampaignCriterion() {
        return negativeCampaignCriterion;
    }

    /**
     * Sets a Negative Campaign Criterion
     */
    public void setNegativeCampaignCriterion(NegativeCampaignCriterion negativeCampaignCriterion) {
        this.negativeCampaignCriterion = negativeCampaignCriterion;
    }

    /**
     * Gets the name of the campaign.
     * Corresponds to the 'Campaign' field in the bulk file.
     */
    public String getCampaignName() {
        return campaignName;
    }

    /**
     * Sets the name of the campaign.
     * Corresponds to the 'Campaign' field in the bulk file.
     */
    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    /**
     * Gets the status of the Negative Campaign Criterion.
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the status of the Negative Campaign Criterion.
     */
    public void setStatus(Status status) {
        this.status = status;
    }
}
