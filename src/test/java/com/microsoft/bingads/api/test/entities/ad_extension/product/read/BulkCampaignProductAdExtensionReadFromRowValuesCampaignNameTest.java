package com.microsoft.bingads.api.test.entities.ad_extension.product.read;

import com.microsoft.bingads.api.test.entities.ad_extension.product.BulkCampaignProductAdExtensionTest;
import com.microsoft.bingads.bulk.entities.BulkCampaignProductAdExtension;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

public class BulkCampaignProductAdExtensionReadFromRowValuesCampaignNameTest extends BulkCampaignProductAdExtensionTest {
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
        this.testReadProperty("Campaign", this.datum, this.expectedResult, new Function<BulkCampaignProductAdExtension, String>() {
            @Override
            public String apply(BulkCampaignProductAdExtension c) {
                return c.getCampaignName();
            }
        });
    }
}
