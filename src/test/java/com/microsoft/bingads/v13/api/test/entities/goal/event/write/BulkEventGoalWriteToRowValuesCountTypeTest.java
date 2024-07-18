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
import com.microsoft.bingads.v13.campaignmanagement.ConversionGoalCountType;

@RunWith(Parameterized.class)
public class BulkEventGoalWriteToRowValuesCountTypeTest extends BulkEventGoalTest {

    @Parameter(value = 1)
    public ConversionGoalCountType propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
        	{"All", ConversionGoalCountType.ALL},
            {"Unique", ConversionGoalCountType.UNIQUE},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<ConversionGoalCountType>testWriteProperty("Count Type", this.datum, this.propertyValue, new BiConsumer<BulkEventGoal, ConversionGoalCountType>() {
            @Override
            public void accept(BulkEventGoal c, ConversionGoalCountType v) {
                c.getEventGoal().setCountType(v);
            }
        });
    }
}
