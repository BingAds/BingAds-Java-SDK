package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.bulk.entities.BulkTargetIdentifier;
import com.microsoft.bingads.campaignmanagement.Day;
import com.microsoft.bingads.campaignmanagement.DayTimeTargetBid;
import com.microsoft.bingads.internal.StringExtensions;
import com.microsoft.bingads.internal.StringTable;
import com.microsoft.bingads.internal.bulk.BulkMapping;
import com.microsoft.bingads.internal.bulk.MappingHelpers;
import com.microsoft.bingads.internal.bulk.RowValues;
import com.microsoft.bingads.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

abstract class BulkDayTimeTargetBid extends BulkTargetBid {

    private DayTimeTargetBid dayTimeTargetBid;
    
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
    public void processMappingsToRowValues(RowValues values) {
        validatePropertyNotNull(getDayTimeTargetBid(), "DayTimeTargetBid");
        
        super.processMappingsToRowValues(values);
        
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }        
    
    public DayTimeTargetBid getDayTimeTargetBid() {
        return dayTimeTargetBid;
    }

    public void setDayTimeTargetBid(DayTimeTargetBid dayTimeTargetBid) {
        this.dayTimeTargetBid = dayTimeTargetBid;
    }
}
