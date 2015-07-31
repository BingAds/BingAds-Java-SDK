package com.microsoft.bingads.api.test.entities.ad_group_product_partition.write;

import com.microsoft.bingads.api.test.entities.Util;
import com.microsoft.bingads.bulk.entities.BulkAdGroupProductPartition;
import com.microsoft.bingads.bulk.entities.BulkCampaignProductScope;
import com.microsoft.bingads.bulk.entities.BulkEntity;
import com.microsoft.bingads.bulk.entities.Status;
import com.microsoft.bingads.campaignmanagement.AdGroupCriterion;
import com.microsoft.bingads.campaignmanagement.AdGroupCriterionStatus;
import com.microsoft.bingads.campaignmanagement.BiddableAdGroupCriterion;
import com.microsoft.bingads.campaignmanagement.CampaignCriterion;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class WriteDeleteStatusTest {

    @Test
    public void testWriteWithDeleteStatus() {
        BiddableAdGroupCriterion adGroupCriterion = new BiddableAdGroupCriterion();
        adGroupCriterion.setId(1L);
        adGroupCriterion.setAdGroupId(2L);
        adGroupCriterion.setStatus(AdGroupCriterionStatus.DELETED);

        BulkAdGroupProductPartition bulkAdGroupProductPartition = new BulkAdGroupProductPartition();
        bulkAdGroupProductPartition.setAdGroupCriterion(adGroupCriterion);

        ArrayList<BulkEntity> entities = new ArrayList<BulkEntity>();
        entities.add(bulkAdGroupProductPartition);
        ArrayList<BulkEntity> readBack = Util.WriteAndReadBack(entities);

        Assert.assertEquals(1, readBack.size());
    }
}
