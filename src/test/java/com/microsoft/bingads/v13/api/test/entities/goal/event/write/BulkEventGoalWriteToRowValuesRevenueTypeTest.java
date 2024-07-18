package com.microsoft.bingads.v13.api.test.entities.goal.event.write;

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
import com.microsoft.bingads.v13.campaignmanagement.ConversionGoalRevenueType;

@RunWith(Parameterized.class)
public class BulkEventGoalWriteToRowValuesRevenueTypeTest extends BulkEventGoalTest {

    @Parameter(value = 1)
    public ConversionGoalRevenueType propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
        	{"FixedValue", ConversionGoalRevenueType.FIXED_VALUE},
            {"NoValue", ConversionGoalRevenueType.NO_VALUE},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<ConversionGoalRevenueType>testWriteProperty("Revenue Type", this.datum, this.propertyValue, new BiConsumer<BulkEventGoal, ConversionGoalRevenueType>() {
            @Override
            public void accept(BulkEventGoal c, ConversionGoalRevenueType v) {
            	c.getEventGoal().setRevenue(new ConversionGoalRevenue());
            	c.getEventGoal().getRevenue().setType(v);
            }
        });
    }
}
