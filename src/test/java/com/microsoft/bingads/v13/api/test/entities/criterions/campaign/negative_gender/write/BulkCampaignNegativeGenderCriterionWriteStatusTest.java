package com.microsoft.bingads.v13.api.test.entities.criterions.campaign.negative_gender.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.negative_gender.BulkCampaignNegativeGenderCriterionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaignNegativeGenderCriterion;
import com.microsoft.bingads.v13.campaignmanagement.CampaignCriterionStatus;

@RunWith(Parameterized.class)
public class BulkCampaignNegativeGenderCriterionWriteStatusTest extends BulkCampaignNegativeGenderCriterionTest {

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
                new BiConsumer<BulkCampaignNegativeGenderCriterion, CampaignCriterionStatus>() {
                    @Override
                    public void accept(BulkCampaignNegativeGenderCriterion c, CampaignCriterionStatus v) {
                        c.getNegativeCampaignCriterion().setStatus(v);
                    }
                }
        );
    }
}
