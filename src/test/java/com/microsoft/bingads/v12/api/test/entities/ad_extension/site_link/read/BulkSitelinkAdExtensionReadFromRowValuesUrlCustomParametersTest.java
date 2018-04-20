package com.microsoft.bingads.v12.api.test.entities.ad_extension.site_link.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v12.api.test.entities.ObjectComparer;
import com.microsoft.bingads.v12.api.test.entities.ad_extension.site_link.BulkSitelinkAdExtensionTest;
import com.microsoft.bingads.v12.bulk.entities.BulkSitelinkAdExtension;
import com.microsoft.bingads.v12.campaignmanagement.ArrayOfCustomParameter;
import com.microsoft.bingads.v12.campaignmanagement.CustomParameter;
import com.microsoft.bingads.v12.campaignmanagement.CustomParameters;


public class BulkSitelinkAdExtensionReadFromRowValuesUrlCustomParametersTest extends BulkSitelinkAdExtensionTest{

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
		this.<CustomParameters>testReadProperty("Custom Parameter", this.datum, this.expectedResult, new Function<BulkSitelinkAdExtension, CustomParameters>() {
			@Override
			public CustomParameters apply(BulkSitelinkAdExtension c) {
				return c.getSitelinkAdExtension().getUrlCustomParameters();
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
		
		this.<CustomParameters>testReadProperty("Custom Parameter", this.datum, this.expectedResult, new Function<BulkSitelinkAdExtension, CustomParameters>() {
			@Override
			public CustomParameters apply(BulkSitelinkAdExtension c) {
				return c.getSitelinkAdExtension().getUrlCustomParameters();
			}
		}, new Supplier<BulkSitelinkAdExtension>() {
            @Override
            public BulkSitelinkAdExtension get() {
                return new BulkSitelinkAdExtension();
            }
        }, new ObjectComparer<CustomParameters>());
	}
}
