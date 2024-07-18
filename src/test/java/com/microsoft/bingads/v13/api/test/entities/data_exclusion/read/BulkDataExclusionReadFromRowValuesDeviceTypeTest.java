package com.microsoft.bingads.v13.api.test.entities.data_exclusion.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.ObjectComparer;
import com.microsoft.bingads.v13.api.test.entities.data_exclusion.BulkDataExclusionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkDataExclusion;
import com.microsoft.bingads.v13.campaignmanagement.DeviceType;

public class BulkDataExclusionReadFromRowValuesDeviceTypeTest extends BulkDataExclusionTest {

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
        this.<Collection<DeviceType>>testReadProperty("Device Type", this.datum, this.expectedResult, new Function<BulkDataExclusion, Collection<DeviceType>>() {
            @Override
            public Collection<DeviceType> apply(BulkDataExclusion c) {
                return c.getDataExclusion().getDeviceTypeFilter();
            }
            
        }, new Supplier<BulkDataExclusion>() {
            @Override
            public BulkDataExclusion get() {
                return new BulkDataExclusion();
            }
        }, new ObjectComparer<Collection<DeviceType>>());
    }
}
