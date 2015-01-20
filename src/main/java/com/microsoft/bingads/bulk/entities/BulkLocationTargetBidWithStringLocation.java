/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.internal.StringExtensions;
import com.microsoft.bingads.internal.StringTable;
import com.microsoft.bingads.internal.bulk.file.RowValues;
import com.microsoft.bingads.internal.bulk.mapping.BulkMapping;
import com.microsoft.bingads.internal.bulk.mapping.MappingHelpers;
import com.microsoft.bingads.internal.bulk.mapping.SimpleBulkMapping;
import com.microsoft.bingads.internal.functionalInterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalInterfaces.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

abstract class BulkLocationTargetBidWithStringLocation extends BulkTargetBid {

    private String location;

    private LocationTargetType locationType;

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
    public void processMappingsToRowValues(RowValues values) {

        super.processMappingsToRowValues(values);

        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocationTargetType getLocationType() {
        return locationType;
    }

    public void setLocationType(LocationTargetType locationType) {
        this.locationType = locationType;
    }
}
