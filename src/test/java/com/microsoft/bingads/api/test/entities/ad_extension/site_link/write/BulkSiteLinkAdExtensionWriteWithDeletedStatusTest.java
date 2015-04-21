package com.microsoft.bingads.api.test.entities.ad_extension.site_link.write;

import com.microsoft.bingads.api.test.entities.Util;
import com.microsoft.bingads.bulk.entities.BulkEntity;
import com.microsoft.bingads.bulk.entities.BulkSiteLinkAdExtension;
import com.microsoft.bingads.campaignmanagement.AdExtensionStatus;
import com.microsoft.bingads.campaignmanagement.SiteLinksAdExtension;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

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
