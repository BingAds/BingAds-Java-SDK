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

/**
 * This abstract base class provides properties that are shared by all bulk location target bid classes.
 */
abstract class BulkLocationTargetBid extends BulkLocationTargetBidWithStringLocation {

    private int bidAdjustment;

    private IntentOption intentOption;

    /**
     * Reserved for internal use.
     */
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
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        super.processMappingsToRowValues(values, excludeReadonlyData);

        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    /**
     * Gets the percentage adjustment to the base bid.
     *
     * <p>
     *     Corresponds to the 'Bid Adjustment' field in the bulk file.
     * </p>
     */
    public int getBidAdjustment() {
        return bidAdjustment;
    }

    /**
     * Sets the percentage adjustment to the base bid.
     *
     * <p>
     *     Corresponds to the 'Bid Adjustment' field in the bulk file.
     * </p>
     */
    public void setBidAdjustment(int bidAdjustment) {
        this.bidAdjustment = bidAdjustment;
    }

    /**
     * Gets the possible intent options for location targeting.
     */
    public IntentOption getIntentOption() {
        return intentOption;
    }

    /**
     * Sets the possible intent options for location targeting.
     */
    void setIntentOption(IntentOption intentOption) {
        this.intentOption = intentOption;
    }
}
