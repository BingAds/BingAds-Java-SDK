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

@RunWith(Parameterized.class)
public class BulkEventGoalWriteToRowValuesCurrencyCodeTest extends BulkEventGoalTest {

    @Parameter(value = 1)
    public String propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        // In this example, the parameter generator returns a List of
        // arrays.  Each array has two elements: { datum, expected }.
        // These data are hard-coded into the class, but they could be
        // generated or loaded in any way you like.
        return Arrays.asList(new Object[][]{
        	{"Currency Code", "Currency Code"},
            {"",""},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<String>testWriteProperty("Currency Code", this.datum, this.propertyValue, new BiConsumer<BulkEventGoal, String>() {
            @Override
            public void accept(BulkEventGoal c, String v) {
            	c.getEventGoal().setRevenue(new ConversionGoalRevenue());
            	c.getEventGoal().getRevenue().setCurrencyCode(v);
            }
        });
    }
}
