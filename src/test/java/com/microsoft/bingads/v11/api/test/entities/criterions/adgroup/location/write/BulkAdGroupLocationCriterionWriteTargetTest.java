package com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.location.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.location.BulkAdGroupLocationCriterionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupLocationCriterion;
import com.microsoft.bingads.v11.campaignmanagement.LocationCriterion;

@RunWith(Parameterized.class)
public class BulkAdGroupLocationCriterionWriteTargetTest extends BulkAdGroupLocationCriterionTest {

    @Parameterized.Parameter(value = 1)
    public Long propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                	{"12", 12L},
                    {"23", 23L},
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
                new BiConsumer<BulkAdGroupLocationCriterion, Long>() {
                    @Override
                    public void accept(BulkAdGroupLocationCriterion c, Long v) {
                        ((LocationCriterion)c.getBiddableAdGroupCriterion().getCriterion()).setLocationId(v);
                    }
                }
        );
    }
}
