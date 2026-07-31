package com.microsoft.bingads.v13.api.test.entities.ad_group_url_target.read;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.ad_group_url_target.BulkAdGroupUrlTargetTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupUrlTarget;
import com.microsoft.bingads.v13.campaignmanagement.BiddableAdGroupCriterion;


public class BulkAdGroupUrlTargetReadTrackingTemplateTest extends BulkAdGroupUrlTargetTest{

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
        Map<String, String> values = new HashMap<String, String>();
        
        values.put("Tracking Template", datum);

        testReadProperty(
                values,
                expectedResult,
                new Function<BulkAdGroupUrlTarget, String>() {
                    @Override
                    public String apply(BulkAdGroupUrlTarget c) {
                        return ((BiddableAdGroupCriterion) c.getBiddableAdGroupCriterion()).getTrackingUrlTemplate();
                    }
                }
        );
    }
}
