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
public class BulkAdGroupDayTimeCriterion extends BulkAdGroupBiddableCriterion {
	
	private static final List<BulkMapping<BulkAdGroupDayTimeCriterion>> MAPPINGS;

    static {
        List<BulkMapping<BulkAdGroupDayTimeCriterion>> m = new ArrayList<BulkMapping<BulkAdGroupDayTimeCriterion>>();
        
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
