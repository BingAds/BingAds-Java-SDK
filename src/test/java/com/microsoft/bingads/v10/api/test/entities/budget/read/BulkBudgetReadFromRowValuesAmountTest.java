package com.microsoft.bingads.v10.api.test.entities.budget.read;

import com.microsoft.bingads.v10.api.test.entities.budget.BulkBudgetTest;
import com.microsoft.bingads.v10.bulk.entities.BulkBudget;
import com.microsoft.bingads.internal.functionalinterfaces.Function;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkBudgetReadFromRowValuesAmountTest extends BulkBudgetTest {

    @Parameter(value = 1)
    public BigDecimal expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"12.34", BigDecimal.valueOf(12.34)},
            {"123.0", BigDecimal.valueOf(123.0)},
            {"", null},
            {null, null}});
    }

    @Test
    public void testRead() {
        this.<BigDecimal>testReadProperty("Budget", this.datum, this.expectedResult, new Function<BulkBudget, BigDecimal>() {
            @Override
            public BigDecimal apply(BulkBudget c) {
                return c.getBudget().getAmount();
            }
        });
    }
}
