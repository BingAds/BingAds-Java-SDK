package com.microsoft.bingads.v13.api.test.entities.goal.event.write;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.goal.event.BulkEventGoalTest;
import com.microsoft.bingads.v13.bulk.entities.BulkEventGoal;

@RunWith(Parameterized.class)
public class BulkEventGoalWriteToRowValuesEventValueTest extends BulkEventGoalTest {

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
        this.<BigDecimal>testWriteProperty("Event Value", this.datum, this.propertyValue, new BiConsumer<BulkEventGoal, BigDecimal>() {
            @Override
            public void accept(BulkEventGoal c, BigDecimal v) {
                c.getEventGoal().setValue(v);
            }
        });
    }
}
