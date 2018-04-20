package com.microsoft.bingads.v12.bulk.entities;

import com.microsoft.bingads.v12.bulk.BulkServiceManager;
import com.microsoft.bingads.v12.campaignmanagement.BidMultiplier;
import com.microsoft.bingads.v12.campaignmanagement.BiddableCampaignCriterion;
import com.microsoft.bingads.v12.campaignmanagement.CampaignCriterionStatus;
import com.microsoft.bingads.v12.campaignmanagement.CriterionBid;
import com.microsoft.bingads.v12.campaignmanagement.Day;
import com.microsoft.bingads.v12.campaignmanagement.DayTimeCriterion;
import com.microsoft.bingads.v12.campaignmanagement.Minute;
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
 * Represents a daytime criterion that is assigned to a campaign. Each daytime criterion can be read or written in a bulk file.
 *
 * <p>
 *     For more information, see Campaign DayTime Criterion at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127>https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkCampaignDayTimeCriterion extends SingleRecordBulkEntity {
	
	private BiddableCampaignCriterion biddableCampaignCriterion;
	
	private String campaignName;

	private static final List<BulkMapping<BulkCampaignDayTimeCriterion>> MAPPINGS;

    static {
        List<BulkMapping<BulkCampaignDayTimeCriterion>> m = new ArrayList<BulkMapping<BulkCampaignDayTimeCriterion>>();
        
        m.add(new SimpleBulkMapping<BulkCampaignDayTimeCriterion, String>(StringTable.Status,
                new Function<BulkCampaignDayTimeCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignDayTimeCriterion c) {
                    	CampaignCriterionStatus status = c.getBiddableCampaignCriterion().getStatus();
                    	
                        return status == null ? null : status.value();
                    }
                },
                new BiConsumer<String, BulkCampaignDayTimeCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignDayTimeCriterion c) {
                        c.getBiddableCampaignCriterion().setStatus(StringExtensions.parseOptional(v, new Function<String, CampaignCriterionStatus>() {
                            @Override
                            public CampaignCriterionStatus apply(String s) {
                                return CampaignCriterionStatus.fromValue(s);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkCampaignDayTimeCriterion, Long>(StringTable.Id,
                new Function<BulkCampaignDayTimeCriterion, Long>() {
                    @Override
                    public Long apply(BulkCampaignDayTimeCriterion c) {
                        return c.getBiddableCampaignCriterion().getId();
                    }
                },
                new BiConsumer<String, BulkCampaignDayTimeCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignDayTimeCriterion c) {
                        c.getBiddableCampaignCriterion().setId(StringExtensions.parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String s) {
                                return Long.parseLong(s);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkCampaignDayTimeCriterion, Long>(StringTable.ParentId,
                new Function<BulkCampaignDayTimeCriterion, Long>() {
                    @Override
                    public Long apply(BulkCampaignDayTimeCriterion c) {
                        return c.getBiddableCampaignCriterion().getCampaignId();
                    }
                },
                new BiConsumer<String, BulkCampaignDayTimeCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignDayTimeCriterion c) {
                        c.getBiddableCampaignCriterion().setCampaignId(Long.parseLong(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkCampaignDayTimeCriterion, String>(StringTable.Campaign,
                new Function<BulkCampaignDayTimeCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignDayTimeCriterion c) {
                        return c.getCampaignName();
                    }
                },
                new BiConsumer<String, BulkCampaignDayTimeCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignDayTimeCriterion c) {
                        c.setCampaignName(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkCampaignDayTimeCriterion, String>(StringTable.BidAdjustment,
                new Function<BulkCampaignDayTimeCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignDayTimeCriterion c) {
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
                new BiConsumer<String, BulkCampaignDayTimeCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignDayTimeCriterion c) {
                        if (c.getBiddableCampaignCriterion() instanceof BiddableCampaignCriterion) {
                            ((BidMultiplier) ((BiddableCampaignCriterion) c.getBiddableCampaignCriterion()).getCriterionBid()).setMultiplier(
                                    StringExtensions.nullOrDouble(v)
                            );
                        }
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkCampaignDayTimeCriterion, String>(StringTable.Target,
                new Function<BulkCampaignDayTimeCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignDayTimeCriterion c) { 
                    	if (c.getBiddableCampaignCriterion().getCriterion() instanceof DayTimeCriterion) {    
                    		Day day = ((DayTimeCriterion) c.getBiddableCampaignCriterion().getCriterion()).getDay();
                    		return day == null ? null : day.value();
                    	} 
                    	return null;
                    }
                },
                new BiConsumer<String, BulkCampaignDayTimeCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignDayTimeCriterion c) {
                    	if (c.getBiddableCampaignCriterion().getCriterion() instanceof DayTimeCriterion) {
                    		
	                		((DayTimeCriterion)c.getBiddableCampaignCriterion().getCriterion()).setDay(StringExtensions.parseOptional(v, new Function<String, Day>() {
	                                @Override
	                                public Day apply(String s) {
	                                    return Day.fromValue(s);
	                                }
	                            }));
                    	}
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkCampaignDayTimeCriterion, String>(StringTable.FromHour,
                new Function<BulkCampaignDayTimeCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignDayTimeCriterion c) { 
                    	if (c.getBiddableCampaignCriterion().getCriterion() instanceof DayTimeCriterion) {
                    		Integer hour = ((DayTimeCriterion) c.getBiddableCampaignCriterion().getCriterion()).getFromHour();
                    		return StringExtensions.toBulkString(hour);
                    	} 
                    	return null;
                    }
                },
                new BiConsumer<String, BulkCampaignDayTimeCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignDayTimeCriterion c) {
                    	if (c.getBiddableCampaignCriterion().getCriterion() instanceof DayTimeCriterion) {
                    		
	                		((DayTimeCriterion)c.getBiddableCampaignCriterion().getCriterion()).setFromHour(StringExtensions.parseOptional(v, new Function<String, Integer>() {
	                                @Override
	                                public Integer apply(String s) {
	                                    return Integer.parseInt(s);
	                                }
	                            }));
                    	}
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkCampaignDayTimeCriterion, String>(StringTable.ToHour,
                new Function<BulkCampaignDayTimeCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignDayTimeCriterion c) { 
                    	if (c.getBiddableCampaignCriterion().getCriterion() instanceof DayTimeCriterion) {
                    		Integer hour = ((DayTimeCriterion) c.getBiddableCampaignCriterion().getCriterion()).getToHour();
                    		return StringExtensions.toBulkString(hour);
                    	} 
                    	return null;
                    }
                },
                new BiConsumer<String, BulkCampaignDayTimeCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignDayTimeCriterion c) {
                    	if (c.getBiddableCampaignCriterion().getCriterion() instanceof DayTimeCriterion) {
                    		
	                		((DayTimeCriterion)c.getBiddableCampaignCriterion().getCriterion()).setToHour(StringExtensions.parseOptional(v, new Function<String, Integer>() {
	                                @Override
	                                public Integer apply(String s) {
	                                    return Integer.parseInt(s);
	                                }
	                            }));
                    	}
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkCampaignDayTimeCriterion, String>(StringTable.FromMinute,
                new Function<BulkCampaignDayTimeCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignDayTimeCriterion c) { 
                    	if (c.getBiddableCampaignCriterion().getCriterion() instanceof DayTimeCriterion) {
                    		Minute minute = ((DayTimeCriterion) c.getBiddableCampaignCriterion().getCriterion()).getFromMinute();
                    		return minute == null ? null : StringExtensions.toMinuteBulkString(minute);
                    	} 
                    	return null;
                    }
                },
                new BiConsumer<String, BulkCampaignDayTimeCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignDayTimeCriterion c) {
                    	if (c.getBiddableCampaignCriterion().getCriterion() instanceof DayTimeCriterion) {
                    		
	                		((DayTimeCriterion)c.getBiddableCampaignCriterion().getCriterion()).setFromMinute(StringExtensions.parseMinute(v));
                    	}
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkCampaignDayTimeCriterion, String>(StringTable.ToMinute,
                new Function<BulkCampaignDayTimeCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignDayTimeCriterion c) { 
                    	if (c.getBiddableCampaignCriterion().getCriterion() instanceof DayTimeCriterion) {
                    		Minute minute = ((DayTimeCriterion) c.getBiddableCampaignCriterion().getCriterion()).getToMinute();
                    		return minute == null ? null : StringExtensions.toMinuteBulkString(minute);
                    	} 
                    	return null;
                    }
                },
                new BiConsumer<String, BulkCampaignDayTimeCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignDayTimeCriterion c) {
                    	if (c.getBiddableCampaignCriterion().getCriterion() instanceof DayTimeCriterion) {
                    		
	                		((DayTimeCriterion)c.getBiddableCampaignCriterion().getCriterion()).setToMinute(StringExtensions.parseMinute(v));
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
        
        DayTimeCriterion daytimeCriterion = new DayTimeCriterion();
        
    	campaignCriterion.setCriterion(daytimeCriterion);
    	campaignCriterion.getCriterion().setType(DayTimeCriterion.class.getSimpleName());
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
