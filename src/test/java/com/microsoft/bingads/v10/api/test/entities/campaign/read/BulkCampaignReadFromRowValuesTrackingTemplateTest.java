package com.microsoft.bingads.v10.api.test.entities.campaign.read;

import java.util.Arrays;
import java.util.Collection;


import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v10.api.test.entities.campaign.BulkCampaignTest;
import com.microsoft.bingads.v10.bulk.entities.BulkCampaign;

public class BulkCampaignReadFromRowValuesTrackingTemplateTest extends BulkCampaignTest{

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
		this.<String>testReadProperty("Tracking Template", this.datum, this.expectedResult, new Function<BulkCampaign, String>() {
			@Override
			public String apply(BulkCampaign c) {
				return c.getCampaign().getTrackingUrlTemplate();
			}
		});
	}
}
