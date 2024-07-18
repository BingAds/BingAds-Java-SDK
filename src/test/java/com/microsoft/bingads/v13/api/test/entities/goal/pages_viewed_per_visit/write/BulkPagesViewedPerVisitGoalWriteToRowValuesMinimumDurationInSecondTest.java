package com.microsoft.bingads.v13.api.test.entities.goal.pages_viewed_per_visit.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.goal.pages_viewed_per_visit.BulkPagesViewedPerVisitGoalTest;
import com.microsoft.bingads.v13.bulk.entities.BulkPagesViewedPerVisitGoal;

@RunWith(Parameterized.class)
public class BulkPagesViewedPerVisitGoalWriteToRowValuesMinimumDurationInSecondTest extends BulkPagesViewedPerVisitGoalTest {

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
        this.<Integer>testWriteProperty("Minimum Pages Viewed", this.datum, this.propertyValue, new BiConsumer<BulkPagesViewedPerVisitGoal, Integer>() {
            @Override
            public void accept(BulkPagesViewedPerVisitGoal c, Integer v) {
                c.getPagesViewedPerVisitGoal().setMinimumPagesViewed(v);
            }
        });
    }
}
