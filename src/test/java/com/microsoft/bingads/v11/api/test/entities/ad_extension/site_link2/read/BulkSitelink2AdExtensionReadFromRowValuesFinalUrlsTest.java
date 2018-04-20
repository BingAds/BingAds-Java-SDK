package com.microsoft.bingads.v11.api.test.entities.ad_extension.site_link2.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v11.api.test.entities.ObjectComparer;
import com.microsoft.bingads.v11.api.test.entities.ad_extension.site_link2.BulkSitelink2AdExtensionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkSitelink2AdExtension;
import com.microsoft.bingads.v11.campaignmanagement.ArrayOfstring;

public class BulkSitelink2AdExtensionReadFromRowValuesFinalUrlsTest extends BulkSitelink2AdExtensionTest{

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
		this.<ArrayOfstring>testReadProperty("Final Url", this.datum, this.expectedResult, new Function<BulkSitelink2AdExtension, ArrayOfstring>() {
			@Override
			public ArrayOfstring apply(BulkSitelink2AdExtension c) {
				return c.getSitelink2AdExtension().getFinalUrls();
			}
		}, new Supplier<BulkSitelink2AdExtension>() {
            @Override
            public BulkSitelink2AdExtension get() {
                return new BulkSitelink2AdExtension();
            }
        }, new ObjectComparer<ArrayOfstring>());
	}
}
