package com.microsoft.bingads.v11.api.test.entities.account.read;

import com.microsoft.bingads.v11.api.test.entities.account.BulkAccountTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAccount;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
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
public class BulkAccountReadFromRowValuesSyncTimeTest extends BulkAccountTest {

    @Parameter(value = 1)
    public Calendar expectedResult;

    /*
     * Test data generator.
     * This method is called the the JUnit parameterized test runner and
     * returns a Collection of Arrays.  For each Array in the Collection,
     * each array element corresponds to a parameter in the constructor.
     */
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
            {"", null},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<Calendar>testReadProperty("Sync Time", this.datum, this.expectedResult, new Function<BulkAccount, Calendar>() {
            @Override
            public Calendar apply(BulkAccount c) {
                return c.getSyncTime();
            }
        });
    }
}
