package com.microsoft.bingads.api.test.entities.negative_site.campaign.sites.write;

import com.microsoft.bingads.api.test.entities.negative_site.campaign.sites.BulkCampaignNegativeSitesTest;
import com.microsoft.bingads.bulk.entities.BulkCampaignNegativeSite;
import com.microsoft.bingads.bulk.entities.BulkCampaignNegativeSites;
import com.microsoft.bingads.bulk.entities.Status;
import com.microsoft.bingads.campaignmanagement.ArrayOfstring;
import com.microsoft.bingads.campaignmanagement.CampaignNegativeSites;
import com.microsoft.bingads.internal.bulk.BulkObjectWriter;
import com.microsoft.bingads.internal.bulk.entities.BulkCampaignNegativeSitesIdentifier;
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
public class BulkCampaignNegativeSitesWriteTest extends BulkCampaignNegativeSitesTest {

    private static final Comparator<Object> IDENTIFIER_COMPARATOR = new Comparator<Object>() {

        @Override
        public int compare(Object obj1,
                Object obj2) {

            if (!BulkCampaignNegativeSitesIdentifier.class.isInstance(obj1)) {
                return -1;
            }

            if (!BulkCampaignNegativeSitesIdentifier.class.isInstance(obj2)) {
                return 1;
            }

            BulkCampaignNegativeSitesIdentifier o1 = BulkCampaignNegativeSitesIdentifier.class.cast(obj1);

            BulkCampaignNegativeSitesIdentifier o2 = BulkCampaignNegativeSitesIdentifier.class.cast(obj2);

            if (o1.getCampaignId() == o2.getCampaignId()) {
                return 0;
            } else {
                return -1;
            }
        }
    };
    private static final Comparator<Object> BULK_NEGATIVE_SITE_COMPARATOR = new Comparator<Object>() {

        @Override
        public int compare(Object obj1, Object obj2) {
            if (!BulkCampaignNegativeSite.class.isInstance(obj1)) {
                return -1;
            }

            if (!BulkCampaignNegativeSite.class.isInstance(obj2)) {
                return 1;
            }

            BulkCampaignNegativeSite o1 = BulkCampaignNegativeSite.class.cast(obj1);

            BulkCampaignNegativeSite o2 = BulkCampaignNegativeSite.class.cast(obj2);

            if (o1.getCampaignId() == o2.getCampaignId()) {
                return 0;
            } else {
                return -1;
            }
        }
    };

    @Mock
    BulkObjectWriter rowWriter;

    @Test
    public void testWriteToStream() throws IOException {
        CampaignNegativeSites apiCampaignNegativeSites = new CampaignNegativeSites();
        apiCampaignNegativeSites.setCampaignId(123L);

        ArrayOfstring arrayOfBulkCampaignNegativeSites = new ArrayOfstring();
        List<String> bulkCampaignNegativeSites = arrayOfBulkCampaignNegativeSites.getStrings();
        bulkCampaignNegativeSites.add("Site 1");
        bulkCampaignNegativeSites.add("Site 2");
        apiCampaignNegativeSites.setNegativeSites(arrayOfBulkCampaignNegativeSites);

        BulkCampaignNegativeSites CampaignNegativeSites = new BulkCampaignNegativeSites();
        CampaignNegativeSites.setCampaignName("Test Ad Group");
        CampaignNegativeSites.setCampaignNegativeSites(apiCampaignNegativeSites);

        BulkCampaignNegativeSitesIdentifier identifier = new BulkCampaignNegativeSitesIdentifier();
        identifier.setCampaignId(123L);
        identifier.setStatus(Status.DELETED);

        BulkCampaignNegativeSite bulkCampaignNegativeSite1 = new BulkCampaignNegativeSite();
        bulkCampaignNegativeSite1.setCampaignId(123L);
        bulkCampaignNegativeSite1.setWebsite(apiCampaignNegativeSites.getNegativeSites().getStrings().get(0));
        BulkCampaignNegativeSite bulkCampaignNegativeSite2 = new BulkCampaignNegativeSite();
        bulkCampaignNegativeSite2.setCampaignId(123L);
        bulkCampaignNegativeSite2.setWebsite(apiCampaignNegativeSites.getNegativeSites().getStrings().get(1));

        rowWriter.writeObjectRow(and(anyObject(BulkCampaignNegativeSitesIdentifier.class), cmp(identifier, IDENTIFIER_COMPARATOR, LogicalOperator.EQUAL)), eq(false));
        rowWriter.writeObjectRow(and(anyObject(BulkCampaignNegativeSite.class), cmp(bulkCampaignNegativeSite1, BULK_NEGATIVE_SITE_COMPARATOR, LogicalOperator.EQUAL)), eq(false));
        rowWriter.writeObjectRow(and(anyObject(BulkCampaignNegativeSite.class), cmp(bulkCampaignNegativeSite2, BULK_NEGATIVE_SITE_COMPARATOR, LogicalOperator.EQUAL)), eq(false));
        replayAll();
        CampaignNegativeSites.writeToStream(rowWriter, false);
    }
}
