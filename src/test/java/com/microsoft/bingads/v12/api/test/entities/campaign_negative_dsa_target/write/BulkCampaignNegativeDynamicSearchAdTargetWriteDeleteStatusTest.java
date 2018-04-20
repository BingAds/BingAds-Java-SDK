package com.microsoft.bingads.v12.api.test.entities.campaign_negative_dsa_target.write;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import com.microsoft.bingads.v12.api.test.entities.Util;
import com.microsoft.bingads.v12.bulk.entities.BulkCampaignNegativeDynamicSearchAdTarget;
import com.microsoft.bingads.v12.bulk.entities.BulkEntity;
import com.microsoft.bingads.v12.bulk.entities.Status;
import com.microsoft.bingads.v12.campaignmanagement.NegativeCampaignCriterion;
import com.microsoft.bingads.v12.campaignmanagement.Webpage;
import com.microsoft.bingads.v12.campaignmanagement.WebpageParameter;

public class BulkCampaignNegativeDynamicSearchAdTargetWriteDeleteStatusTest {

    @Test
    public void testWriteWithDeleteStatus() {
        NegativeCampaignCriterion campaignCriterion = new NegativeCampaignCriterion();
        campaignCriterion.setId(1L);
        campaignCriterion.setCampaignId(2L);
        
        Webpage webpage = new Webpage();
        webpage.setParameter(new WebpageParameter());
        
        campaignCriterion.setCriterion(webpage);

        BulkCampaignNegativeDynamicSearchAdTarget bulkCampaignNegativeDynamicSearchAdTarget = new BulkCampaignNegativeDynamicSearchAdTarget();
        bulkCampaignNegativeDynamicSearchAdTarget.setNegativeCampaignCriterion(campaignCriterion);
        bulkCampaignNegativeDynamicSearchAdTarget.setStatus(Status.DELETED);

        ArrayList<BulkEntity> entities = new ArrayList<BulkEntity>();
        entities.add(bulkCampaignNegativeDynamicSearchAdTarget);
        ArrayList<BulkEntity> readBack = Util.WriteAndReadBack(entities);

        Assert.assertEquals(1, readBack.size());
    }
}
