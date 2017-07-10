package com.microsoft.bingads.v11.bulk.entities;

import com.microsoft.bingads.v11.bulk.BulkServiceManager;
import com.microsoft.bingads.v11.campaignmanagement.AdGroupCriterionStatus;
import com.microsoft.bingads.v11.campaignmanagement.BidMultiplier;
import com.microsoft.bingads.v11.campaignmanagement.BiddableAdGroupCriterion;
import com.microsoft.bingads.v11.campaignmanagement.CriterionBid;
import com.microsoft.bingads.v11.campaignmanagement.Day;
import com.microsoft.bingads.v11.campaignmanagement.DayTimeCriterion;
import com.microsoft.bingads.v11.campaignmanagement.Minute;
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
 * Represents a daytime criterion that is assigned to an ad group. Each daytime criterion can be read or written in a bulk file.
 *
 * <p>
 *     For more information, see Ad Group DayTime Criterion at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127>https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkAdGroupDayTimeCriterion extends SingleRecordBulkEntity {
	
	private BiddableAdGroupCriterion biddableAdGroupCriterion;
	
	private String campaignName;
	
	private String adGroupName;

	private static final List<BulkMapping<BulkAdGroupDayTimeCriterion>> MAPPINGS;

    static {
        List<BulkMapping<BulkAdGroupDayTimeCriterion>> m = new ArrayList<BulkMapping<BulkAdGroupDayTimeCriterion>>();
        
        m.add(new SimpleBulkMapping<BulkAdGroupDayTimeCriterion, String>(StringTable.Status,
                new Function<BulkAdGroupDayTimeCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupDayTimeCriterion c) {
                        AdGroupCriterionStatus status = c.getBiddableAdGroupCriterion().getStatus();

                        return status == null ? null : status.value();
                    }
                },
                new BiConsumer<String, BulkAdGroupDayTimeCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupDayTimeCriterion c) {
                        c.getBiddableAdGroupCriterion().setStatus(StringExtensions.parseOptional(v, new Function<String, AdGroupCriterionStatus>() {
                            @Override
                            public AdGroupCriterionStatus apply(String s) {
                                return AdGroupCriterionStatus.fromValue(s);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupDayTimeCriterion, Long>(StringTable.Id,
                new Function<BulkAdGroupDayTimeCriterion, Long>() {
                    @Override
                    public Long apply(BulkAdGroupDayTimeCriterion c) {
                        return c.getBiddableAdGroupCriterion().getId();
                    }
                },
                new BiConsumer<String, BulkAdGroupDayTimeCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupDayTimeCriterion c) {
                        c.getBiddableAdGroupCriterion().setId(StringExtensions.parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String s) {
                                return Long.parseLong(s);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupDayTimeCriterion, Long>(StringTable.ParentId,
                new Function<BulkAdGroupDayTimeCriterion, Long>() {
                    @Override
                    public Long apply(BulkAdGroupDayTimeCriterion c) {
                        return c.getBiddableAdGroupCriterion().getAdGroupId();
                    }
                },
                new BiConsumer<String, BulkAdGroupDayTimeCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupDayTimeCriterion c) {
                        c.getBiddableAdGroupCriterion().setAdGroupId(Long.parseLong(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupDayTimeCriterion, String>(StringTable.Campaign,
                new Function<BulkAdGroupDayTimeCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupDayTimeCriterion c) {
                        return c.getCampaignName();
                    }
                },
                new BiConsumer<String, BulkAdGroupDayTimeCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupDayTimeCriterion c) {
                        c.setCampaignName(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroupDayTimeCriterion, String>(StringTable.AdGroup,
                new Function<BulkAdGroupDayTimeCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupDayTimeCriterion c) {
                        return c.getAdGroupName();
                    }
                },
                new BiConsumer<String, BulkAdGroupDayTimeCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupDayTimeCriterion c) {
                        c.setAdGroupName(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroupDayTimeCriterion, String>(StringTable.BidAdjustment,
                new Function<BulkAdGroupDayTimeCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupDayTimeCriterion c) {
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
                new BiConsumer<String, BulkAdGroupDayTimeCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupDayTimeCriterion c) {
                        if (c.getBiddableAdGroupCriterion() instanceof BiddableAdGroupCriterion) {
                            ((BidMultiplier) ((BiddableAdGroupCriterion) c.getBiddableAdGroupCriterion()).getCriterionBid()).setMultiplier(
                                    StringExtensions.nullOrDouble(v)
                            );
                        }
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroupDayTimeCriterion, String>(StringTable.Target,
                new Function<BulkAdGroupDayTimeCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupDayTimeCriterion c) { 
                    	if (c.getBiddableAdGroupCriterion().getCriterion() instanceof DayTimeCriterion) {    
                    		Day day = ((DayTimeCriterion) c.getBiddableAdGroupCriterion().getCriterion()).getDay();
                    		return day == null ? null : day.value();
                    	} 
                    	return null;
                    }
                },
                new BiConsumer<String, BulkAdGroupDayTimeCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupDayTimeCriterion c) {
                    	if (c.getBiddableAdGroupCriterion().getCriterion() instanceof DayTimeCriterion) {
                    		
	                		((DayTimeCriterion)c.getBiddableAdGroupCriterion().getCriterion()).setDay(StringExtensions.parseOptional(v, new Function<String, Day>() {
	                                @Override
	                                public Day apply(String s) {
	                                    return Day.fromValue(s);
	                                }
	                            }));
                    	}
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroupDayTimeCriterion, String>(StringTable.FromHour,
                new Function<BulkAdGroupDayTimeCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupDayTimeCriterion c) { 
                    	if (c.getBiddableAdGroupCriterion().getCriterion() instanceof DayTimeCriterion) {
                    		Integer hour = ((DayTimeCriterion) c.getBiddableAdGroupCriterion().getCriterion()).getFromHour();
                    		return StringExtensions.toBulkString(hour);
                    	} 
                    	return null;
                    }
                },
                new BiConsumer<String, BulkAdGroupDayTimeCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupDayTimeCriterion c) {
                    	if (c.getBiddableAdGroupCriterion().getCriterion() instanceof DayTimeCriterion) {
                    		
	                		((DayTimeCriterion)c.getBiddableAdGroupCriterion().getCriterion()).setFromHour(StringExtensions.parseOptional(v, new Function<String, Integer>() {
	                                @Override
	                                public Integer apply(String s) {
	                                    return Integer.parseInt(s);
	                                }
	                            }));
                    	}
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroupDayTimeCriterion, String>(StringTable.ToHour,
                new Function<BulkAdGroupDayTimeCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupDayTimeCriterion c) { 
                    	if (c.getBiddableAdGroupCriterion().getCriterion() instanceof DayTimeCriterion) {
                    		Integer hour = ((DayTimeCriterion) c.getBiddableAdGroupCriterion().getCriterion()).getToHour();
                    		return StringExtensions.toBulkString(hour);
                    	} 
                    	return null;
                    }
                },
                new BiConsumer<String, BulkAdGroupDayTimeCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupDayTimeCriterion c) {
                    	if (c.getBiddableAdGroupCriterion().getCriterion() instanceof DayTimeCriterion) {
                    		
	                		((DayTimeCriterion)c.getBiddableAdGroupCriterion().getCriterion()).setToHour(StringExtensions.parseOptional(v, new Function<String, Integer>() {
	                                @Override
	                                public Integer apply(String s) {
	                                    return Integer.parseInt(s);
	                                }
	                            }));
                    	}
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroupDayTimeCriterion, String>(StringTable.FromMinute,
                new Function<BulkAdGroupDayTimeCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupDayTimeCriterion c) { 
                    	if (c.getBiddableAdGroupCriterion().getCriterion() instanceof DayTimeCriterion) {
                    		Minute minute = ((DayTimeCriterion) c.getBiddableAdGroupCriterion().getCriterion()).getFromMinute();
                    		return minute == null ? null : StringExtensions.toMinuteBulkString(minute);
                    	} 
                    	return null;
                    }
                },
                new BiConsumer<String, BulkAdGroupDayTimeCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupDayTimeCriterion c) {
                    	if (c.getBiddableAdGroupCriterion().getCriterion() instanceof DayTimeCriterion) {
                    		
	                		((DayTimeCriterion)c.getBiddableAdGroupCriterion().getCriterion()).setFromMinute(StringExtensions.parseMinute(v));
                    	}
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroupDayTimeCriterion, String>(StringTable.ToMinute,
                new Function<BulkAdGroupDayTimeCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupDayTimeCriterion c) { 
                    	if (c.getBiddableAdGroupCriterion().getCriterion() instanceof DayTimeCriterion) {
                    		Minute minute = ((DayTimeCriterion) c.getBiddableAdGroupCriterion().getCriterion()).getToMinute();
                    		return minute == null ? null : StringExtensions.toMinuteBulkString(minute);
                    	} 
                    	return null;
                    }
                },
                new BiConsumer<String, BulkAdGroupDayTimeCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupDayTimeCriterion c) {
                    	if (c.getBiddableAdGroupCriterion().getCriterion() instanceof DayTimeCriterion) {
                    		
	                		((DayTimeCriterion)c.getBiddableAdGroupCriterion().getCriterion()).setToMinute(StringExtensions.parseMinute(v));
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
        
        DayTimeCriterion daytimeCriterion = new DayTimeCriterion();
        
    	adGroupCriterion.setCriterion(daytimeCriterion);
    	adGroupCriterion.getCriterion().setType(DayTimeCriterion.class.getSimpleName());
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
