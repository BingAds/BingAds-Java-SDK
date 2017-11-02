package com.microsoft.bingads.v11.api.test.entities.campaign_product_scope.write;

import com.microsoft.bingads.v11.api.test.entities.campaign_product_scope.BulkCampaignProductScopeTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaignProductScope;
import com.microsoft.bingads.v11.campaignmanagement.CampaignCriterionStatus;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class WriteStatusTest extends BulkCampaignProductScopeTest {

    @Parameter(value = 1)
    public CampaignCriterionStatus propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"Active", CampaignCriterionStatus.ACTIVE},
                        {"Deleted", CampaignCriterionStatus.DELETED},
                        {"Paused", CampaignCriterionStatus.PAUSED},
                        {null, null}
                }
        );
    }

    @Test
    public void testWrite() {
        testWriteProperty(
                "Status",
                datum,
                propertyValue,
                new BiConsumer<BulkCampaignProductScope, CampaignCriterionStatus>() {
                    @Override
                    public void accept(BulkCampaignProductScope c, CampaignCriterionStatus v) {
                        c.getBiddableCampaignCriterion().setStatus(v);
                    }
                }
        );
    }
}
