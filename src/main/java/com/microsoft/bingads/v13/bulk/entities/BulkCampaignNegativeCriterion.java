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
import com.microsoft.bingads.v13.campaignmanagement.CampaignCriterionStatus;
import com.microsoft.bingads.v13.campaignmanagement.Criterion;
import com.microsoft.bingads.v13.campaignmanagement.NegativeCampaignCriterion;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;
import com.microsoft.bingads.v13.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * Represents a negative criterion that is assigned to a campaign. Each negative criterion can be read or written in a bulk file.
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public abstract class BulkCampaignNegativeCriterion extends SingleRecordBulkEntity {
	
	private NegativeCampaignCriterion negativeCampaignCriterion;
	
	private String campaignName;

	private static final List<BulkMapping<BulkCampaignNegativeCriterion>> MAPPINGS;

    static {
        List<BulkMapping<BulkCampaignNegativeCriterion>> m = new ArrayList<BulkMapping<BulkCampaignNegativeCriterion>>();
        
        m.add(new SimpleBulkMapping<BulkCampaignNegativeCriterion, String>(StringTable.Status,
                new Function<BulkCampaignNegativeCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignNegativeCriterion c) {
                    	CampaignCriterionStatus status = c.getNegativeCampaignCriterion().getStatus();
                    	
                        return status == null ? null : status.value();
                    }
                },
                new BiConsumer<String, BulkCampaignNegativeCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignNegativeCriterion c) {
                        c.getNegativeCampaignCriterion().setStatus(StringExtensions.parseOptional(v, new Function<String, CampaignCriterionStatus>() {
                            @Override
                            public CampaignCriterionStatus apply(String s) {
                                return StringExtensions.fromValueOptional(s, CampaignCriterionStatus.class);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkCampaignNegativeCriterion, Long>(StringTable.Id,
                new Function<BulkCampaignNegativeCriterion, Long>() {
                    @Override
                    public Long apply(BulkCampaignNegativeCriterion c) {
                        return c.getNegativeCampaignCriterion().getId();
                    }
                },
                new BiConsumer<String, BulkCampaignNegativeCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignNegativeCriterion c) {
                        c.getNegativeCampaignCriterion().setId(StringExtensions.parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String s) {
                                return Long.parseLong(s);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkCampaignNegativeCriterion, Long>(StringTable.ParentId,
                new Function<BulkCampaignNegativeCriterion, Long>() {
                    @Override
                    public Long apply(BulkCampaignNegativeCriterion c) {
                        return c.getNegativeCampaignCriterion().getCampaignId();
                    }
                },
                new BiConsumer<String, BulkCampaignNegativeCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignNegativeCriterion c) {
                        c.getNegativeCampaignCriterion().setCampaignId(StringExtensions.nullOrLong(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkCampaignNegativeCriterion, String>(StringTable.Campaign,
                new Function<BulkCampaignNegativeCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignNegativeCriterion c) {
                        return c.getCampaignName();
                    }
                },
                new BiConsumer<String, BulkCampaignNegativeCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignNegativeCriterion c) {
                        c.setCampaignName(v);
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
    	NegativeCampaignCriterion campaignCriterion = new NegativeCampaignCriterion();  
    	Criterion criterion = createCriterion();
    	campaignCriterion.setCriterion(criterion);
    	campaignCriterion.getCriterion().setType(criterion.getClass().getSimpleName());
    	campaignCriterion.setType("NegativeCampaignCriterion");
    	
    	setNegativeCampaignCriterion(campaignCriterion);  
    	
    	MappingHelpers.convertToEntity(values, MAPPINGS, this);   
    }
    
    protected abstract Criterion createCriterion();

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getNegativeCampaignCriterion(), NegativeCampaignCriterion.class.getSimpleName());
        
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    /**
     * Gets an Campaign Criterion.
     */
    public NegativeCampaignCriterion getNegativeCampaignCriterion() {
        return negativeCampaignCriterion;
    }

    /**
     * Sets an Campaign Criterion
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
}
