package com.microsoft.bingads.api.test.entities.ad_extension.site_link.read;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.List;
import org.junit.Test;

import com.microsoft.bingads.api.test.TestFactory;
import com.microsoft.bingads.api.test.entities.MultirecordEntityTestHelper;
import com.microsoft.bingads.api.test.entities.ad_extension.site_link.BulkSiteLinkAdExtensionTest;
import com.microsoft.bingads.bulk.BulkFileReader;
import com.microsoft.bingads.bulk.ResultFileType;
import com.microsoft.bingads.bulk.entities.BulkProductConditionCollection;
import com.microsoft.bingads.bulk.entities.BulkSiteLink;
import com.microsoft.bingads.bulk.entities.BulkSiteLinkAdExtension;
import com.microsoft.bingads.bulk.entities.BulkEntity;
import com.microsoft.bingads.internal.bulk.entities.adextensions.SiteLinkAdExtensionIdentifier;
import com.microsoft.bingads.internal.bulk.file.BulkObjectReader;
import java.util.ArrayList;

public class BulkSiteLinkAdExtensionReadFromBulkReaderTest extends BulkSiteLinkAdExtensionTest {

    @Test
    public void readFromBulkFileReader_NoDeleteAllRowNotFullDownload_IndividualSiteLinksAreReturned() {
        BulkSiteLink[] siteLinks = createSiteLinksWithSameIdentifier(3);

        BulkObjectReader objectReader = MultirecordEntityTestHelper.createFakeObjectReader(siteLinks);

        BulkFileReader fileReader = TestFactory.createBulkFileReader(objectReader, ResultFileType.PARTIAL_DOWNLOAD);

        replayAll();

        BulkSiteLink[] expectedEntities = new BulkSiteLink[]{siteLinks[0], siteLinks[1], siteLinks[2]};

        Iterable<BulkEntity> actualEntities = fileReader.getEntities();

        List<BulkSiteLink> actualSiteLinks = new ArrayList<BulkSiteLink>();

        for (BulkEntity entity : actualEntities) {
            actualSiteLinks.add((BulkSiteLink) entity);
        }

        assertThat(actualSiteLinks, hasItems(expectedEntities));
    }

    @Test
    public void readFromBulkFileReader_NoDeleteAllRowFullDownload_ReturnsFullSiteLinkAdExtension() {
        SiteLinkAdExtensionIdentifier identifier = new SiteLinkAdExtensionIdentifier();
        identifier.setAccountId(123L);
        identifier.setAdExtensionId(456L);

        BulkSiteLink[] siteLinks = createSiteLinksWithSameIdentifier(3, identifier);

        BulkSiteLink siteLink1 = siteLinks[0];
        BulkSiteLink siteLink2 = siteLinks[1];
        BulkSiteLink siteLink3 = siteLinks[2];

        BulkObjectReader objectReader = MultirecordEntityTestHelper.createFakeObjectReader(siteLink1, siteLink2, siteLink3);

        BulkFileReader fileReader = TestFactory.createBulkFileReader(objectReader, ResultFileType.FULL_DOWNLOAD);

        List<BulkEntity> actualEntities = new ArrayList<BulkEntity>();

        for (BulkEntity entity : fileReader.getEntities()) {
            actualEntities.add(entity);
        }

        assertEquals(1, actualEntities.size());
        assertThat(actualEntities.get(0), instanceOf(BulkSiteLinkAdExtension.class));

        assertSiteLinkAdExtension(123L, 456L, new BulkSiteLink[]{siteLink1, siteLink2, siteLink3}, BulkSiteLinkAdExtension.class.cast(actualEntities.get(0)));
    }
}
