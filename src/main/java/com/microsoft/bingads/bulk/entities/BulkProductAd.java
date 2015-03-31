package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.bulk.BulkServiceManager;
import com.microsoft.bingads.bulk.BulkFileReader;
import com.microsoft.bingads.bulk.BulkFileWriter;
import com.microsoft.bingads.bulk.BulkOperation;
import com.microsoft.bingads.campaignmanagement.AdType;
import com.microsoft.bingads.campaignmanagement.ProductAd;
import com.microsoft.bingads.internal.StringTable;
import com.microsoft.bingads.internal.bulk.BulkMapping;
import com.microsoft.bingads.internal.bulk.MappingHelpers;
import com.microsoft.bingads.internal.bulk.RowValues;
import com.microsoft.bingads.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents a product ad.
 *
 * This class exposes the {@link #setProductAd} and {@link #getProductAd} methods
 * that can be used to read and write fields of the Product Ad record in a bulk file.
 *
 * <p>
 *     For more information, see Product Ad at
 *     <a href="http://go.microsoft.com/fwlink/?LinkID=511555">http://go.microsoft.com/fwlink/?LinkID=511555</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkProductAd extends BulkAd<ProductAd> {

    private static final List<BulkMapping<BulkProductAd>> MAPPINGS;

    static {
        List<BulkMapping<BulkProductAd>> m = new ArrayList<BulkMapping<BulkProductAd>>();

        m.add(new SimpleBulkMapping<BulkProductAd, String>(StringTable.PromotionalText,
                new Function<BulkProductAd, String>() {
                    @Override
                    public String apply(BulkProductAd c) {
                        return c.getAd().getPromotionalText();
                    }
                },
                new BiConsumer<String, BulkProductAd>() {
                    @Override
                    public void accept(String v, BulkProductAd c) {
                        c.getAd().setPromotionalText(v);
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getProductAd(), "ProductAd");

        super.processMappingsToRowValues(values, excludeReadonlyData);

        MappingHelpers.<BulkProductAd>convertToValues(this, values, MAPPINGS);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        setAd(new ProductAd());
        
        getAd().setType(AdType.PRODUCT);
        
        super.processMappingsFromRowValues(values);
        MappingHelpers.<BulkProductAd>convertToEntity(values, MAPPINGS, this);
    }

    /**
     * Gets the product ad.
     */
    public ProductAd getProductAd() {
        return ad;
    }

    /**
     * Sets the product ad.
     */
    public void setProductAd(ProductAd ad) {
        this.setAd(ad);
    }
}
