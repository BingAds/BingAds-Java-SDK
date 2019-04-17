package com.microsoft.bingads.v13.api.test.entities.experiment.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.experiment.BulkExperimentTest;
import com.microsoft.bingads.v13.bulk.entities.BulkExperiment;

@RunWith(Parameterized.class)
public class BulkExperimentReadFromRowValuesNameTest extends BulkExperimentTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Name", "Name"},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.testReadProperty("Name", this.datum, this.expectedResult, new Function<BulkExperiment, String>() {
            @Override
            public String apply(BulkExperiment c) {
                return c.getExperiment().getName();
            }
        });
    }
}
