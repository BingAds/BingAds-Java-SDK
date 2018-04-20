package com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.device.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.device.BulkAdGroupDeviceCriterionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupDeviceCriterion;
import com.microsoft.bingads.v11.campaignmanagement.DeviceCriterion;

@RunWith(Parameterized.class)
public class BulkAdGroupDeviceCriterionWriteTargetTest extends BulkAdGroupDeviceCriterionTest {

    @Parameterized.Parameter(value = 1)
    public String propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                	{"Computers", "Computers"},
                    {"Smartphones", "Smartphones"},
                    {"", ""},
                    {null, null}
                }
        );
    }

    @Test
    public void testWrite() {
        testWriteProperty(
                "Target",
                datum,
                propertyValue,
                new BiConsumer<BulkAdGroupDeviceCriterion, String>() {
                    @Override
                    public void accept(BulkAdGroupDeviceCriterion c, String v) {
                        ((DeviceCriterion)c.getBiddableAdGroupCriterion().getCriterion()).setDeviceName(v);
                    }
                }
        );
    }
}
