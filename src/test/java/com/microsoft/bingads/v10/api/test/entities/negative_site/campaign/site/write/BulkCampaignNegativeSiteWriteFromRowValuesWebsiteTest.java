package com.microsoft.bingads.v10.api.test.entities.negative_site.campaign.site.write;

import com.microsoft.bingads.v10.api.test.entities.negative_site.campaign.site.BulkCampaignNegativeSiteTest;
import com.microsoft.bingads.v10.bulk.entities.BulkCampaignNegativeSite;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

public class BulkCampaignNegativeSiteWriteFromRowValuesWebsiteTest extends BulkCampaignNegativeSiteTest {

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
    public void testWrite() {
        this.<String>testWriteProperty("Website", this.datum, this.expectedResult, new BiConsumer<BulkCampaignNegativeSite, String>() {
            @Override
            public void accept(BulkCampaignNegativeSite c, String v) {
                c.setWebsite(v);
            }
        });
    }
}
