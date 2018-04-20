package com.microsoft.bingads.v12.api.test.entities.negative_site.campaign.site.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v12.api.test.entities.negative_site.campaign.site.BulkCampaignNegativeSiteTest;
import com.microsoft.bingads.v12.bulk.entities.BulkCampaignNegativeSite;
import com.microsoft.bingads.v12.bulk.entities.Status;

public class BulkCampaignNegativeSiteReadFromRowValuesStatusTest extends BulkCampaignNegativeSiteTest {

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
    public void testRead() {
        this.<Status>testReadProperty("Status", this.datum, this.expectedResult, new Function<BulkCampaignNegativeSite, Status>() {
            @Override
            public Status apply(BulkCampaignNegativeSite c) {
                return c.getStatus();
            }
        });
    }
}
