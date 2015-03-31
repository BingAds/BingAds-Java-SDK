package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.bulk.entities.BulkTargetIdentifier;
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
 * This abstract base class provides properties that are shared by
 * all bulk location target bid classes defining Location as string.
 */
abstract class BulkLocationTargetBidWithStringLocation extends BulkTargetBid {

    private String location;

    private LocationTargetType locationType;

    /**
     * Reserved for internal use.
     */
    BulkLocationTargetBidWithStringLocation(BulkTargetIdentifier identifier) {
        super(identifier);
    }

    private static final List<BulkMapping<BulkLocationTargetBidWithStringLocation>> MAPPINGS;

    static {
        List<BulkMapping<BulkLocationTargetBidWithStringLocation>> m = new ArrayList<BulkMapping<BulkLocationTargetBidWithStringLocation>>();

        m.add(new SimpleBulkMapping<BulkLocationTargetBidWithStringLocation, String>(StringTable.Target,
                new Function<BulkLocationTargetBidWithStringLocation, String>() {
                    @Override
                    public String apply(BulkLocationTargetBidWithStringLocation c) {
                        return c.getLocation();
                    }
                },
                new BiConsumer<String, BulkLocationTargetBidWithStringLocation>() {
                    @Override
                    public void accept(String v, BulkLocationTargetBidWithStringLocation c) {
                        c.setLocation(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkLocationTargetBidWithStringLocation, String>(StringTable.SubType,
                new Function<BulkLocationTargetBidWithStringLocation, String>() {
                    @Override
                    public String apply(BulkLocationTargetBidWithStringLocation c) {
                        return StringExtensions.toLocationTargetTypeBulkString(c.getLocationType());
                    }
                },
                new BiConsumer<String, BulkLocationTargetBidWithStringLocation>() {
                    @Override
                    public void accept(String v, BulkLocationTargetBidWithStringLocation c) {
                        c.setLocationType(StringExtensions.parseLocationTargetType(v));
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
     * Gets the geographical location code.
     *
     * <p>
     *     Corresponds to the 'Target' field in the bulk file.
     * </p>
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the geographical location code.
     *
     * <p>
     *     Corresponds to the 'Target' field in the bulk file.
     * </p>
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Gets the sub location target type.
     *
     * <p>
     *     Corresponds to the 'Sub Type' field in the bulk file.
     * </p>
     */
    public LocationTargetType getLocationType() {
        return locationType;
    }

    /**
     * Sets the sub location target type.
     *
     * <p>
     *     Corresponds to the 'Sub Type' field in the bulk file.
     * </p>
     */
    public void setLocationType(LocationTargetType locationType) {
        this.locationType = locationType;
    }
}
