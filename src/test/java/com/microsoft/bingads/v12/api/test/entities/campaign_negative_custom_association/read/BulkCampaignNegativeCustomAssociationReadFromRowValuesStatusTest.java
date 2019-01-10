package com.microsoft.bingads.v12.api.test.entities.campaign_negative_custom_association.read;


import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v12.api.test.entities.campaign_negative_custom_association.BulkCampaignNegativeCustomAssociationTest;
import com.microsoft.bingads.v12.bulk.entities.BulkCampaignNegativeCustomAudienceAssociation;
import com.microsoft.bingads.v12.campaignmanagement.CampaignCriterionStatus;

@RunWith(Parameterized.class)
public class BulkCampaignNegativeCustomAssociationReadFromRowValuesStatusTest extends BulkCampaignNegativeCustomAssociationTest {

    @Parameter
    public String datum;

    @Parameter(value = 1)
    public CampaignCriterionStatus expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Active", CampaignCriterionStatus.ACTIVE},
            {"Deleted", CampaignCriterionStatus.DELETED},
            {"Paused", CampaignCriterionStatus.PAUSED},
            {"", null},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<CampaignCriterionStatus>testReadProperty("Status", this.datum, this.expectedResult, new Function<BulkCampaignNegativeCustomAudienceAssociation, CampaignCriterionStatus>() {
            @Override
            public CampaignCriterionStatus apply(BulkCampaignNegativeCustomAudienceAssociation c) {
                return c.getNegativeCampaignCriterion().getStatus();
            }
        });
    }
}
