package com.microsoft.bingads.v11.api.test.entities.budget.write;

import com.microsoft.bingads.v11.api.test.entities.budget.BulkBudgetTest;
import com.microsoft.bingads.v11.bulk.entities.BulkBudget;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

public class BulkBudgetWriteToRowValuesBudgetNameTest extends BulkBudgetTest {

    @Parameter(value = 1)
    public String propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Test Budget 1", "Test Budget 1"},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<String>testWriteProperty("Budget Name", this.datum, this.propertyValue, new BiConsumer<BulkBudget, String>() {
            @Override
            public void accept(BulkBudget c, String v) {
                c.getBudget().setName(v);;
            }
        });
    }
}
