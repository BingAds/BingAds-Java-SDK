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
import com.microsoft.bingads.v13.campaignmanagement.ConversionGoalStatus;

@RunWith(Parameterized.class)
public class BulkEventGoalWriteToRowValuesStatusTest extends BulkEventGoalTest {

    @Parameter(value = 1)
    public ConversionGoalStatus propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
        	{"Active", ConversionGoalStatus.ACTIVE},
            {"Paused", ConversionGoalStatus.PAUSED},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<ConversionGoalStatus>testWriteProperty("Status", this.datum, this.propertyValue, new BiConsumer<BulkEventGoal, ConversionGoalStatus>() {
            @Override
            public void accept(BulkEventGoal c, ConversionGoalStatus v) {
                c.getEventGoal().setStatus(v);
            }
        });
    }
}
