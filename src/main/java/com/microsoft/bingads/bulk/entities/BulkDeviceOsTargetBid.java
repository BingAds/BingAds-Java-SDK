/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.campaignmanagement.ArrayOfstring;
import com.microsoft.bingads.campaignmanagement.DeviceOSTargetBid;
import com.microsoft.bingads.internal.StringExtensions;
import com.microsoft.bingads.internal.StringTable;
import com.microsoft.bingads.internal.bulk.file.RowValues;
import com.microsoft.bingads.internal.bulk.mapping.BulkMapping;
import com.microsoft.bingads.internal.bulk.mapping.MappingHelpers;
import com.microsoft.bingads.internal.bulk.mapping.SimpleBulkMapping;
import com.microsoft.bingads.internal.functionalInterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalInterfaces.Function;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

abstract class BulkDeviceOsTargetBid extends BulkTargetBid {

    private DeviceOSTargetBid deviceOsTargetBid;

    BulkDeviceOsTargetBid(BulkTargetIdentifier identifier) {
        super(identifier);
    }

    private static final List<BulkMapping<BulkDeviceOsTargetBid>> MAPPINGS;

    static {
        List<BulkMapping<BulkDeviceOsTargetBid>> m = new ArrayList<BulkMapping<BulkDeviceOsTargetBid>>();

        m.add(new SimpleBulkMapping<BulkDeviceOsTargetBid, String>(StringTable.Target,
                new Function<BulkDeviceOsTargetBid, String>() {
                    @Override
                    public String apply(BulkDeviceOsTargetBid c) {
                        return c.getDeviceOsTargetBid().getDeviceName();
                    }
                },
                new BiConsumer<String, BulkDeviceOsTargetBid>() {
                    @Override
                    public void accept(String v, BulkDeviceOsTargetBid c) {
                        c.getDeviceOsTargetBid().setDeviceName(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkDeviceOsTargetBid, String>(StringTable.OsNames,
                new Function<BulkDeviceOsTargetBid, String>() {
                    @Override
                    public String apply(BulkDeviceOsTargetBid c) {
                        return c.getDeviceOsTargetBid().getOSNames() != null
                                ? StringExtensions.join(";", c.getDeviceOsTargetBid().getOSNames().getStrings())
                                : null;
                    }
                },
                new BiConsumer<String, BulkDeviceOsTargetBid>() {
                    @Override
                    public void accept(String v, BulkDeviceOsTargetBid c) {
                        if (!StringExtensions.isNullOrEmpty(v)) {
                            ArrayOfstring nameArray = new ArrayOfstring();

                            //TODO: implement RemoveEmptyEntries
                            nameArray.getStrings().addAll(Arrays.asList(v.split(";")));

                            c.getDeviceOsTargetBid().setOSNames(nameArray);
                        } else {
                            c.getDeviceOsTargetBid().setOSNames(null);
                        }
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkDeviceOsTargetBid, Integer>(StringTable.BidAdjustment,
                new Function<BulkDeviceOsTargetBid, Integer>() {
                    @Override
                    public Integer apply(BulkDeviceOsTargetBid c) {
                        return c.getDeviceOsTargetBid().getBidAdjustment();
                    }
                },
                new BiConsumer<String, BulkDeviceOsTargetBid>() {
                    @Override
                    public void accept(String v, BulkDeviceOsTargetBid c) {
                        c.getDeviceOsTargetBid().setBidAdjustment(Integer.parseInt(v));
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        setDeviceOsTargetBid(new DeviceOSTargetBid());

        super.processMappingsFromRowValues(values);

        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values) {
        validatePropertyNotNull(getDeviceOsTargetBid(), "DeviceOsTargetBid");

        super.processMappingsToRowValues(values);

        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    public DeviceOSTargetBid getDeviceOsTargetBid() {
        return deviceOsTargetBid;
    }

    public void setDeviceOsTargetBid(DeviceOSTargetBid deviceTargetBid) {
        this.deviceOsTargetBid = deviceTargetBid;
    }
}
