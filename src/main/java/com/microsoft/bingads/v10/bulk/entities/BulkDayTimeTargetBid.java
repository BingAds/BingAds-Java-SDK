package com.microsoft.bingads.v10.bulk.entities;

import com.microsoft.bingads.v10.bulk.entities.BulkTargetIdentifier;
import com.microsoft.bingads.v10.campaignmanagement.Day;
import com.microsoft.bingads.v10.campaignmanagement.DayTimeTargetBid;
import com.microsoft.bingads.v10.internal.bulk.StringExtensions;
import com.microsoft.bingads.v10.internal.bulk.StringTable;
import com.microsoft.bingads.v10.internal.bulk.BulkMapping;
import com.microsoft.bingads.v10.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v10.internal.bulk.RowValues;
import com.microsoft.bingads.v10.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This abstract base class provides properties that are shared by all bulk day and time target bid classes.
 */
abstract class BulkDayTimeTargetBid extends BulkTargetBid {

    private DayTimeTargetBid dayTimeTargetBid;

    /**
     * Reserved for internal use.
     */
    BulkDayTimeTargetBid(BulkTargetIdentifier identifier) {
        super(identifier);
    }
    
    private static final List<BulkMapping<BulkDayTimeTargetBid>> MAPPINGS;

    static {
        List<BulkMapping<BulkDayTimeTargetBid>> m = new ArrayList<BulkMapping<BulkDayTimeTargetBid>>();

        m.add(new SimpleBulkMapping<BulkDayTimeTargetBid, String>(StringTable.Target,
                new Function<BulkDayTimeTargetBid, String>() {
                    @Override
                    public String apply(BulkDayTimeTargetBid c) {
                        return c.getDayTimeTargetBid().getDay().value();
                    }
                },
                new BiConsumer<String, BulkDayTimeTargetBid>() {
                    @Override
                    public void accept(String v, BulkDayTimeTargetBid c) {
                        c.getDayTimeTargetBid().setDay(Day.fromValue(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkDayTimeTargetBid, Integer>(StringTable.FromHour,
                new Function<BulkDayTimeTargetBid, Integer>() {
                    @Override
                    public Integer apply(BulkDayTimeTargetBid c) {
                        return c.getDayTimeTargetBid().getFromHour();
                    }
                },
                new BiConsumer<String, BulkDayTimeTargetBid>() {
                    @Override
                    public void accept(String v, BulkDayTimeTargetBid c) {
                        c.getDayTimeTargetBid().setFromHour(Integer.parseInt(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkDayTimeTargetBid, Integer>(StringTable.ToHour,
                new Function<BulkDayTimeTargetBid, Integer>() {
                    @Override
                    public Integer apply(BulkDayTimeTargetBid c) {
                        return c.getDayTimeTargetBid().getToHour();
                    }
                },
                new BiConsumer<String, BulkDayTimeTargetBid>() {
                    @Override
                    public void accept(String v, BulkDayTimeTargetBid c) {
                        c.getDayTimeTargetBid().setToHour(Integer.parseInt(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkDayTimeTargetBid, String>(StringTable.FromMinute,
                new Function<BulkDayTimeTargetBid, String>() {
                    @Override
                    public String apply(BulkDayTimeTargetBid c) {
                        return StringExtensions.toMinuteBulkString(c.getDayTimeTargetBid().getFromMinute());
                    }
                },
                new BiConsumer<String, BulkDayTimeTargetBid>() {
                    @Override
                    public void accept(String v, BulkDayTimeTargetBid c) {
                        c.getDayTimeTargetBid().setFromMinute(StringExtensions.parseMinute(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkDayTimeTargetBid, String>(StringTable.ToMinute,
                new Function<BulkDayTimeTargetBid, String>() {
                    @Override
                    public String apply(BulkDayTimeTargetBid c) {
                        return StringExtensions.toMinuteBulkString(c.getDayTimeTargetBid().getToMinute());
                    }
                },
                new BiConsumer<String, BulkDayTimeTargetBid>() {
                    @Override
                    public void accept(String v, BulkDayTimeTargetBid c) {
                        c.getDayTimeTargetBid().setToMinute(StringExtensions.parseMinute(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkDayTimeTargetBid, Integer>(StringTable.BidAdjustment,
                new Function<BulkDayTimeTargetBid, Integer>() {
                    @Override
                    public Integer apply(BulkDayTimeTargetBid c) {
                        return c.getDayTimeTargetBid().getBidAdjustment();
                    }
                },
                new BiConsumer<String, BulkDayTimeTargetBid>() {
                    @Override
                    public void accept(String v, BulkDayTimeTargetBid c) {
                        c.getDayTimeTargetBid().setBidAdjustment(Integer.parseInt(v));
                    }
                }
        ));
        
        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        setDayTimeTargetBid(new DayTimeTargetBid());
        
        super.processMappingsFromRowValues(values);
        
        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getDayTimeTargetBid(), "DayTimeTargetBid");
        
        super.processMappingsToRowValues(values, excludeReadonlyData);
        
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    /**
     * Gets a specific day of the week and time range to target.
     */
    public DayTimeTargetBid getDayTimeTargetBid() {
        return dayTimeTargetBid;
    }

    /**
     * Sets a specific day of the week and time range to target.
     */
    public void setDayTimeTargetBid(DayTimeTargetBid dayTimeTargetBid) {
        this.dayTimeTargetBid = dayTimeTargetBid;
    }
}
