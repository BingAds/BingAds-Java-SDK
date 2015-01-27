package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.bulk.entities.BulkTargetIdentifier;
import com.microsoft.bingads.campaignmanagement.IntentOption;
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

abstract class BulkLocationTargetBid extends BulkLocationTargetBidWithStringLocation {

    private int bidAdjustment;

    private IntentOption intentOption;

    BulkLocationTargetBid(BulkTargetIdentifier identifier) {
        super(identifier);
    }

    private static final List<BulkMapping<BulkLocationTargetBid>> MAPPINGS;

    static {
        List<BulkMapping<BulkLocationTargetBid>> m = new ArrayList<BulkMapping<BulkLocationTargetBid>>();

        m.add(new SimpleBulkMapping<BulkLocationTargetBid, Integer>(StringTable.BidAdjustment,
                new Function<BulkLocationTargetBid, Integer>() {
                    @Override
                    public Integer apply(BulkLocationTargetBid c) {
                        return c.getBidAdjustment();
                    }
                },
                new BiConsumer<String, BulkLocationTargetBid>() {
                    @Override
                    public void accept(String v, BulkLocationTargetBid c) {
                        c.setBidAdjustment(Integer.parseInt(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkLocationTargetBid, String>(StringTable.PhysicalIntent,
                new Function<BulkLocationTargetBid, String>() {
                    @Override
                    public String apply(BulkLocationTargetBid c) {
                        return c.getIntentOption() != null ? c.getIntentOption().value() : null;
                    }
                },
                new BiConsumer<String, BulkLocationTargetBid>() {
                    @Override
                    public void accept(String v, BulkLocationTargetBid c) {
                        c.setIntentOption(StringExtensions.parseOptional(v, new Function<String, IntentOption>() {
                            @Override
                            public IntentOption apply(String value) {
                                return IntentOption.fromValue(value);
                            }
                        }));
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
    public void processMappingsToRowValues(RowValues values) {
        super.processMappingsToRowValues(values);

        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    public int getBidAdjustment() {
        return bidAdjustment;
    }

    public void setBidAdjustment(int bidAdjustment) {
        this.bidAdjustment = bidAdjustment;
    }
    
    public IntentOption getIntentOption() {
        return intentOption;
    }

    void setIntentOption(IntentOption intentOption) {
        this.intentOption = intentOption;
    }
}
