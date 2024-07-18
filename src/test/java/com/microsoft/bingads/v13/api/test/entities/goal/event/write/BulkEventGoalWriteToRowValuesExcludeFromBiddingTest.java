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
public class BulkEventGoalWriteToRowValuesExcludeFromBiddingTest extends BulkEventGoalTest {

    @Parameter(value = 1)
    public Boolean propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"false", false},
            {"true", true},
        });
    }

    @Test
    public void testWrite() {
        this.<Boolean>testWriteProperty("Exclude From Bidding", this.datum, this.propertyValue, new BiConsumer<BulkEventGoal, Boolean>() {
            @Override
            public void accept(BulkEventGoal c, Boolean v) {
            	c.getConversionGoal().setExcludeFromBidding(v);
            }
        });
    }
}
