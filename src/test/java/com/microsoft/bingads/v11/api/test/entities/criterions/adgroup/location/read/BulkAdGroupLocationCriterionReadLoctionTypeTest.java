package com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.location.read;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.location.BulkAdGroupLocationCriterionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupLocationCriterion;
import com.microsoft.bingads.v11.campaignmanagement.LocationCriterion;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class BulkAdGroupLocationCriterionReadLoctionTypeTest extends BulkAdGroupLocationCriterionTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
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
    public void testRead() {
        testReadProperty(
                "Sub Type",
                datum,
                expectedResult,
                new Function<BulkAdGroupLocationCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupLocationCriterion c) {
                        return ((LocationCriterion)c.getAdGroupCriterion().getCriterion()).getLocationType();
                    }
                }
        );
    }
}
