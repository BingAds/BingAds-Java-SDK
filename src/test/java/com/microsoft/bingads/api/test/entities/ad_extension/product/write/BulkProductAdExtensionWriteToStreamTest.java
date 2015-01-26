package com.microsoft.bingads.api.test.entities.ad_extension.product.write;

import com.microsoft.bingads.api.test.entities.ad_extension.product.BulkProductAdExtensionTest;
import com.microsoft.bingads.bulk.entities.BulkProductAdExtension;
import com.microsoft.bingads.bulk.entities.BulkProductConditionCollection;
import com.microsoft.bingads.campaignmanagement.AdExtensionStatus;
import com.microsoft.bingads.campaignmanagement.ArrayOfProductConditionCollection;
import com.microsoft.bingads.campaignmanagement.ProductAdExtension;
import com.microsoft.bingads.campaignmanagement.ProductConditionCollection;
import com.microsoft.bingads.internal.bulk.BulkObjectWriter;
import com.microsoft.bingads.internal.bulk.entities.BulkProductAdExtensionIdentifier;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import static org.easymock.EasyMock.and;
import static org.easymock.EasyMock.anyObject;
import static org.easymock.EasyMock.cmp;
import org.easymock.EasyMockRunner;
import org.easymock.LogicalOperator;
import org.easymock.Mock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EasyMockRunner.class)
public class BulkProductAdExtensionWriteToStreamTest extends
        BulkProductAdExtensionTest {

    private static final Comparator<BulkProductAdExtensionIdentifier> IDENTIFIER_COMPARATOR = new Comparator<BulkProductAdExtensionIdentifier>() {

        @Override
        public int compare(BulkProductAdExtensionIdentifier o1,
                BulkProductAdExtensionIdentifier o2) {
            boolean areEqual = o1.getAccountId().equals(o2.getAccountId());
            areEqual &= o1.getAdExtensionId().equals(o2.getAdExtensionId());
            areEqual &= o1.getStatus().equals(o2.getStatus());

            if (areEqual) {
                return 0;
            } else {
                return -1;
            }
        }
    };
    private static final Comparator<BulkProductConditionCollection> BULK_SITE_LINK_COMPARATOR = new Comparator<BulkProductConditionCollection>() {

        @Override
        public int compare(BulkProductConditionCollection o1, BulkProductConditionCollection o2) {
            boolean areEqual = o1.getAccountId().equals(o2.getAccountId());
            areEqual &= o1.getProductConditionCollection().equals(o2.getProductConditionCollection());

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
        ProductAdExtension apiAdExtension = new ProductAdExtension();
        apiAdExtension.setId(10L);

        ArrayOfProductConditionCollection arrayOfProductConditionCollections = new ArrayOfProductConditionCollection();
        List<ProductConditionCollection> ProductConditionCollections = arrayOfProductConditionCollections.getProductConditionCollections();
        ProductConditionCollections.add(new ProductConditionCollection());
        ProductConditionCollections.add(new ProductConditionCollection());
        apiAdExtension.setProductSelection(arrayOfProductConditionCollections);

        BulkProductAdExtension adExtension = new BulkProductAdExtension();
        adExtension.setAccountId(123L);
        adExtension.setProductAdExtension(apiAdExtension);

        BulkProductAdExtensionIdentifier identifier = new BulkProductAdExtensionIdentifier();
        identifier.setAccountId(123L);
        identifier.setAdExtensionId(10L);
        identifier.setStatus(AdExtensionStatus.DELETED);
        BulkProductConditionCollection ProductConditionCollection1 = new BulkProductConditionCollection();
        ProductConditionCollection1.setAccountId(123L);
        ProductConditionCollection1.setProductConditionCollection(apiAdExtension.getProductSelection().getProductConditionCollections().get(0));
        BulkProductConditionCollection ProductConditionCollection2 = new BulkProductConditionCollection();
        ProductConditionCollection2.setAccountId(123L);
        ProductConditionCollection2.setProductConditionCollection(apiAdExtension.getProductSelection().getProductConditionCollections().get(1));

        rowWriter.writeObjectRow(and(anyObject(BulkProductAdExtensionIdentifier.class), cmp(identifier, IDENTIFIER_COMPARATOR, LogicalOperator.EQUAL)));
        rowWriter.writeObjectRow(and(anyObject(BulkProductConditionCollection.class), cmp(ProductConditionCollection1, BULK_SITE_LINK_COMPARATOR, LogicalOperator.EQUAL)));
        rowWriter.writeObjectRow(and(anyObject(BulkProductConditionCollection.class), cmp(ProductConditionCollection2, BULK_SITE_LINK_COMPARATOR, LogicalOperator.EQUAL)));

        replayAll();
        adExtension.writeToStream(rowWriter);
    }

}
