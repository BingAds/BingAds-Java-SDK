package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.campaignmanagement.AdType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.microsoft.bingads.internal.functionalInterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalInterfaces.Function;

import com.microsoft.bingads.campaignmanagement.ProductAd;
import com.microsoft.bingads.internal.StringTable;
import com.microsoft.bingads.internal.bulk.entities.BulkAdBase;
import com.microsoft.bingads.internal.bulk.file.RowValues;
import com.microsoft.bingads.internal.bulk.mapping.BulkMapping;
import com.microsoft.bingads.internal.bulk.mapping.MappingHelpers;
import com.microsoft.bingads.internal.bulk.mapping.SimpleBulkMapping;

public class BulkProductAd extends BulkAdBase<ProductAd> {

    private static List<BulkMapping<BulkProductAd>> MAPPINGS;

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
    public void processMappingsToRowValues(RowValues values) {
        super.processMappingsToRowValues(values);
        MappingHelpers.<BulkProductAd>convertToValues(this, values, MAPPINGS);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        this.setAd(new ProductAd());
        
        this.getAd().setType(AdType.PRODUCT);
        
        super.processMappingsFromRowValues(values);
        MappingHelpers.<BulkProductAd>convertToEntity(values, MAPPINGS, this);
    }

    public ProductAd getProductAd() {
        return this.ad;
    }

    public void setProductAd(ProductAd ad) {
        this.setAd(ad);
    }
}
