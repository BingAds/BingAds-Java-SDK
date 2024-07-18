package com.microsoft.bingads.v13.api.test.entities.goal.event.read;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.goal.event.BulkEventGoalTest;
import com.microsoft.bingads.v13.bulk.entities.BulkEventGoal;

@RunWith(Parameterized.class)
public class BulkEventGoalReadFromRowValuesEventValueTest extends BulkEventGoalTest {

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
        this.<BigDecimal>testReadProperty("Event Value", this.datum, this.expectedResult, new Function<BulkEventGoal, BigDecimal>() {
            @Override
            public BigDecimal apply(BulkEventGoal c) {
                return c.getEventGoal().getValue();
            }
        });
    }
}
