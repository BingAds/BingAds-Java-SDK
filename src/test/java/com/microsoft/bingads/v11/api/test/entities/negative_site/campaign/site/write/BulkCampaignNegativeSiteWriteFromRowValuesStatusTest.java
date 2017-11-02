package com.microsoft.bingads.v11.api.test.entities.negative_site.campaign.site.write;

import com.microsoft.bingads.v11.api.test.entities.negative_site.campaign.site.BulkCampaignNegativeSiteTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaignNegativeSite;
import com.microsoft.bingads.v11.bulk.entities.Status;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

public class BulkCampaignNegativeSiteWriteFromRowValuesStatusTest extends BulkCampaignNegativeSiteTest {

    @Parameter(value = 1)
    public Status expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Active", Status.ACTIVE},
            {"Deleted", Status.DELETED},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<Status>testWriteProperty("Status", this.datum, this.expectedResult, new BiConsumer<BulkCampaignNegativeSite, Status>() {
            @Override
            public void accept(BulkCampaignNegativeSite c, Status v) {
                c.setStatus(v);
            }
        });
    }
}
