package com.microsoft.bingads.v11.api.test.entities.label.read;

import com.microsoft.bingads.v11.api.test.entities.label.BulkLabelTest;
import com.microsoft.bingads.v11.bulk.entities.BulkLabel;
import com.microsoft.bingads.internal.functionalinterfaces.Function;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkLabelReadFromRowValueDescriptionTest extends BulkLabelTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"Some descriptions", "Some descriptions"},
                {"", ""},
                {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<String>testReadProperty("Description", this.datum, this.expectedResult, new Function<BulkLabel, String>() {
            @Override
            public String apply(BulkLabel c) {
                return c.getLabel().getDescription();
            }
        });
    }
}
