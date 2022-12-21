package com.microsoft.bingads.v13.api.test.entities.ad_group_hotel_group.read;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.ObjectComparer;
import com.microsoft.bingads.v13.api.test.entities.ad_group_hotel_group.BulkAdGroupHotelListingGroupTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupHotelListingGroup;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfCustomParameter;
import com.microsoft.bingads.v13.campaignmanagement.BiddableAdGroupCriterion;
import com.microsoft.bingads.v13.campaignmanagement.CustomParameter;
import com.microsoft.bingads.v13.campaignmanagement.CustomParameters;

public class ReadUrlCustomParametersTest extends BulkAdGroupHotelListingGroupTest{

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
		 Map<String, String> values = new HashMap<String, String>();

	        values.put("Is Excluded", "No");
	        values.put("Custom Parameter", datum);

	        testReadProperty(
	                values,
	                expectedResult,
	                new Function<BulkAdGroupHotelListingGroup, CustomParameters>() {
	                    @Override
	                    public CustomParameters apply(BulkAdGroupHotelListingGroup c) {
	                        return ((BiddableAdGroupCriterion) c.getAdGroupCriterion()).getUrlCustomParameters();
	                    }
	                }
	        );
		
		
		this.datum = "{_key1}=value\\;1; {_key2}=value\\\\2";
		values.put("Custom Parameter", datum);
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
		
		testReadProperty(
        values,
        expectedResult,
        new Function<BulkAdGroupHotelListingGroup, CustomParameters>() {
            @Override
            public CustomParameters apply(BulkAdGroupHotelListingGroup c) {
                return ((BiddableAdGroupCriterion) c.getAdGroupCriterion()).getUrlCustomParameters();
            }
        }, new Supplier<BulkAdGroupHotelListingGroup>() {
            @Override
            public BulkAdGroupHotelListingGroup get() {
                return new BulkAdGroupHotelListingGroup();
            }
        }, new ObjectComparer<CustomParameters>());

	}
}
