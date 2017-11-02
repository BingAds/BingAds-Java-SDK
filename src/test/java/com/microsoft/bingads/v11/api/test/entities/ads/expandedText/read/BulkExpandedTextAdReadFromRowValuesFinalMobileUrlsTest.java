package com.microsoft.bingads.v11.api.test.entities.ads.expandedText.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.v11.campaignmanagement.ArrayOfstring;
import com.microsoft.bingads.v11.bulk.entities.BulkExpandedTextAd;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v11.api.test.entities.ObjectComparer;
import com.microsoft.bingads.v11.api.test.entities.ads.expandedText.BulkExpandedTextAdTest;

public class BulkExpandedTextAdReadFromRowValuesFinalMobileUrlsTest extends BulkExpandedTextAdTest{

	@Parameter(value = 1)
	public ArrayOfstring expectedResult;
	
	@Parameters
	public static Collection<Object[]> data() {
		ArrayOfstring array = new ArrayOfstring();
		array.getStrings().addAll(Arrays.asList(new String[] { "http://www.test 1.com", "https://www.test2.com" }));
		
		return Arrays.asList(new Object[][] {
			{"", null},
			{"http://www.test 1.com; https://www.test2.com", array},
		});
	}
	
	@Test
	public void testRead() {
		this.<ArrayOfstring>testReadProperty("Mobile Final Url", this.datum, this.expectedResult, new Function<BulkExpandedTextAd, ArrayOfstring>() {
			@Override
			public ArrayOfstring apply(BulkExpandedTextAd c) {
				return c.getExpandedTextAd().getFinalMobileUrls();
			}
		}, new Supplier<BulkExpandedTextAd>() {
            @Override
            public BulkExpandedTextAd get() {
                return new BulkExpandedTextAd();
            }
        }, new ObjectComparer<ArrayOfstring>());
	}
}
