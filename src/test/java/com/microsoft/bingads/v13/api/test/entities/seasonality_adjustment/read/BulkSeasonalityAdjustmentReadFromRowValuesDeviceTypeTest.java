package com.microsoft.bingads.v13.api.test.entities.seasonality_adjustment.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.seasonality_adjustment.BulkSeasonalityAdjustmentTest;
import com.microsoft.bingads.v13.bulk.entities.BulkSeasonalityAdjustment;
import com.microsoft.bingads.v13.campaignmanagement.DeviceType;

public class BulkSeasonalityAdjustmentReadFromRowValuesDeviceTypeTest extends BulkSeasonalityAdjustmentTest {

    @Parameter(value = 1)
    public DeviceType expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Computers", DeviceType.COMPUTERS},
            {"Tablets", DeviceType.TABLETS},
            {"", null},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<DeviceType>testReadProperty("Device Type", this.datum, this.expectedResult, new Function<BulkSeasonalityAdjustment, DeviceType>() {
            @Override
            public DeviceType apply(BulkSeasonalityAdjustment c) {
                return c.getSeasonalityAdjustment().getDeviceTypeFilter();
            }
        });
    }
}
