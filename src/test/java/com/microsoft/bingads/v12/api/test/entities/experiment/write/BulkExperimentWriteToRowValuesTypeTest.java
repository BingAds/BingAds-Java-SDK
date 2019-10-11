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
public class BulkExperimentWriteToRowValuesTypeTest extends BulkExperimentTest {

    @Parameter(value = 1)
    public String propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Test Experiment Type", "Test Experiment Type"},
            {"", ""},
            {null, null},});
    }

    @Test
    public void testWrite() {
        this.<String>testWriteProperty("Experiment Type", this.datum, this.propertyValue, new BiConsumer<BulkExperiment, String>() {
            @Override
            public void accept(BulkExperiment c, String v) {
                c.getExperiment().setExperimentType(v);
            }
        });
    }
}
