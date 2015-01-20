package com.microsoft.bingads.api.test.entities.ad_extension.image.read;

import java.util.Arrays;
import java.util.Collection;
import com.microsoft.bingads.internal.functionalInterfaces.Function;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.api.test.entities.ad_extension.image.BulkImageAdExtensionTest;
import com.microsoft.bingads.bulk.entities.BulkImageAdExtension;

public class BulkImageAdExtensionReadFromRowValuesDestinationUrlTest extends BulkImageAdExtensionTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Test text", "Test text"},
            {"", ""},
            {null, ""}
        });
    }

    @Test
    public void testRead() {
        this.<String>testReadProperty("Destination Url", this.datum, this.expectedResult, new Function<BulkImageAdExtension, String>() {
            @Override
            public String apply(BulkImageAdExtension c) {
                return c.getImageAdExtension().getDestinationUrl();
            }
        });
    }
}
