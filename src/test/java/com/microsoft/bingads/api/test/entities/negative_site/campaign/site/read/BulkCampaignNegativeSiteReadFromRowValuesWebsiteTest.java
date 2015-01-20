package com.microsoft.bingads.api.test.entities.negative_site.campaign.site.read;

import java.util.Arrays;
import java.util.Collection;
import com.microsoft.bingads.internal.functionalInterfaces.Function;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.api.test.entities.negative_site.campaign.site.BulkCampaignNegativeSiteTest;
import com.microsoft.bingads.bulk.entities.BulkCampaignNegativeSite;

public class BulkCampaignNegativeSiteReadFromRowValuesWebsiteTest extends BulkCampaignNegativeSiteTest {

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
        this.<String>testReadProperty("Website", this.datum, this.expectedResult, new Function<BulkCampaignNegativeSite, String>() {
            @Override
            public String apply(BulkCampaignNegativeSite c) {
                return c.getWebsite();
            }
        });
    }
}
