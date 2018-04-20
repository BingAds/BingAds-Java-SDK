package com.microsoft.bingads.v11.api.test.entities.keyword.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v11.api.test.entities.ObjectComparer;
import com.microsoft.bingads.v11.api.test.entities.keyword.BulkKeywordTest;
import com.microsoft.bingads.v11.bulk.entities.BulkKeyword;
import com.microsoft.bingads.v11.campaignmanagement.ArrayOfstring;

public class BulkKeywordReadFromRowValuesFinalUrlsTest extends BulkKeywordTest{

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
		this.<ArrayOfstring>testReadProperty("Final Url", this.datum, this.expectedResult, new Function<BulkKeyword, ArrayOfstring>() {
			@Override
			public ArrayOfstring apply(BulkKeyword c) {
				return c.getKeyword().getFinalUrls();
			}
		}, new Supplier<BulkKeyword>() {
            @Override
            public BulkKeyword get() {
                return new BulkKeyword();
            }
        }, new ObjectComparer<ArrayOfstring>());
	}
}
