package com.microsoft.bingads.v13.api.test.entities.data_exclusion.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.data_exclusion.BulkDataExclusionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkDataExclusion;
import com.microsoft.bingads.v13.campaignmanagement.DeviceType;

public class BulkDataExclusionReadFromRowValuesDeviceTypeTest extends BulkDataExclusionTest {

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
        this.<DeviceType>testReadProperty("Device Type", this.datum, this.expectedResult, new Function<BulkDataExclusion, DeviceType>() {
            @Override
            public DeviceType apply(BulkDataExclusion c) {
                return c.getDataExclusion().getDeviceTypeFilter();
            }
        });
    }
}
