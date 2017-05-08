package com.microsoft.bingads.v11.bulk.entities;

import com.microsoft.bingads.v11.bulk.BulkServiceManager;
import com.microsoft.bingads.v11.campaignmanagement.AdGroupCriterionStatus;
import com.microsoft.bingads.v11.campaignmanagement.LocationCriterion;
import com.microsoft.bingads.v11.campaignmanagement.NegativeAdGroupCriterion;
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
 * Represents a negative location criterion that is assigned to an ad group. Each negative location criterion can be read or written in a bulk file.
 *
 * <p>
 *     For more information, see Ad Group Negative Location Criterion at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127>https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkAdGroupNegativeLocationCriterion extends SingleRecordBulkEntity {
	
	private NegativeAdGroupCriterion adGroupCriterion;
	
	private String campaignName;
	
	private String adGroupName;

	private static final List<BulkMapping<BulkAdGroupNegativeLocationCriterion>> MAPPINGS;

    static {
        List<BulkMapping<BulkAdGroupNegativeLocationCriterion>> m = new ArrayList<BulkMapping<BulkAdGroupNegativeLocationCriterion>>();
        
        m.add(new SimpleBulkMapping<BulkAdGroupNegativeLocationCriterion, String>(StringTable.Status,
                new Function<BulkAdGroupNegativeLocationCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupNegativeLocationCriterion c) {
                        AdGroupCriterionStatus status = c.getAdGroupCriterion().getStatus();

                        return status == null ? null : status.value();
                    }
                },
                new BiConsumer<String, BulkAdGroupNegativeLocationCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupNegativeLocationCriterion c) {
                        c.getAdGroupCriterion().setStatus(StringExtensions.parseOptional(v, new Function<String, AdGroupCriterionStatus>() {
                            @Override
                            public AdGroupCriterionStatus apply(String s) {
                                return AdGroupCriterionStatus.fromValue(s);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupNegativeLocationCriterion, Long>(StringTable.Id,
                new Function<BulkAdGroupNegativeLocationCriterion, Long>() {
                    @Override
                    public Long apply(BulkAdGroupNegativeLocationCriterion c) {
                        return c.getAdGroupCriterion().getId();
                    }
                },
                new BiConsumer<String, BulkAdGroupNegativeLocationCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupNegativeLocationCriterion c) {
                        c.getAdGroupCriterion().setId(StringExtensions.parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String s) {
                                return Long.parseLong(s);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupNegativeLocationCriterion, Long>(StringTable.ParentId,
                new Function<BulkAdGroupNegativeLocationCriterion, Long>() {
                    @Override
                    public Long apply(BulkAdGroupNegativeLocationCriterion c) {
                        return c.getAdGroupCriterion().getAdGroupId();
                    }
                },
                new BiConsumer<String, BulkAdGroupNegativeLocationCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupNegativeLocationCriterion c) {
                        c.getAdGroupCriterion().setAdGroupId(Long.parseLong(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupNegativeLocationCriterion, String>(StringTable.Campaign,
                new Function<BulkAdGroupNegativeLocationCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupNegativeLocationCriterion c) {
                        return c.getCampaignName();
                    }
                },
                new BiConsumer<String, BulkAdGroupNegativeLocationCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupNegativeLocationCriterion c) {
                        c.setCampaignName(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroupNegativeLocationCriterion, String>(StringTable.AdGroup,
                new Function<BulkAdGroupNegativeLocationCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupNegativeLocationCriterion c) {
                        return c.getAdGroupName();
                    }
                },
                new BiConsumer<String, BulkAdGroupNegativeLocationCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupNegativeLocationCriterion c) {
                        c.setAdGroupName(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroupNegativeLocationCriterion, String>(StringTable.Target,
                new Function<BulkAdGroupNegativeLocationCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupNegativeLocationCriterion c) { 
                    	if (c.getAdGroupCriterion().getCriterion() instanceof LocationCriterion) {    
                    		Long locationId = ((LocationCriterion) c.getAdGroupCriterion().getCriterion()).getLocationId();
                    		return locationId == null ? null : locationId.toString();
                    	} 
                    	return null;
                    }
                },
                new BiConsumer<String, BulkAdGroupNegativeLocationCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupNegativeLocationCriterion c) {
                    	if (c.getAdGroupCriterion().getCriterion() instanceof LocationCriterion) {                   		
	                		((LocationCriterion)c.getAdGroupCriterion().getCriterion()).setLocationId(Long.parseLong(v));
                    	}
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroupNegativeLocationCriterion, String>(StringTable.SubType,
                new Function<BulkAdGroupNegativeLocationCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupNegativeLocationCriterion c) { 
                    	if (c.getAdGroupCriterion().getCriterion() instanceof LocationCriterion) {    
                    		return ((LocationCriterion) c.getAdGroupCriterion().getCriterion()).getLocationType();
                    	} 
                    	return null;
                    }
                },
                new BiConsumer<String, BulkAdGroupNegativeLocationCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupNegativeLocationCriterion c) {
                    	if (c.getAdGroupCriterion().getCriterion() instanceof LocationCriterion) {                   		
	                		((LocationCriterion)c.getAdGroupCriterion().getCriterion()).setLocationType(v);
                    	}
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroupNegativeLocationCriterion, String>(StringTable.Name,
                new Function<BulkAdGroupNegativeLocationCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupNegativeLocationCriterion c) { 
                    	if (c.getAdGroupCriterion().getCriterion() instanceof LocationCriterion) {    
                    		return ((LocationCriterion) c.getAdGroupCriterion().getCriterion()).getDisplayName();
                    	} 
                    	return null;
                    }
                },
                new BiConsumer<String, BulkAdGroupNegativeLocationCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupNegativeLocationCriterion c) {
                    	if (c.getAdGroupCriterion().getCriterion() instanceof LocationCriterion) {                   		
	                		((LocationCriterion)c.getAdGroupCriterion().getCriterion()).setDisplayName(v);
                    	}
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
    	NegativeAdGroupCriterion adGroupCriterion = new NegativeAdGroupCriterion();  
                
        LocationCriterion locationCriterion = new LocationCriterion();
        
    	adGroupCriterion.setCriterion(locationCriterion);
    	adGroupCriterion.getCriterion().setType(LocationCriterion.class.getSimpleName());
    	adGroupCriterion.setType("NegativeAdGroupCriterion");
    	
    	setAdGroupCriterion(adGroupCriterion);  
    	
    	MappingHelpers.convertToEntity(values, MAPPINGS, this);   
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getAdGroupCriterion(), NegativeAdGroupCriterion.class.getSimpleName());
        
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    /**
     * Gets an Ad Group Criterion.
     */
    public NegativeAdGroupCriterion getAdGroupCriterion() {
        return adGroupCriterion;
    }

    /**
     * Sets an Ad Group Criterion
     */
    public void setAdGroupCriterion(NegativeAdGroupCriterion adGroupCriterion) {
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
