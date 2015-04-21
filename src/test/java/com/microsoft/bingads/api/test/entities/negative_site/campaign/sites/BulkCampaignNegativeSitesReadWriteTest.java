package com.microsoft.bingads.api.test.entities.negative_site.campaign.sites;

import com.microsoft.bingads.api.test.entities.Util;
import com.microsoft.bingads.bulk.entities.BulkCampaignNegativeSite;
import com.microsoft.bingads.bulk.entities.BulkCampaignNegativeSites;
import com.microsoft.bingads.bulk.entities.BulkEntity;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class BulkCampaignNegativeSitesReadWriteTest {

    @Test
    public void readBulkCampaignNegativeSitesWithDifferentCampaignIds() {
        ArrayList<BulkEntity> negativeSites = new ArrayList<BulkEntity>();

        BulkCampaignNegativeSite site = new BulkCampaignNegativeSite();
        site.setCampaignId(1001L);
        site.setWebsite("http://microsoft.com");
        negativeSites.add(site);

        site = new BulkCampaignNegativeSite();
        site.setCampaignId(1002L);
        site.setWebsite("http://google.com");
        negativeSites.add(site);

        ArrayList<BulkEntity> readBack = Util.WriteAndReadBack(negativeSites);
        Assert.assertEquals(2, readBack.size());

        BulkCampaignNegativeSites a = (BulkCampaignNegativeSites) readBack.get(0);
        Assert.assertEquals(1001L, a.getCampaignNegativeSites().getCampaignId().longValue());
        Assert.assertEquals(
                "http://microsoft.com",
                a.getNegativeSites().get(0).getWebsite()
        );

        BulkCampaignNegativeSites b = (BulkCampaignNegativeSites) readBack.get(1);
        Assert.assertEquals(1002L, b.getCampaignNegativeSites().getCampaignId().longValue());
        Assert.assertEquals(
                "http://google.com",
                b.getNegativeSites().get(0).getWebsite()
        );
    }
}
