package com.microsoft.bingads.v11.api.test.entities.ad_extension.location.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v11.api.test.entities.ad_extension.location.BulkCampaignLocationAdExtensionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaignLocationAdExtension;

public class BulkCampaignLocationAdExtensionReadFromRowValuesCampaignNameTest extends BulkCampaignLocationAdExtensionTest {
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
        this.testReadProperty("Campaign", this.datum, this.expectedResult, new Function<BulkCampaignLocationAdExtension, String>() {
            @Override
            public String apply(BulkCampaignLocationAdExtension c) {
                return c.getCampaignName();
            }
        });
    }
}
