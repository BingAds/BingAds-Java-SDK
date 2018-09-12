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
import com.microsoft.bingads.v12.campaignmanagement.AdGroupCriterionStatus;
import com.microsoft.bingads.v12.campaignmanagement.LocationCriterion;
import com.microsoft.bingads.v12.campaignmanagement.NegativeAdGroupCriterion;
import com.microsoft.bingads.v12.internal.bulk.BulkMapping;
import com.microsoft.bingads.v12.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v12.internal.bulk.RowValues;
import com.microsoft.bingads.v12.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v12.internal.bulk.StringExtensions;
import com.microsoft.bingads.v12.internal.bulk.StringTable;
import com.microsoft.bingads.v12.internal.bulk.entities.SingleRecordBulkEntity;

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
	
	private NegativeAdGroupCriterion negativeAdGroupCriterion;
	
	private String campaignName;
	
	private String adGroupName;

	private static final List<BulkMapping<BulkAdGroupNegativeLocationCriterion>> MAPPINGS;

    static {
        List<BulkMapping<BulkAdGroupNegativeLocationCriterion>> m = new ArrayList<BulkMapping<BulkAdGroupNegativeLocationCriterion>>();
        
        m.add(new SimpleBulkMapping<BulkAdGroupNegativeLocationCriterion, String>(StringTable.Status,
                new Function<BulkAdGroupNegativeLocationCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupNegativeLocationCriterion c) {
                        AdGroupCriterionStatus status = c.getNegativeAdGroupCriterion().getStatus();

                        return status == null ? null : status.value();
                    }
                },
                new BiConsumer<String, BulkAdGroupNegativeLocationCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupNegativeLocationCriterion c) {
                        c.getNegativeAdGroupCriterion().setStatus(StringExtensions.parseOptional(v, new Function<String, AdGroupCriterionStatus>() {
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
                        return c.getNegativeAdGroupCriterion().getId();
                    }
                },
                new BiConsumer<String, BulkAdGroupNegativeLocationCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupNegativeLocationCriterion c) {
                        c.getNegativeAdGroupCriterion().setId(StringExtensions.parseOptional(v, new Function<String, Long>() {
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
                        return c.getNegativeAdGroupCriterion().getAdGroupId();
                    }
                },
                new BiConsumer<String, BulkAdGroupNegativeLocationCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupNegativeLocationCriterion c) {
                        c.getNegativeAdGroupCriterion().setAdGroupId(Long.parseLong(v));
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
                    	if (c.getNegativeAdGroupCriterion().getCriterion() instanceof LocationCriterion) {    
                    		Long locationId = ((LocationCriterion) c.getNegativeAdGroupCriterion().getCriterion()).getLocationId();
                    		return locationId == null ? null : locationId.toString();
                    	} 
                    	return null;
                    }
                },
                new BiConsumer<String, BulkAdGroupNegativeLocationCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupNegativeLocationCriterion c) {
                    	if (c.getNegativeAdGroupCriterion().getCriterion() instanceof LocationCriterion) {                   		
	                		((LocationCriterion)c.getNegativeAdGroupCriterion().getCriterion()).setLocationId(Long.parseLong(v));
                    	}
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroupNegativeLocationCriterion, String>(StringTable.SubType,
                new Function<BulkAdGroupNegativeLocationCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupNegativeLocationCriterion c) { 
                    	if (c.getNegativeAdGroupCriterion().getCriterion() instanceof LocationCriterion) {    
                    		return ((LocationCriterion) c.getNegativeAdGroupCriterion().getCriterion()).getLocationType();
                    	} 
                    	return null;
                    }
                },
                new BiConsumer<String, BulkAdGroupNegativeLocationCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupNegativeLocationCriterion c) {
                    	if (c.getNegativeAdGroupCriterion().getCriterion() instanceof LocationCriterion) {                   		
	                		((LocationCriterion)c.getNegativeAdGroupCriterion().getCriterion()).setLocationType(v);
                    	}
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroupNegativeLocationCriterion, String>(StringTable.Name,
                new Function<BulkAdGroupNegativeLocationCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupNegativeLocationCriterion c) { 
                    	if (c.getNegativeAdGroupCriterion().getCriterion() instanceof LocationCriterion) {    
                    		return ((LocationCriterion) c.getNegativeAdGroupCriterion().getCriterion()).getDisplayName();
                    	} 
                    	return null;
                    }
                },
                new BiConsumer<String, BulkAdGroupNegativeLocationCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupNegativeLocationCriterion c) {
                    	if (c.getNegativeAdGroupCriterion().getCriterion() instanceof LocationCriterion) {                   		
	                		((LocationCriterion)c.getNegativeAdGroupCriterion().getCriterion()).setDisplayName(v);
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
    	
    	setNegativeAdGroupCriterion(adGroupCriterion);  
    	
    	MappingHelpers.convertToEntity(values, MAPPINGS, this);   
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getNegativeAdGroupCriterion(), NegativeAdGroupCriterion.class.getSimpleName());
        
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
