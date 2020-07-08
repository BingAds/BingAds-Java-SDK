package com.microsoft.bingads.v13.bulk.entities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.bulk.BulkFileReader;
import com.microsoft.bingads.v13.bulk.BulkFileWriter;
import com.microsoft.bingads.v13.bulk.BulkOperation;
import com.microsoft.bingads.v13.bulk.BulkServiceManager;
import com.microsoft.bingads.v13.campaignmanagement.Audience;
import com.microsoft.bingads.v13.campaignmanagement.ProductAudience;
import com.microsoft.bingads.v13.campaignmanagement.ProductAudienceType;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;

/**
 * Represents a product audience that can be read or written in a bulk file.
 *
 * This class exposes the {@link BulkProductAudience#setProductAudience} and {@link BulkProductAudience#getProductAudience}
 * methods that can be used to read and write fields of the Product Audience record in a bulk file.
 *
 * <p>
 *     For more information, see Product Audience at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkProductAudience extends BulkAudience<ProductAudience> {

    private static final List<BulkMapping<BulkProductAudience>> MAPPINGS;

    static {
        List<BulkMapping<BulkProductAudience>> m = new ArrayList<BulkMapping<BulkProductAudience>>();

        m.add(new SimpleBulkMapping<BulkProductAudience, Long>(StringTable.TagId,
                new Function<BulkProductAudience, Long>() {
                    @Override
                    public Long apply(BulkProductAudience c) {
                        return c.getProductAudience().getTagId();
                    }
                },
                new BiConsumer<String, BulkProductAudience>() {
                    @Override
                    public void accept(String v, BulkProductAudience c) {
                        c.getProductAudience().setTagId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkProductAudience, String>(StringTable.ProductAudienceType,
                new Function<BulkProductAudience, String>() {
                    @Override
                    public String apply(BulkProductAudience c) {
                        Collection<ProductAudienceType> productAudienceTypes = c.getProductAudience().getProductAudienceType();
                        if (productAudienceTypes == null || productAudienceTypes.size() == 0) return null;
                        if (productAudienceTypes.size() != 1) {
                            throw new IllegalArgumentException("Only 1 Product Audience Type can be set in ProductAudience");
                        }
                        return (productAudienceTypes.toArray(new ProductAudienceType[productAudienceTypes.size()])[0]).value();
                    }
                },
                new BiConsumer<String, BulkProductAudience>() {
                    @Override
                    public void accept(String v, BulkProductAudience c) {
                        
                        ProductAudienceType productAudienceType = StringExtensions.parseOptional(v, new Function<String, ProductAudienceType>() {
                            @Override
                            public ProductAudienceType apply(String value) {
                                return ProductAudienceType.fromValue(value);
                            }
                        });
                        if (productAudienceType != null) {
                            c.getProductAudience().setProductAudienceType(Collections.singleton(productAudienceType));
                        }
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        super.processMappingsFromRowValues(values);
       
        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        super.processMappingsToRowValues(values, excludeReadonlyData);
        
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    /**
     * Gets the product audience.
     */
    public ProductAudience getProductAudience() {
        return getAudience();
    }

    /**
     * Sets the product audience.
     */
    public void setProductAudience(ProductAudience productAudience) {
        setAudience(productAudience);
    }

    @Override
    public ProductAudience createAudience() {
        return new ProductAudience();
    }

}
