package com.microsoft.bingads.v13.api.test.entities.ad_extension.site_link.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.site_link.BulkSitelinkAdExtensionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkSitelinkAdExtension;

public class BulkSitelinkAdExtensionWriteToRowValuesDescription2Test extends BulkSitelinkAdExtensionTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Test text", "Test text"},
            {"", ""},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<String>testWriteProperty("Sitelink Extension Description2", this.datum, this.expectedResult, new BiConsumer<BulkSitelinkAdExtension, String>() {
            @Override
            public void accept(BulkSitelinkAdExtension c, String v) {
                c.getSitelinkAdExtension().setDescription2(v);
            }
        });
    }
}
