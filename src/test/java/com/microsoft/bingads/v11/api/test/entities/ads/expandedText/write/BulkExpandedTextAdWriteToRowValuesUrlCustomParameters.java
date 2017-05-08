package com.microsoft.bingads.v11.api.test.entities.ads.expandedText.write;

import com.microsoft.bingads.v11.api.test.entities.ads.expandedText.BulkExpandedTextAdTest;
import com.microsoft.bingads.v11.bulk.entities.BulkExpandedTextAd;
import com.microsoft.bingads.v11.campaignmanagement.ArrayOfCustomParameter;
import com.microsoft.bingads.v11.campaignmanagement.CustomParameter;
import com.microsoft.bingads.v11.campaignmanagement.CustomParameters;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkExpandedTextAdWriteToRowValuesUrlCustomParameters extends BulkExpandedTextAdTest {

    @Parameter(value = 1)
    public CustomParameters propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {null, null},
        });
    }

    @Test
    public void testWrite() {
        this.<CustomParameters>testWriteProperty("Custom Parameter", this.datum, this.propertyValue, new BiConsumer<BulkExpandedTextAd, CustomParameters>() {
            @Override
            public void accept(BulkExpandedTextAd c, CustomParameters v) {
                c.getExpandedTextAd().setUrlCustomParameters(v);;
            }
        });
        
        this.datum = "delete_value";
        propertyValue = new CustomParameters(); 
        this.<CustomParameters>testWriteProperty("Custom Parameter", this.datum, this.propertyValue, new BiConsumer<BulkExpandedTextAd, CustomParameters>() {
            @Override
            public void accept(BulkExpandedTextAd c, CustomParameters v) {
                c.getExpandedTextAd().setUrlCustomParameters(v);;
            }
        });
        
        
        this.datum = "delete_value";	
		propertyValue.setParameters(new ArrayOfCustomParameter());
		this.<CustomParameters>testWriteProperty("Custom Parameter", this.datum, this.propertyValue, new BiConsumer<BulkExpandedTextAd, CustomParameters>() {
            @Override
            public void accept(BulkExpandedTextAd c, CustomParameters v) {
                c.getExpandedTextAd().setUrlCustomParameters(v);;
            }
        });
        
		
        this.datum = "{_key1}=value\\;1; {_key2}=value\\\\2";
		CustomParameter paraTest1 = new CustomParameter();
		paraTest1.setKey("key1");
		paraTest1.setValue("value;1");
		CustomParameter paraTest2 = new CustomParameter();
		paraTest2.setKey("key2");
		paraTest2.setValue("value\\2");
		ArrayOfCustomParameter array = new ArrayOfCustomParameter();
		array.getCustomParameters().add(paraTest1);
		array.getCustomParameters().add(paraTest2);
		propertyValue = new CustomParameters();
		propertyValue.setParameters(array);
		this.<CustomParameters>testWriteProperty("Custom Parameter", this.datum, this.propertyValue, new BiConsumer<BulkExpandedTextAd, CustomParameters>() {
            @Override
            public void accept(BulkExpandedTextAd c, CustomParameters v) {
                c.getExpandedTextAd().setUrlCustomParameters(v);;
            }
        });
    }
}
