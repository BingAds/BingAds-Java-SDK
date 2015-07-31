package com.microsoft.bingads.api.test.entities.campaign_product_scope.write;

import com.microsoft.bingads.api.test.entities.Util;
import com.microsoft.bingads.bulk.entities.BulkCampaignProductScope;
import com.microsoft.bingads.bulk.entities.BulkEntity;
import com.microsoft.bingads.bulk.entities.BulkSiteLinkAdExtension;
import com.microsoft.bingads.bulk.entities.Status;
import com.microsoft.bingads.campaignmanagement.CampaignCriterion;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class WriteDeleteStatusTest {

    @Test
    public void testWriteWithDeleteStatus() {
        CampaignCriterion campaignCriterion = new CampaignCriterion();
        campaignCriterion.setId(1L);
        campaignCriterion.setCampaignId(2L);

        BulkCampaignProductScope bulkCampaignProductScope = new BulkCampaignProductScope();
        bulkCampaignProductScope.setCampaignCriterion(campaignCriterion);
        bulkCampaignProductScope.setStatus(Status.DELETED);

        ArrayList<BulkEntity> entities = new ArrayList<BulkEntity>();
        entities.add(bulkCampaignProductScope);
        ArrayList<BulkEntity> readBack = Util.WriteAndReadBack(entities);

        Assert.assertEquals(1, readBack.size());
    }
}
