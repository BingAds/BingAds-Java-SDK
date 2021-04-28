package com.microsoft.bingads.v13.api.test.entities.ad_extension.video.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.video.BulkVideoAdExtensionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkVideoAdExtension;
import com.microsoft.bingads.v13.campaignmanagement.Date;
import com.microsoft.bingads.v13.campaignmanagement.Schedule;

public class BulkVideoAdExtensionWriteToRowValuesStartDateTest extends BulkVideoAdExtensionTest {

    @Parameter(value = 1)
    public Date propertyValue;
    
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"delete_value", null}
        });
    }

    @Test
    public void testWrite() {
    	this.testWriteProperty("Start Date", this.datum, this.propertyValue, new BiConsumer<BulkVideoAdExtension, Date>() {
            @Override
            public void accept(BulkVideoAdExtension c, Date v) {
            	c.getVideoAdExtension().setScheduling(new Schedule());
                c.getVideoAdExtension().getScheduling().setStartDate(new Date());
            }
        });
    	
    	datum = "2/13/2016";
    	propertyValue = new Date();
    	propertyValue.setMonth(2);
    	propertyValue.setDay(13);
    	propertyValue.setYear(2016);
    	   	
        this.testWriteProperty("Start Date", this.datum, this.propertyValue, new BiConsumer<BulkVideoAdExtension, Date>() {
            @Override
            public void accept(BulkVideoAdExtension c, Date v) {
            	c.getVideoAdExtension().setScheduling(new Schedule());
                c.getVideoAdExtension().getScheduling().setStartDate(v);
            }
        });
        
        datum = "delete_value";
    	propertyValue = null;
    	   	
        this.testWriteProperty("Start Date", this.datum, this.propertyValue, new BiConsumer<BulkVideoAdExtension, Date>() {
            @Override
            public void accept(BulkVideoAdExtension c, Date v) {
            	c.getVideoAdExtension().setScheduling(new Schedule());
                c.getVideoAdExtension().getScheduling().setStartDate(v);
            }
        });
        
        datum = null;
    	propertyValue = null;
    	   	
        this.testWriteProperty("Start Date", this.datum, this.propertyValue, new BiConsumer<BulkVideoAdExtension, Date>() {
            @Override
            public void accept(BulkVideoAdExtension c, Date v) {
            	c.getVideoAdExtension().setScheduling(null);
            }
        });
    }
}
