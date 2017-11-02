package com.microsoft.bingads.v11.api.test.entities.ad_extension.site_link2.read;

import com.microsoft.bingads.v11.api.test.entities.ad_extension.site_link2.BulkSitelink2AdExtensionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkSitelink2AdExtension;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

public class BulkSitelink2AdExtensionReadFromRowValuesDestinationUrlTest extends BulkSitelink2AdExtensionTest {

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
        this.<String>testReadProperty("Sitelink Extension Destination Url", this.datum, this.expectedResult, new Function<BulkSitelink2AdExtension, String>() {
            @Override
            public String apply(BulkSitelink2AdExtension c) {
                return c.getSitelink2AdExtension().getDestinationUrl();
            }
        });
    }
}
