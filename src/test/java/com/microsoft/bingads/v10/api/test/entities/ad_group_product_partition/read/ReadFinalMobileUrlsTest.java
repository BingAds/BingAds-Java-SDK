package com.microsoft.bingads.v10.api.test.entities.ad_group_product_partition.read;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.v10.bulk.entities.BulkAdGroupProductPartition;
import com.microsoft.bingads.v10.bulk.entities.BulkKeyword;
import com.microsoft.bingads.v10.campaignmanagement.ArrayOfstring;
import com.microsoft.bingads.v10.campaignmanagement.BiddableAdGroupCriterion;
import com.microsoft.bingads.v10.internal.bulk.StringExtensions;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v10.api.test.entities.ObjectComparer;
import com.microsoft.bingads.v10.api.test.entities.ad_group_product_partition.BulkAdGroupProductPartitionTest;
import com.microsoft.bingads.v10.api.test.entities.keyword.BulkKeywordTest;

public class ReadFinalMobileUrlsTest extends BulkAdGroupProductPartitionTest{

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
        Map<String, String> values = new HashMap<String, String>();

        values.put("Is Excluded", "No");
        values.put("Mobile Final Url", datum);

        testReadProperty(
                values,
                expectedResult,
                new Function<BulkAdGroupProductPartition, ArrayOfstring>() {
                    @Override
                    public ArrayOfstring apply(BulkAdGroupProductPartition c) {
                        return ((BiddableAdGroupCriterion) c.getAdGroupCriterion()).getFinalMobileUrls();
                    }
                }, new Supplier<BulkAdGroupProductPartition>() {
                    @Override
                    public BulkAdGroupProductPartition get() {
                        return new BulkAdGroupProductPartition();
                    }
                }, new ObjectComparer<ArrayOfstring>()
        );
    }
}
