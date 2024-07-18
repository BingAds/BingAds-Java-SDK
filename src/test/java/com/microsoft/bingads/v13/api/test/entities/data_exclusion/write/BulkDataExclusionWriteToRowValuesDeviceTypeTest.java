package com.microsoft.bingads.v13.api.test.entities.data_exclusion.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.data_exclusion.BulkDataExclusionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkDataExclusion;
import com.microsoft.bingads.v13.campaignmanagement.DeviceType;

@RunWith(Parameterized.class)
public class BulkDataExclusionWriteToRowValuesDeviceTypeTest extends BulkDataExclusionTest {

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
        this.<Collection<DeviceType>> testWriteProperty("Device Type", this.datum, this.propertyValue, new BiConsumer<BulkDataExclusion, Collection<DeviceType>>() {
            @Override
            public void accept(BulkDataExclusion c, Collection<DeviceType> v) {
                c.getDataExclusion().setDeviceTypeFilter(v);
            }
        });
    }
}
