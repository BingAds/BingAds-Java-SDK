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

@RunWith(Parameterized.class)
public class BulkEventGoalWriteToRowValuesViewThroughConversionWindowInMinutesTest extends BulkEventGoalTest {

    @Parameter(value = 1)
    public Integer propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
    	return Arrays.asList(new Object[][]{
    		{"123", 123},
            {null, null}
    	});
    }

    @Test
    public void testWrite() {
        this.<Integer>testWriteProperty("View Through Conversion Window In Minutes", this.datum, this.propertyValue, new BiConsumer<BulkEventGoal, Integer>() {
            @Override
            public void accept(BulkEventGoal c, Integer v) {
                c.getEventGoal().setViewThroughConversionWindowInMinutes(v);
            }
        });
    }
}
