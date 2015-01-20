package com.microsoft.bingads.api.test.entities.ad_extension.site_link.read;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.api.test.TestFactory;
import com.microsoft.bingads.api.test.entities.DeleteAllRowPosition;
import com.microsoft.bingads.api.test.entities.MultirecordEntityTestHelper;
import com.microsoft.bingads.api.test.entities.ad_extension.site_link.BulkSiteLinkAdExtensionTest;
import com.microsoft.bingads.bulk.BulkFileReader;
import com.microsoft.bingads.bulk.ResultFileType;
import com.microsoft.bingads.bulk.entities.BulkSiteLink;
import com.microsoft.bingads.bulk.entities.BulkSiteLinkAdExtension;
import com.microsoft.bingads.campaignmanagement.AdExtensionStatus;
import com.microsoft.bingads.bulk.entities.BulkEntity;
import com.microsoft.bingads.internal.bulk.entities.adextensions.SiteLinkAdExtensionIdentifier;
import com.microsoft.bingads.internal.bulk.file.BulkObjectReader;
import java.util.ArrayList;

@RunWith(Parameterized.class)
public class HasDeleteAllRowTest extends BulkSiteLinkAdExtensionTest {

    @Parameter(value = 0)
    public DeleteAllRowPosition deleteAllRowPosition;

    @Parameter(value = 1)
    public ResultFileType type;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {DeleteAllRowPosition.IN_THE_BEGINNING, ResultFileType.PARTIAL_DOWNLOAD},
            {DeleteAllRowPosition.IN_THE_BEGINNING, ResultFileType.FULL_DOWNLOAD},
            {DeleteAllRowPosition.IN_THE_MIDDLE, ResultFileType.PARTIAL_DOWNLOAD},
            {DeleteAllRowPosition.IN_THE_MIDDLE, ResultFileType.FULL_DOWNLOAD},
            {DeleteAllRowPosition.IN_THE_END, ResultFileType.PARTIAL_DOWNLOAD},
            {DeleteAllRowPosition.IN_THE_END, ResultFileType.FULL_DOWNLOAD},});
    }

    @Test
    public void returnsFullSiteLinkAdExtension() {
        SiteLinkAdExtensionIdentifier identifier = new SiteLinkAdExtensionIdentifier();
        identifier.setAccountId(123L);
        identifier.setAdExtensionId(456L);

        SiteLinkAdExtensionIdentifier deleteAllRow = new SiteLinkAdExtensionIdentifier();
        deleteAllRow.setAccountId(123L);
        deleteAllRow.setAdExtensionId(456L);
        deleteAllRow.setStatus(AdExtensionStatus.DELETED);

        BulkSiteLink[] siteLinks = createSiteLinksWithSameIdentifier(3, identifier);

        BulkObjectReader objectReader = MultirecordEntityTestHelper.setupObjectReaderToReturnEntitiesAndDeleteAllRow(siteLinks, deleteAllRow, deleteAllRowPosition);

        BulkFileReader fileReader = TestFactory.createBulkFileReader(objectReader, type);

        List<BulkEntity> actualEntities = new ArrayList<BulkEntity>();

        for (BulkEntity entity : fileReader.getEntities()) {
            actualEntities.add(entity);
        }

        assertEquals(1, actualEntities.size());
        assertThat(actualEntities.get(0), instanceOf(BulkSiteLinkAdExtension.class));
        assertSiteLinkAdExtension(123, 456, siteLinks, BulkSiteLinkAdExtension.class.cast(actualEntities.get(0)));
    }
}
