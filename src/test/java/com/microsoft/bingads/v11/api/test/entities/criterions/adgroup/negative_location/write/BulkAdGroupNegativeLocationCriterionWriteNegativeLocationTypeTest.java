package com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.negative_location.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.negative_location.BulkAdGroupNegativeLocationCriterionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupNegativeLocationCriterion;
import com.microsoft.bingads.v11.campaignmanagement.LocationCriterion;

@RunWith(Parameterized.class)
public class BulkAdGroupNegativeLocationCriterionWriteNegativeLocationTypeTest extends BulkAdGroupNegativeLocationCriterionTest {

    @Parameterized.Parameter(value = 1)
    public String propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                	{"Test", "Test"},
                    {"", ""},
                    {null, null}
                }
        );
    }

    @Test
    public void testWrite() {
        testWriteProperty(
                "Sub Type",
                datum,
                propertyValue,
                new BiConsumer<BulkAdGroupNegativeLocationCriterion, String>() {
                    @Override
                    public void accept(BulkAdGroupNegativeLocationCriterion c, String v) {
                        ((LocationCriterion)c.getNegativeAdGroupCriterion().getCriterion()).setLocationType(v);
                    }
                }
        );
    }
}
