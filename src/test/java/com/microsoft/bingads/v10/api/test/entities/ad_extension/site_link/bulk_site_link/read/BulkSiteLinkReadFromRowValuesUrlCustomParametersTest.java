package com.microsoft.bingads.v10.api.test.entities.ad_extension.site_link.bulk_site_link.read;



import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.v10.api.test.entities.ObjectComparer;
import com.microsoft.bingads.v10.api.test.entities.ad_extension.site_link.bulk_site_link.BulkSiteLinkTest;
import com.microsoft.bingads.v10.bulk.entities.BulkSiteLink;
import com.microsoft.bingads.v10.campaignmanagement.ArrayOfCustomParameter;
import com.microsoft.bingads.v10.campaignmanagement.ArrayOfstring;
import com.microsoft.bingads.v10.campaignmanagement.CustomParameter;
import com.microsoft.bingads.v10.campaignmanagement.CustomParameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;


public class BulkSiteLinkReadFromRowValuesUrlCustomParametersTest extends BulkSiteLinkTest{

	@Parameter(value = 1)
	public CustomParameters expectedResult;
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{"", null},
		});
	}
	@Test
	public void testRead() {	
		this.<CustomParameters>testReadProperty("Custom Parameter", this.datum, this.expectedResult, new Function<BulkSiteLink, CustomParameters>() {
			@Override
			public CustomParameters apply(BulkSiteLink c) {
				return c.getSiteLink().getUrlCustomParameters();
			}
		});
		
		this.datum = "{_key1}=value\\;1; {_key2}=value\\\\2";
		
		CustomParameter paraTest1 = new CustomParameter();
		paraTest1.setKey("key1");
		paraTest1.setValue("value;1");
		CustomParameter paraTest2 = new CustomParameter();
		paraTest2.setKey("key2");
		paraTest2.setValue("value\\2");
		
		ArrayOfCustomParameter array = new ArrayOfCustomParameter();
		array.getCustomParameters().add(paraTest1);
		array.getCustomParameters().add(paraTest2);
		
		expectedResult = new CustomParameters();
		expectedResult.setParameters(array);
		
		this.<CustomParameters>testReadProperty("Custom Parameter", this.datum, this.expectedResult, new Function<BulkSiteLink, CustomParameters>() {
			@Override
			public CustomParameters apply(BulkSiteLink c) {
				return c.getSiteLink().getUrlCustomParameters();
			}
		}, new Supplier<BulkSiteLink>() {
            @Override
            public BulkSiteLink get() {
                return new BulkSiteLink();
            }
        }, new ObjectComparer<CustomParameters>());
	}
}
