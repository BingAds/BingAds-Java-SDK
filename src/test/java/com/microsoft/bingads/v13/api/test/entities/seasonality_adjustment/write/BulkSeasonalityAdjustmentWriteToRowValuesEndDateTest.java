package com.microsoft.bingads.v13.api.test.entities.seasonality_adjustment.write;

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
import com.microsoft.bingads.v13.api.test.entities.seasonality_adjustment.BulkSeasonalityAdjustmentTest;
import com.microsoft.bingads.v13.bulk.entities.BulkSeasonalityAdjustment;

@RunWith(Parameterized.class)
public class BulkSeasonalityAdjustmentWriteToRowValuesEndDateTest extends BulkSeasonalityAdjustmentTest {

    @Parameter(value = 1)
    public Calendar propertyValue;

    @Parameters
    public static Collection<Object[]> data() throws ParseException {

        String timeString = "2017/07/06 22:34:30";

        GregorianCalendar expectedSyncTime = new GregorianCalendar();
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        format.setTimeZone(TimeZone.getTimeZone("UTC"));
        expectedSyncTime.setTime(format.parse(timeString));

        return Arrays.asList(new Object[][]{
                {timeString, expectedSyncTime},
                {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<Calendar>testWriteProperty("End Date", this.datum, this.propertyValue, new BiConsumer<BulkSeasonalityAdjustment, Calendar>() {
            @Override
            public void accept(BulkSeasonalityAdjustment c, Calendar v) {
                c.getSeasonalityAdjustment().setEndDate(v);
            }
        });
    }
}
