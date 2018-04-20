package com.microsoft.bingads.v12.api.test.entities.criterions.campaign.gender.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v12.api.test.entities.criterions.campaign.gender.BulkCampaignGenderCriterionTest;
import com.microsoft.bingads.v12.bulk.entities.BulkCampaignGenderCriterion;
import com.microsoft.bingads.v12.campaignmanagement.CampaignCriterionStatus;

@RunWith(Parameterized.class)
public class BulkCampaignGenderCriterionReadStatusTest extends BulkCampaignGenderCriterionTest {

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
                new Function<BulkCampaignGenderCriterion, CampaignCriterionStatus>() {
                    @Override
                    public CampaignCriterionStatus apply(BulkCampaignGenderCriterion c) {
                        return c.getBiddableCampaignCriterion().getStatus();
                    }
                }
        );
    }
}
