package com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.hotelcheckinday.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.hotelcheckinday.BulkAdGroupHotelCheckInDayCriterionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupHotelCheckInDayCriterion;
import com.microsoft.bingads.v13.campaignmanagement.Day;
import com.microsoft.bingads.v13.campaignmanagement.HotelCheckInDayCriterion;

@RunWith(Parameterized.class)
public class BulkAdGroupHotelCheckInDayCriterionReadTargetTest extends BulkAdGroupHotelCheckInDayCriterionTest {

    @Parameter(value = 1)
    public Day expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] { 
            { "Sunday", Day.SUNDAY }, 
            { "Saturday", Day.SATURDAY }, 
        });
    }

    @Test
    public void testRead() {
        testReadProperty("Target", datum, expectedResult, new Function<BulkAdGroupHotelCheckInDayCriterion, Day>() {
            @Override
            public Day apply(BulkAdGroupHotelCheckInDayCriterion c) {
                return ((HotelCheckInDayCriterion) c.getBiddableAdGroupCriterion().getCriterion()).getCheckInDay();
            }
        });
    }
}
