package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.campaignmanagement.AdExtensionStatus;
import com.microsoft.bingads.campaignmanagement.ArrayOfProductConditionCollection;
import com.microsoft.bingads.campaignmanagement.ProductAdExtension;
import com.microsoft.bingads.campaignmanagement.ProductConditionCollection;
import com.microsoft.bingads.internal.bulk.BulkObjectWriter;
import com.microsoft.bingads.internal.bulk.BulkStreamReader;
import com.microsoft.bingads.internal.bulk.TryResult;
import com.microsoft.bingads.internal.bulk.entities.BulkProductAdExtensionIdentifier;
import com.microsoft.bingads.internal.bulk.entities.MultiRecordBulkEntity;
import com.microsoft.bingads.internal.functionalinterfaces.Predicate;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents a product ad extension. This class exposes the
 * {@link BulkProductAdExtension#ProductAdExtension} property that can be read
 * and written as fields of the Product Ad Extension record in a bulk file.
 *
 * For more information, see Product Ad Extension at
 * {@link http://go.microsoft.com/fwlink/?LinkID=511516}.
 *
 * The Product Ad Extension record includes the distinct properties of the
 * {@link BulkProductConditionCollection} class, combined with the common
 * properties of the {@link BulkProductAdExtension} class, for example AccountId
 * and ProductAdExtension.
 *
 * One {@link BulkProductAdExtension} has one or more
 * {@link BulkProductConditionCollection}. Each
 * {@link BulkProductConditionCollection} instance corresponds to one Product Ad
 * Extension record in the bulk file. If you upload a
 * {@link BulkProductAdExtension}, then you are effectively replacing any
 * existing product conditions for the product ad extension.
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkProductAdExtension extends MultiRecordBulkEntity {

    /**
     * The ad extension's parent account identifier. Corresponds to the 'Parent
     * Id' field in the bulk file.
     */
    public Long accountId;// { get; set; }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    /**
     * The product ad extension.
     */
    public ProductAdExtension productAdExtension;// { get; set; }

    public ProductAdExtension getProductAdExtension() {
        return productAdExtension;
    }

    public void setProductAdExtension(ProductAdExtension productAdExtension) {
        this.productAdExtension = productAdExtension;
    }

    /**
     * The list of {@link BulkProductConditionCollection} are represented by
     * multiple Product Ad Extension records in the file. Each item in the list
     * corresponds to a separate Product Ad Extension record that includes the
     * distinct properties of the {@link BulkProductConditionCollection} class,
     * combined with the common properties of the {@link BulkProductAdExtension}
     * class, for example {@link AccountId} and {@link ProductAdExtension}.
     */
    private List<BulkProductConditionCollection> productConditionCollections = new ArrayList<BulkProductConditionCollection>();

    public List<BulkProductConditionCollection> getProductConditionCollections() {
        return productConditionCollections;
    }

    @Override
    public List<? extends BulkEntity> getChildEntities() {
        return Collections.unmodifiableList(this.productConditionCollections);
    }

    private BulkProductAdExtensionIdentifier identifier;

    private boolean hasDeleteAllRow;

    /**
     * Initializes a new instance of the BulkProductAdExtension class.
     */
    public BulkProductAdExtension() {

    }

    public BulkProductAdExtension(BulkProductAdExtensionIdentifier identifier) {
        this();
        this.productAdExtension = new ProductAdExtension();
        this.productAdExtension.setType("ProductAdExtension");

        this.identifier = identifier;

        this.hasDeleteAllRow = AdExtensionStatus.DELETED.equals(this.identifier.getStatus());

        this.productAdExtension.setId(identifier.getAdExtensionId());
        this.productAdExtension.setStatus(identifier.getStatus());
        this.productAdExtension.setVersion(identifier.getVersion());
        this.productAdExtension.setName(identifier.getName());

        this.accountId = identifier.getAccountId();
    }

    BulkProductAdExtension(BulkProductConditionCollection productCollection) {
        this(productCollection.getIdentifier());
        this.addProductCollection(productCollection);
    }

    private void addProductCollection(BulkProductConditionCollection productCollection) {
        this.productConditionCollections.add(productCollection);

        this.productAdExtension.setStoreId(productCollection.getStoreId());
        this.productAdExtension.setStoreName(productCollection.getStoreName());
    }

    @Override
    public void writeToStream(BulkObjectWriter rowWriter) throws IOException {
        this.validatePropertyNotNull(productAdExtension, "ProductAdExtension");

        this.validatePropertyNotNull(productAdExtension.getProductSelection(), "ProductAdExtension.ProductSelection");

        BulkProductAdExtensionIdentifier extensionIdentifier = new BulkProductAdExtensionIdentifier();

        extensionIdentifier.setStatus(AdExtensionStatus.DELETED);
        extensionIdentifier.setAccountId(this.accountId);
        extensionIdentifier.setAdExtensionId(this.productAdExtension.getId());
        extensionIdentifier.setName(this.productAdExtension.getName());
        extensionIdentifier.setVersion(this.getProductAdExtension().getVersion());

        rowWriter.writeObjectRow(extensionIdentifier);

        for (BulkProductConditionCollection bulkProductConditionCollection : this.convertRawToBulkProductConditionCollections()) {
            bulkProductConditionCollection.writeToStream(rowWriter);
        }
    }

    @Override
    public void readRelatedDataFromStream(BulkStreamReader reader) {
        boolean hasMoreRows = true;

        while (hasMoreRows) {
            TryResult<BulkProductConditionCollection> nextProductCollectionResult = reader.tryRead(new Predicate<BulkProductConditionCollection>() {
                @Override
                public boolean test(BulkProductConditionCollection x) {
                    return x.getIdentifier().equals(identifier);
                }
            }, BulkProductConditionCollection.class);

            if (nextProductCollectionResult.isSuccessful()) {
                this.addProductCollection(nextProductCollectionResult.getResult());
                continue;
            }

            TryResult<BulkProductAdExtensionIdentifier> identifierResult = reader.tryRead(new Predicate<BulkProductAdExtensionIdentifier>() {
                @Override
                public boolean test(BulkProductAdExtensionIdentifier x) {
                    return x.equals(identifier);
                }
            }, BulkProductAdExtensionIdentifier.class);

            if (identifierResult.isSuccessful()) {
                if (AdExtensionStatus.DELETED.equals(identifierResult.getResult().getStatus())) {
                    this.hasDeleteAllRow = true;
                }
            } else {
                hasMoreRows = false;
            }
        }

        ArrayOfProductConditionCollection apiCollections = getApiCollections();
        
        this.productAdExtension.setProductSelection(apiCollections);
        
        this.productAdExtension.setStatus(apiCollections.getProductConditionCollections().size() > 0 ? AdExtensionStatus.ACTIVE : AdExtensionStatus.DELETED);
    }

    private ArrayOfProductConditionCollection getApiCollections() {
        ArrayOfProductConditionCollection apiCollections = new ArrayOfProductConditionCollection();

        for (BulkProductConditionCollection bulkCollection : productConditionCollections) {
            apiCollections.getProductConditionCollections().add(bulkCollection.getProductConditionCollection());
        }

        return apiCollections;
    }

    private List<BulkProductConditionCollection> convertRawToBulkProductConditionCollections() {
        List<BulkProductConditionCollection> bulkCollections = new ArrayList<BulkProductConditionCollection>();

        List<ProductConditionCollection> apiCollections = productAdExtension.getProductSelection().getProductConditionCollections();

        for (ProductConditionCollection apiCollection : apiCollections) {
            BulkProductConditionCollection bulkCollection = new BulkProductConditionCollection();
            
            bulkCollections.add(bulkCollection);

            bulkCollection.setProductConditionCollection(apiCollection);
            bulkCollection.setAccountId(accountId);
            bulkCollection.setAdExtensionId(productAdExtension.getId());
            bulkCollection.setVersion(productAdExtension.getVersion());
            bulkCollection.setName(productAdExtension.getName());
            bulkCollection.setStoreId(productAdExtension.getStoreId());
        }

        return bulkCollections;
    }

    @Override
    public boolean allChildrenPresent() {
        return hasDeleteAllRow;
    }
}
