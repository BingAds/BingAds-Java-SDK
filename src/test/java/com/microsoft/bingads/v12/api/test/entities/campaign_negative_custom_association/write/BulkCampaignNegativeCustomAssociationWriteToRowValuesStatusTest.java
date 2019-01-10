package com.microsoft.bingads.v12.api.test.entities.campaign_negative_custom_association.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v12.api.test.entities.campaign_negative_custom_association.BulkCampaignNegativeCustomAssociationTest;
import com.microsoft.bingads.v12.bulk.entities.BulkCampaignNegativeCustomAudienceAssociation;
import com.microsoft.bingads.v12.campaignmanagement.CampaignCriterionStatus;

@RunWith(Parameterized.class)
public class BulkCampaignNegativeCustomAssociationWriteToRowValuesStatusTest extends BulkCampaignNegativeCustomAssociationTest {

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
        this.<CampaignCriterionStatus>testWriteProperty("Status", this.datum, this.propertyValue, new BiConsumer<BulkCampaignNegativeCustomAudienceAssociation, CampaignCriterionStatus>() {
            @Override
            public void accept(BulkCampaignNegativeCustomAudienceAssociation c, CampaignCriterionStatus v) {
                c.getNegativeCampaignCriterion().setStatus(v);;
            }
        });
    }
}
