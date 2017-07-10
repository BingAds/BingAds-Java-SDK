package com.microsoft.bingads.v11.api.test.entities.campaign_product_scope.read;

import com.microsoft.bingads.v11.api.test.entities.campaign_product_scope.BulkCampaignProductScopeTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaignProductScope;
import com.microsoft.bingads.v11.campaignmanagement.CampaignCriterionStatus;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ReadStatusTest extends BulkCampaignProductScopeTest {

    @Parameter(value = 1)
    public CampaignCriterionStatus expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"", null},
                        {null, null},
                        {"Active", CampaignCriterionStatus.ACTIVE},
                        {"Paused", CampaignCriterionStatus.PAUSED},
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
                new Function<BulkCampaignProductScope, CampaignCriterionStatus>() {
                    @Override
                    public CampaignCriterionStatus apply(BulkCampaignProductScope c) {
                        return c.getBiddableCampaignCriterion().getStatus();
                    }
                }
        );
    }
}


