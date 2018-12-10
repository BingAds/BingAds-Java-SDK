package com.microsoft.bingads.v12.api.test.entities.experiment.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v12.api.test.entities.experiment.BulkExperimentTest;
import com.microsoft.bingads.v12.bulk.entities.BulkExperiment;

@RunWith(Parameterized.class)
public class BulkExperimentWriteToRowValuesIdTest extends BulkExperimentTest {

    @Parameter(value = 1)
    public Long propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"123", 123L},
            {"9223372036854775807", 9223372036854775807L}
        });
    }

    @Test
    public void testWrite() {
        this.<Long>testWriteProperty("Id", this.datum, this.propertyValue, new BiConsumer<BulkExperiment, Long>() {
            @Override
            public void accept(BulkExperiment c, Long v) {
                c.getExperiment().setId(v);
            }
        });
    }
}
