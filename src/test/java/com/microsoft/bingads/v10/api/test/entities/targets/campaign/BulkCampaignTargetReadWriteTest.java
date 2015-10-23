package com.microsoft.bingads.v10.api.test.entities.targets.campaign;

import com.microsoft.bingads.v10.api.test.entities.Util;
import com.microsoft.bingads.v10.bulk.entities.BulkCampaignAgeTargetBid;
import com.microsoft.bingads.v10.bulk.entities.BulkCampaignTarget;
import com.microsoft.bingads.v10.bulk.entities.BulkEntity;
import com.microsoft.bingads.v10.campaignmanagement.AgeRange;
import com.microsoft.bingads.v10.campaignmanagement.AgeTargetBid;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class BulkCampaignTargetReadWriteTest {

    @Test
    public void readBulkCampaignTargetWithDifferentCampaignIds() {
        ArrayList<BulkEntity> targetBids = new ArrayList<BulkEntity>();

        BulkCampaignAgeTargetBid bulkBid = new BulkCampaignAgeTargetBid();
        AgeTargetBid bid = new AgeTargetBid();
        bulkBid.setAgeTargetBid(bid);
        bulkBid.setCampaignId(1001L);
        bid.setAge(AgeRange.EIGHTEEN_TO_TWENTY_FIVE);
        bid.setBidAdjustment(10);
        targetBids.add(bulkBid);

        bulkBid = new BulkCampaignAgeTargetBid();
        bid = new AgeTargetBid();
        bulkBid.setAgeTargetBid(bid);
        bulkBid.setCampaignId(1002L);
        bid.setAge(AgeRange.FIFTY_TO_SIXTY_FIVE);
        bid.setBidAdjustment(-10);
        targetBids.add(bulkBid);

        ArrayList<BulkEntity> readBack = Util.WriteAndReadBack(targetBids);
        Assert.assertEquals(2, readBack.size());

        BulkCampaignTarget a = (BulkCampaignTarget) readBack.get(0);
        Assert.assertEquals(1001L, a.getCampaignId().longValue());
        Assert.assertEquals(
                Util.toJson(((BulkCampaignAgeTargetBid) targetBids.get(0)).getAgeTargetBid()),
                Util.toJson(a.getAgeTarget().getBids().get(0).getAgeTargetBid())
        );

        BulkCampaignTarget b = (BulkCampaignTarget) readBack.get(1);
        Assert.assertEquals(1002L, b.getCampaignId().longValue());
        Assert.assertEquals(
                Util.toJson(((BulkCampaignAgeTargetBid) targetBids.get(1)).getAgeTargetBid()),
                Util.toJson(b.getAgeTarget().getBids().get(0).getAgeTargetBid())
        );
    }

}