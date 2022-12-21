package com.microsoft.bingads.v13.api.test.entities.ad_group_hotel_group.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.ad_group_hotel_group.BulkAdGroupHotelListingGroupTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupHotelListingGroup;
import com.microsoft.bingads.v13.campaignmanagement.BidMultiplier;
import com.microsoft.bingads.v13.campaignmanagement.BiddableAdGroupCriterion;
import com.microsoft.bingads.v13.campaignmanagement.HotelGroup;

public class WriteCriterionBidAdjustmentTest extends BulkAdGroupHotelListingGroupTest {
    @Parameterized.Parameter(value = 1)
    public BidMultiplier propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
    	BidMultiplier withValue = new BidMultiplier();
        withValue.setMultiplier(12.34);

        BidMultiplier zeroValue = new BidMultiplier();
        zeroValue.setMultiplier(0.0);

        return Arrays.asList(
                new Object[][]{
                        {"12.34", withValue},
                        {"0.0", zeroValue},
                        {null, null}
                }
        );
    }

    @Test
    public void testWrite() {
        testWriteProperty(
                "Bid Adjustment",
                datum,
                propertyValue,
                new BiConsumer<BulkAdGroupHotelListingGroup, BidMultiplier>() {
                    @Override
                    public void accept(BulkAdGroupHotelListingGroup c, BidMultiplier v) {
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
