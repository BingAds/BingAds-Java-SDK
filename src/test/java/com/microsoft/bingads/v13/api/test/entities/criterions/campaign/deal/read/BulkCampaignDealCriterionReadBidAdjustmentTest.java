package com.microsoft.bingads.v13.api.test.entities.criterions.campaign.deal.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.deal.BulkCampaignDealCriterionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaignDealCriterion;
import com.microsoft.bingads.v13.campaignmanagement.BidMultiplier;
import com.microsoft.bingads.v13.campaignmanagement.BiddableCampaignCriterion;

@RunWith(Parameterized.class)
public class BulkCampaignDealCriterionReadBidAdjustmentTest extends BulkCampaignDealCriterionTest {

    @Parameter(value = 1)
    public Double expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"0.58", 0.58},
                        {"0.0", 0.0},
                        {"", null},
                        {null, null}
                }
        );
    }

    @Test
    public void testRead() {
        testReadProperty(
                "Bid Adjustment",
                datum,
                expectedResult,
                new Function<BulkCampaignDealCriterion, Double>() {
                    @Override
                    public Double apply(BulkCampaignDealCriterion c) {
                        return ((BidMultiplier) ((BiddableCampaignCriterion) c.getBiddableCampaignCriterion()).getCriterionBid()).getMultiplier();
                    }
                }
        );
    }
}
