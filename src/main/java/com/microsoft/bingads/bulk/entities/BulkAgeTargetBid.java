package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.bulk.entities.BulkTargetIdentifier;
import com.microsoft.bingads.campaignmanagement.AgeRange;
import com.microsoft.bingads.campaignmanagement.AgeTargetBid;
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

abstract class BulkAgeTargetBid extends BulkTargetBid {

    private AgeTargetBid ageTargetBid;        
    
    BulkAgeTargetBid(BulkTargetIdentifier identifier) {
        super(identifier);
    }
    
    private static final List<BulkMapping<BulkAgeTargetBid>> MAPPINGS;

    static {
        List<BulkMapping<BulkAgeTargetBid>> m = new ArrayList<BulkMapping<BulkAgeTargetBid>>();

        m.add(new SimpleBulkMapping<BulkAgeTargetBid, String>(StringTable.Target,
                new Function<BulkAgeTargetBid, String>() {
                    @Override
                    public String apply(BulkAgeTargetBid c) {
                        return c.getAgeTargetBid().getAge().value();
                    }
                },
                new BiConsumer<String, BulkAgeTargetBid>() {
                    @Override
                    public void accept(String v, BulkAgeTargetBid c) {
                        c.getAgeTargetBid().setAge(AgeRange.fromValue(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAgeTargetBid, Integer>(StringTable.BidAdjustment,
                new Function<BulkAgeTargetBid, Integer>() {
                    @Override
                    public Integer apply(BulkAgeTargetBid c) {
                        return c.getAgeTargetBid().getBidAdjustment();
                    }
                },
                new BiConsumer<String, BulkAgeTargetBid>() {
                    @Override
                    public void accept(String v, BulkAgeTargetBid c) {
                        c.getAgeTargetBid().setBidAdjustment(Integer.parseInt(v));
                    }
                }
        ));
        
        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        setAgeTargetBid(new AgeTargetBid());
        
        super.processMappingsFromRowValues(values);
        
        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getAgeTargetBid(), "AgeTargetBid");
        
        super.processMappingsToRowValues(values, excludeReadonlyData);
        
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }        
    
    public AgeTargetBid getAgeTargetBid() {
        return ageTargetBid;
    }

    public void setAgeTargetBid(AgeTargetBid ageTargetBid) {
        this.ageTargetBid = ageTargetBid;
    }
}
