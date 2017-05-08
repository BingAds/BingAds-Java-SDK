package com.microsoft.bingads.v11.api.test.entities.ad_group_product_partition.read;



import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupProductPartition;
import com.microsoft.bingads.v11.bulk.entities.BulkKeyword;
import com.microsoft.bingads.v11.bulk.entities.BulkSiteLink;
import com.microsoft.bingads.v11.campaignmanagement.ArrayOfCustomParameter;
import com.microsoft.bingads.v11.campaignmanagement.BiddableAdGroupCriterion;
import com.microsoft.bingads.v11.campaignmanagement.CustomParameter;
import com.microsoft.bingads.v11.campaignmanagement.CustomParameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v11.api.test.entities.ObjectComparer;
import com.microsoft.bingads.v11.api.test.entities.ad_group_product_partition.BulkAdGroupProductPartitionTest;
import com.microsoft.bingads.v11.api.test.entities.keyword.BulkKeywordTest;

public class ReadUrlCustomParametersTest extends BulkAdGroupProductPartitionTest{

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
	                new Function<BulkAdGroupProductPartition, CustomParameters>() {
	                    @Override
	                    public CustomParameters apply(BulkAdGroupProductPartition c) {
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
        new Function<BulkAdGroupProductPartition, CustomParameters>() {
            @Override
            public CustomParameters apply(BulkAdGroupProductPartition c) {
                return ((BiddableAdGroupCriterion) c.getAdGroupCriterion()).getUrlCustomParameters();
            }
        }, new Supplier<BulkAdGroupProductPartition>() {
            @Override
            public BulkAdGroupProductPartition get() {
                return new BulkAdGroupProductPartition();
            }
        }, new ObjectComparer<CustomParameters>());

	}
}
