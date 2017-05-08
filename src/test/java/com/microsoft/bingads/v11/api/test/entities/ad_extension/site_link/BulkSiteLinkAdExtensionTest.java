package com.microsoft.bingads.v11.api.test.entities.ad_extension.site_link;

import com.microsoft.bingads.v11.bulk.entities.BulkSiteLink;
import com.microsoft.bingads.v11.bulk.entities.BulkSiteLinkAdExtension;
import com.microsoft.bingads.v11.internal.bulk.entities.SiteLinkAdExtensionIdentifier;
import java.util.List;
import org.easymock.EasyMockSupport;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public abstract class BulkSiteLinkAdExtensionTest extends EasyMockSupport {

    protected static void assertSiteLinkAdExtension(long expectedAccountId, long expectedAdExtensionId, BulkSiteLink[] bulkSiteLinks, BulkSiteLinkAdExtension actualBulkSiteLinkAdExtension) {
        assertEquals(123, expectedAccountId);
        assertEquals(456, expectedAdExtensionId);

        List<BulkSiteLink> actualSiteLinks = actualBulkSiteLinkAdExtension.getSiteLinks();

        assertThat(actualSiteLinks, hasItems(bulkSiteLinks));
    }

    protected BulkSiteLink[] createSiteLinksWithSameIdentifier(int count) {
        return this.createSiteLinksWithSameIdentifier(count, null);
    }

    protected BulkSiteLink[] createSiteLinksWithSameIdentifier(int count, SiteLinkAdExtensionIdentifier identifier) {
        if (identifier == null) {
            identifier = new SiteLinkAdExtensionIdentifier();
            identifier.setAccountId(123L);
            identifier.setAdExtensionId(456L);
        }

        BulkSiteLink[] siteLinks = new BulkSiteLink[count];

        for (int i = 0; i < count; i++) {
            siteLinks[i] = new BulkSiteLink();
            siteLinks[i].setAccountId(identifier.getAccountId());
            siteLinks[i].setAdExtensionId(identifier.getAdExtensionId());
            siteLinks[i].setOrder(i);
        }

        return siteLinks;
    }
}
