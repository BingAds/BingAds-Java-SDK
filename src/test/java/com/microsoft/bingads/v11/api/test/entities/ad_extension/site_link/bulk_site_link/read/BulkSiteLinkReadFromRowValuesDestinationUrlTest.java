package com.microsoft.bingads.v11.api.test.entities.ad_extension.site_link.bulk_site_link.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v11.api.test.entities.ad_extension.site_link.bulk_site_link.BulkSiteLinkTest;
import com.microsoft.bingads.v11.bulk.entities.BulkSiteLink;

public class BulkSiteLinkReadFromRowValuesDestinationUrlTest extends BulkSiteLinkTest {

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
        this.<String>testReadProperty("Sitelink Extension Destination Url", this.datum, this.expectedResult, new Function<BulkSiteLink, String>() {
            @Override
            public String apply(BulkSiteLink c) {
                return c.getSiteLink().getDestinationUrl();
            }
        });
    }
}
