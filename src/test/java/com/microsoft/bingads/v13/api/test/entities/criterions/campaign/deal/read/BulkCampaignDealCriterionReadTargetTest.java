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
import com.microsoft.bingads.v13.campaignmanagement.DealCriterion;

@RunWith(Parameterized.class)
public class BulkCampaignDealCriterionReadTargetTest extends BulkCampaignDealCriterionTest {

    @Parameter(value = 1)
    public Long expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"12", 12L},
                        {"23", 23L},
                        {null, null}
                }
        );
    }

    @Test
    public void testRead() {
        testReadProperty(
                "Target",
                datum,
                expectedResult,
                new Function<BulkCampaignDealCriterion, Long>() {
                    @Override
                    public Long apply(BulkCampaignDealCriterion c) {
                        return ((DealCriterion)c.getBiddableCampaignCriterion().getCriterion()).getDealId();
                    }
                }
        );
    }
}
