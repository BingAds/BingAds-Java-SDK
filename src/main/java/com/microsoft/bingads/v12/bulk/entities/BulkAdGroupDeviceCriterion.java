package com.microsoft.bingads.v12.bulk.entities;

import com.microsoft.bingads.v12.bulk.BulkServiceManager;
import com.microsoft.bingads.v12.campaignmanagement.AdGroupCriterionStatus;
import com.microsoft.bingads.v12.campaignmanagement.BidMultiplier;
import com.microsoft.bingads.v12.campaignmanagement.BiddableAdGroupCriterion;
import com.microsoft.bingads.v12.campaignmanagement.CriterionBid;
import com.microsoft.bingads.v12.campaignmanagement.DeviceCriterion;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v12.bulk.BulkFileReader;
import com.microsoft.bingads.v12.bulk.BulkFileWriter;
import com.microsoft.bingads.v12.bulk.BulkOperation;
import com.microsoft.bingads.v12.internal.bulk.BulkMapping;
import com.microsoft.bingads.v12.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v12.internal.bulk.RowValues;
import com.microsoft.bingads.v12.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v12.internal.bulk.StringExtensions;
import com.microsoft.bingads.v12.internal.bulk.StringTable;
import com.microsoft.bingads.v12.internal.bulk.entities.SingleRecordBulkEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents a device criterion that is assigned to an ad group. Each device criterion can be read or written in a bulk file.
 *
 * <p>
 *     For more information, see Ad Group DeviceOS Criterion at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127>https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkAdGroupDeviceCriterion extends SingleRecordBulkEntity {
	
	private BiddableAdGroupCriterion biddableAdGroupCriterion;
	
	private String campaignName;
	
	private String adGroupName;

	private static final List<BulkMapping<BulkAdGroupDeviceCriterion>> MAPPINGS;

    static {
        List<BulkMapping<BulkAdGroupDeviceCriterion>> m = new ArrayList<BulkMapping<BulkAdGroupDeviceCriterion>>();
        
        m.add(new SimpleBulkMapping<BulkAdGroupDeviceCriterion, String>(StringTable.Status,
                new Function<BulkAdGroupDeviceCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupDeviceCriterion c) {
                        AdGroupCriterionStatus status = c.getBiddableAdGroupCriterion().getStatus();

                        return status == null ? null : status.value();
                    }
                },
                new BiConsumer<String, BulkAdGroupDeviceCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupDeviceCriterion c) {
                        c.getBiddableAdGroupCriterion().setStatus(StringExtensions.parseOptional(v, new Function<String, AdGroupCriterionStatus>() {
                            @Override
                            public AdGroupCriterionStatus apply(String s) {
                                return AdGroupCriterionStatus.fromValue(s);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupDeviceCriterion, Long>(StringTable.Id,
                new Function<BulkAdGroupDeviceCriterion, Long>() {
                    @Override
                    public Long apply(BulkAdGroupDeviceCriterion c) {
                        return c.getBiddableAdGroupCriterion().getId();
                    }
                },
                new BiConsumer<String, BulkAdGroupDeviceCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupDeviceCriterion c) {
                        c.getBiddableAdGroupCriterion().setId(StringExtensions.parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String s) {
                                return Long.parseLong(s);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupDeviceCriterion, Long>(StringTable.ParentId,
                new Function<BulkAdGroupDeviceCriterion, Long>() {
                    @Override
                    public Long apply(BulkAdGroupDeviceCriterion c) {
                        return c.getBiddableAdGroupCriterion().getAdGroupId();
                    }
                },
                new BiConsumer<String, BulkAdGroupDeviceCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupDeviceCriterion c) {
                        c.getBiddableAdGroupCriterion().setAdGroupId(Long.parseLong(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupDeviceCriterion, String>(StringTable.Campaign,
                new Function<BulkAdGroupDeviceCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupDeviceCriterion c) {
                        return c.getCampaignName();
                    }
                },
                new BiConsumer<String, BulkAdGroupDeviceCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupDeviceCriterion c) {
                        c.setCampaignName(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroupDeviceCriterion, String>(StringTable.AdGroup,
                new Function<BulkAdGroupDeviceCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupDeviceCriterion c) {
                        return c.getAdGroupName();
                    }
                },
                new BiConsumer<String, BulkAdGroupDeviceCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupDeviceCriterion c) {
                        c.setAdGroupName(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroupDeviceCriterion, String>(StringTable.BidAdjustment,
                new Function<BulkAdGroupDeviceCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupDeviceCriterion c) {
                        if (c.getBiddableAdGroupCriterion() instanceof BiddableAdGroupCriterion) {
                            CriterionBid bid = ((BiddableAdGroupCriterion) c.getBiddableAdGroupCriterion()).getCriterionBid();
                            if (bid == null) {
                                return null;
                            } else {
                                return StringExtensions.toCriterionBidMultiplierBulkString(((BidMultiplier) bid).getMultiplier());
                            }
                        } else {
                            return null;
                        }
                    }
                },
                new BiConsumer<String, BulkAdGroupDeviceCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupDeviceCriterion c) {
                        if (c.getBiddableAdGroupCriterion() instanceof BiddableAdGroupCriterion) {
                            ((BidMultiplier) ((BiddableAdGroupCriterion) c.getBiddableAdGroupCriterion()).getCriterionBid()).setMultiplier(
                                    StringExtensions.nullOrDouble(v)
                            );
                        }
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroupDeviceCriterion, String>(StringTable.Target,
                new Function<BulkAdGroupDeviceCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupDeviceCriterion c) { 
                    	if (c.getBiddableAdGroupCriterion().getCriterion() instanceof DeviceCriterion) {    
                    		return ((DeviceCriterion) c.getBiddableAdGroupCriterion().getCriterion()).getDeviceName();
                    	}
                    	return null;
                    }
                },
                new BiConsumer<String, BulkAdGroupDeviceCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupDeviceCriterion c) {
                    	if (c.getBiddableAdGroupCriterion().getCriterion() instanceof DeviceCriterion) {                   		
	                		((DeviceCriterion)c.getBiddableAdGroupCriterion().getCriterion()).setDeviceName(v);
                    	}
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroupDeviceCriterion, String>(StringTable.OsNames,
                new Function<BulkAdGroupDeviceCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupDeviceCriterion c) { 
                    	if (c.getBiddableAdGroupCriterion().getCriterion() instanceof DeviceCriterion) {    
                    		return ((DeviceCriterion) c.getBiddableAdGroupCriterion().getCriterion()).getOSName();
                    	}
                    	return null;
                    }
                },
                new BiConsumer<String, BulkAdGroupDeviceCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupDeviceCriterion c) {
                    	if (c.getBiddableAdGroupCriterion().getCriterion() instanceof DeviceCriterion) {                   		
	                		((DeviceCriterion)c.getBiddableAdGroupCriterion().getCriterion()).setOSName(v);
                    	}
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        BiddableAdGroupCriterion adGroupCriterion = new BiddableAdGroupCriterion();  
        
        BidMultiplier bidMultiplier = new BidMultiplier();       
        bidMultiplier.setType(BidMultiplier.class.getSimpleName());
        
        DeviceCriterion deviceCriterion = new DeviceCriterion();
        
    	adGroupCriterion.setCriterion(deviceCriterion);
    	adGroupCriterion.getCriterion().setType(DeviceCriterion.class.getSimpleName());
    	adGroupCriterion.setCriterionBid(bidMultiplier);
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
