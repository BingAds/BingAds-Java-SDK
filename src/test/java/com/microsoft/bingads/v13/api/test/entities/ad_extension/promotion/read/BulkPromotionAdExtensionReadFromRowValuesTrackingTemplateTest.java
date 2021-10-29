package com.microsoft.bingads.v13.api.test.entities.ad_extension.promotion.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.promotion.BulkPromotionAdExtensionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkPromotionAdExtension;

public class BulkPromotionAdExtensionReadFromRowValuesTrackingTemplateTest extends BulkPromotionAdExtensionTest{

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
		this.<String>testReadProperty("Tracking Template", this.datum, this.expectedResult, new Function<BulkPromotionAdExtension, String>() {
			@Override
			public String apply(BulkPromotionAdExtension c) {
				return c.getPromotionAdExtension().getTrackingUrlTemplate();
			}
		});
	}
}
