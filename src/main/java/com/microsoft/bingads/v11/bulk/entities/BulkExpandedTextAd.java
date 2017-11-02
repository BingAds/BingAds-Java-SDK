package com.microsoft.bingads.v11.bulk.entities;

import com.microsoft.bingads.v11.bulk.BulkServiceManager;
import com.microsoft.bingads.v11.campaignmanagement.AdType;
import com.microsoft.bingads.v11.campaignmanagement.ExpandedTextAd;
import com.microsoft.bingads.v11.bulk.BulkFileReader;
import com.microsoft.bingads.v11.bulk.BulkFileWriter;
import com.microsoft.bingads.v11.bulk.BulkOperation;
import com.microsoft.bingads.v11.internal.bulk.StringTable;
import com.microsoft.bingads.v11.internal.bulk.BulkMapping;
import com.microsoft.bingads.v11.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v11.internal.bulk.RowValues;
import com.microsoft.bingads.v11.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents an expanded text ad.
 *
 * This class exposes the {@link #setExpandedTextAd} and {@link #getExpandedTextAd} methods
 * that can be used to read and write fields of the Expanded Text Ad record in a bulk file.
 *
 * <p>
 *     For more information, see Expanded Text Ad at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkExpandedTextAd extends BulkAd<ExpandedTextAd> {

    private static final List<BulkMapping<BulkExpandedTextAd>> MAPPINGS;

    static {
        List<BulkMapping<BulkExpandedTextAd>> m = new ArrayList<BulkMapping<BulkExpandedTextAd>>();

        m.add(new SimpleBulkMapping<BulkExpandedTextAd, String>(StringTable.TitlePart1,
                new Function<BulkExpandedTextAd, String>() {
                    @Override
                    public String apply(BulkExpandedTextAd c) {
                        return c.getAd().getTitlePart1();
                    }
                },
                new BiConsumer<String, BulkExpandedTextAd>() {
                    @Override
                    public void accept(String v, BulkExpandedTextAd c) {
                        c.getAd().setTitlePart1(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkExpandedTextAd, String>(StringTable.TitlePart2,
                new Function<BulkExpandedTextAd, String>() {
                    @Override
                    public String apply(BulkExpandedTextAd c) {
                        return c.getAd().getTitlePart2();
                    }
                },
                new BiConsumer<String, BulkExpandedTextAd>() {
                    @Override
                    public void accept(String v, BulkExpandedTextAd c) {
                        c.getAd().setTitlePart2(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkExpandedTextAd, String>(StringTable.Text,
                new Function<BulkExpandedTextAd, String>() {
                    @Override
                    public String apply(BulkExpandedTextAd c) {
                        return c.getAd().getText();
                    }
                },
                new BiConsumer<String, BulkExpandedTextAd>() {
                    @Override
                    public void accept(String v, BulkExpandedTextAd c) {
                        c.getAd().setText(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkExpandedTextAd, String>(StringTable.Path1,
                new Function<BulkExpandedTextAd, String>() {
                    @Override
                    public String apply(BulkExpandedTextAd c) {
                        return c.getAd().getPath1();
                    }
                },
                new BiConsumer<String, BulkExpandedTextAd>() {
                    @Override
                    public void accept(String v, BulkExpandedTextAd c) {
                        c.getAd().setPath1(v);;
                    }
                },
                true
        ));
        
        m.add(new SimpleBulkMapping<BulkExpandedTextAd, String>(StringTable.Path2,
                new Function<BulkExpandedTextAd, String>() {
                    @Override
                    public String apply(BulkExpandedTextAd c) {
                        return c.getAd().getPath2();
                    }
                },
                new BiConsumer<String, BulkExpandedTextAd>() {
                    @Override
                    public void accept(String v, BulkExpandedTextAd c) {
                        c.getAd().setPath2(v);;
                    }
                },
                true
        ));       
        
        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getExpandedTextAd(), "ExpandedTextAd");

        super.processMappingsToRowValues(values, excludeReadonlyData);

        MappingHelpers.<BulkExpandedTextAd>convertToValues(this, values, MAPPINGS);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        this.setAd(new ExpandedTextAd());
        
        this.getAd().setType(AdType.EXPANDED_TEXT);
        
        super.processMappingsFromRowValues(values);
        MappingHelpers.<BulkExpandedTextAd>convertToEntity(values, MAPPINGS, this);
    }

    /**
     * Gets the expanded text ad.
     */
    public ExpandedTextAd getExpandedTextAd() {
        return this.ad;
    }

    /**
     * Sets the expanded text ad.
     */
    public void setExpandedTextAd(ExpandedTextAd ad) {
        this.setAd(ad);
    }
}
