package com.microsoft.bingads.v12.api.test.entities.campaign_remarketing_list_association.read;


import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v12.api.test.entities.campaign_remarketing_list_association.BulkCampaignRemarketingListAssociationTest;
import com.microsoft.bingads.v12.bulk.entities.BulkCampaignRemarketingListAssociation;
import com.microsoft.bingads.v12.campaignmanagement.CampaignCriterionStatus;

@RunWith(Parameterized.class)
public class BulkCampaignRemarketingListAssociationReadFromRowValuesStatusTest extends BulkCampaignRemarketingListAssociationTest {

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
        this.<CampaignCriterionStatus>testReadProperty("Status", this.datum, this.expectedResult, new Function<BulkCampaignRemarketingListAssociation, CampaignCriterionStatus>() {
            @Override
            public CampaignCriterionStatus apply(BulkCampaignRemarketingListAssociation c) {
                return c.getBiddableCampaignCriterion().getStatus();
            }
        });
    }
}
