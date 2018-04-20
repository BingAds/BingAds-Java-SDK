package com.microsoft.bingads.v12.api.test.entities.negative_site.ad_group.sites.read;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.easymock.EasyMockRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.microsoft.bingads.v12.api.test.entities.negative_site.ad_group.sites.BulkAdGroupNegativeSitesTest;
import com.microsoft.bingads.v12.bulk.BulkFileReader;
import com.microsoft.bingads.v12.bulk.ResultFileType;
import com.microsoft.bingads.v12.bulk.entities.BulkAdGroupNegativeSite;
import com.microsoft.bingads.v12.bulk.entities.BulkAdGroupNegativeSites;
import com.microsoft.bingads.v12.bulk.entities.BulkEntity;
import com.microsoft.bingads.v12.bulk.entities.MultirecordEntityTestHelper;
import com.microsoft.bingads.v12.bulk.entities.Status;
import com.microsoft.bingads.v12.internal.bulk.BulkObject;
import com.microsoft.bingads.v12.internal.bulk.BulkObjectReader;
import com.microsoft.bingads.v12.internal.bulk.TestFactory;
import com.microsoft.bingads.v12.internal.bulk.entities.BulkAdGroupNegativeSitesIdentifier;

@RunWith(EasyMockRunner.class)
public class BulkAdGroupNegativeSitesReadTest extends BulkAdGroupNegativeSitesTest {

    private static final int AdGroupId = 123;

    @Test
    public void testRead() {
        List<BulkObject> objects = BulkAdGroupNegativeSitesReadTest.createObjectListWithIdentifier();

        addNegativeSite(objects, "site 1");
        addNegativeSite(objects, "site 2");

        BulkAdGroupNegativeSites bulkNegativeSites = BulkAdGroupNegativeSitesReadTest.readAdGroupNegativeSites(objects);

        List<String> apiNegativeSites = bulkNegativeSites.getAdGroupNegativeSites().getNegativeSites().getStrings();

        assertEquals(2, apiNegativeSites.size());

        assertEquals("site 1", apiNegativeSites.get(0));
        assertEquals("site 2", apiNegativeSites.get(1));
    }

    private static List<BulkObject> createObjectListWithIdentifier() {
        List<BulkObject> objects = new ArrayList<BulkObject>();

        BulkAdGroupNegativeSitesIdentifier deleteAllRow = new BulkAdGroupNegativeSitesIdentifier();
        deleteAllRow.setAdGroupId(123L);
        deleteAllRow.setAdGroupName("Test Ad Group");
        deleteAllRow.setCampaignName("Test Campaign");
        deleteAllRow.setStatus(Status.DELETED);
        objects.add(deleteAllRow);

        return objects;
    }

    public void addNegativeSite(List<BulkObject> objects, String website) {
        BulkAdGroupNegativeSite site = new BulkAdGroupNegativeSite();
        site.setAdGroupId(123L);
        site.setWebsite(website);
        objects.add(site);
    }

    public static BulkAdGroupNegativeSites readAdGroupNegativeSites(List<BulkObject> objects) {
        BulkObject[] objectArray = new BulkObject[]{objects.get(0), objects.get(1), objects.get(2)};

        BulkObjectReader objectReader = MultirecordEntityTestHelper.createFakeObjectReader(objectArray);

        BulkFileReader fileReader = TestFactory.createBulkFileReader(objectReader, ResultFileType.PARTIAL_DOWNLOAD);

        List<BulkEntity> actualEntities = new ArrayList<BulkEntity>();

        for (BulkEntity entity : fileReader.getEntities()) {
            actualEntities.add(entity);
        }
        assertEquals(1, actualEntities.size());
        assertThat(actualEntities.get(0), instanceOf(BulkAdGroupNegativeSites.class));

        return BulkAdGroupNegativeSites.class.cast(actualEntities.get(0));
    }
}
