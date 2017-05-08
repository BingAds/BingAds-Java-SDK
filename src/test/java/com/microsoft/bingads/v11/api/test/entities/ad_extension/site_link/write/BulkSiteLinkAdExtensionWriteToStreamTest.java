package com.microsoft.bingads.v11.api.test.entities.ad_extension.site_link.write;

import com.microsoft.bingads.v11.api.test.entities.ad_extension.site_link.BulkSiteLinkAdExtensionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkSiteLink;
import com.microsoft.bingads.v11.bulk.entities.BulkSiteLinkAdExtension;
import com.microsoft.bingads.v11.campaignmanagement.AdExtensionStatus;
import com.microsoft.bingads.v11.campaignmanagement.ArrayOfSiteLink;
import com.microsoft.bingads.v11.campaignmanagement.SiteLink;
import com.microsoft.bingads.v11.campaignmanagement.SiteLinksAdExtension;
import com.microsoft.bingads.v11.internal.bulk.BulkObjectWriter;
import com.microsoft.bingads.v11.internal.bulk.entities.SiteLinkAdExtensionIdentifier;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import static org.easymock.EasyMock.and;
import static org.easymock.EasyMock.anyObject;
import static org.easymock.EasyMock.cmp;
import static org.easymock.EasyMock.eq;
import org.easymock.EasyMockRunner;
import org.easymock.LogicalOperator;
import org.easymock.Mock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EasyMockRunner.class)
public class BulkSiteLinkAdExtensionWriteToStreamTest extends
        BulkSiteLinkAdExtensionTest {

    private static final Comparator<SiteLinkAdExtensionIdentifier> IDENTIFIER_COMPARATOR = new Comparator<SiteLinkAdExtensionIdentifier>() {

        @Override
        public int compare(SiteLinkAdExtensionIdentifier o1,
                SiteLinkAdExtensionIdentifier o2) {
            boolean areEqual = o1.getAccountId() == o2.getAccountId();
            areEqual &= o1.getAdExtensionId().equals(o2.getAdExtensionId());
            areEqual &= o1.getStatus().equals(o2.getStatus());

            if (areEqual) {
                return 0;
            } else {
                return -1;
            }
        }
    };
    private static final Comparator<BulkSiteLink> BULK_SITE_LINK_COMPARATOR = new Comparator<BulkSiteLink>() {

        @Override
        public int compare(BulkSiteLink o1, BulkSiteLink o2) {
            boolean areEqual = o1.getAccountId().equals(o2.getAccountId());
            areEqual &= o1.getSiteLink().equals(o2.getSiteLink());

            if (areEqual) {
                return 0;
            } else {
                return -1;
            }
        }
    };

    @Mock
    BulkObjectWriter rowWriter;

    @Test
    public void test() throws IOException {
        SiteLinksAdExtension apiAdExtension = new SiteLinksAdExtension();
        apiAdExtension.setId(10L);

        ArrayOfSiteLink arrayOfSiteLinks = new ArrayOfSiteLink();
        List<SiteLink> siteLinks = arrayOfSiteLinks.getSiteLinks();
        siteLinks.add(new SiteLink());
        siteLinks.add(new SiteLink());
        apiAdExtension.setSiteLinks(arrayOfSiteLinks);

        BulkSiteLinkAdExtension adExtension = new BulkSiteLinkAdExtension();
        adExtension.setAccountId(123L);
        adExtension.setSiteLinksAdExtension(apiAdExtension);

        SiteLinkAdExtensionIdentifier identifier = new SiteLinkAdExtensionIdentifier();
        identifier.setAccountId(123L);
        identifier.setAdExtensionId(10L);
        identifier.setStatus(AdExtensionStatus.DELETED);
        BulkSiteLink siteLink1 = new BulkSiteLink();
        siteLink1.setAccountId(123L);
        siteLink1.setSiteLink(apiAdExtension.getSiteLinks().getSiteLinks().get(0));
        BulkSiteLink siteLink2 = new BulkSiteLink();
        siteLink2.setAccountId(123L);
        siteLink2.setSiteLink(apiAdExtension.getSiteLinks().getSiteLinks().get(1));

        rowWriter.writeObjectRow(and(anyObject(SiteLinkAdExtensionIdentifier.class), cmp(identifier, IDENTIFIER_COMPARATOR, LogicalOperator.EQUAL)), eq(false));
        rowWriter.writeObjectRow(and(anyObject(BulkSiteLink.class), cmp(siteLink1, BULK_SITE_LINK_COMPARATOR, LogicalOperator.EQUAL)), eq(false));
        rowWriter.writeObjectRow(and(anyObject(BulkSiteLink.class), cmp(siteLink2, BULK_SITE_LINK_COMPARATOR, LogicalOperator.EQUAL)), eq(false));

        replayAll();
        adExtension.writeToStream(rowWriter, false);
    }

}
