package com.microsoft.bingads.v11.api.test.entities.ad_extension.site_link.bulk_site_link.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v11.api.test.entities.ad_extension.site_link.bulk_site_link.BulkAdGroupSiteLinkAdExtensionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupSiteLinkAdExtension;

public class BulkAdGroupSiteLinkAdExtensionReadFromRowValuesCampaignNameTest extends BulkAdGroupSiteLinkAdExtensionTest {
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
        this.testReadProperty("Campaign", this.datum, this.expectedResult, new Function<BulkAdGroupSiteLinkAdExtension, String>() {
            @Override
            public String apply(BulkAdGroupSiteLinkAdExtension c) {
                return c.getCampaignName();
            }
        });
    }
}
