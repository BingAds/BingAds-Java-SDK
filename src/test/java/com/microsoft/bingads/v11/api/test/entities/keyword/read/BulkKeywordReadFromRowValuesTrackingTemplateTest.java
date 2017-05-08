package com.microsoft.bingads.v11.api.test.entities.keyword.read;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.v11.bulk.entities.BulkKeyword;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v11.api.test.entities.keyword.BulkKeywordTest;

public class BulkKeywordReadFromRowValuesTrackingTemplateTest extends BulkKeywordTest{

	@Parameter(value = 1)
	public String expectedResult;
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{"", ""},
			{"template", "template"},
		});
	}
	
	@Test
	public void testRead() {
		this.<String>testReadProperty("Tracking Template", this.datum, this.expectedResult, new Function<BulkKeyword, String>() {
			@Override
			public String apply(BulkKeyword c) {
				return c.getKeyword().getTrackingUrlTemplate();
			}
		});
	}
}
