package com.microsoft.bingads.api.test.entities.ad_extension.site_link.bulk_site_link.write;

import java.util.Arrays;
import java.util.Collection;
import com.microsoft.bingads.internal.functionalInterfaces.BiConsumer;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.api.test.entities.ad_extension.site_link.bulk_site_link.BulkSiteLinkTest;
import com.microsoft.bingads.bulk.entities.BulkSiteLink;

public class BulkSiteLinkWriteFromRowValuesDestinationUrlTest extends BulkSiteLinkTest {

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
        this.<String>testWriteProperty("Sitelink Extension Destination Url", this.datum, this.expectedResult, new BiConsumer<BulkSiteLink, String>() {
            @Override
            public void accept(BulkSiteLink c, String v) {
                c.getSiteLink().setDestinationUrl(v);
            }
        });
    }
}
