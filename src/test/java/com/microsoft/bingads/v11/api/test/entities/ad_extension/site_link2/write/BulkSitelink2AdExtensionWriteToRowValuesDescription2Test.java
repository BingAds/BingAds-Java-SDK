package com.microsoft.bingads.v11.api.test.entities.ad_extension.site_link2.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v11.api.test.entities.ad_extension.site_link2.BulkSitelink2AdExtensionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkSitelink2AdExtension;

public class BulkSitelink2AdExtensionWriteToRowValuesDescription2Test extends BulkSitelink2AdExtensionTest {

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
        this.<String>testWriteProperty("Sitelink Extension Description2", this.datum, this.expectedResult, new BiConsumer<BulkSitelink2AdExtension, String>() {
            @Override
            public void accept(BulkSitelink2AdExtension c, String v) {
                c.getSitelink2AdExtension().setDescription2(v);
            }
        });
    }
}
