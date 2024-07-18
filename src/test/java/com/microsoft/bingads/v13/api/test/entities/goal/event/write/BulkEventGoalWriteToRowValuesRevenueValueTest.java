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
import com.microsoft.bingads.v13.campaignmanagement.ConversionGoalRevenue;

@RunWith(Parameterized.class)
public class BulkEventGoalWriteToRowValuesRevenueValueTest extends BulkEventGoalTest {

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
        this.<BigDecimal>testWriteProperty("Revenue Value", this.datum, this.propertyValue, new BiConsumer<BulkEventGoal, BigDecimal>() {
            @Override
            public void accept(BulkEventGoal c, BigDecimal v) {
            	c.getEventGoal().setRevenue(new ConversionGoalRevenue());
                c.getEventGoal().getRevenue().setValue(v);
            }
        });
    }
}
