package com.microsoft.bingads.v11.api.test.entities.budget.write;

import com.microsoft.bingads.v11.api.test.entities.budget.BulkBudgetTest;
import com.microsoft.bingads.v11.bulk.entities.BulkBudget;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkBudgetWriteToRowValuesAmountTest extends BulkBudgetTest {

    @Parameter(value = 1)
    public BigDecimal propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"12.34", BigDecimal.valueOf(12.34)},
            {"123.0", BigDecimal.valueOf(123.0)},
            {null, null}});
    }

    @Test
    public void testRead() {
        this.<BigDecimal>testWriteProperty("Budget", this.datum, this.propertyValue, new BiConsumer<BulkBudget, BigDecimal>() {
            @Override
            public void accept(BulkBudget c, BigDecimal v) {
                c.getBudget().setAmount(v);;
            }
        });
    }
}
