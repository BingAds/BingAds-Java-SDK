package com.microsoft.bingads.api.test.entities.ad_extension.site_link.bulk_site_link.read;

import java.util.Arrays;
import java.util.Collection;
import com.microsoft.bingads.internal.functionalInterfaces.Function;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.api.test.entities.ad_extension.site_link.bulk_site_link.BulkSiteLinkTest;
import com.microsoft.bingads.bulk.entities.BulkSiteLink;

public class BulkSiteLinkReadFromRowValuesDescription1Test extends BulkSiteLinkTest {

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
    public void testRead() {
        this.<String>testReadProperty("Sitelink Extension Description1", this.datum, this.expectedResult, new Function<BulkSiteLink, String>() {
            @Override
            public String apply(BulkSiteLink c) {
                return c.getSiteLink().getDescription1();
            }
        });
    }
}
