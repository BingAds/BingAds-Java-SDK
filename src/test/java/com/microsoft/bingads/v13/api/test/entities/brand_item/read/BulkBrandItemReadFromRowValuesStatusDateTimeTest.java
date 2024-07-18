package com.microsoft.bingads.v13.api.test.entities.brand_item.read;

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
import com.microsoft.bingads.v13.api.test.entities.brand_item.BulkBrandItemTest;
import com.microsoft.bingads.v13.bulk.entities.BulkBrandItem;

@RunWith(Parameterized.class)
public class BulkBrandItemReadFromRowValuesStatusDateTimeTest extends BulkBrandItemTest {

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
        this.<Calendar>testReadProperty("Editorial Status Date", this.datum, this.expectedResult, new Function<BulkBrandItem, Calendar>() {
            @Override
            public Calendar apply(BulkBrandItem c) {
                return c.getEditorialStatusDate();
            }
        });
    }
}
