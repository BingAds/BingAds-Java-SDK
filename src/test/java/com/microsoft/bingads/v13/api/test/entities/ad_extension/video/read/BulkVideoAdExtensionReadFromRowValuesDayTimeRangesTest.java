package com.microsoft.bingads.v13.api.test.entities.ad_extension.video.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.DayTimeRangesComparer;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.video.BulkVideoAdExtensionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkVideoAdExtension;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfDayTime;
import com.microsoft.bingads.v13.campaignmanagement.Day;
import com.microsoft.bingads.v13.campaignmanagement.DayTime;
import com.microsoft.bingads.v13.campaignmanagement.Minute;

public class BulkVideoAdExtensionReadFromRowValuesDayTimeRangesTest extends BulkVideoAdExtensionTest {

    @Parameter(value = 1)
    public ArrayOfDayTime expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"", null},
                {null, null}
        });
    }

    @Test
    public void testRead() {
        this.testReadProperty("Ad Schedule", this.datum, this.expectedResult, new Function<BulkVideoAdExtension, ArrayOfDayTime>() {
            @Override
            public ArrayOfDayTime apply(BulkVideoAdExtension c) {
                return c.getVideoAdExtension().getScheduling().getDayTimeRanges();
            }
        });
        
        datum = "(Monday[00:15-05:30]);(Friday[12:15-23:00])";
    	
        expectedResult = new ArrayOfDayTime();
    	DayTime dt1 = new DayTime();
    	dt1.setDay(Day.MONDAY);
    	dt1.setStartHour(0);
    	dt1.setStartMinute(Minute.FIFTEEN);
    	dt1.setEndHour(5);
    	dt1.setEndMinute(Minute.THIRTY);
    	
    	DayTime dt2 = new DayTime();
    	dt2.setDay(Day.FRIDAY);
    	dt2.setStartHour(12);
    	dt2.setStartMinute(Minute.FIFTEEN);
    	dt2.setEndHour(23);
    	dt2.setEndMinute(Minute.ZERO);
    	
    	expectedResult.getDayTimes().add(dt1);
    	expectedResult.getDayTimes().add(dt2);
    	
    	this.testReadProperty("Ad Schedule", this.datum, this.expectedResult, new Function<BulkVideoAdExtension, ArrayOfDayTime>() {
            @Override
            public ArrayOfDayTime apply(BulkVideoAdExtension c) {
                return c.getVideoAdExtension().getScheduling().getDayTimeRanges();
            }
        }, new Supplier<BulkVideoAdExtension>() {
            @Override
            public BulkVideoAdExtension get() {
                return new BulkVideoAdExtension();
            }
        },new DayTimeRangesComparer());

    	
    	datum = "(Monday[00:15-05:30])";  	
        expectedResult = new ArrayOfDayTime();    	
    	expectedResult.getDayTimes().add(dt1);
    	
    	this.testReadProperty("Ad Schedule", this.datum, this.expectedResult, new Function<BulkVideoAdExtension, ArrayOfDayTime>() {
            @Override
            public ArrayOfDayTime apply(BulkVideoAdExtension c) {
                return c.getVideoAdExtension().getScheduling().getDayTimeRanges();
            }
        }, new Supplier<BulkVideoAdExtension>() {
            @Override
            public BulkVideoAdExtension get() {
                return new BulkVideoAdExtension();
            }
        },new DayTimeRangesComparer());
    }
}
