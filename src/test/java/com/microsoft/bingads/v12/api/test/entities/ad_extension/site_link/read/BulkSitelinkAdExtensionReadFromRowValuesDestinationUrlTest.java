package com.microsoft.bingads.v12.api.test.entities.ad_extension.site_link.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v12.api.test.entities.ad_extension.site_link.BulkSitelinkAdExtensionTest;
import com.microsoft.bingads.v12.bulk.entities.BulkSitelinkAdExtension;

public class BulkSitelinkAdExtensionReadFromRowValuesDestinationUrlTest extends BulkSitelinkAdExtensionTest {

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
        this.<String>testReadProperty("Sitelink Extension Destination Url", this.datum, this.expectedResult, new Function<BulkSitelinkAdExtension, String>() {
            @Override
            public String apply(BulkSitelinkAdExtension c) {
                return c.getSitelinkAdExtension().getDestinationUrl();
            }
        });
    }
}
