package com.microsoft.bingads.v10.api.test.entities.campaign.read;

import com.microsoft.bingads.v10.api.test.entities.campaign.BulkCampaignTest;
import com.microsoft.bingads.v10.bulk.entities.BulkCampaign;
import com.microsoft.bingads.v10.campaignmanagement.CampaignStatus;
import com.microsoft.bingads.internal.functionalinterfaces.Function;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkCampaignReadFromRowValuesStatusTest extends BulkCampaignTest {

    @Parameter
    public String datum;

    @Parameter(value = 1)
    public CampaignStatus expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Active", CampaignStatus.ACTIVE},
            {"Paused", CampaignStatus.PAUSED},
            {"BudgetPaused", CampaignStatus.BUDGET_PAUSED},
            {"BudgetAndManualPaused", CampaignStatus.BUDGET_AND_MANUAL_PAUSED},
            {"Suspended", CampaignStatus.SUSPENDED},
            {"Deleted", CampaignStatus.DELETED},
            {"", null},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<CampaignStatus>testReadProperty("Status", this.datum, this.expectedResult, new Function<BulkCampaign, CampaignStatus>() {
            @Override
            public CampaignStatus apply(BulkCampaign c) {
                return c.getCampaign().getStatus();
            }
        });
    }
}
