package com.microsoft.bingads.v13.api.test.entities.criterions.campaign.negative_age.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.negative_age.BulkCampaignNegativeAgeCriterionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaignNegativeAgeCriterion;
import com.microsoft.bingads.v13.campaignmanagement.CampaignCriterionStatus;

@RunWith(Parameterized.class)
public class BulkCampaignNegativeAgeCriterionWriteStatusTest extends BulkCampaignNegativeAgeCriterionTest {

    @Parameter(value = 1)
    public CampaignCriterionStatus propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"Active", CampaignCriterionStatus.ACTIVE},
                        {"Deleted", CampaignCriterionStatus.DELETED},
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
                new BiConsumer<BulkCampaignNegativeAgeCriterion, CampaignCriterionStatus>() {
                    @Override
                    public void accept(BulkCampaignNegativeAgeCriterion c, CampaignCriterionStatus v) {
                        c.getNegativeCampaignCriterion().setStatus(v);
                    }
                }
        );
    }
}
