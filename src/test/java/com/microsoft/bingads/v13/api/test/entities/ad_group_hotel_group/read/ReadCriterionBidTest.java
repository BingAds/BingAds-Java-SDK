package com.microsoft.bingads.v13.api.test.entities.ad_group_hotel_group.read;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.FixedBidComparer;
import com.microsoft.bingads.v13.api.test.entities.ad_group_hotel_group.BulkAdGroupHotelListingGroupTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupHotelListingGroup;
import com.microsoft.bingads.v13.campaignmanagement.BiddableAdGroupCriterion;
import com.microsoft.bingads.v13.campaignmanagement.FixedBid;

@RunWith(Parameterized.class)
public class ReadCriterionBidTest extends BulkAdGroupHotelListingGroupTest {

    @Parameter(value = 1)
    public FixedBid expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
    	FixedBid withValue = new FixedBid();
        withValue.setAmount(12.34);

        FixedBid zeroValue = new FixedBid();
        zeroValue.setAmount(0.0);

        return Arrays.asList(
                new Object[][]{
                        {"12.34", withValue},
                        {"delete_value", zeroValue},
                }
        );
    }

    @Test
    public void testRead() {
        Map<String, String> values = new HashMap<String, String>();

        values.put("Is Excluded", "No");
        values.put("Bid", datum);

        testReadProperty(
                values,
                expectedResult,
                new Function<BulkAdGroupHotelListingGroup, FixedBid>() {
                    @Override
                    public FixedBid apply(BulkAdGroupHotelListingGroup c) {
                        return ((FixedBid) ((BiddableAdGroupCriterion) c.getAdGroupCriterion()).getCriterionBid());
                    }
                },
                new Supplier<BulkAdGroupHotelListingGroup>() {
                    @Override
                    public BulkAdGroupHotelListingGroup get() {
                        return new BulkAdGroupHotelListingGroup();
                    }
                },
                new FixedBidComparer()
        );
    }
}
