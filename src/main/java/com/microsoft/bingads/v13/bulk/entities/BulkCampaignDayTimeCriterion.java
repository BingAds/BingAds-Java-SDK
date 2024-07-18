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
import com.microsoft.bingads.v13.campaignmanagement.Criterion;
import com.microsoft.bingads.v13.campaignmanagement.Day;
import com.microsoft.bingads.v13.campaignmanagement.DayTimeCriterion;
import com.microsoft.bingads.v13.campaignmanagement.Minute;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;

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
public class BulkCampaignDayTimeCriterion extends BulkCampaignBiddableCriterion {
	
	private static final List<BulkMapping<BulkCampaignDayTimeCriterion>> MAPPINGS;

    static {
        List<BulkMapping<BulkCampaignDayTimeCriterion>> m = new ArrayList<BulkMapping<BulkCampaignDayTimeCriterion>>();
        
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
	                                    return StringExtensions.fromValueOptional(s, Day.class);
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
    	super.processMappingsFromRowValues(values);
    	MappingHelpers.convertToEntity(values, MAPPINGS, this);   
    }
    
    @Override
    protected Criterion createCriterion() {
        return new DayTimeCriterion();
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        super.processMappingsToRowValues(values, excludeReadonlyData);
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }
}
