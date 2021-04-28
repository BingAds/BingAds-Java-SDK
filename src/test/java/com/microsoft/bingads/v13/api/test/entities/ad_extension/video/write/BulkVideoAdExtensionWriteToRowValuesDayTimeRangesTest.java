package com.microsoft.bingads.v13.api.test.entities.ad_extension.video.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.video.BulkVideoAdExtensionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkVideoAdExtension;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfDayTime;
import com.microsoft.bingads.v13.campaignmanagement.Day;
import com.microsoft.bingads.v13.campaignmanagement.DayTime;
import com.microsoft.bingads.v13.campaignmanagement.Minute;
import com.microsoft.bingads.v13.campaignmanagement.Schedule;

public class BulkVideoAdExtensionWriteToRowValuesDayTimeRangesTest extends BulkVideoAdExtensionTest {

    @Parameter(value = 1)
    public ArrayOfDayTime propertyValue;
    
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {null, null}
        });
    }

    @Test
    public void testWrite() {	   	
	    this.testWriteProperty("Ad Schedule", this.datum, this.propertyValue, new BiConsumer<BulkVideoAdExtension, ArrayOfDayTime>() {
	        @Override
	        public void accept(BulkVideoAdExtension c, ArrayOfDayTime v) {
	        	c.getVideoAdExtension().setScheduling(null);
	        }
	    });    	
    	
    	datum = "(Monday[00:15-05:30]);(Friday[12:15-23:00])";
    	
    	propertyValue = new ArrayOfDayTime();
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
    	
    	propertyValue.getDayTimes().add(dt1);
    	propertyValue.getDayTimes().add(dt2);
    	   	
        this.testWriteProperty("Ad Schedule", this.datum, this.propertyValue, new BiConsumer<BulkVideoAdExtension, ArrayOfDayTime>() {
            @Override
            public void accept(BulkVideoAdExtension c, ArrayOfDayTime v) {
            	c.getVideoAdExtension().setScheduling(new Schedule());
                c.getVideoAdExtension().getScheduling().setDayTimeRanges(v);
            }
        });
        
        datum = "delete_value";
    	propertyValue = new ArrayOfDayTime();
    	   	
        this.testWriteProperty("Ad Schedule", this.datum, this.propertyValue, new BiConsumer<BulkVideoAdExtension, ArrayOfDayTime>() {
            @Override
            public void accept(BulkVideoAdExtension c, ArrayOfDayTime v) {
            	c.getVideoAdExtension().setScheduling(new Schedule());
                c.getVideoAdExtension().getScheduling().setDayTimeRanges(v);
            }
        });
        
        datum = "delete_value";
    	propertyValue = null;
    	   	
        this.testWriteProperty("Ad Schedule", this.datum, this.propertyValue, new BiConsumer<BulkVideoAdExtension, ArrayOfDayTime>() {
            @Override
            public void accept(BulkVideoAdExtension c, ArrayOfDayTime v) {
            	c.getVideoAdExtension().setScheduling(new Schedule());
                c.getVideoAdExtension().getScheduling().setDayTimeRanges(v);
            }
        });
    }
}
