package com.microsoft.bingads.v11.api.test.entities.ad_extension.review.read;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v11.api.test.entities.ad_extension.review.BulkCampaignReviewAdExtensionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaignReviewAdExtension;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

public class BulkCampaignReviewAdExtensionReadFromRowValuesCampaignNameTest extends BulkCampaignReviewAdExtensionTest {
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
        this.testReadProperty("Campaign", this.datum, this.expectedResult, new Function<BulkCampaignReviewAdExtension, String>() {
            @Override
            public String apply(BulkCampaignReviewAdExtension c) {
                return c.getCampaignName();
            }
        });
    }
}
