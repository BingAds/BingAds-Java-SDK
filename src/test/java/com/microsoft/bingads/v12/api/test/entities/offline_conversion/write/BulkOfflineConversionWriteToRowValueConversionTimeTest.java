package com.microsoft.bingads.v12.api.test.entities.offline_conversion.write;

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

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v12.api.test.entities.offline_conversion.BulkOfflineConversionTest;
import com.microsoft.bingads.v12.bulk.entities.BulkOfflineConversion;

@RunWith(Parameterized.class)
public class BulkOfflineConversionWriteToRowValueConversionTimeTest extends BulkOfflineConversionTest {

    @Parameter(value = 1)
    public Calendar propertyValue;

    @Parameters
    public static Collection<Object[]> data() throws ParseException {

        String timeString = "07/06/2017 22:34:30";

        GregorianCalendar expectedSyncTime = new GregorianCalendar();
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        format.setTimeZone(TimeZone.getTimeZone("UTC"));
        expectedSyncTime.setTime(format.parse(timeString));

        return Arrays.asList(new Object[][]{
                {timeString, expectedSyncTime},
                {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<Calendar>testWriteProperty("Conversion Time", this.datum, this.propertyValue, new BiConsumer<BulkOfflineConversion, Calendar>() {
            @Override
            public void accept(BulkOfflineConversion c, Calendar v) {
                c.getOfflineConversion().setConversionTime(v);
            }
        });
    }
}
