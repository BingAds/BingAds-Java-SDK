package com.microsoft.bingads.v11.api.test.entities.negative_site.campaign.sites.read;

import com.microsoft.bingads.v11.api.test.entities.negative_site.campaign.sites.BulkCampaignNegativeSitesTest;
import com.microsoft.bingads.v11.bulk.BulkFileReader;
import com.microsoft.bingads.v11.bulk.ResultFileType;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaignNegativeSite;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaignNegativeSites;
import com.microsoft.bingads.v11.bulk.entities.BulkEntity;
import com.microsoft.bingads.v11.bulk.entities.MultirecordEntityTestHelper;
import com.microsoft.bingads.v11.bulk.entities.Status;
import com.microsoft.bingads.v11.internal.bulk.BulkObject;
import com.microsoft.bingads.v11.internal.bulk.BulkObjectReader;
import com.microsoft.bingads.v11.internal.bulk.TestFactory;
import com.microsoft.bingads.v11.internal.bulk.entities.BulkCampaignNegativeSitesIdentifier;
import java.util.ArrayList;
import java.util.List;
import org.easymock.EasyMockRunner;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EasyMockRunner.class)
public class BulkCampaignNegativeSitesReadTest extends BulkCampaignNegativeSitesTest {

    private static final int CampaignId = 123;

    @Test
    public void testRead() {
        List<BulkObject> objects = BulkCampaignNegativeSitesReadTest.createObjectListWithIdentifier();

        addNegativeSite(objects, "site 1");
        addNegativeSite(objects, "site 2");

        BulkCampaignNegativeSites bulkNegativeSites = BulkCampaignNegativeSitesReadTest.readCampaignNegativeSites(objects);

        List<String> apiNegativeSites = bulkNegativeSites.getCampaignNegativeSites().getNegativeSites().getStrings();

        assertEquals(2, apiNegativeSites.size());

        assertEquals("site 1", apiNegativeSites.get(0));
        assertEquals("site 2", apiNegativeSites.get(1));
    }

    private static List<BulkObject> createObjectListWithIdentifier() {
        List<BulkObject> objects = new ArrayList<BulkObject>();

        BulkCampaignNegativeSitesIdentifier deleteAllRow = new BulkCampaignNegativeSitesIdentifier();
        deleteAllRow.setCampaignId(123L);
        deleteAllRow.setCampaignName("Test Ad Group");
        deleteAllRow.setCampaignName("Test Campaign");
        deleteAllRow.setStatus(Status.DELETED);
        objects.add(deleteAllRow);

        return objects;
    }

    public void addNegativeSite(List<BulkObject> objects, String website) {
        BulkCampaignNegativeSite site = new BulkCampaignNegativeSite();
        site.setCampaignId(123L);
        site.setWebsite(website);
        objects.add(site);
    }

    public static BulkCampaignNegativeSites readCampaignNegativeSites(List<BulkObject> objects) {
        BulkObject[] objectArray = new BulkObject[]{objects.get(0), objects.get(1), objects.get(2)};

        BulkObjectReader objectReader = MultirecordEntityTestHelper.createFakeObjectReader(objectArray);

        BulkFileReader fileReader = TestFactory.createBulkFileReader(objectReader, ResultFileType.PARTIAL_DOWNLOAD);

        List<BulkEntity> actualEntities = new ArrayList<BulkEntity>();

        for (BulkEntity entity : fileReader.getEntities()) {
            actualEntities.add(entity);
        }

        assertEquals(1, actualEntities.size());
        assertThat(actualEntities.get(0), instanceOf(BulkCampaignNegativeSites.class));

        return BulkCampaignNegativeSites.class.cast(actualEntities.get(0));
    }
}
