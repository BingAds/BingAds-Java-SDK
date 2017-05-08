package com.microsoft.bingads.v11.api.test.entities.ad_extension.app.write;

import com.microsoft.bingads.v11.api.test.entities.ad_extension.app.BulkAppAdExtensionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAppAdExtension;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

public class BulkAppAdExtensionWriteFromRowValuesAppPlatformTest extends BulkAppAdExtensionTest {

    @Parameterized.Parameter(value = 1)
    public String expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"App Platform string", "App Platform string"},
                {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.testWriteProperty("App Platform", this.datum, this.expectedResult, new BiConsumer<BulkAppAdExtension, String>() {
            @Override
            public void accept(BulkAppAdExtension c, String v) {
                c.getAppAdExtension().setAppPlatform(v);
            }
        });
    }
}
