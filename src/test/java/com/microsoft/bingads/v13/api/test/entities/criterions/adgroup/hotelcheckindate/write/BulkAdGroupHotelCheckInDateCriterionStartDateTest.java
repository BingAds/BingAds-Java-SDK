package com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.hotelcheckindate.write;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.hotelcheckindate.BulkAdGroupHotelCheckInDateTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupHotelCheckInDateCriterion;
import com.microsoft.bingads.v13.campaignmanagement.HotelCheckInDateCriterion;

@RunWith(Parameterized.class)
public class BulkAdGroupHotelCheckInDateCriterionStartDateTest extends BulkAdGroupHotelCheckInDateTest {

    @Parameterized.Parameter(value = 1)
    public Calendar expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() throws ParseException {
        String timeString = "2014/02/01 12:24:30";
        
        GregorianCalendar expetedSyncTime = new GregorianCalendar();
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        format.setTimeZone(TimeZone.getTimeZone("UTC"));
        expetedSyncTime.setTime(format.parse(timeString));
        
        return Arrays.asList(new Object[][]{
            {timeString, expetedSyncTime},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        testWriteProperty(
                "Min Target Value",
                datum,
                expectedResult,
                new BiConsumer<BulkAdGroupHotelCheckInDateCriterion, Calendar>() {
                    @Override
                    public void accept(BulkAdGroupHotelCheckInDateCriterion c, Calendar v) {
                        ((HotelCheckInDateCriterion)c.getBiddableAdGroupCriterion().getCriterion()).setStartDate(v);
                    }
                }
        );
    }
}
