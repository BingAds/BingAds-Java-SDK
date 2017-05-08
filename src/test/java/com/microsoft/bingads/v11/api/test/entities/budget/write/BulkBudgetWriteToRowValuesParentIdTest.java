package com.microsoft.bingads.v11.api.test.entities.budget.write;

import com.microsoft.bingads.v11.api.test.entities.budget.BulkBudgetTest;
import com.microsoft.bingads.v11.bulk.entities.BulkBudget;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

public class BulkBudgetWriteToRowValuesParentIdTest extends BulkBudgetTest {

    @Parameter(value = 1)
    public Long propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"123", 123L},
            {"9223372036854775807", 9223372036854775807L},});
    }

    @Test
    public void testWrite() {
        this.<Long>testWriteProperty("Parent Id", this.datum, this.propertyValue, new BiConsumer<BulkBudget, Long>() {
            @Override
            public void accept(BulkBudget c, Long v) {
                c.setAccountId(v);
            }
        });
    }
}
