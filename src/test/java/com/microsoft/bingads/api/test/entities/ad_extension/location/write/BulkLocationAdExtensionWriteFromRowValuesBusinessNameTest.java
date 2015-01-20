package com.microsoft.bingads.api.test.entities.ad_extension.location.write;

import java.util.Arrays;
import java.util.Collection;
import com.microsoft.bingads.internal.functionalInterfaces.BiConsumer;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.api.test.entities.ad_extension.location.BulkLocationAdExtensionTest;
import com.microsoft.bingads.bulk.entities.BulkLocationAdExtension;

public class BulkLocationAdExtensionWriteFromRowValuesBusinessNameTest extends BulkLocationAdExtensionTest {

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
        this.<String>testWriteProperty("Business Name", this.datum, this.expectedResult, new BiConsumer<BulkLocationAdExtension, String>() {
            @Override
            public void accept(BulkLocationAdExtension c, String v) {
                c.getLocationAdExtension().setCompanyName(v);
            }
        });
    }
}
