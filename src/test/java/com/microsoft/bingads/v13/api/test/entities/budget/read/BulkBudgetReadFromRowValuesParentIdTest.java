package com.microsoft.bingads.v13.api.test.entities.budget.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.budget.BulkBudgetTest;
import com.microsoft.bingads.v13.bulk.entities.BulkBudget;

public class BulkBudgetReadFromRowValuesParentIdTest extends BulkBudgetTest {

    @Parameter(value = 1)
    public Long expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"123", 123L},
            {"9223372036854775807", 9223372036854775807L},});
    }

    @Test
    public void testRead() {
        this.<Long>testReadProperty("Parent Id", this.datum, this.expectedResult, new Function<BulkBudget, Long>() {
            @Override
            public Long apply(BulkBudget c) {
                return c.getAccountId();
            }
        });
    }
}
