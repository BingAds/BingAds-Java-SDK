package com.microsoft.bingads.v12.api.test.entities.ad_extension.image.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v12.api.test.entities.ad_extension.image.BulkImageAdExtensionTest;
import com.microsoft.bingads.v12.bulk.entities.BulkImageAdExtension;

public class BulkImageAdExtensionWriteFromRowValuesDestinationUrlTest extends BulkImageAdExtensionTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Test text", "Test text"},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<String>testWriteProperty("Destination Url", this.datum, this.expectedResult, new BiConsumer<BulkImageAdExtension, String>() {
            @Override
            public void accept(BulkImageAdExtension c, String v) {
                c.getImageAdExtension().setDestinationUrl(v);
            }
        });
    }
}
