package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.bulk.entities.BulkTargetIdentifier;
import com.microsoft.bingads.campaignmanagement.GenderTargetBid;
import com.microsoft.bingads.campaignmanagement.GenderType;
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

/**
 * This abstract base class provides properties that are shared by all bulk gender target bid classes.
 */
abstract class BulkGenderTargetBid extends BulkTargetBid {

    private GenderTargetBid genderTargetBid;

    /**
     * Reserved for internal use.
     */
    BulkGenderTargetBid(BulkTargetIdentifier identifier) {
        super(identifier);
    }
    
    private static final List<BulkMapping<BulkGenderTargetBid>> MAPPINGS;

    static {
        List<BulkMapping<BulkGenderTargetBid>> m = new ArrayList<BulkMapping<BulkGenderTargetBid>>();

        m.add(new SimpleBulkMapping<BulkGenderTargetBid, String>(StringTable.Target,
                new Function<BulkGenderTargetBid, String>() {
                    @Override
                    public String apply(BulkGenderTargetBid c) {
                        return c.getGenderTargetBid().getGender().value();
                    }
                },
                new BiConsumer<String, BulkGenderTargetBid>() {
                    @Override
                    public void accept(String v, BulkGenderTargetBid c) {
                        c.getGenderTargetBid().setGender(GenderType.fromValue(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkGenderTargetBid, Integer>(StringTable.BidAdjustment,
                new Function<BulkGenderTargetBid, Integer>() {
                    @Override
                    public Integer apply(BulkGenderTargetBid c) {
                        return c.getGenderTargetBid().getBidAdjustment();
                    }
                },
                new BiConsumer<String, BulkGenderTargetBid>() {
                    @Override
                    public void accept(String v, BulkGenderTargetBid c) {
                        c.getGenderTargetBid().setBidAdjustment(Integer.parseInt(v));
                    }
                }
        ));
        
        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        setGenderTargetBid(new GenderTargetBid());
        
        super.processMappingsFromRowValues(values);
        
        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getGenderTargetBid(), "GenderTargetBid");
        
        super.processMappingsToRowValues(values, excludeReadonlyData);
        
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    /**
     * Gets a specific gender target.
     */
    public GenderTargetBid getGenderTargetBid() {
        return genderTargetBid;
    }

    /**
     * Sets a specific gender target.
     */
    public void setGenderTargetBid(GenderTargetBid genderTargetBid) {
        this.genderTargetBid = genderTargetBid;
    }
}
