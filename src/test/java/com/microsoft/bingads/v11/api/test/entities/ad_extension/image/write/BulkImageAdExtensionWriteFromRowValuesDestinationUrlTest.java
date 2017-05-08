package com.microsoft.bingads.v11.api.test.entities.ad_extension.image.write;

import com.microsoft.bingads.v11.api.test.entities.ad_extension.image.BulkImageAdExtensionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkImageAdExtension;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

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
