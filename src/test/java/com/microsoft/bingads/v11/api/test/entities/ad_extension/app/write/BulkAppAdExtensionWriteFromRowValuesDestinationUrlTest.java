package com.microsoft.bingads.v11.api.test.entities.ad_extension.app.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v11.api.test.entities.ad_extension.app.BulkAppAdExtensionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAppAdExtension;

public class BulkAppAdExtensionWriteFromRowValuesDestinationUrlTest extends BulkAppAdExtensionTest {

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
        this.testWriteProperty("Destination Url", this.datum, this.expectedResult, new BiConsumer<BulkAppAdExtension, String>() {
            @Override
            public void accept(BulkAppAdExtension c, String v) {
                c.getAppAdExtension().setDestinationUrl(v);
            }
        });
    }
}
