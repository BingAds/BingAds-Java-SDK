package com.microsoft.bingads.v13.api.test.entities.ad_group_hotel_group.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.ad_group_hotel_group.BulkAdGroupHotelListingGroupTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupHotelListingGroup;
import com.microsoft.bingads.v13.campaignmanagement.BiddableAdGroupCriterion;
import com.microsoft.bingads.v13.campaignmanagement.FixedBid;
import com.microsoft.bingads.v13.campaignmanagement.HotelGroup;

public class WriteCriterionBidTest extends BulkAdGroupHotelListingGroupTest {
    @Parameterized.Parameter(value = 1)
    public FixedBid propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
    	FixedBid withValue = new FixedBid();
        withValue.setAmount(12.34);

        FixedBid zeroValue = new FixedBid();
        zeroValue.setAmount(0.0);

        return Arrays.asList(
                new Object[][]{
                        {"12.34", withValue},
                        {"delete_value", zeroValue},
                        {null, null}
                }
        );
    }

    @Test
    public void testWrite() {
        testWriteProperty(
                "Bid",
                datum,
                propertyValue,
                new BiConsumer<BulkAdGroupHotelListingGroup, FixedBid>() {
                    @Override
                    public void accept(BulkAdGroupHotelListingGroup c, FixedBid v) {
                        HotelGroup criterion = new HotelGroup();

                        BiddableAdGroupCriterion adGroupCriterion = new BiddableAdGroupCriterion();
                        adGroupCriterion.setId(100L);
                        adGroupCriterion.setCriterion(criterion);

                        c.setAdGroupCriterion(adGroupCriterion);

                        adGroupCriterion.setCriterionBid(v);
                    }
                }
        );
    }

}
