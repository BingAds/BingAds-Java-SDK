package com.microsoft.bingads.v11.api.test.entities.campaign.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v11.api.test.entities.campaign.BulkCampaignTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaign;
import com.microsoft.bingads.v11.campaignmanagement.BudgetLimitType;

public class BulkCampaignReadFromRowValuesBudgetTypeTest extends BulkCampaignTest {

    @Parameter(value = 1)
    public BudgetLimitType expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"DailyBudgetAccelerated", BudgetLimitType.DAILY_BUDGET_ACCELERATED},
            {"DailyBudgetStandard", BudgetLimitType.DAILY_BUDGET_STANDARD},
            {"", null},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<BudgetLimitType>testReadProperty("Budget Type", this.datum, this.expectedResult, new Function<BulkCampaign, BudgetLimitType>() {
            @Override
            public BudgetLimitType apply(BulkCampaign c) {
                return c.getCampaign().getBudgetType();
            }
        });
    }
}
