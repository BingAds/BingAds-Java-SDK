package com.microsoft.bingads.v11.api.test.entities.campaign.write;

import com.microsoft.bingads.v11.api.test.entities.campaign.BulkCampaignTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaign;
import com.microsoft.bingads.v11.campaignmanagement.BudgetLimitType;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkCampaignWriteToRowValuesBudgetTypeTest extends BulkCampaignTest {

    @Parameter(value = 1)
    public BudgetLimitType propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
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
