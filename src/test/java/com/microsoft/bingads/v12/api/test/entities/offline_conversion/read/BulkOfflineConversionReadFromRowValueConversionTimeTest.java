package com.microsoft.bingads.v12.api.test.entities.offline_conversion.read;

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
import com.microsoft.bingads.v12.api.test.entities.offline_conversion.BulkOfflineConversionTest;
import com.microsoft.bingads.v12.bulk.entities.BulkOfflineConversion;

@RunWith(Parameterized.class)
public class BulkOfflineConversionReadFromRowValueConversionTimeTest extends BulkOfflineConversionTest {

    @Parameter(value = 1)
    public Calendar expectedResult;

    @Parameters
    public static Collection<Object[]> data() throws ParseException {
        String timeString = "02/01/2014 12:24:30";
        
        GregorianCalendar expetedSyncTime = new GregorianCalendar();
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        format.setTimeZone(TimeZone.getTimeZone("UTC"));
        expetedSyncTime.setTime(format.parse(timeString));
        
        return Arrays.asList(new Object[][]{
            {timeString, expetedSyncTime},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<Calendar>testReadProperty("Conversion Time", this.datum, this.expectedResult, new Function<BulkOfflineConversion, Calendar>() {
            @Override
            public Calendar apply(BulkOfflineConversion c) {
                return c.getOfflineConversion().getConversionTime();
            }
        });
    }
}
