package com.microsoft.bingads.v10.api.test.entities.ad_extension.location.write;

import com.microsoft.bingads.v10.api.test.entities.ad_extension.location.BulkLocationAdExtensionTest;
import com.microsoft.bingads.v10.bulk.entities.BulkLocationAdExtension;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

public class BulkLocationAdExtensionWriteFromRowValuesCountryCodeTest extends BulkLocationAdExtensionTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Test text", "Test text"}
        });
    }

    @Test
    public void testWrite() {
        this.<String>testWriteProperty("Country Code", this.datum, this.expectedResult, new BiConsumer<BulkLocationAdExtension, String>() {
            @Override
            public void accept(BulkLocationAdExtension c, String v) {
                c.getLocationAdExtension().getAddress().setCountryCode(v);
            }
        });
    }
}
