package com.microsoft.bingads.v11.api.test.entities.campaign_negative_dsa_target.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v11.api.test.entities.campaign_negative_dsa_target.BulkCampaignNegativeDynamicSearchAdTargetTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaignNegativeDynamicSearchAdTarget;
import com.microsoft.bingads.v11.bulk.entities.Status;

@RunWith(Parameterized.class)
public class BulkCampaignNegativeDynamicSearchAdTargetReadStatusTest extends BulkCampaignNegativeDynamicSearchAdTargetTest {

    @Parameter(value = 1)
    public Status expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"", null},
                        {null, null},
                        {"Active", Status.ACTIVE},
                        {"Deleted", Status.DELETED}
                }
        );
    }

    @Test
    public void testRead() {
        testReadProperty(
                "Status",
                datum,
                expectedResult,
                new Function<BulkCampaignNegativeDynamicSearchAdTarget, Status>() {
                    @Override
                    public Status apply(BulkCampaignNegativeDynamicSearchAdTarget c) {
                        return c.getStatus();
                    }
                }
        );
    }
}
