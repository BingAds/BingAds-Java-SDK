package com.microsoft.bingads.v11.api.test.entities.ad_extension.app.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v11.api.test.entities.DateComparer;
import com.microsoft.bingads.v11.api.test.entities.ad_extension.app.BulkAppAdExtensionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAppAdExtension;
import com.microsoft.bingads.v11.campaignmanagement.Date;

public class BulkAppAdExtensionReadFromRowValuesEndDateTest extends BulkAppAdExtensionTest {

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
    	this.<Date>testReadProperty("End Date", this.datum, this.expectedResult, new Function<BulkAppAdExtension, Date>() {
            @Override
            public Date apply(BulkAppAdExtension c) {
                return c.getAppAdExtension().getScheduling().getEndDate();
            }
        }, new Supplier<BulkAppAdExtension>() {
            @Override
            public BulkAppAdExtension get() {
                return new BulkAppAdExtension();
            }
        }, new DateComparer());
    }
}
