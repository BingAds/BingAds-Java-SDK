package com.microsoft.bingads.api.test.entities.account.write;

import com.microsoft.bingads.api.test.entities.account.BulkAccountTest;
import com.microsoft.bingads.bulk.entities.BulkAccount;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
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

@RunWith(Parameterized.class)
public class BulkAccountWriteToRowValuesSyncTimeTest extends BulkAccountTest {

    @Parameter(value = 1)
    public Calendar propertyValue;

    @Parameters
    public static Collection<Object[]> data() throws ParseException {
        // In this example, the parameter generator returns a List of
        // arrays.  Each array has two elements: { datum, expected }.
        // These data are hard-coded into the class, but they could be
        // generated or loaded in any way you like.

        String timeString = "02/01/2014 12:34:30";

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
    public void testWrite() {
        this.<Calendar>testWriteProperty("Sync Time", this.datum, this.propertyValue, new BiConsumer<BulkAccount, Calendar>() {
            @Override
            public void accept(BulkAccount c, Calendar v) {
                c.setSyncTime(v);
            }
        });
    }
}
