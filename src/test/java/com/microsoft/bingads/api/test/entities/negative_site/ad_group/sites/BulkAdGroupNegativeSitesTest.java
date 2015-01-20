package com.microsoft.bingads.api.test.entities.negative_site.ad_group.sites;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.easymock.EasyMockSupport;

import com.microsoft.bingads.bulk.entities.BulkAdGroupNegativeSite;
import com.microsoft.bingads.bulk.entities.BulkAdGroupNegativeSites;
import com.microsoft.bingads.internal.bulk.entities.negativesites.BulkAdGroupNegativeSitesIdentifier;

public abstract class BulkAdGroupNegativeSitesTest extends EasyMockSupport {

    protected final int AdGroupId = 123;

    protected static void assertNegativeSites(BulkAdGroupNegativeSite[] bulkAdGroupNegativeSites, BulkAdGroupNegativeSites actualBulkAdGroupNegativeSites) {
        List<BulkAdGroupNegativeSite> listBulkAdGroupNegativeSites = actualBulkAdGroupNegativeSites.getNegativeSites();

        assertThat(listBulkAdGroupNegativeSites, hasItems(bulkAdGroupNegativeSites));
    }

    protected BulkAdGroupNegativeSite[] createBulkAdGroupNegativeSitesWithSameIdentifier(int count) {
        return this.createBulkAdGroupNegativeSitesWithSameIdentifier(count, null);
    }

    protected BulkAdGroupNegativeSite[] createBulkAdGroupNegativeSitesWithSameIdentifier(int count, BulkAdGroupNegativeSitesIdentifier identifier) {
        if (identifier == null) {
            identifier = new BulkAdGroupNegativeSitesIdentifier();
            identifier.setAdGroupId(123L);
            identifier.setAdGroupName("Test Ad Group");
            identifier.setCampaignName("Test Campaign");
        }

        BulkAdGroupNegativeSite[] BulkAdGroupNegativeSites = new BulkAdGroupNegativeSite[count];

        for (int i = 0; i < count; i++) {
            BulkAdGroupNegativeSites[i] = new BulkAdGroupNegativeSite();
            BulkAdGroupNegativeSites[i].setAdGroupId(identifier.getAdGroupId());
            BulkAdGroupNegativeSites[i].setAdGroupName(identifier.getAdGroupName());
            BulkAdGroupNegativeSites[i].setCampaignName(identifier.getCampaignName());
        }

        return BulkAdGroupNegativeSites;
    }
}
