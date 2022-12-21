package com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.hoteladvancebookingwindow.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.hoteladvancebookingwindow.BulkAdGroupHotelAdvanceBookingWindowCriterionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupHotelAdvanceBookingWindowCriterion;
import com.microsoft.bingads.v13.campaignmanagement.HotelAdvanceBookingWindowCriterion;

@RunWith(Parameterized.class)
public class BulkAdGroupHotelAdvanceBookingWindowCriterionReadMinDaysTest extends BulkAdGroupHotelAdvanceBookingWindowCriterionTest {

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
        testReadProperty("Min Target Value", datum, expectedResult, new Function<BulkAdGroupHotelAdvanceBookingWindowCriterion, Integer>() {
            @Override
            public Integer apply(BulkAdGroupHotelAdvanceBookingWindowCriterion c) {
                return ((HotelAdvanceBookingWindowCriterion) c.getBiddableAdGroupCriterion().getCriterion()).getMinDays();
            }
        });
    }
}
