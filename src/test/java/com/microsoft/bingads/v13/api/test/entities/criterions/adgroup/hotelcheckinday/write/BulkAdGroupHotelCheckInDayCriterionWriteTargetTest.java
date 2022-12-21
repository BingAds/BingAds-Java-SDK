package com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.hotelcheckinday.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.hotelcheckinday.BulkAdGroupHotelCheckInDayCriterionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupHotelCheckInDayCriterion;
import com.microsoft.bingads.v13.campaignmanagement.Day;
import com.microsoft.bingads.v13.campaignmanagement.HotelCheckInDayCriterion;

@RunWith(Parameterized.class)
public class BulkAdGroupHotelCheckInDayCriterionWriteTargetTest extends BulkAdGroupHotelCheckInDayCriterionTest {

    @Parameterized.Parameter(value = 1)
    public Day propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                	{"Sunday", Day.SUNDAY},
                }
        );
    }

    @Test
    public void testWrite() {
        testWriteProperty(
                "Target",
                datum,
                propertyValue,
                new BiConsumer<BulkAdGroupHotelCheckInDayCriterion, Day>() {
                    @Override
                    public void accept(BulkAdGroupHotelCheckInDayCriterion c, Day v) {
                        ((HotelCheckInDayCriterion)c.getBiddableAdGroupCriterion().getCriterion()).setCheckInDay(v);
                    }
                }
        );
    }
}
