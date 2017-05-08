package com.microsoft.bingads.v11.api.test.entities.ad_extension.site_link.bulk_site_link.read;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.v11.api.test.entities.ObjectComparer;
import com.microsoft.bingads.v11.api.test.entities.ad_extension.site_link.bulk_site_link.BulkSiteLinkTest;
import com.microsoft.bingads.v11.bulk.entities.BulkSiteLink;
import com.microsoft.bingads.v11.bulk.entities.BulkTextAd;
import com.microsoft.bingads.v11.campaignmanagement.ArrayOfstring;
import com.microsoft.bingads.v11.internal.bulk.StringExtensions;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;

public class BulkSiteLinkReadFromRowValuesFinalUrlsTest extends BulkSiteLinkTest{

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
		this.<ArrayOfstring>testReadProperty("Final Url", this.datum, this.expectedResult, new Function<BulkSiteLink, ArrayOfstring>() {
			@Override
			public ArrayOfstring apply(BulkSiteLink c) {
				return c.getSiteLink().getFinalUrls();
			}
		}, new Supplier<BulkSiteLink>() {
            @Override
            public BulkSiteLink get() {
                return new BulkSiteLink();
            }
        }, new ObjectComparer<ArrayOfstring>());
	}
}
