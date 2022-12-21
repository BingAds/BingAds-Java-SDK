package com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.hoteladvancebookingwindow.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.hoteladvancebookingwindow.BulkAdGroupHotelAdvanceBookingWindowCriterionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupHotelAdvanceBookingWindowCriterion;
import com.microsoft.bingads.v13.campaignmanagement.HotelAdvanceBookingWindowCriterion;

@RunWith(Parameterized.class)
public class BulkAdGroupHotelAdvanceBookingWindowCriterionMinDaysTest extends BulkAdGroupHotelAdvanceBookingWindowCriterionTest {

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
    public void testWrite() {
        testWriteProperty(
                "Min Target Value",
                datum,
                expectedResult,
                new BiConsumer<BulkAdGroupHotelAdvanceBookingWindowCriterion, Integer>() {
                    @Override
                    public void accept(BulkAdGroupHotelAdvanceBookingWindowCriterion c, Integer v) {
                        ((HotelAdvanceBookingWindowCriterion)c.getBiddableAdGroupCriterion().getCriterion()).setMinDays(v);
                    }
                }
        );
    }
}
