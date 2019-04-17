package com.microsoft.bingads.v13.api.test.entities.ad_extension.app.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.app.BulkCampaignAppAdExtensionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaignAppAdExtension;

public class BulkCampaignAppAdExtensionReadFromRowValuesCampaignNameTest extends BulkCampaignAppAdExtensionTest {
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
        this.testReadProperty("Campaign", this.datum, this.expectedResult, new Function<BulkCampaignAppAdExtension, String>() {
            @Override
            public String apply(BulkCampaignAppAdExtension c) {
                return c.getCampaignName();
            }
        });
    }
}
