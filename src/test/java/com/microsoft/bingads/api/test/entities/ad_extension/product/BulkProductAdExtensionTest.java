package com.microsoft.bingads.api.test.entities.ad_extension.product;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.easymock.EasyMockSupport;

import com.microsoft.bingads.bulk.entities.BulkProductAdExtension;
import com.microsoft.bingads.bulk.entities.BulkProductConditionCollection;
import com.microsoft.bingads.internal.bulk.entities.adextensions.BulkProductAdExtensionIdentifier;

public abstract class BulkProductAdExtensionTest extends EasyMockSupport {

    protected static void assertProductAdExtension(long expectedAccountId, long expectedAdExtensionId, BulkProductConditionCollection[] bulkProductConditionCollections, BulkProductAdExtension actualBulkProductAdExtension) {
        assertEquals(123, expectedAccountId);
        assertEquals(456, expectedAdExtensionId);

        List<BulkProductConditionCollection> actualProductConditionCollections = actualBulkProductAdExtension.getProductConditionCollections();

        assertThat(actualProductConditionCollections, hasItems(bulkProductConditionCollections));
    }

    protected BulkProductConditionCollection[] createProductConditionCollectionsWithSameIdentifier(int count) {
        return this.createProductConditionCollectionsWithSameIdentifier(count, null);
    }

    protected BulkProductConditionCollection[] createProductConditionCollectionsWithSameIdentifier(int count, BulkProductAdExtensionIdentifier identifier) {
        if (identifier == null) {
            identifier = new BulkProductAdExtensionIdentifier();
            identifier.setAccountId(123L);
            identifier.setAdExtensionId(456L);
        }

        BulkProductConditionCollection[] productConditionCollections = new BulkProductConditionCollection[count];

        for (int i = 0; i < count; i++) {
            productConditionCollections[i] = new BulkProductConditionCollection();
            productConditionCollections[i].setAccountId(identifier.getAccountId());
            productConditionCollections[i].setAdExtensionId(identifier.getAdExtensionId());
        }

        return productConditionCollections;
    }
}
