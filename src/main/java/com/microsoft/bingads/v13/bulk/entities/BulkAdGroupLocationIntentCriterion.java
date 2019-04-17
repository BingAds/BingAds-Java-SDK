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
import com.microsoft.bingads.v13.campaignmanagement.AdGroupCriterionStatus;
import com.microsoft.bingads.v13.campaignmanagement.BiddableAdGroupCriterion;
import com.microsoft.bingads.v13.campaignmanagement.IntentOption;
import com.microsoft.bingads.v13.campaignmanagement.LocationIntentCriterion;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;
import com.microsoft.bingads.v13.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * Represents a location intent criterion that is assigned to an ad group. Each location intent criterion can be read or written in a bulk file.
 *
 * <p>
 *     For more information, see Ad Group Location Intent Criterion at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127>https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkAdGroupLocationIntentCriterion extends SingleRecordBulkEntity {
	
	private BiddableAdGroupCriterion biddableAdGroupCriterion;
	
	private String campaignName;
	
	private String adGroupName;

	private static final List<BulkMapping<BulkAdGroupLocationIntentCriterion>> MAPPINGS;

    static {
        List<BulkMapping<BulkAdGroupLocationIntentCriterion>> m = new ArrayList<BulkMapping<BulkAdGroupLocationIntentCriterion>>();
        
        m.add(new SimpleBulkMapping<BulkAdGroupLocationIntentCriterion, String>(StringTable.Status,
                new Function<BulkAdGroupLocationIntentCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupLocationIntentCriterion c) {
                        AdGroupCriterionStatus status = c.getBiddableAdGroupCriterion().getStatus();

                        return status == null ? null : status.value();
                    }
                },
                new BiConsumer<String, BulkAdGroupLocationIntentCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupLocationIntentCriterion c) {
                        c.getBiddableAdGroupCriterion().setStatus(StringExtensions.parseOptional(v, new Function<String, AdGroupCriterionStatus>() {
                            @Override
                            public AdGroupCriterionStatus apply(String s) {
                                return AdGroupCriterionStatus.fromValue(s);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupLocationIntentCriterion, Long>(StringTable.Id,
                new Function<BulkAdGroupLocationIntentCriterion, Long>() {
                    @Override
                    public Long apply(BulkAdGroupLocationIntentCriterion c) {
                        return c.getBiddableAdGroupCriterion().getId();
                    }
                },
                new BiConsumer<String, BulkAdGroupLocationIntentCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupLocationIntentCriterion c) {
                        c.getBiddableAdGroupCriterion().setId(StringExtensions.parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String s) {
                                return Long.parseLong(s);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupLocationIntentCriterion, Long>(StringTable.ParentId,
                new Function<BulkAdGroupLocationIntentCriterion, Long>() {
                    @Override
                    public Long apply(BulkAdGroupLocationIntentCriterion c) {
                        return c.getBiddableAdGroupCriterion().getAdGroupId();
                    }
                },
                new BiConsumer<String, BulkAdGroupLocationIntentCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupLocationIntentCriterion c) {
                        c.getBiddableAdGroupCriterion().setAdGroupId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupLocationIntentCriterion, String>(StringTable.Campaign,
                new Function<BulkAdGroupLocationIntentCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupLocationIntentCriterion c) {
                        return c.getCampaignName();
                    }
                },
                new BiConsumer<String, BulkAdGroupLocationIntentCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupLocationIntentCriterion c) {
                        c.setCampaignName(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroupLocationIntentCriterion, String>(StringTable.AdGroup,
                new Function<BulkAdGroupLocationIntentCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupLocationIntentCriterion c) {
                        return c.getAdGroupName();
                    }
                },
                new BiConsumer<String, BulkAdGroupLocationIntentCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupLocationIntentCriterion c) {
                        c.setAdGroupName(v);
                    }
                }
        ));       
        
        m.add(new SimpleBulkMapping<BulkAdGroupLocationIntentCriterion, String>(StringTable.Target,
                new Function<BulkAdGroupLocationIntentCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupLocationIntentCriterion c) { 
                    	if (c.getBiddableAdGroupCriterion().getCriterion() instanceof LocationIntentCriterion) {    
                    		IntentOption intentOption = ((LocationIntentCriterion) c.getBiddableAdGroupCriterion().getCriterion()).getIntentOption();
                    		return intentOption == null ? null : intentOption.value();
                    	} 
                    	return null;
                    }
                },
                new BiConsumer<String, BulkAdGroupLocationIntentCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupLocationIntentCriterion c) {
                    	if (c.getBiddableAdGroupCriterion().getCriterion() instanceof LocationIntentCriterion) {                   		
	                		((LocationIntentCriterion)c.getBiddableAdGroupCriterion().getCriterion()).setIntentOption(StringExtensions.parseOptional(v, new Function<String, IntentOption>() {
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
        BiddableAdGroupCriterion adGroupCriterion = new BiddableAdGroupCriterion();    
        
        LocationIntentCriterion locationIntentCriterion = new LocationIntentCriterion();
        
    	adGroupCriterion.setCriterion(locationIntentCriterion);
    	adGroupCriterion.getCriterion().setType(LocationIntentCriterion.class.getSimpleName());
    	adGroupCriterion.setType("BiddableAdGroupCriterion");
    	
    	setBiddableAdGroupCriterion(adGroupCriterion);  
    	
    	MappingHelpers.convertToEntity(values, MAPPINGS, this);   
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getBiddableAdGroupCriterion(), BiddableAdGroupCriterion.class.getSimpleName());
        
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    /**
     * Gets an Ad Group Criterion.
     */
    public BiddableAdGroupCriterion getBiddableAdGroupCriterion() {
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
