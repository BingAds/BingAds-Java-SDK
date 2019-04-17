package com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.device.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.device.BulkAdGroupDeviceCriterionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupDeviceCriterion;

@RunWith(Parameterized.class)
public class BulkAdGroupDeviceCriterionWriteCampaignNameTest extends BulkAdGroupDeviceCriterionTest {

    @Parameterized.Parameter(value = 1)
    public String propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"123", "123"},
                        {"XXX YYY", "XXX YYY"},
                        {"", ""},
                        {null, null}
                }
        );
    }

    @Test
    public void testWrite() {
        testWriteProperty(
                "Campaign",
                datum,
                propertyValue,
                new BiConsumer<BulkAdGroupDeviceCriterion, String>() {
                    @Override
                    public void accept(BulkAdGroupDeviceCriterion c, String v) {
                        c.setCampaignName(v);
                    }
                }
        );
    }
}
