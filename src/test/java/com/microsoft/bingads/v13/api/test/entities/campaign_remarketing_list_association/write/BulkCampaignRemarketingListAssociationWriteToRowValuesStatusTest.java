package com.microsoft.bingads.v13.api.test.entities.campaign_remarketing_list_association.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.campaign_remarketing_list_association.BulkCampaignRemarketingListAssociationTest;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaignRemarketingListAssociation;
import com.microsoft.bingads.v13.campaignmanagement.CampaignCriterionStatus;

@RunWith(Parameterized.class)
public class BulkCampaignRemarketingListAssociationWriteToRowValuesStatusTest extends BulkCampaignRemarketingListAssociationTest {

    @Parameter
    public String datum;

    @Parameter(value = 1)
    public CampaignCriterionStatus propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Active", CampaignCriterionStatus.ACTIVE},
            {"Deleted", CampaignCriterionStatus.DELETED},
            {"Paused", CampaignCriterionStatus.PAUSED},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<CampaignCriterionStatus>testWriteProperty("Status", this.datum, this.propertyValue, new BiConsumer<BulkCampaignRemarketingListAssociation, CampaignCriterionStatus>() {
            @Override
            public void accept(BulkCampaignRemarketingListAssociation c, CampaignCriterionStatus v) {
                c.getBiddableCampaignCriterion().setStatus(v);;
            }
        });
    }
}
