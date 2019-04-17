package com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.device.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.device.BulkAdGroupDeviceCriterionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupDeviceCriterion;
import com.microsoft.bingads.v13.campaignmanagement.DeviceCriterion;

@RunWith(Parameterized.class)
public class BulkAdGroupDeviceCriterionWriteOsNamesTest extends BulkAdGroupDeviceCriterionTest {

    @Parameterized.Parameter(value = 1)
    public String propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                	{"Linux", "Linux"},
                    {"Windows", "Windows"},
                    {"", ""},
                    {null, null}
                }
        );
    }

    @Test
    public void testWrite() {
        testWriteProperty(
                "OS Names",
                datum,
                propertyValue,
                new BiConsumer<BulkAdGroupDeviceCriterion, String>() {
                    @Override
                    public void accept(BulkAdGroupDeviceCriterion c, String v) {
                        ((DeviceCriterion)c.getBiddableAdGroupCriterion().getCriterion()).setOSName(v);
                    }
                }
        );
    }
}
