package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.campaignmanagement.AdType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.microsoft.bingads.internal.functionalInterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalInterfaces.Function;

import com.microsoft.bingads.campaignmanagement.TextAd;
import com.microsoft.bingads.internal.StringTable;
import com.microsoft.bingads.internal.bulk.entities.BulkAdBase;
import com.microsoft.bingads.internal.bulk.file.RowValues;
import com.microsoft.bingads.internal.bulk.mapping.BulkMapping;
import com.microsoft.bingads.internal.bulk.mapping.MappingHelpers;
import com.microsoft.bingads.internal.bulk.mapping.SimpleBulkMapping;

public class BulkTextAd extends BulkAdBase<TextAd> {

    private static final List<BulkMapping<BulkTextAd>> MAPPINGS;

    static {
        List<BulkMapping<BulkTextAd>> m = new ArrayList<BulkMapping<BulkTextAd>>();

        m.add(new SimpleBulkMapping<BulkTextAd, String>(StringTable.Title,
                new Function<BulkTextAd, String>() {
                    @Override
                    public String apply(BulkTextAd c) {
                        return c.getAd().getTitle();
                    }
                },
                new BiConsumer<String, BulkTextAd>() {
                    @Override
                    public void accept(String v, BulkTextAd c) {
                        c.getAd().setTitle(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkTextAd, String>(StringTable.Text,
                new Function<BulkTextAd, String>() {
                    @Override
                    public String apply(BulkTextAd c) {
                        return c.getAd().getText();
                    }
                },
                new BiConsumer<String, BulkTextAd>() {
                    @Override
                    public void accept(String v, BulkTextAd c) {
                        c.getAd().setText(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkTextAd, String>(StringTable.DisplayUrl,
                new Function<BulkTextAd, String>() {
                    @Override
                    public String apply(BulkTextAd c) {
                        return c.getAd().getDisplayUrl();
                    }
                },
                new BiConsumer<String, BulkTextAd>() {
                    @Override
                    public void accept(String v, BulkTextAd c) {
                        c.getAd().setDisplayUrl(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkTextAd, String>(StringTable.DestinationUrl,
                new Function<BulkTextAd, String>() {
                    @Override
                    public String apply(BulkTextAd c) {
                        return c.getAd().getDestinationUrl();
                    }
                },
                new BiConsumer<String, BulkTextAd>() {
                    @Override
                    public void accept(String v, BulkTextAd c) {
                        c.getAd().setDestinationUrl(v);
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsToRowValues(RowValues values) {
        super.processMappingsToRowValues(values);
        MappingHelpers.<BulkTextAd>convertToValues(this, values, MAPPINGS);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        this.setAd(new TextAd());
        
        this.getAd().setType(AdType.TEXT);
        
        super.processMappingsFromRowValues(values);
        MappingHelpers.<BulkTextAd>convertToEntity(values, MAPPINGS, this);
    }

    public TextAd getTextAd() {
        return this.ad;
    }

    public void setTextAd(TextAd ad) {
        this.setAd(ad);
    }
}
