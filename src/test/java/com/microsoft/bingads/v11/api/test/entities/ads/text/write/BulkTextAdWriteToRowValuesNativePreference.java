package com.microsoft.bingads.v11.api.test.entities.ads.text.write;

import com.microsoft.bingads.v11.api.test.entities.ads.text.BulkTextAdTest;
import com.microsoft.bingads.v11.bulk.entities.BulkTextAd;
import com.microsoft.bingads.v11.campaignmanagement.ArrayOfCustomParameter;
import com.microsoft.bingads.v11.campaignmanagement.ArrayOfKeyValuePairOfstringstring;
import com.microsoft.bingads.v11.campaignmanagement.CustomParameter;
import com.microsoft.bingads.v11.campaignmanagement.CustomParameters;
import com.microsoft.bingads.v11.campaignmanagement.KeyValuePairOfstringstring;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkTextAdWriteToRowValuesNativePreference extends BulkTextAdTest {

    @Parameter(value = 1)
    public ArrayOfKeyValuePairOfstringstring propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {null, null},
        });
    }

    @Test
    public void testWrite() {
    	
    	this.<ArrayOfKeyValuePairOfstringstring>testWriteProperty("Ad Format Preference", this.datum, this.propertyValue, new BiConsumer<BulkTextAd, ArrayOfKeyValuePairOfstringstring>() {
            @Override
            public void accept(BulkTextAd c, ArrayOfKeyValuePairOfstringstring v) {
                c.getTextAd().setForwardCompatibilityMap(v);;
            }
        });
    	
    	KeyValuePairOfstringstring keyValuePair = new KeyValuePairOfstringstring();
    	
    	keyValuePair.setKey("NativePreference");
    	    	
    	keyValuePair.setValue("True");
		
    	propertyValue = new ArrayOfKeyValuePairOfstringstring();
    	
        this.<ArrayOfKeyValuePairOfstringstring>testWriteProperty("Ad Format Preference", this.datum, this.propertyValue, new BiConsumer<BulkTextAd, ArrayOfKeyValuePairOfstringstring>() {
            @Override
            public void accept(BulkTextAd c, ArrayOfKeyValuePairOfstringstring v) {
                c.getTextAd().setForwardCompatibilityMap(v);;
            }
        });
       
        this.datum = "Native";		
    	
    	keyValuePair = new KeyValuePairOfstringstring();
    	
    	keyValuePair.setKey("NativePreference");
    	    	
    	keyValuePair.setValue("True");
		
    	propertyValue = new ArrayOfKeyValuePairOfstringstring();
		
    	propertyValue.getKeyValuePairOfstringstrings().add(keyValuePair);
    	
        this.<ArrayOfKeyValuePairOfstringstring>testWriteProperty("Ad Format Preference", this.datum, this.propertyValue, new BiConsumer<BulkTextAd, ArrayOfKeyValuePairOfstringstring>() {
            @Override
            public void accept(BulkTextAd c, ArrayOfKeyValuePairOfstringstring v) {
                c.getTextAd().setForwardCompatibilityMap(v);;
            }
        });
        
        this.datum = "All";		
    	
    	keyValuePair = new KeyValuePairOfstringstring();
    	
    	keyValuePair.setKey("NativePreference");
    	    	
    	keyValuePair.setValue("False");
		
    	propertyValue = new ArrayOfKeyValuePairOfstringstring();
		
    	propertyValue.getKeyValuePairOfstringstrings().add(keyValuePair);
    	
        this.<ArrayOfKeyValuePairOfstringstring>testWriteProperty("Ad Format Preference", this.datum, this.propertyValue, new BiConsumer<BulkTextAd, ArrayOfKeyValuePairOfstringstring>() {
            @Override
            public void accept(BulkTextAd c, ArrayOfKeyValuePairOfstringstring v) {
                c.getTextAd().setForwardCompatibilityMap(v);;
            }
        });
    }
}
