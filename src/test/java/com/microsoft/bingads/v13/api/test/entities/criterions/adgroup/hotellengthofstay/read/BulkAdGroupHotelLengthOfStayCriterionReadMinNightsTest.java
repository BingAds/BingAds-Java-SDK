package com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.hotellengthofstay.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.hotellengthofstay.BulkAdGroupHotelLengthOfStayCriterionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupHotelLengthOfStayCriterion;
import com.microsoft.bingads.v13.campaignmanagement.HotelLengthOfStayCriterion;

@RunWith(Parameterized.class)
public class BulkAdGroupHotelLengthOfStayCriterionReadMinNightsTest extends BulkAdGroupHotelLengthOfStayCriterionTest {

    @Parameter(value = 1)
    public int expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"0", 0},
            {"2147483647", Integer.MAX_VALUE}
        });
    }

    @Test
    public void testRead() {
        testReadProperty("Min Target Value", datum, expectedResult, new Function<BulkAdGroupHotelLengthOfStayCriterion, Integer>() {
            @Override
            public Integer apply(BulkAdGroupHotelLengthOfStayCriterion c) {
                return ((HotelLengthOfStayCriterion) c.getBiddableAdGroupCriterion().getCriterion()).getMinNights();
            }
        });
    }
}
