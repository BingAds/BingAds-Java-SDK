package com.microsoft.bingads.v13.api.test.entities.ad_extension.filterlink.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.ObjectComparer;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.filterlink.BulkFilterLinkAdExtensionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkFilterLinkAdExtension;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfstring;

public class BulkFilterLinkAdExtensionReadFromRowValuesFinalMobileUrlsTest extends BulkFilterLinkAdExtensionTest{

	@Parameter(value = 1)
	public ArrayOfstring expectedResult;
	
	@Parameters
	public static Collection<Object[]> data() {
		ArrayOfstring array = new ArrayOfstring();
		array.getStrings().addAll(Arrays.asList(new String[] { "http://www.test 1.com", "https://www.test2.com" }));
		
		return Arrays.asList(new Object[][] {
			{"", null},
			{"http://www.test 1.com; https://www.test2.com", array}
		});
	}
	
	@Test
	public void testRead() {
		this.<ArrayOfstring>testReadProperty("Mobile Final Url", this.datum, this.expectedResult, new Function<BulkFilterLinkAdExtension, ArrayOfstring>() {
			@Override
			public ArrayOfstring apply(BulkFilterLinkAdExtension c) {
				return c.getFilterLinkAdExtension().getFinalMobileUrls();
			}
		}, new Supplier<BulkFilterLinkAdExtension>() {
            @Override
            public BulkFilterLinkAdExtension get() {
                return new BulkFilterLinkAdExtension();
            }
        }, new ObjectComparer<ArrayOfstring>());
	}
}
