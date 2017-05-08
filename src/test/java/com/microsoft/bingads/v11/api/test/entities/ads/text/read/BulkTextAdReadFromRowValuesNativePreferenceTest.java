package com.microsoft.bingads.v11.api.test.entities.ads.text.read;

import java.util.Arrays;
import java.util.Collection;


import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v11.api.test.entities.ObjectComparer;
import com.microsoft.bingads.v11.api.test.entities.ads.text.BulkTextAdTest;
import com.microsoft.bingads.v11.bulk.entities.BulkTextAd;
import com.microsoft.bingads.v11.campaignmanagement.ArrayOfKeyValuePairOfstringstring;
import com.microsoft.bingads.v11.campaignmanagement.KeyValuePairOfstringstring;

public class BulkTextAdReadFromRowValuesNativePreferenceTest extends BulkTextAdTest{

	@Parameter(value = 1)
	public ArrayOfKeyValuePairOfstringstring expectedResult;
	
	@Parameters
	public static Collection<Object[]> data() {
		//Initialization
		return Arrays.asList(new Object[][] {
			{"", null},
		});
	}
	
	@Test
	public void testRead() {
		KeyValuePairOfstringstring keyValuePair = new KeyValuePairOfstringstring();
    	
    	keyValuePair = new KeyValuePairOfstringstring();
    	
    	keyValuePair.setKey("NativePreference");
    	    	
    	keyValuePair.setValue("False");
		
		expectedResult = new ArrayOfKeyValuePairOfstringstring();
		
		expectedResult.getKeyValuePairOfstringstrings().add(keyValuePair);
		
		this.<ArrayOfKeyValuePairOfstringstring>testReadProperty("Ad Format Preference", this.datum, this.expectedResult, new Function<BulkTextAd, ArrayOfKeyValuePairOfstringstring>() {
			@Override
			public ArrayOfKeyValuePairOfstringstring apply(BulkTextAd c) {
				return c.getTextAd().getForwardCompatibilityMap();
			}
		}, new Supplier<BulkTextAd>() {
            @Override
            public BulkTextAd get() {
                return new BulkTextAd();
            }
        }, new ObjectComparer<ArrayOfKeyValuePairOfstringstring>());
		
		this.datum = "All";		
    	
    	keyValuePair = new KeyValuePairOfstringstring();
    	
    	keyValuePair.setKey("NativePreference");
    	    	
    	keyValuePair.setValue("False");
		
		expectedResult = new ArrayOfKeyValuePairOfstringstring();
		
		expectedResult.getKeyValuePairOfstringstrings().add(keyValuePair);
		
		this.<ArrayOfKeyValuePairOfstringstring>testReadProperty("Ad Format Preference", this.datum, this.expectedResult, new Function<BulkTextAd, ArrayOfKeyValuePairOfstringstring>() {
			@Override
			public ArrayOfKeyValuePairOfstringstring apply(BulkTextAd c) {
				return c.getTextAd().getForwardCompatibilityMap();
			}
		}, new Supplier<BulkTextAd>() {
            @Override
            public BulkTextAd get() {
                return new BulkTextAd();
            }
        }, new ObjectComparer<ArrayOfKeyValuePairOfstringstring>());
		
		this.datum = "Native";		
		    	
    	keyValuePair = new KeyValuePairOfstringstring();
    	
    	keyValuePair.setKey("NativePreference");
    	    	
    	keyValuePair.setValue("True");
		
		expectedResult = new ArrayOfKeyValuePairOfstringstring();
		
		expectedResult.getKeyValuePairOfstringstrings().add(keyValuePair);
		
		this.<ArrayOfKeyValuePairOfstringstring>testReadProperty("Ad Format Preference", this.datum, this.expectedResult, new Function<BulkTextAd, ArrayOfKeyValuePairOfstringstring>() {
			@Override
			public ArrayOfKeyValuePairOfstringstring apply(BulkTextAd c) {
				return c.getTextAd().getForwardCompatibilityMap();
			}
		}, new Supplier<BulkTextAd>() {
            @Override
            public BulkTextAd get() {
                return new BulkTextAd();
            }
        }, new ObjectComparer<ArrayOfKeyValuePairOfstringstring>());
	}
}
