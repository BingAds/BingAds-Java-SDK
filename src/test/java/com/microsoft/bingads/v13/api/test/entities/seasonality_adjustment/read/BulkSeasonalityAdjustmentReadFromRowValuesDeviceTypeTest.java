package com.microsoft.bingads.v13.api.test.entities.seasonality_adjustment.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.ObjectComparer;
import com.microsoft.bingads.v13.api.test.entities.seasonality_adjustment.BulkSeasonalityAdjustmentTest;
import com.microsoft.bingads.v13.bulk.entities.BulkSeasonalityAdjustment;
import com.microsoft.bingads.v13.campaignmanagement.DeviceType;

public class BulkSeasonalityAdjustmentReadFromRowValuesDeviceTypeTest extends BulkSeasonalityAdjustmentTest {

    @Parameter(value = 1)
    public Collection<DeviceType> expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Computers,Tablets", Arrays.asList(new DeviceType[] { DeviceType.COMPUTERS, DeviceType.TABLETS })},
            {"", null},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<Collection<DeviceType>>testReadProperty("Device Type", this.datum, this.expectedResult, new Function<BulkSeasonalityAdjustment, Collection<DeviceType>>() {
            @Override
            public Collection<DeviceType> apply(BulkSeasonalityAdjustment c) {
                return c.getSeasonalityAdjustment().getDeviceTypeFilter();
            }
            
        }, new Supplier<BulkSeasonalityAdjustment>() {
            @Override
            public BulkSeasonalityAdjustment get() {
                return new BulkSeasonalityAdjustment();
            }
        }, new ObjectComparer<Collection<DeviceType>>());
    }
}
