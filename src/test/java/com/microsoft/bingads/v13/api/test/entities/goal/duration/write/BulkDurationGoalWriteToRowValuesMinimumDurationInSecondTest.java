package com.microsoft.bingads.v13.api.test.entities.goal.duration.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.goal.duration.BulkDurationGoalTest;
import com.microsoft.bingads.v13.bulk.entities.BulkDurationGoal;

@RunWith(Parameterized.class)
public class BulkDurationGoalWriteToRowValuesMinimumDurationInSecondTest extends BulkDurationGoalTest {

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
        this.<Integer>testWriteProperty("Minimum Duration In Second", this.datum, this.propertyValue, new BiConsumer<BulkDurationGoal, Integer>() {
            @Override
            public void accept(BulkDurationGoal c, Integer v) {
                c.getDurationGoal().setMinimumDurationInSeconds(v);
            }
        });
    }
}
