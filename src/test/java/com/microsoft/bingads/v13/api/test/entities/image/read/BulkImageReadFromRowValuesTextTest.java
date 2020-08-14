package com.microsoft.bingads.v13.api.test.entities.image.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.image.BulkImageTest;
import com.microsoft.bingads.v13.bulk.entities.BulkImage;

public class BulkImageReadFromRowValuesTextTest extends BulkImageTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Test Budget 1", "Test Budget 1"},
            {"", ""},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<String>testReadProperty("Text", this.datum, this.expectedResult, new Function<BulkImage, String>() {
            @Override
            public String apply(BulkImage c) {
                return c.getText();
            }
        });
    }
}
