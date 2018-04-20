package com.microsoft.bingads.v12.bulk.entities;

import com.microsoft.bingads.v12.bulk.BulkServiceManager;
import com.microsoft.bingads.v12.campaignmanagement.BidMultiplier;
import com.microsoft.bingads.v12.campaignmanagement.BiddableCampaignCriterion;
import com.microsoft.bingads.v12.campaignmanagement.CampaignCriterionStatus;
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
 * Represents a device criterion that is assigned to a campaign. Each device criterion can be read or written in a bulk file.
 *
 * <p>
 *     For more information, see Campaign DeviceOS Criterion at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127>https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkCampaignDeviceCriterion extends SingleRecordBulkEntity {
	
	private BiddableCampaignCriterion biddableCampaignCriterion;
	
	private String campaignName;

	private static final List<BulkMapping<BulkCampaignDeviceCriterion>> MAPPINGS;

    static {
        List<BulkMapping<BulkCampaignDeviceCriterion>> m = new ArrayList<BulkMapping<BulkCampaignDeviceCriterion>>();
        
        m.add(new SimpleBulkMapping<BulkCampaignDeviceCriterion, String>(StringTable.Status,
                new Function<BulkCampaignDeviceCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignDeviceCriterion c) {
                    	CampaignCriterionStatus status = c.getBiddableCampaignCriterion().getStatus();
                    	
                        return status == null ? null : status.value();
                    }
                },
                new BiConsumer<String, BulkCampaignDeviceCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignDeviceCriterion c) {
                        c.getBiddableCampaignCriterion().setStatus(StringExtensions.parseOptional(v, new Function<String, CampaignCriterionStatus>() {
                            @Override
                            public CampaignCriterionStatus apply(String s) {
                                return CampaignCriterionStatus.fromValue(s);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkCampaignDeviceCriterion, Long>(StringTable.Id,
                new Function<BulkCampaignDeviceCriterion, Long>() {
                    @Override
                    public Long apply(BulkCampaignDeviceCriterion c) {
                        return c.getBiddableCampaignCriterion().getId();
                    }
                },
                new BiConsumer<String, BulkCampaignDeviceCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignDeviceCriterion c) {
                        c.getBiddableCampaignCriterion().setId(StringExtensions.parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String s) {
                                return Long.parseLong(s);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkCampaignDeviceCriterion, Long>(StringTable.ParentId,
                new Function<BulkCampaignDeviceCriterion, Long>() {
                    @Override
                    public Long apply(BulkCampaignDeviceCriterion c) {
                        return c.getBiddableCampaignCriterion().getCampaignId();
                    }
                },
                new BiConsumer<String, BulkCampaignDeviceCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignDeviceCriterion c) {
                        c.getBiddableCampaignCriterion().setCampaignId(Long.parseLong(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkCampaignDeviceCriterion, String>(StringTable.Campaign,
                new Function<BulkCampaignDeviceCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignDeviceCriterion c) {
                        return c.getCampaignName();
                    }
                },
                new BiConsumer<String, BulkCampaignDeviceCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignDeviceCriterion c) {
                        c.setCampaignName(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkCampaignDeviceCriterion, String>(StringTable.BidAdjustment,
                new Function<BulkCampaignDeviceCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignDeviceCriterion c) {
                        if (c.getBiddableCampaignCriterion() instanceof BiddableCampaignCriterion) {
                            CriterionBid bid = ((BiddableCampaignCriterion) c.getBiddableCampaignCriterion()).getCriterionBid();
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
                new BiConsumer<String, BulkCampaignDeviceCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignDeviceCriterion c) {
                        if (c.getBiddableCampaignCriterion() instanceof BiddableCampaignCriterion) {
                            ((BidMultiplier) ((BiddableCampaignCriterion) c.getBiddableCampaignCriterion()).getCriterionBid()).setMultiplier(
                                    StringExtensions.nullOrDouble(v)
                            );
                        }
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkCampaignDeviceCriterion, String>(StringTable.Target,
                new Function<BulkCampaignDeviceCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignDeviceCriterion c) { 
                    	if (c.getBiddableCampaignCriterion().getCriterion() instanceof DeviceCriterion) {    
                    		return ((DeviceCriterion) c.getBiddableCampaignCriterion().getCriterion()).getDeviceName();
                    	}
                    	return null;
                    }
                },
                new BiConsumer<String, BulkCampaignDeviceCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignDeviceCriterion c) {
                    	if (c.getBiddableCampaignCriterion().getCriterion() instanceof DeviceCriterion) {                   		
	                		((DeviceCriterion)c.getBiddableCampaignCriterion().getCriterion()).setDeviceName(v);
                    	}
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkCampaignDeviceCriterion, String>(StringTable.OsNames,
                new Function<BulkCampaignDeviceCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignDeviceCriterion c) { 
                    	if (c.getBiddableCampaignCriterion().getCriterion() instanceof DeviceCriterion) {    
                    		return ((DeviceCriterion) c.getBiddableCampaignCriterion().getCriterion()).getOSName();
                    	}
                    	return null;
                    }
                },
                new BiConsumer<String, BulkCampaignDeviceCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignDeviceCriterion c) {
                    	if (c.getBiddableCampaignCriterion().getCriterion() instanceof DeviceCriterion) {                   		
	                		((DeviceCriterion)c.getBiddableCampaignCriterion().getCriterion()).setOSName(v);
                    	}
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        BiddableCampaignCriterion campaignCriterion = new BiddableCampaignCriterion();  
        
        BidMultiplier bidMultiplier = new BidMultiplier();       
        bidMultiplier.setType(BidMultiplier.class.getSimpleName());
        
        DeviceCriterion deviceCriterion = new DeviceCriterion();
        
    	campaignCriterion.setCriterion(deviceCriterion);
    	campaignCriterion.getCriterion().setType(DeviceCriterion.class.getSimpleName());
    	campaignCriterion.setCriterionBid(bidMultiplier);
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
    public void setBiddableCampaignCriterion(BiddableCampaignCriterion campaignCriterion) {
        this.biddableCampaignCriterion = campaignCriterion;
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
