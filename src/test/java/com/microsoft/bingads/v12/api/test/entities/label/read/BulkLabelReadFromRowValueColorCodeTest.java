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
public class BulkLabelReadFromRowValueColorCodeTest extends BulkLabelTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"#FFFFFF", "#FFFFFF"},
                {"#000000", "#000000"},
                {"", ""},
                {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<String>testReadProperty("Color", this.datum, this.expectedResult, new Function<BulkLabel, String>() {
            @Override
            public String apply(BulkLabel c) {
                return c.getLabel().getColorCode();
            }
        });
    }
}
