package com.microsoft.bingads.v11.api.test.entities.budget.write;

import com.microsoft.bingads.v11.api.test.entities.budget.BulkBudgetTest;
import com.microsoft.bingads.v11.bulk.entities.BulkBudget;
import com.microsoft.bingads.v11.campaignmanagement.BudgetLimitType;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

public class BulkBudgetWriteToRowValuesBudgetTypeTest extends BulkBudgetTest {

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
        this.<BudgetLimitType>testWriteProperty("Budget Type", this.datum, this.propertyValue, new BiConsumer<BulkBudget, BudgetLimitType>() {
            @Override
            public void accept(BulkBudget c, BudgetLimitType v) {
                c.getBudget().setBudgetType(v);;
            }
        });
    }
}
