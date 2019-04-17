package com.microsoft.bingads.v13.api.test.entities.budget.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.budget.BulkBudgetTest;
import com.microsoft.bingads.v13.bulk.entities.BulkBudget;

@RunWith(Parameterized.class)
public class BulkBudgetWriteToRowValuesIdTest extends BulkBudgetTest {

    @Parameter(value = 1)
    public Long propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"123", 123L},
            {"9223372036854775807", 9223372036854775807L}
        });
    }

    @Test
    public void testWrite() {
        this.<Long>testWriteProperty("Id", this.datum, this.propertyValue, new BiConsumer<BulkBudget, Long>() {
            @Override
            public void accept(BulkBudget c, Long v) {
                c.getBudget().setId(v);;
            }
        });
    }
}
