package com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.hotelcheckindate.read;

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
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.hotelcheckindate.BulkAdGroupHotelCheckInDateTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupHotelCheckInDateCriterion;
import com.microsoft.bingads.v13.campaignmanagement.HotelCheckInDateCriterion;

@RunWith(Parameterized.class)
public class BulkAdGroupHotelCheckInDateCriterionReadStartDateTest extends BulkAdGroupHotelCheckInDateTest {

    @Parameter(value = 1)
    public Calendar expectedResult;

    @Parameters
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
    public void testRead() {
        testReadProperty("Min Target Value", datum, expectedResult, new Function<BulkAdGroupHotelCheckInDateCriterion, Calendar>() {
            @Override
            public Calendar apply(BulkAdGroupHotelCheckInDateCriterion c) {
                return ((HotelCheckInDateCriterion) c.getBiddableAdGroupCriterion().getCriterion()).getStartDate();
            }
        });
    }
}
