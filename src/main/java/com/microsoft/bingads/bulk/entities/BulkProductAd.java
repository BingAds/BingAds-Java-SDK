package com.microsoft.bingads.bulk.entities;

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

    public ProductAd getProductAd() {
        return ad;
    }

    public void setProductAd(ProductAd ad) {
        this.setAd(ad);
    }
}
