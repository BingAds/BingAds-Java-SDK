package com.microsoft.bingads.v13.api.test.entities.negative_site.campaign.sites;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.easymock.EasyMockSupport;

import com.microsoft.bingads.v13.bulk.entities.BulkCampaignNegativeSite;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaignNegativeSites;
import com.microsoft.bingads.v13.internal.bulk.entities.BulkCampaignNegativeSitesIdentifier;

public abstract class BulkCampaignNegativeSitesTest extends EasyMockSupport {

    protected final int CampaignId = 123;

    protected static void assertNegativeSites(BulkCampaignNegativeSite[] bulkCampaignNegativeSites, BulkCampaignNegativeSites actualBulkCampaignNegativeSites) {
        List<BulkCampaignNegativeSite> listBulkCampaignNegativeSites = actualBulkCampaignNegativeSites.getNegativeSites();

        assertThat(listBulkCampaignNegativeSites, hasItems(bulkCampaignNegativeSites));
    }

    protected BulkCampaignNegativeSite[] createBulkCampaignNegativeSitesWithSameIdentifier(int count) {
        return this.createBulkCampaignNegativeSitesWithSameIdentifier(count, null);
    }

    protected BulkCampaignNegativeSite[] createBulkCampaignNegativeSitesWithSameIdentifier(int count, BulkCampaignNegativeSitesIdentifier identifier) {
        if (identifier == null) {
            identifier = new BulkCampaignNegativeSitesIdentifier();
            identifier.setCampaignId(123L);
            identifier.setCampaignName("Test Campaign");
        }

        BulkCampaignNegativeSite[] BulkCampaignNegativeSites = new BulkCampaignNegativeSite[count];

        for (int i = 0; i < count; i++) {
            BulkCampaignNegativeSites[i] = new BulkCampaignNegativeSite();
            BulkCampaignNegativeSites[i].setCampaignId(identifier.getCampaignId());
            BulkCampaignNegativeSites[i].setCampaignName(identifier.getCampaignName());
        }

        return BulkCampaignNegativeSites;
    }
}
