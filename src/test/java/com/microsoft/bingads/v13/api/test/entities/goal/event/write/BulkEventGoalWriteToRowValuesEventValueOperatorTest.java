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
import com.microsoft.bingads.v13.campaignmanagement.ValueOperator;

@RunWith(Parameterized.class)
public class BulkEventGoalWriteToRowValuesEventValueOperatorTest extends BulkEventGoalTest {

    @Parameter(value = 1)
    public ValueOperator propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
        	{"Equals", ValueOperator.EQUALS},
            {"LessThan", ValueOperator.LESS_THAN},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<ValueOperator>testWriteProperty("Event Value Operator", this.datum, this.propertyValue, new BiConsumer<BulkEventGoal, ValueOperator>() {
            @Override
            public void accept(BulkEventGoal c, ValueOperator v) {
                c.getEventGoal().setValueOperator(v);
            }
        });
    }
}
