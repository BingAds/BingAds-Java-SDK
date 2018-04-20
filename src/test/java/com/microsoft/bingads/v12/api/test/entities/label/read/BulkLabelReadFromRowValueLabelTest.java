package com.microsoft.bingads.v12.api.test.entities.label.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v12.api.test.entities.label.BulkLabelTest;
import com.microsoft.bingads.v12.bulk.entities.BulkLabel;

@RunWith(Parameterized.class)
public class BulkLabelReadFromRowValueLabelTest extends BulkLabelTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"A Label Name", "A Label Name"},
                {"", ""},
                {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<String>testReadProperty("Label", this.datum, this.expectedResult, new Function<BulkLabel, String>() {
            @Override
            public String apply(BulkLabel c) {
                return c.getLabel().getName();
            }
        });
    }
}
