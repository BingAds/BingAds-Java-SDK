package com.microsoft.bingads.v10.api.test.entities.negative_site.ad_group.sites;

import com.microsoft.bingads.v10.api.test.entities.Util;
import com.microsoft.bingads.v10.bulk.entities.BulkAdGroupNegativeSite;
import com.microsoft.bingads.v10.bulk.entities.BulkAdGroupNegativeSites;
import com.microsoft.bingads.v10.bulk.entities.BulkEntity;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class BulkAdGroupNegativeSitesReadWriteTest {

    @Test
    public void readBulkAdGroupNegativeSitesWithDifferentAdGroupIds() {
        ArrayList<BulkEntity> negativeSites = new ArrayList<BulkEntity>();

        BulkAdGroupNegativeSite site = new BulkAdGroupNegativeSite();
        site.setAdGroupId(1001L);
        site.setWebsite("http://microsoft.com");
        negativeSites.add(site);

        site = new BulkAdGroupNegativeSite();
        site.setAdGroupId(1002L);
        site.setWebsite("http://google.com");
        negativeSites.add(site);

        ArrayList<BulkEntity> readBack = Util.WriteAndReadBack(negativeSites);
        Assert.assertEquals(2, readBack.size());

        BulkAdGroupNegativeSites a = (BulkAdGroupNegativeSites) readBack.get(0);
        Assert.assertEquals(1001L, a.getAdGroupNegativeSites().getAdGroupId().longValue());
        Assert.assertEquals(
                "http://microsoft.com",
                a.getNegativeSites().get(0).getWebsite()
        );

        BulkAdGroupNegativeSites b = (BulkAdGroupNegativeSites) readBack.get(1);
        Assert.assertEquals(1002L, b.getAdGroupNegativeSites().getAdGroupId().longValue());
        Assert.assertEquals(
                "http://google.com",
                b.getNegativeSites().get(0).getWebsite()
        );
    }
}
