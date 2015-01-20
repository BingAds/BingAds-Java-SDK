package com.microsoft.bingads.api.test.entities.ad_extension.product.read;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.microsoft.bingads.api.test.TestFactory;
import com.microsoft.bingads.api.test.entities.MultirecordEntityTestHelper;
import com.microsoft.bingads.api.test.entities.ad_extension.product.BulkProductAdExtensionTest;
import com.microsoft.bingads.bulk.BulkFileReader;
import com.microsoft.bingads.bulk.ResultFileType;
import com.microsoft.bingads.bulk.entities.BulkProductAdExtension;
import com.microsoft.bingads.bulk.entities.BulkProductConditionCollection;
import com.microsoft.bingads.bulk.entities.BulkSiteLinkAdExtension;
import com.microsoft.bingads.bulk.entities.BulkEntity;
import com.microsoft.bingads.internal.bulk.entities.adextensions.BulkProductAdExtensionIdentifier;
import com.microsoft.bingads.internal.bulk.file.BulkObjectReader;
import java.util.ArrayList;

public class ReadFromBulkReaderTest extends BulkProductAdExtensionTest {

    @Test
    public void NoDeleteAllRowNotFullDownload_IndividualProductsAreReturned() {
        BulkProductConditionCollection[] collections = createProductConditionCollectionsWithSameIdentifier(3);

        BulkProductConditionCollection collection1 = collections[0];
        BulkProductConditionCollection collection2 = collections[1];
        BulkProductConditionCollection collection3 = collections[2];

        BulkObjectReader objectReader = MultirecordEntityTestHelper.createFakeObjectReader(collections);

        BulkFileReader fileReader = TestFactory.createBulkFileReader(objectReader, ResultFileType.PARTIAL_DOWNLOAD);

        BulkProductConditionCollection[] expectedEntities = new BulkProductConditionCollection[]{collection1, collection2, collection3};

        Iterable<BulkEntity> actualEntities = fileReader.getEntities();

        List<BulkProductConditionCollection> actualCollections = new ArrayList<BulkProductConditionCollection>();

        for (BulkEntity entity : actualEntities) {
            actualCollections.add((BulkProductConditionCollection) entity);
        }

        assertThat(actualCollections, hasItems(expectedEntities));
    }

    public void BulkProductAdExtension_ReadFromBulkFileReader_NoDeleteAllRowFullDownload_ReturnsFullProductAdExtension() {
        BulkProductAdExtensionIdentifier identifier = new BulkProductAdExtensionIdentifier();
        identifier.setAccountId(123L);
        identifier.setAdExtensionId(456L);

        BulkProductConditionCollection[] collections = createProductConditionCollectionsWithSameIdentifier(3, identifier);

        BulkProductConditionCollection collection1 = collections[0];
        BulkProductConditionCollection collection2 = collections[1];
        BulkProductConditionCollection collection3 = collections[2];

        BulkObjectReader objectReader = MultirecordEntityTestHelper.createFakeObjectReader(collections);

        BulkFileReader fileReader = TestFactory.createBulkFileReader(objectReader, ResultFileType.FULL_DOWNLOAD);

        BulkProductConditionCollection[] expectedEntities = new BulkProductConditionCollection[]{collection1, collection2, collection3};

        Iterable<BulkEntity> actualEntitiesIterable = fileReader.getEntities();

        List<BulkProductConditionCollection> actualEntities = new ArrayList<BulkProductConditionCollection>();

        for (BulkEntity entity : actualEntitiesIterable) {
            actualEntities.add((BulkProductConditionCollection) entity);
        }

        assertEquals(1, actualEntities.size());
        assertThat(actualEntities.get(0), instanceOf(BulkSiteLinkAdExtension.class));

        assertProductAdExtension(123L, 456L, new BulkProductConditionCollection[]{collection1, collection2, collection3}, BulkProductAdExtension.class.cast(actualEntities.get(0)));
    }
}
