package com.microsoft.bingads.v13.api.test.entities.ads.text.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.ads.text.BulkTextAdTest;
import com.microsoft.bingads.v13.bulk.entities.BulkTextAd;

public class BulkTextAdReadFromRowValuesTrackingTemplateTest extends BulkTextAdTest{

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
		this.<String>testReadProperty("Tracking Template", this.datum, this.expectedResult, new Function<BulkTextAd, String>() {
			@Override
			public String apply(BulkTextAd c) {
				return c.getTextAd().getTrackingUrlTemplate();
			}
		});
	}
}
