package com.microsoft.bingads.v13.api.test.entities.ad_extension.promotion.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.promotion.BulkPromotionAdExtensionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkPromotionAdExtension;
import com.microsoft.bingads.v13.campaignmanagement.Date;
import com.microsoft.bingads.v13.campaignmanagement.Schedule;

public class BulkPromotionAdExtensionWriteToValuesPromotionStartTest extends BulkPromotionAdExtensionTest {

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
    	this.testWriteProperty("Promotion Start", this.datum, this.propertyValue, new BiConsumer<BulkPromotionAdExtension, Date>() {
            @Override
            public void accept(BulkPromotionAdExtension c, Date v) {
            	c.getPromotionAdExtension().setPromotionStartDate(new Date());
            }
        });
    	
    	datum = "2/13/2016";
    	propertyValue = new Date();
    	propertyValue.setMonth(2);
    	propertyValue.setDay(13);
    	propertyValue.setYear(2016);
    	   	
        this.testWriteProperty("Promotion Start", this.datum, this.propertyValue, new BiConsumer<BulkPromotionAdExtension, Date>() {
            @Override
            public void accept(BulkPromotionAdExtension c, Date v) {
                c.getPromotionAdExtension().setPromotionStartDate(v);
            }
        });
        
        datum = "delete_value";
    	propertyValue = null;
    	   	
        this.testWriteProperty("Promotion Start", this.datum, this.propertyValue, new BiConsumer<BulkPromotionAdExtension, Date>() {
            @Override
            public void accept(BulkPromotionAdExtension c, Date v) {
            	c.getPromotionAdExtension().setPromotionStartDate(v);
            }
        });
    }
}
