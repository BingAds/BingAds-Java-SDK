package com.microsoft.bingads.v11.api.test.entities.ads.appInstall.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.v11.api.test.entities.ObjectComparer;
import com.microsoft.bingads.v11.api.test.entities.ads.appInstall.BulkAppInstallAdTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAppInstallAd;
import com.microsoft.bingads.v11.campaignmanagement.ArrayOfstring;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;

public class BulkAppInstallAdReadFromRowValuesFinalUrlsTest extends BulkAppInstallAdTest{

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
		this.<ArrayOfstring>testReadProperty("Final Url", this.datum, this.expectedResult, new Function<BulkAppInstallAd, ArrayOfstring>() {
			@Override
			public ArrayOfstring apply(BulkAppInstallAd c) {
				return c.getAppInstallAd().getFinalUrls();
			}
		}, new Supplier<BulkAppInstallAd>() {
            @Override
            public BulkAppInstallAd get() {
                return new BulkAppInstallAd();
            }
        }, new ObjectComparer<ArrayOfstring>());
	}
}
