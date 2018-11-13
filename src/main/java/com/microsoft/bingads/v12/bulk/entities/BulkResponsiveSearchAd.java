package com.microsoft.bingads.v12.bulk.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v12.bulk.BulkFileReader;
import com.microsoft.bingads.v12.bulk.BulkFileWriter;
import com.microsoft.bingads.v12.bulk.BulkOperation;
import com.microsoft.bingads.v12.bulk.BulkServiceManager;
import com.microsoft.bingads.v12.campaignmanagement.AdType;
import com.microsoft.bingads.v12.campaignmanagement.ResponsiveSearchAd;
import com.microsoft.bingads.v12.internal.bulk.BulkMapping;
import com.microsoft.bingads.v12.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v12.internal.bulk.RowValues;
import com.microsoft.bingads.v12.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v12.internal.bulk.StringExtensions;
import com.microsoft.bingads.v12.internal.bulk.StringTable;

/**
 * Represents a Responsive Search ad.
 *
 * This class exposes the {@link #setResponsiveSearchAd} and {@link #getResponsiveSearchAd} methods
 * that can be used to read and write fields of the Responsive Search Ad record in a bulk file.
 *
 * <p>
 *     For more information, see Responsive Search Ad at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkResponsiveSearchAd extends BulkAd<ResponsiveSearchAd> {

    private static final List<BulkMapping<BulkResponsiveSearchAd>> MAPPINGS;

    static {
        List<BulkMapping<BulkResponsiveSearchAd>> m = new ArrayList<BulkMapping<BulkResponsiveSearchAd>>();

        m.add(new SimpleBulkMapping<BulkResponsiveSearchAd, String>(StringTable.Path1,
                new Function<BulkResponsiveSearchAd, String>() {
                    @Override
                    public String apply(BulkResponsiveSearchAd c) {
                        return StringExtensions.toOptionalBulkString(c.getAd().getPath1());
                    }
                },
                new BiConsumer<String, BulkResponsiveSearchAd>() {
                    @Override
                    public void accept(String v, BulkResponsiveSearchAd c) {
                        c.getAd().setPath1(StringExtensions.getValueOrEmptyString(v));
                    }
                }
        ));
        m.add(new SimpleBulkMapping<BulkResponsiveSearchAd, String>(StringTable.Path2,
                new Function<BulkResponsiveSearchAd, String>() {
                    @Override
                    public String apply(BulkResponsiveSearchAd c) {
                        return StringExtensions.toOptionalBulkString(c.getAd().getPath2());
                    }
                },
                new BiConsumer<String, BulkResponsiveSearchAd>() {
                    @Override
                    public void accept(String v, BulkResponsiveSearchAd c) {
                        c.getAd().setPath2(StringExtensions.getValueOrEmptyString(v));
                    }
                }
        ));
        m.add(new SimpleBulkMapping<BulkResponsiveSearchAd, String>(StringTable.Domain,
                new Function<BulkResponsiveSearchAd, String>() {
                    @Override
                    public String apply(BulkResponsiveSearchAd c) {
                        return StringExtensions.toOptionalBulkString(c.getAd().getDomain());
                    }
                },
                new BiConsumer<String, BulkResponsiveSearchAd>() {
                    @Override
                    public void accept(String v, BulkResponsiveSearchAd c) {
                        c.getAd().setDomain(StringExtensions.getValueOrEmptyString(v));
                    }
                }
        ));
        m.add(new SimpleBulkMapping<BulkResponsiveSearchAd, String>(StringTable.Headline,
                new Function<BulkResponsiveSearchAd, String>() {
                    @Override
                    public String apply(BulkResponsiveSearchAd c) {
                        return StringExtensions.toTextAssetLinksBulkString(c.getAd().getHeadlines());
                    }
                },
                new BiConsumer<String, BulkResponsiveSearchAd>() {
                    @Override
                    public void accept(String v, BulkResponsiveSearchAd c) {
                        c.getAd().setHeadlines(StringExtensions.parseTextAssetLinks(v));
                    }
                }
        ));
        m.add(new SimpleBulkMapping<BulkResponsiveSearchAd, String>(StringTable.Description,
                new Function<BulkResponsiveSearchAd, String>() {
                    @Override
                    public String apply(BulkResponsiveSearchAd c) {
                        return StringExtensions.toTextAssetLinksBulkString(c.getAd().getDescriptions());
                    }
                },
                new BiConsumer<String, BulkResponsiveSearchAd>() {
                    @Override
                    public void accept(String v, BulkResponsiveSearchAd c) {
                        c.getAd().setDescriptions(StringExtensions.parseTextAssetLinks(v));
                    }
                }
        ));


        MAPPINGS = Collections.unmodifiableList(m);
    }
    
    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getResponsiveSearchAd(), "ResponsiveSearchAd");

        super.processMappingsToRowValues(values, excludeReadonlyData);

        MappingHelpers.<BulkResponsiveSearchAd>convertToValues(this, values, MAPPINGS);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        setAd(new ResponsiveSearchAd());
        
        getAd().setType(AdType.RESPONSIVE_SEARCH);
        
        super.processMappingsFromRowValues(values);
        MappingHelpers.<BulkResponsiveSearchAd>convertToEntity(values, MAPPINGS, this);
    }

    /**
     * Gets the product ad.
     */
    public ResponsiveSearchAd getResponsiveSearchAd() {
        return ad;
    }

    /**
     * Sets the product ad.
     */
    public void setResponsiveSearchAd(ResponsiveSearchAd ad) {
        this.setAd(ad);
    }
}
