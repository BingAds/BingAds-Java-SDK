package com.microsoft.bingads.v13.api.test.entities.seasonality_adjustment.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.seasonality_adjustment.BulkSeasonalityAdjustmentTest;
import com.microsoft.bingads.v13.bulk.entities.BulkSeasonalityAdjustment;
import com.microsoft.bingads.v13.campaignmanagement.DeviceType;

@RunWith(Parameterized.class)
public class BulkSeasonalityAdjustmentWriteToRowValuesDeviceTypeTest extends BulkSeasonalityAdjustmentTest {

    @Parameter(value = 1)
    public Collection<DeviceType> propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
        	{"Computers,Tablets", Arrays.asList(new DeviceType[] { DeviceType.COMPUTERS, DeviceType.TABLETS })},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<Collection<DeviceType>> testWriteProperty("Device Type", this.datum, this.propertyValue, new BiConsumer<BulkSeasonalityAdjustment, Collection<DeviceType>>() {
            @Override
            public void accept(BulkSeasonalityAdjustment c, Collection<DeviceType> v) {
                c.getSeasonalityAdjustment().setDeviceTypeFilter(v);
            }
        });
    }
}
