package com.microsoft.bingads.v13.api.test.entities.experiment.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.experiment.BulkExperimentTest;
import com.microsoft.bingads.v13.bulk.entities.BulkExperiment;

@RunWith(Parameterized.class)
public class BulkExperimentWriteToRowValuesTrafficSplitPercentageTest extends BulkExperimentTest {

    @Parameter(value = 1)
    public Integer propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"123", 123},
            {"2147483647", Integer.MAX_VALUE}
        });
    }

    @Test
    public void testWrite() {
        this.<Integer>testWriteProperty("Traffic Split Percent", this.datum, this.propertyValue, new BiConsumer<BulkExperiment, Integer>() {
            @Override
            public void accept(BulkExperiment c, Integer v) {
                c.getExperiment().setTrafficSplitPercent(v);
            }
        });
    }
}
