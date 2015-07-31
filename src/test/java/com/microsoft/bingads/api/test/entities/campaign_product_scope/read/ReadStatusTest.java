package com.microsoft.bingads.api.test.entities.campaign_product_scope.read;

import com.microsoft.bingads.api.test.entities.campaign_product_scope.BulkCampaignProductScopeTest;
import com.microsoft.bingads.bulk.entities.BulkCampaignProductScope;
import com.microsoft.bingads.bulk.entities.Status;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ReadStatusTest extends BulkCampaignProductScopeTest {

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
                new Function<BulkCampaignProductScope, Status>() {
                    @Override
                    public Status apply(BulkCampaignProductScope c) {
                        return c.getStatus();
                    }
                }
        );
    }
}
