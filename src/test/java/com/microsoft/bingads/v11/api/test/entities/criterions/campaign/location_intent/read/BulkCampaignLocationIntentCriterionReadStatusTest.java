package com.microsoft.bingads.v11.api.test.entities.criterions.campaign.location_intent.read;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v11.api.test.entities.criterions.campaign.location_intent.BulkCampaignLocationIntentCriterionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaignLocationIntentCriterion;
import com.microsoft.bingads.v11.campaignmanagement.CampaignCriterionStatus;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class BulkCampaignLocationIntentCriterionReadStatusTest extends BulkCampaignLocationIntentCriterionTest {

    @Parameter(value = 1)
    public CampaignCriterionStatus expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"", null},
                        {null, null},
                        {"Active", CampaignCriterionStatus.ACTIVE},
                        {"Deleted", CampaignCriterionStatus.DELETED}
                }
        );
    }

    @Test
    public void testRead() {
        testReadProperty(
                "Status",
                datum,
                expectedResult,
                new Function<BulkCampaignLocationIntentCriterion, CampaignCriterionStatus>() {
                    @Override
                    public CampaignCriterionStatus apply(BulkCampaignLocationIntentCriterion c) {
                        return c.getBiddableCampaignCriterion().getStatus();
                    }
                }
        );
    }
}
