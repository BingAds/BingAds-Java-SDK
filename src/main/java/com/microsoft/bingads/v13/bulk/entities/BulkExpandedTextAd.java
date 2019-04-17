package com.microsoft.bingads.v13.bulk.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.bulk.BulkFileReader;
import com.microsoft.bingads.v13.bulk.BulkFileWriter;
import com.microsoft.bingads.v13.bulk.BulkOperation;
import com.microsoft.bingads.v13.bulk.BulkServiceManager;
import com.microsoft.bingads.v13.campaignmanagement.AdType;
import com.microsoft.bingads.v13.campaignmanagement.ExpandedTextAd;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;

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
        
        m.add(new SimpleBulkMapping<BulkExpandedTextAd, String>(StringTable.TitlePart3,
                new Function<BulkExpandedTextAd, String>() {
                    @Override
                    public String apply(BulkExpandedTextAd c) {
                        return StringExtensions.toOptionalBulkString(c.getAd().getTitlePart3(), c.getAd().getId());
                    }
                },
                new BiConsumer<String, BulkExpandedTextAd>() {
                    @Override
                    public void accept(String v, BulkExpandedTextAd c) {
                        c.getAd().setTitlePart3(StringExtensions.getValueOrEmptyString(v));
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
        
        m.add(new SimpleBulkMapping<BulkExpandedTextAd, String>(StringTable.TextPart2,
                new Function<BulkExpandedTextAd, String>() {
                    @Override
                    public String apply(BulkExpandedTextAd c) {
                        return StringExtensions.toOptionalBulkString(c.getAd().getTextPart2(), c.getAd().getId());
                    }
                },
                new BiConsumer<String, BulkExpandedTextAd>() {
                    @Override
                    public void accept(String v, BulkExpandedTextAd c) {
                        c.getAd().setTextPart2(StringExtensions.getValueOrEmptyString(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkExpandedTextAd, String>(StringTable.Path1,
                new Function<BulkExpandedTextAd, String>() {
                    @Override
                    public String apply(BulkExpandedTextAd c) {
                        return StringExtensions.toOptionalBulkString(c.getAd().getPath1(), c.getAd().getId());
                    }
                },
                new BiConsumer<String, BulkExpandedTextAd>() {
                    @Override
                    public void accept(String v, BulkExpandedTextAd c) {
                        c.getAd().setPath1(StringExtensions.getValueOrEmptyString(v));
                    }
                },
                true
        ));
        
        m.add(new SimpleBulkMapping<BulkExpandedTextAd, String>(StringTable.Path2,
                new Function<BulkExpandedTextAd, String>() {
                    @Override
                    public String apply(BulkExpandedTextAd c) {
                        return StringExtensions.toOptionalBulkString(c.getAd().getPath2(), c.getAd().getId());
                    }
                },
                new BiConsumer<String, BulkExpandedTextAd>() {
                    @Override
                    public void accept(String v, BulkExpandedTextAd c) {
                        c.getAd().setPath2(StringExtensions.getValueOrEmptyString(v));
                    }
                },
                true
        ));
        

        m.add(new SimpleBulkMapping<BulkExpandedTextAd, String>(StringTable.Domain,
                new Function<BulkExpandedTextAd, String>() {
                    @Override
                    public String apply(BulkExpandedTextAd c) {
                        return StringExtensions.toOptionalBulkString(c.getAd().getDomain(), c.getAd().getId());
                    }
                },
                new BiConsumer<String, BulkExpandedTextAd>() {
                    @Override
                    public void accept(String v, BulkExpandedTextAd c) {
                        c.getAd().setDomain(StringExtensions.getValueOrEmptyString(v));
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
