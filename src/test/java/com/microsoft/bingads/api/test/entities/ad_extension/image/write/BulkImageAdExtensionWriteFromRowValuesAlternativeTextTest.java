package com.microsoft.bingads.api.test.entities.ad_extension.image.write;

import java.util.Arrays;
import java.util.Collection;
import com.microsoft.bingads.internal.functionalInterfaces.BiConsumer;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.api.test.entities.ad_extension.image.BulkImageAdExtensionTest;
import com.microsoft.bingads.bulk.entities.BulkImageAdExtension;

public class BulkImageAdExtensionWriteFromRowValuesAlternativeTextTest extends BulkImageAdExtensionTest {

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
        this.<String>testWriteProperty("Alternative Text", this.datum, this.expectedResult, new BiConsumer<BulkImageAdExtension, String>() {
            @Override
            public void accept(BulkImageAdExtension c, String v) {
                c.getImageAdExtension().setAlternativeText(v);
            }
        });
    }
}
