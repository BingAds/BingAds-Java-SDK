package com.microsoft.bingads.v13.api.test.entities.data_exclusion.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.data_exclusion.BulkDataExclusionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkDataExclusion;

@RunWith(Parameterized.class)
public class BulkDataExclusionReadFromRowValuesDataExclusionTest extends BulkDataExclusionTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"DataExclusion Name", "DataExclusion Name"},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<String>testReadProperty("Data Exclusion", this.datum, this.expectedResult, new Function<BulkDataExclusion, String>() {
            @Override
            public String apply(BulkDataExclusion c) {
                return c.getDataExclusion().getName();
            }
        });
    }
}
