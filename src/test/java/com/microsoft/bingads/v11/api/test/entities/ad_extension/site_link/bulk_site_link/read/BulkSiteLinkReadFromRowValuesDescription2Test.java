package com.microsoft.bingads.v11.api.test.entities.ad_extension.site_link.bulk_site_link.read;

import com.microsoft.bingads.v11.api.test.entities.ad_extension.site_link.bulk_site_link.BulkSiteLinkTest;
import com.microsoft.bingads.v11.bulk.entities.BulkSiteLink;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

public class BulkSiteLinkReadFromRowValuesDescription2Test extends BulkSiteLinkTest {

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
        this.<String>testReadProperty("Sitelink Extension Description2", this.datum, this.expectedResult, new Function<BulkSiteLink, String>() {
            @Override
            public String apply(BulkSiteLink c) {
                return c.getSiteLink().getDescription2();
            }
        });
    }
}
