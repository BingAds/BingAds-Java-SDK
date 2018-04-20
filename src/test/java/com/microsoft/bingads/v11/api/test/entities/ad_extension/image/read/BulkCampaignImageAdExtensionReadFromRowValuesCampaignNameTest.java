package com.microsoft.bingads.v11.api.test.entities.ad_extension.image.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v11.api.test.entities.ad_extension.image.BulkCampaignImageAdExtensionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaignImageAdExtension;

public class BulkCampaignImageAdExtensionReadFromRowValuesCampaignNameTest extends BulkCampaignImageAdExtensionTest {
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
        this.testReadProperty("Campaign", this.datum, this.expectedResult, new Function<BulkCampaignImageAdExtension, String>() {
            @Override
            public String apply(BulkCampaignImageAdExtension c) {
                return c.getCampaignName();
            }
        });
    }
}
