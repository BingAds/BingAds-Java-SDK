package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.bulk.entities.BulkTargetIdentifier;
import com.microsoft.bingads.campaignmanagement.ArrayOfstring;
import com.microsoft.bingads.campaignmanagement.DeviceOSTargetBid;
import com.microsoft.bingads.internal.StringExtensions;
import com.microsoft.bingads.internal.StringTable;
import com.microsoft.bingads.internal.bulk.BulkMapping;
import com.microsoft.bingads.internal.bulk.MappingHelpers;
import com.microsoft.bingads.internal.bulk.RowValues;
import com.microsoft.bingads.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * This abstract base class provides properties that are shared by all bulk device OS target bid classes.
 */
abstract class BulkDeviceOsTargetBid extends BulkTargetBid {

    private DeviceOSTargetBid deviceOsTargetBid;

    /**
     * Reserved for internal use.
     */
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
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getDeviceOsTargetBid(), "DeviceOsTargetBid");

        super.processMappingsToRowValues(values, excludeReadonlyData);

        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    /**
     * Gets a specific device to target.
     */
    public DeviceOSTargetBid getDeviceOsTargetBid() {
        return deviceOsTargetBid;
    }

    /**
     * Sets a specific device to target.
     */
    public void setDeviceOsTargetBid(DeviceOSTargetBid deviceTargetBid) {
        this.deviceOsTargetBid = deviceTargetBid;
    }
}
