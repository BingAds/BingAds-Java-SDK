package com.microsoft.bingads.v12.api.test.entities.negative_site.ad_group.sites.write;

import static org.easymock.EasyMock.and;
import static org.easymock.EasyMock.anyObject;
import static org.easymock.EasyMock.cmp;
import static org.easymock.EasyMock.eq;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;

import org.easymock.EasyMockRunner;
import org.easymock.LogicalOperator;
import org.easymock.Mock;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.microsoft.bingads.v12.api.test.entities.negative_site.ad_group.sites.BulkAdGroupNegativeSitesTest;
import com.microsoft.bingads.v12.bulk.entities.BulkAdGroupNegativeSite;
import com.microsoft.bingads.v12.bulk.entities.BulkAdGroupNegativeSites;
import com.microsoft.bingads.v12.bulk.entities.Status;
import com.microsoft.bingads.v12.campaignmanagement.AdGroupNegativeSites;
import com.microsoft.bingads.v12.campaignmanagement.ArrayOfstring;
import com.microsoft.bingads.v12.internal.bulk.BulkObjectWriter;
import com.microsoft.bingads.v12.internal.bulk.entities.BulkAdGroupNegativeSitesIdentifier;

@RunWith(EasyMockRunner.class)
public class BulkAdGroupNegativeSitesWriteTest extends BulkAdGroupNegativeSitesTest {

    private static final Comparator<Object> IDENTIFIER_COMPARATOR = new Comparator<Object>() {

        @Override
        public int compare(Object obj1,
                Object obj2) {

            if (!BulkAdGroupNegativeSitesIdentifier.class.isInstance(obj1)) {
                return -1;
            }

            if (!BulkAdGroupNegativeSitesIdentifier.class.isInstance(obj2)) {
                return 1;
            }

            BulkAdGroupNegativeSitesIdentifier o1 = BulkAdGroupNegativeSitesIdentifier.class.cast(obj1);

            BulkAdGroupNegativeSitesIdentifier o2 = BulkAdGroupNegativeSitesIdentifier.class.cast(obj2);

            if (o1.getAdGroupId() == o2.getAdGroupId()) {
                return 0;
            } else {
                return -1;
            }
        }
    };
    private static final Comparator<Object> BULK_NEGATIVE_SITE_COMPARATOR = new Comparator<Object>() {

        @Override
        public int compare(Object obj1, Object obj2) {
            if (!BulkAdGroupNegativeSite.class.isInstance(obj1)) {
                return -1;
            }

            if (!BulkAdGroupNegativeSite.class.isInstance(obj2)) {
                return 1;
            }

            BulkAdGroupNegativeSite o1 = BulkAdGroupNegativeSite.class.cast(obj1);

            BulkAdGroupNegativeSite o2 = BulkAdGroupNegativeSite.class.cast(obj2);
            if (o1.getAdGroupId() == o2.getAdGroupId()) {
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
        AdGroupNegativeSites apiAdGroupNegativeSites = new AdGroupNegativeSites();
        apiAdGroupNegativeSites.setAdGroupId(123L);

        ArrayOfstring arrayOfBulkAdGroupNegativeSites = new ArrayOfstring();
        List<String> bulkAdGroupNegativeSites = arrayOfBulkAdGroupNegativeSites.getStrings();
        bulkAdGroupNegativeSites.add("Site 1");
        bulkAdGroupNegativeSites.add("Site 2");
        apiAdGroupNegativeSites.setNegativeSites(arrayOfBulkAdGroupNegativeSites);

        BulkAdGroupNegativeSites adGroupNegativeSites = new BulkAdGroupNegativeSites();
        adGroupNegativeSites.setAdGroupName("Test Ad Group");
        adGroupNegativeSites.setAdGroupNegativeSites(apiAdGroupNegativeSites);

        BulkAdGroupNegativeSitesIdentifier identifier = new BulkAdGroupNegativeSitesIdentifier();
        identifier.setAdGroupId(123L);
        identifier.setStatus(Status.DELETED);

        BulkAdGroupNegativeSite bulkAdGroupNegativeSite1 = new BulkAdGroupNegativeSite();
        bulkAdGroupNegativeSite1.setAdGroupId(123L);
        bulkAdGroupNegativeSite1.setWebsite(apiAdGroupNegativeSites.getNegativeSites().getStrings().get(0));
        BulkAdGroupNegativeSite bulkAdGroupNegativeSite2 = new BulkAdGroupNegativeSite();
        bulkAdGroupNegativeSite2.setAdGroupId(123L);
        bulkAdGroupNegativeSite2.setWebsite(apiAdGroupNegativeSites.getNegativeSites().getStrings().get(1));

        rowWriter.writeObjectRow(and(anyObject(BulkAdGroupNegativeSitesIdentifier.class), cmp(identifier, IDENTIFIER_COMPARATOR, LogicalOperator.EQUAL)), eq(false));
        rowWriter.writeObjectRow(and(anyObject(BulkAdGroupNegativeSite.class), cmp(bulkAdGroupNegativeSite1, BULK_NEGATIVE_SITE_COMPARATOR, LogicalOperator.EQUAL)), eq(false));
        rowWriter.writeObjectRow(and(anyObject(BulkAdGroupNegativeSite.class), cmp(bulkAdGroupNegativeSite2, BULK_NEGATIVE_SITE_COMPARATOR, LogicalOperator.EQUAL)), eq(false));
        replayAll();
        adGroupNegativeSites.writeToStream(rowWriter, false);
    }
}
