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
import com.microsoft.bingads.v13.campaignmanagement.ExpressionOperator;

@RunWith(Parameterized.class)
public class BulkEventGoalWriteToRowValuesCategoryOperatorTest extends BulkEventGoalTest {

    @Parameter(value = 1)
    public ExpressionOperator propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
        	{"Equals", ExpressionOperator.EQUALS},
            {"Contains", ExpressionOperator.CONTAINS},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<ExpressionOperator>testWriteProperty("Category Operator", this.datum, this.propertyValue, new BiConsumer<BulkEventGoal, ExpressionOperator>() {
            @Override
            public void accept(BulkEventGoal c, ExpressionOperator v) {
                c.getEventGoal().setCategoryOperator(v);
            }
        });
    }
}
