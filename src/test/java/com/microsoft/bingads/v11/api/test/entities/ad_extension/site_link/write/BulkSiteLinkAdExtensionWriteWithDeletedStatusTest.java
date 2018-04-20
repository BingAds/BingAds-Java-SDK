package com.microsoft.bingads.v11.api.test.entities.ad_extension.site_link.write;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import com.microsoft.bingads.v11.api.test.entities.Util;
import com.microsoft.bingads.v11.bulk.entities.BulkEntity;
import com.microsoft.bingads.v11.bulk.entities.BulkSiteLinkAdExtension;
import com.microsoft.bingads.v11.campaignmanagement.AdExtensionStatus;
import com.microsoft.bingads.v11.campaignmanagement.SiteLinksAdExtension;

public class BulkSiteLinkAdExtensionWriteWithDeletedStatusTest {

    @Test
    public void testWriteWithDeletedStatus() {
        BulkSiteLinkAdExtension adExtension = new BulkSiteLinkAdExtension();
        adExtension.setSiteLinksAdExtension(new SiteLinksAdExtension());
        adExtension.getSiteLinksAdExtension().setType("SiteLinksAdExtension");
        adExtension.getSiteLinksAdExtension().setId(10L);
        adExtension.getSiteLinksAdExtension().setStatus(AdExtensionStatus.DELETED);
        ArrayList<BulkEntity> adExtensions = new ArrayList<BulkEntity>();
        adExtensions.add(adExtension);
        ArrayList<BulkEntity> readBack = Util.WriteAndReadBack(adExtensions);
        Assert.assertEquals(1, readBack.size());
        BulkSiteLinkAdExtension a = (BulkSiteLinkAdExtension) readBack.get(0);
        Assert.assertEquals(Util.toJson(adExtension), Util.toJson(a));
    }
}
