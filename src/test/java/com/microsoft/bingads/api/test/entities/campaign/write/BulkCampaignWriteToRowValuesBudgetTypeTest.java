package com.microsoft.bingads.api.test.entities.campaign.write;

import java.util.Arrays;
import java.util.Collection;
import com.microsoft.bingads.internal.functionalInterfaces.BiConsumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.api.test.entities.campaign.BulkCampaignTest;
import com.microsoft.bingads.bulk.entities.BulkCampaign;
import com.microsoft.bingads.campaignmanagement.BudgetLimitType;

@RunWith(Parameterized.class)
public class BulkCampaignWriteToRowValuesBudgetTypeTest extends BulkCampaignTest {

    @Parameter(value = 1)
    public BudgetLimitType propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"MonthlyBudgetSpendUntilDepleted", BudgetLimitType.MONTHLY_BUDGET_SPEND_UNTIL_DEPLETED},
            {"DailyBudgetAccelerated", BudgetLimitType.DAILY_BUDGET_ACCELERATED},
            {"DailyBudgetStandard", BudgetLimitType.DAILY_BUDGET_STANDARD},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<BudgetLimitType>testWriteProperty("Budget Type", this.datum, this.propertyValue, new BiConsumer<BulkCampaign, BudgetLimitType>() {
            @Override
            public void accept(BulkCampaign c, BudgetLimitType v) {
                c.getCampaign().setBudgetType(v);
            }
        });
    }
}
