package com.microsoft.bingads.v13.api.test.entities.ad_group_hotel_group.read;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.ad_group_hotel_group.BulkAdGroupHotelListingGroupTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupHotelListingGroup;
import com.microsoft.bingads.v13.campaignmanagement.HotelGroup;
import com.microsoft.bingads.v13.campaignmanagement.HotelListing;

public class ReadAttributeTest extends BulkAdGroupHotelListingGroupTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
            {"", ""},
            {"Brand", "Brand"},
            {null, null},
        });
    }

    @Test
    public void testReadAttribure() {
        Map<String, String> values = new HashMap<String, String>();

        values.put("Hotel Attribute", datum);
        values.put("Is Excluded", "No");

        testReadProperty(
                values,
                expectedResult,
                new Function<BulkAdGroupHotelListingGroup, String>() {
                    @Override
                    public String apply(BulkAdGroupHotelListingGroup c) {
                        HotelListing listing = ((HotelGroup)c.getAdGroupCriterion().getCriterion()).getListing();
                        if (listing != null) {
                            return listing.getOperand();
                        }
                        return null;
                    }
                }
        );
    }
    
}
