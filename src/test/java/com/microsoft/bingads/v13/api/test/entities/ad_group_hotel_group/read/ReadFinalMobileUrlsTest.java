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
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfstring;
import com.microsoft.bingads.v13.campaignmanagement.BiddableAdGroupCriterion;

public class ReadFinalMobileUrlsTest extends BulkAdGroupHotelListingGroupTest{

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
                new Function<BulkAdGroupHotelListingGroup, ArrayOfstring>() {
                    @Override
                    public ArrayOfstring apply(BulkAdGroupHotelListingGroup c) {
                        return ((BiddableAdGroupCriterion) c.getAdGroupCriterion()).getFinalMobileUrls();
                    }
                }, new Supplier<BulkAdGroupHotelListingGroup>() {
                    @Override
                    public BulkAdGroupHotelListingGroup get() {
                        return new BulkAdGroupHotelListingGroup();
                    }
                }, new ObjectComparer<ArrayOfstring>()
        );
    }
}
