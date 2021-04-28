package com.microsoft.bingads.v13.api.test.entities.ad_extension.video.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.DateComparer;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.video.BulkVideoAdExtensionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkVideoAdExtension;
import com.microsoft.bingads.v13.campaignmanagement.Date;

public class BulkVideoAdExtensionReadFromRowValuesStartDateTest extends BulkVideoAdExtensionTest {

    @Parameter(value = 1)
    public Date expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
    	Date date = new Date();
        date.setDay(12);
        date.setMonth(11);
        date.setYear(2013);
        return Arrays.asList(new Object[][]{
                {"11/12/2013", date}
        });
    }

    @Test
    public void testRead() {         	
    	this.<Date>testReadProperty("Start Date", this.datum, this.expectedResult, new Function<BulkVideoAdExtension, Date>() {
            @Override
            public Date apply(BulkVideoAdExtension c) {
                return c.getVideoAdExtension().getScheduling().getStartDate();
            }
        }, new Supplier<BulkVideoAdExtension>() {
            @Override
            public BulkVideoAdExtension get() {
                return new BulkVideoAdExtension();
            }
        }, new DateComparer());
    }
}
