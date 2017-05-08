package com.microsoft.bingads.v11.bulk.entities;

import com.microsoft.bingads.v11.bulk.BulkServiceManager;
import com.microsoft.bingads.v11.campaignmanagement.CampaignCriterionStatus;
import com.microsoft.bingads.v11.campaignmanagement.LocationCriterion;
import com.microsoft.bingads.v11.campaignmanagement.NegativeCampaignCriterion;
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
 * Represents a negative location criterion that is assigned to a campaign. Each negative location criterion can be read or written in a bulk file.
 *
 * <p>
 *     For more information, see Campaign Negative Location Criterion at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127>https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkCampaignNegativeLocationCriterion extends SingleRecordBulkEntity {
	
	private NegativeCampaignCriterion campaignCriterion;
	
	private String campaignName;

	private static final List<BulkMapping<BulkCampaignNegativeLocationCriterion>> MAPPINGS;

    static {
        List<BulkMapping<BulkCampaignNegativeLocationCriterion>> m = new ArrayList<BulkMapping<BulkCampaignNegativeLocationCriterion>>();
        
        m.add(new SimpleBulkMapping<BulkCampaignNegativeLocationCriterion, String>(StringTable.Status,
                new Function<BulkCampaignNegativeLocationCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignNegativeLocationCriterion c) {
                    	CampaignCriterionStatus status = c.getCampaignCriterion().getStatus();
                    	
                        return status == null ? null : status.value();
                    }
                },
                new BiConsumer<String, BulkCampaignNegativeLocationCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignNegativeLocationCriterion c) {
                        c.getCampaignCriterion().setStatus(StringExtensions.parseOptional(v, new Function<String, CampaignCriterionStatus>() {
                            @Override
                            public CampaignCriterionStatus apply(String s) {
                                return CampaignCriterionStatus.fromValue(s);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkCampaignNegativeLocationCriterion, Long>(StringTable.Id,
                new Function<BulkCampaignNegativeLocationCriterion, Long>() {
                    @Override
                    public Long apply(BulkCampaignNegativeLocationCriterion c) {
                        return c.getCampaignCriterion().getId();
                    }
                },
                new BiConsumer<String, BulkCampaignNegativeLocationCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignNegativeLocationCriterion c) {
                        c.getCampaignCriterion().setId(StringExtensions.parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String s) {
                                return Long.parseLong(s);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkCampaignNegativeLocationCriterion, Long>(StringTable.ParentId,
                new Function<BulkCampaignNegativeLocationCriterion, Long>() {
                    @Override
                    public Long apply(BulkCampaignNegativeLocationCriterion c) {
                        return c.getCampaignCriterion().getCampaignId();
                    }
                },
                new BiConsumer<String, BulkCampaignNegativeLocationCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignNegativeLocationCriterion c) {
                        c.getCampaignCriterion().setCampaignId(Long.parseLong(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkCampaignNegativeLocationCriterion, String>(StringTable.Campaign,
                new Function<BulkCampaignNegativeLocationCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignNegativeLocationCriterion c) {
                        return c.getCampaignName();
                    }
                },
                new BiConsumer<String, BulkCampaignNegativeLocationCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignNegativeLocationCriterion c) {
                        c.setCampaignName(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkCampaignNegativeLocationCriterion, String>(StringTable.Target,
                new Function<BulkCampaignNegativeLocationCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignNegativeLocationCriterion c) { 
                    	if (c.getCampaignCriterion().getCriterion() instanceof LocationCriterion) {    
                    		Long locationId = ((LocationCriterion) c.getCampaignCriterion().getCriterion()).getLocationId();
                    		return locationId == null ? null : locationId.toString();
                    	} 
                    	return null;
                    }
                },
                new BiConsumer<String, BulkCampaignNegativeLocationCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignNegativeLocationCriterion c) {
                    	if (c.getCampaignCriterion().getCriterion() instanceof LocationCriterion) {                   		
	                		((LocationCriterion)c.getCampaignCriterion().getCriterion()).setLocationId(Long.parseLong(v));
                    	}
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkCampaignNegativeLocationCriterion, String>(StringTable.SubType,
                new Function<BulkCampaignNegativeLocationCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignNegativeLocationCriterion c) { 
                    	if (c.getCampaignCriterion().getCriterion() instanceof LocationCriterion) {    
                    		return ((LocationCriterion) c.getCampaignCriterion().getCriterion()).getLocationType();
                    	} 
                    	return null;
                    }
                },
                new BiConsumer<String, BulkCampaignNegativeLocationCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignNegativeLocationCriterion c) {
                    	if (c.getCampaignCriterion().getCriterion() instanceof LocationCriterion) {                   		
	                		((LocationCriterion)c.getCampaignCriterion().getCriterion()).setLocationType(v);
                    	}
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkCampaignNegativeLocationCriterion, String>(StringTable.Name,
                new Function<BulkCampaignNegativeLocationCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignNegativeLocationCriterion c) { 
                    	if (c.getCampaignCriterion().getCriterion() instanceof LocationCriterion) {    
                    		return ((LocationCriterion) c.getCampaignCriterion().getCriterion()).getDisplayName();
                    	} 
                    	return null;
                    }
                },
                new BiConsumer<String, BulkCampaignNegativeLocationCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignNegativeLocationCriterion c) {
                    	if (c.getCampaignCriterion().getCriterion() instanceof LocationCriterion) {                   		
	                		((LocationCriterion)c.getCampaignCriterion().getCriterion()).setDisplayName(v);
                    	}
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
    	NegativeCampaignCriterion campaignCriterion = new NegativeCampaignCriterion();  
                
        LocationCriterion locationCriterion = new LocationCriterion();
        
    	campaignCriterion.setCriterion(locationCriterion);
    	campaignCriterion.getCriterion().setType(LocationCriterion.class.getSimpleName());
    	campaignCriterion.setType("NegativeCampaignCriterion");
    	
    	setCampaignCriterion(campaignCriterion);  
    	
    	MappingHelpers.convertToEntity(values, MAPPINGS, this);   
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getCampaignCriterion(), NegativeCampaignCriterion.class.getSimpleName());
        
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    /**
     * Gets an Campaign Criterion.
     */
    public NegativeCampaignCriterion getCampaignCriterion() {
        return campaignCriterion;
    }

    /**
     * Sets an Campaign Criterion
     */
    public void setCampaignCriterion(NegativeCampaignCriterion campaignCriterion) {
        this.campaignCriterion = campaignCriterion;
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
