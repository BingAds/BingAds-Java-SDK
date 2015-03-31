package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.campaignmanagement.AdExtensionStatus;
import com.microsoft.bingads.campaignmanagement.ArrayOfProductCondition;
import com.microsoft.bingads.campaignmanagement.ProductConditionCollection;
import com.microsoft.bingads.internal.StringExtensions;
import com.microsoft.bingads.internal.StringTable;
import com.microsoft.bingads.internal.bulk.BulkMapping;
import com.microsoft.bingads.internal.bulk.ComplexBulkMapping;
import com.microsoft.bingads.internal.bulk.MappingHelpers;
import com.microsoft.bingads.internal.bulk.RowValues;
import com.microsoft.bingads.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.internal.bulk.entities.BulkProductAdExtensionIdentifier;
import com.microsoft.bingads.internal.bulk.entities.MultiRecordBulkEntity;
import com.microsoft.bingads.internal.bulk.entities.SingleRecordBulkEntity;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents the product condition collection for a product ad extension. Each
 * product condition collection can be read or written in a bulk file. This
 * class exposes the properties
 * that can be read and written as fields of the Product Ad Extension record in
 * a bulk file.
 *
 * <p>
 * For more information, see Product Ad Extension at
 * <a href="http://go.microsoft.com/fwlink/?LinkID=511516">http://go.microsoft.com/fwlink/?LinkID=511516</a>.
 * </p>
 *
 * <p>
 * The Product Ad Extension record includes the distinct properties of the
 * {@link BulkProductConditionCollection} class, combined with the common
 * properties of the {@link BulkProductAdExtension} class, for example AccountId
 * and ProductAdExtension.
 * </p>
 *
 * <p>
 * One {@link BulkProductAdExtension} has one or more
 * {@link BulkProductConditionCollection}. Each
 * {@link BulkProductConditionCollection} instance corresponds to one Product Ad
 * Extension record in the bulk file. If you upload a
 * {@link BulkProductAdExtension}, then you are effectively replacing any
 * existing product conditions for the product ad extension.
 * </p>
 */
public class BulkProductConditionCollection extends SingleRecordBulkEntity {

    private ProductConditionCollection productConditionCollection;

    /**
     * Gets the collection of product conditions for a product ad extension.
     */
    public ProductConditionCollection getProductConditionCollection() {
        return productConditionCollection;
    }

    /**
     * Sets the collection of product conditions for a product ad extension.
     */
    public void setProductConditionCollection(ProductConditionCollection productConditionCollection) {
        this.productConditionCollection = productConditionCollection;
    }

    private BulkProductAdExtensionIdentifier identifier;

    BulkProductAdExtensionIdentifier getIdentifier() {
        return identifier;
    }

    void setIdentifier(BulkProductAdExtensionIdentifier identifier) {
        this.identifier = identifier;
    }

    /**
     * Gets the identifier of the ad extension.
     *
     * <p>
     * Corresponds to the 'Id' field in the bulk file.
     * </p>
     */
    public Long getAdExtensionId() {
        return this.identifier.getAdExtensionId();
    }

    /**
     * Sets the identifier of the ad extension.
     *
     * <p>
     * Corresponds to the 'Id' field in the bulk file.
     * </p>
     */
    public void setAdExtensionId(Long value) {
        this.identifier.setAdExtensionId(value);
    }

    /**
     * Gets the ad extension's parent account identifier.
     *
     * <p>
     * Corresponds to the 'Parent Id' field in the bulk file.
     * </p>
     */
    public Long getAccountId() {
        return this.identifier.getAccountId();
    }

    /**
     * Sets the ad extension's parent account identifier.
     *
     * <p>
     * Corresponds to the 'Parent Id' field in the bulk file.
     * </p>
     */
    public void setAccountId(Long value) {
        this.identifier.setAccountId(value);
    }

    /**
     * Gets the status of the ad extension.
     *
     * <p>
     * Corresponds to the 'Status' field in the bulk file.
     * </p>
     */
    public AdExtensionStatus getStatus() {
        return this.identifier.getStatus();
    }

    /**
     * Sets the status of the ad extension.
     *
     * <p>
     * Corresponds to the 'Status' field in the bulk file.
     * </p>
     */
    public void setStatus(AdExtensionStatus status) {
        this.identifier.setStatus(status);
    }

    /**
     * The version of the ad extension.
     *
     * <p>
     * Corresponds to the 'Version' field in * the bulk file.
     * </p>
     */
    public Integer getVersion() {
        return this.identifier.getVersion();
    }

    private String name;

    /**
     * Gets the name of the ad extension.
     *
     * <p>
     * Corresponds to the 'Name' field in the bulk file.
     * </p>
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the ad extension.
     *
     * <p>
     * Corresponds to the 'Name' field in the bulk file.
     * </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    private Long storeId;

    /**
     * Gets the product ad extension's store identifier.
     *
     * <p>
     * Corresponds to the 'Store Id' field in the bulk file.
     * </p>
     */
    public Long getStoreId() {
        return storeId;
    }

    /**
     * Sets the product ad extension's store identifier.
     *
     * <p>
     * Corresponds to the 'Store Id' field in the bulk file.
     * </p>
     */
    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    private String storeName;

    /**
     * Gets the product ad extension's store name.
     *
     * <p>
     * Corresponds to the 'Store Name' field in the bulk file.
     * </p>
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * Sets the product ad extension's store name.
     *
     * <p>
     * Corresponds to the 'Store Name' field in the bulk file.
     * </p>
     */
    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    /**
     * Initializes a new instance of the BulkProductConditionCollection class.
     */
    public BulkProductConditionCollection() {
        this.identifier = new BulkProductAdExtensionIdentifier();
    }

    private static final List<BulkMapping<BulkProductConditionCollection>> MAPPINGS;

    static {
        List<BulkMapping<BulkProductConditionCollection>> m = new ArrayList<BulkMapping<BulkProductConditionCollection>>();

        m.add(new ComplexBulkMapping<BulkProductConditionCollection>(
                new BiConsumer<BulkProductConditionCollection, RowValues>() {
                    @Override
                    public void accept(BulkProductConditionCollection arg0, RowValues arg1) {
                        BulkProductConditionCollection.conditionsToRowValues(arg0, arg1);
                    }
                },
                new BiConsumer<RowValues, BulkProductConditionCollection>() {
                    @Override
                    public void accept(RowValues arg0, BulkProductConditionCollection arg1) {
                        BulkProductConditionCollection.rowValuesToConditions(arg0, arg1);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkProductConditionCollection, String>(StringTable.Name,
                new Function<BulkProductConditionCollection, String>() {
                    @Override
                    public String apply(BulkProductConditionCollection c) {
                        return c.getName();
                    }
                },
                new BiConsumer<String, BulkProductConditionCollection>() {
                    @Override
                    public void accept(String v, BulkProductConditionCollection c) {
                        c.setName(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkProductConditionCollection, Long>(StringTable.BingMerchantCenterId,
                new Function<BulkProductConditionCollection, Long>() {
                    @Override
                    public Long apply(BulkProductConditionCollection c) {
                        return c.getStoreId();
                    }
                },
                new BiConsumer<String, BulkProductConditionCollection>() {
                    @Override
                    public void accept(String v, BulkProductConditionCollection c) {
                        c.setStoreId(StringExtensions.parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkProductConditionCollection, String>(StringTable.BingMerchantCenterName,
                new Function<BulkProductConditionCollection, String>() {
                    @Override
                    public String apply(BulkProductConditionCollection c) {
                        return c.getStoreName();
                    }
                },
                new BiConsumer<String, BulkProductConditionCollection>() {
                    @Override
                    public void accept(String v, BulkProductConditionCollection c) {
                        c.setStoreName(v);
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    private static void rowValuesToConditions(RowValues values, BulkProductConditionCollection c) {
        ProductConditionHelper.addConditionsFromRowValues(values, c.getProductConditionCollection().getConditions());
    }

    private static void conditionsToRowValues(BulkProductConditionCollection c, RowValues values) {
        ProductConditionHelper.addRowValuesFromConditions(c.getProductConditionCollection().getConditions(), values);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        productConditionCollection = new ProductConditionCollection();
                
        productConditionCollection.setConditions(new ArrayOfProductCondition());               

        this.identifier.readFromRowValues(values);

        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        this.validatePropertyNotNull(this.getProductConditionCollection(), "ProductConditionCollection");

        this.validatePropertyNotNull(this.getProductConditionCollection().getConditions(), "ProductConditionCollection.Conditions");

        this.identifier.writeToRowValues(values, excludeReadonlyData);

        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    @Override
    public boolean canEncloseInMultilineEntity() {
        return true;
    }

    @Override
    public MultiRecordBulkEntity encloseInMultilineEntity() {
        return new BulkProductAdExtension(this);
    }
}
