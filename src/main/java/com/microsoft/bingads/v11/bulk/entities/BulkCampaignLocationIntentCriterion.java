package com.microsoft.bingads.v11.bulk.entities;

import com.microsoft.bingads.v11.bulk.BulkServiceManager;
import com.microsoft.bingads.v11.campaignmanagement.BiddableCampaignCriterion;
import com.microsoft.bingads.v11.campaignmanagement.CampaignCriterionStatus;
import com.microsoft.bingads.v11.campaignmanagement.IntentOption;
import com.microsoft.bingads.v11.campaignmanagement.LocationIntentCriterion;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v11.bulk.BulkFileReader;
import com.microsoft.bingads.v11.bulk.BulkFileWriter;
import com.microsoft.bingads.v11.bulk.BulkOperation;
import com.microsoft.bingads.v11.internal.bulk.BulkMapping;
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
 * Represents a location intent criterion that is assigned to a campaign. Each location intent criterion can be read or written in a bulk file.
 *
 * <p>
 *     For more information, see Campaign Location Intent Criterion at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127>https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkCampaignLocationIntentCriterion extends SingleRecordBulkEntity {
	
	private BiddableCampaignCriterion biddableCampaignCriterion;
	
	private String campaignName;

	private static final List<BulkMapping<BulkCampaignLocationIntentCriterion>> MAPPINGS;

    static {
        List<BulkMapping<BulkCampaignLocationIntentCriterion>> m = new ArrayList<BulkMapping<BulkCampaignLocationIntentCriterion>>();
        
        m.add(new SimpleBulkMapping<BulkCampaignLocationIntentCriterion, String>(StringTable.Status,
                new Function<BulkCampaignLocationIntentCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignLocationIntentCriterion c) {
                    	CampaignCriterionStatus status = c.getBiddableCampaignCriterion().getStatus();
                    	
                        return status == null ? null : status.value();
                    }
                },
                new BiConsumer<String, BulkCampaignLocationIntentCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignLocationIntentCriterion c) {
                        c.getBiddableCampaignCriterion().setStatus(StringExtensions.parseOptional(v, new Function<String, CampaignCriterionStatus>() {
                            @Override
                            public CampaignCriterionStatus apply(String s) {
                                return CampaignCriterionStatus.fromValue(s);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkCampaignLocationIntentCriterion, Long>(StringTable.Id,
                new Function<BulkCampaignLocationIntentCriterion, Long>() {
                    @Override
                    public Long apply(BulkCampaignLocationIntentCriterion c) {
                        return c.getBiddableCampaignCriterion().getId();
                    }
                },
                new BiConsumer<String, BulkCampaignLocationIntentCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignLocationIntentCriterion c) {
                        c.getBiddableCampaignCriterion().setId(StringExtensions.parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String s) {
                                return Long.parseLong(s);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkCampaignLocationIntentCriterion, Long>(StringTable.ParentId,
                new Function<BulkCampaignLocationIntentCriterion, Long>() {
                    @Override
                    public Long apply(BulkCampaignLocationIntentCriterion c) {
                        return c.getBiddableCampaignCriterion().getCampaignId();
                    }
                },
                new BiConsumer<String, BulkCampaignLocationIntentCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignLocationIntentCriterion c) {
                        c.getBiddableCampaignCriterion().setCampaignId(Long.parseLong(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkCampaignLocationIntentCriterion, String>(StringTable.Campaign,
                new Function<BulkCampaignLocationIntentCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignLocationIntentCriterion c) {
                        return c.getCampaignName();
                    }
                },
                new BiConsumer<String, BulkCampaignLocationIntentCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignLocationIntentCriterion c) {
                        c.setCampaignName(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkCampaignLocationIntentCriterion, String>(StringTable.Target,
                new Function<BulkCampaignLocationIntentCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignLocationIntentCriterion c) { 
                    	if (c.getBiddableCampaignCriterion().getCriterion() instanceof LocationIntentCriterion) {    
                    		IntentOption intentOption = ((LocationIntentCriterion) c.getBiddableCampaignCriterion().getCriterion()).getIntentOption();
                    		return intentOption == null ? null : intentOption.value();
                    	} 
                    	return null;
                    }
                },
                new BiConsumer<String, BulkCampaignLocationIntentCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignLocationIntentCriterion c) {
                    	if (c.getBiddableCampaignCriterion().getCriterion() instanceof LocationIntentCriterion) {                   		
	                		((LocationIntentCriterion)c.getBiddableCampaignCriterion().getCriterion()).setIntentOption(StringExtensions.parseOptional(v, new Function<String, IntentOption>() {
	                                @Override
	                                public IntentOption apply(String s) {
	                                    return IntentOption.fromValue(s);
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
        BiddableCampaignCriterion campaignCriterion = new BiddableCampaignCriterion();  
        
        LocationIntentCriterion locationIntentCriterion = new LocationIntentCriterion();
        
    	campaignCriterion.setCriterion(locationIntentCriterion);
    	campaignCriterion.getCriterion().setType(LocationIntentCriterion.class.getSimpleName());
    	campaignCriterion.setType("BiddableCampaignCriterion");
    	
    	setBiddableCampaignCriterion(campaignCriterion);  
    	
    	MappingHelpers.convertToEntity(values, MAPPINGS, this);   
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getBiddableCampaignCriterion(), BiddableCampaignCriterion.class.getSimpleName());
        
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    /**
     * Gets a Campaign Criterion.
     */
    public BiddableCampaignCriterion getBiddableCampaignCriterion() {
        return biddableCampaignCriterion;
    }

    /**
     * Sets a Campaign Criterion
     */
    public void setBiddableCampaignCriterion(BiddableCampaignCriterion biddableCampaignCriterion) {
        this.biddableCampaignCriterion = biddableCampaignCriterion;
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
