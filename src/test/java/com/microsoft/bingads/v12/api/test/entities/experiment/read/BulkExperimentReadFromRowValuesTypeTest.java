package com.microsoft.bingads.v12.api.test.entities.experiment.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v12.api.test.entities.experiment.BulkExperimentTest;
import com.microsoft.bingads.v12.bulk.entities.BulkExperiment;

@RunWith(Parameterized.class)
public class BulkExperimentReadFromRowValuesTypeTest extends BulkExperimentTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Experiment Type", "Experiment Type"},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.testReadProperty("Experiment Type", this.datum, this.expectedResult, new Function<BulkExperiment, String>() {
            @Override
            public String apply(BulkExperiment c) {
                return c.getExperiment().getExperimentType();
            }
        });
    }
}
