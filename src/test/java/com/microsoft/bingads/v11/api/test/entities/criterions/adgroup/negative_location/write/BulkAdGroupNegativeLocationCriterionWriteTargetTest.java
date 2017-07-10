package com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.negative_location.write;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.negative_location.BulkAdGroupNegativeLocationCriterionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupNegativeLocationCriterion;
import com.microsoft.bingads.v11.campaignmanagement.LocationCriterion;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class BulkAdGroupNegativeLocationCriterionWriteTargetTest extends BulkAdGroupNegativeLocationCriterionTest {

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
                new BiConsumer<BulkAdGroupNegativeLocationCriterion, Long>() {
                    @Override
                    public void accept(BulkAdGroupNegativeLocationCriterion c, Long v) {
                        ((LocationCriterion)c.getNegativeAdGroupCriterion().getCriterion()).setLocationId(v);
                    }
                }
        );
    }
}
