package com.microsoft.bingads.v12.api.test.entities.criterions.campaign.daytime.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v12.api.test.entities.criterions.campaign.daytime.BulkCampaignDayTimeCriterionTest;
import com.microsoft.bingads.v12.bulk.entities.BulkCampaignDayTimeCriterion;
import com.microsoft.bingads.v12.campaignmanagement.BidMultiplier;
import com.microsoft.bingads.v12.campaignmanagement.BiddableCampaignCriterion;
import com.microsoft.bingads.v12.campaignmanagement.DayTimeCriterion;

public class BulkCampaignDayTimeCriterionWriteBidAdjustmentTest extends BulkCampaignDayTimeCriterionTest {
    @Parameterized.Parameter(value = 1)
    public Double propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"12.34", 12.34},
                        {"0.0", 0.0},
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
                new BiConsumer<BulkCampaignDayTimeCriterion, Double>() {
                    @Override
                    public void accept(BulkCampaignDayTimeCriterion c, Double v) {
                        DayTimeCriterion criterion = new DayTimeCriterion();

                        BiddableCampaignCriterion adGroupCriterion = new BiddableCampaignCriterion();

                        adGroupCriterion.setCriterion(criterion);

                        c.setBiddableCampaignCriterion(adGroupCriterion);

                        BidMultiplier bid = new BidMultiplier();

                        bid.setMultiplier(v);

                        adGroupCriterion.setCriterionBid(bid);
                    }
                }
        );
    }

}
