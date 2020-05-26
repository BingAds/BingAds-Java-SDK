package com.microsoft.bingads.v13.api.test.entities.ad_extension.promotion.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.DateComparer;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.promotion.BulkPromotionAdExtensionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkPromotionAdExtension;
import com.microsoft.bingads.v13.campaignmanagement.Date;

public class BulkPromotionAdExtensionReadFromRowValuesPromotionEndTest extends BulkPromotionAdExtensionTest {

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
    	this.<Date>testReadProperty("Promotion End", this.datum, this.expectedResult, new Function<BulkPromotionAdExtension, Date>() {
            @Override
            public Date apply(BulkPromotionAdExtension c) {
                return c.getPromotionAdExtension().getPromotionEndDate();
            }
        }, new Supplier<BulkPromotionAdExtension>() {
            @Override
            public BulkPromotionAdExtension get() {
                return new BulkPromotionAdExtension();
            }
        }, new DateComparer());
    }
}
