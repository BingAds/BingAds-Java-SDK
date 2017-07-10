package com.microsoft.bingads.v11.api.test.entities.criterions.campaign.radius.write;

import com.microsoft.bingads.v11.api.test.entities.criterions.campaign.radius.BulkCampaignRadiusCriterionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaignRadiusCriterion;
import com.microsoft.bingads.v11.campaignmanagement.*;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;

import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

public class BulkCampaignRadiusCriterionWriteBidAdjustmentTest extends BulkCampaignRadiusCriterionTest {
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
                new BiConsumer<BulkCampaignRadiusCriterion, Double>() {
                    @Override
                    public void accept(BulkCampaignRadiusCriterion c, Double v) {
                        RadiusCriterion criterion = new RadiusCriterion();

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
