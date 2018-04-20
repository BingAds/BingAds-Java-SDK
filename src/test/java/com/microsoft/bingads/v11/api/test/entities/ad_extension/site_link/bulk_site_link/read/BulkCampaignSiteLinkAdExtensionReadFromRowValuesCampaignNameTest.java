package com.microsoft.bingads.v11.api.test.entities.ad_extension.site_link.bulk_site_link.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v11.api.test.entities.ad_extension.site_link.bulk_site_link.BulkCampaignSiteLinkAdExtensionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaignSiteLinkAdExtension;

public class BulkCampaignSiteLinkAdExtensionReadFromRowValuesCampaignNameTest extends BulkCampaignSiteLinkAdExtensionTest {
    @Parameterized.Parameter(value = 1)
    public String expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"Campaign Name String", "Campaign Name String"},
                {"", ""},
                {null, null}
        });
    }

    @Test
    public void testRead() {
        this.testReadProperty("Campaign", this.datum, this.expectedResult, new Function<BulkCampaignSiteLinkAdExtension, String>() {
            @Override
            public String apply(BulkCampaignSiteLinkAdExtension c) {
                return c.getCampaignName();
            }
        });
    }
}
