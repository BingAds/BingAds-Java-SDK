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
import com.microsoft.bingads.v13.campaignmanagement.AdExtensionHeaderType;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfstring;
import com.microsoft.bingads.v13.campaignmanagement.FilterLinkAdExtension;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;

/**
 * Represents a filter link ad extension that can be read or written in a bulk file.
 * This class exposes the properties
 * that can be read and written as fields of the Filter Link Ad Extension record in a
 * bulk file.
 *
 * For more information, see Filter Link Ad Extension at
 * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkFilterLinkAdExtension extends BulkAdExtension<FilterLinkAdExtension> {

    /**
     * Gets the image ad extension.
     */
    public FilterLinkAdExtension getFilterLinkAdExtension() {
        return getAdExtension();
    }

    /**
     * Sets the image ad extension.
     */
    public void setFilterLinkAdExtension(FilterLinkAdExtension FilterLinkAdExtension) {
        setAdExtension(FilterLinkAdExtension);
    }

    private static final List<BulkMapping<BulkFilterLinkAdExtension>> MAPPINGS;

    static {
        List<BulkMapping<BulkFilterLinkAdExtension>> m = new ArrayList<BulkMapping<BulkFilterLinkAdExtension>>();
        
        m.add(new SimpleBulkMapping<BulkFilterLinkAdExtension, String>(StringTable.AdExtensionHeaderType,
                new Function<BulkFilterLinkAdExtension, String>() {
                    @Override
                    public String apply(BulkFilterLinkAdExtension c) {
                        return c.getAdExtension().getAdExtensionHeaderType() != null ? c.getAdExtension().getAdExtensionHeaderType().value() : null;
                    }
                },
                new BiConsumer<String, BulkFilterLinkAdExtension>() {
                    @Override
                    public void accept(String v, BulkFilterLinkAdExtension c) {
                        
                        if (c.getAdExtension() == null) {
                            return;
                        }
                        
                        c.getAdExtension().setAdExtensionHeaderType(StringExtensions.parseOptional(v, new Function<String, AdExtensionHeaderType>() {
                            @Override
                            public AdExtensionHeaderType apply(String value) {
                                return AdExtensionHeaderType.fromValue(value);
                            }
                        }));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkFilterLinkAdExtension, String>(StringTable.Language,
                new Function<BulkFilterLinkAdExtension, String>() {
                    @Override
                    public String apply(BulkFilterLinkAdExtension c) {
                        return c.getFilterLinkAdExtension().getLanguage();
                    }
                },
                new BiConsumer<String, BulkFilterLinkAdExtension>() {
                    @Override
                    public void accept(String v, BulkFilterLinkAdExtension c) {
                        c.getFilterLinkAdExtension().setLanguage(v);
                    }
                }
        ));
        
        
        m.add(new SimpleBulkMapping<BulkFilterLinkAdExtension, String>(StringTable.Texts,
                new Function<BulkFilterLinkAdExtension, String>() {
                    @Override
                    public String apply(BulkFilterLinkAdExtension c) {
                        return StringExtensions.WriteDelimitedStrings(";", c.getAdExtension().getTexts());
                    }
                },
                new BiConsumer<String, BulkFilterLinkAdExtension>() {
                    @Override
                    public void accept(String v, BulkFilterLinkAdExtension c) {
                        c.getAdExtension().setTexts(StringExtensions.ParseDelimitedStrings(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkFilterLinkAdExtension, String>(StringTable.FinalUrl,
                new Function<BulkFilterLinkAdExtension, String>() {
                    @Override
                    public String apply(BulkFilterLinkAdExtension c) {
                        return StringExtensions.writeUrls("; ", c.getAdExtension().getFinalUrls(), c.getAdExtension().getId());
                    }
                },
                new BiConsumer<String, BulkFilterLinkAdExtension>() {
                    @Override
                    public void accept(String v, BulkFilterLinkAdExtension c) {
                        ArrayOfstring urls = new ArrayOfstring();
                        List<String> urlArray = StringExtensions.parseUrls(v);
                        if(urlArray == null) {
                            urls = null;
                        } else {
                            urls.getStrings().addAll(urlArray);
                        }
                        c.getAdExtension().setFinalUrls(urls);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkFilterLinkAdExtension, String>(StringTable.FinalMobileUrl,
                new Function<BulkFilterLinkAdExtension, String>() {
                    @Override
                    public String apply(BulkFilterLinkAdExtension c) {
                        return StringExtensions.writeUrls("; ", c.getAdExtension().getFinalMobileUrls(), c.getAdExtension().getId());
                    }
                },
                new BiConsumer<String, BulkFilterLinkAdExtension>() {
                    @Override
                    public void accept(String v, BulkFilterLinkAdExtension c) {
                        ArrayOfstring urls = new ArrayOfstring();
                        List<String> urlArray = StringExtensions.parseUrls(v);
                        if(urlArray == null) {
                            urls = null;
                        } else {
                            urls.getStrings().addAll(urlArray);
                        }
                        c.getAdExtension().setFinalMobileUrls(urls);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkFilterLinkAdExtension, String>(StringTable.TrackingTemplate,
                new Function<BulkFilterLinkAdExtension, String>() {
                    @Override
                    public String apply(BulkFilterLinkAdExtension c) {
                        return StringExtensions.toOptionalBulkString(c.getAdExtension().getTrackingUrlTemplate(), c.getAdExtension().getId());
                    }
                },
                new BiConsumer<String, BulkFilterLinkAdExtension>() {
                    @Override
                    public void accept(String v, BulkFilterLinkAdExtension c) {
                        c.getAdExtension().setTrackingUrlTemplate(StringExtensions.getValueOrEmptyString(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkFilterLinkAdExtension, String>(StringTable.CustomParameter,
                new Function<BulkFilterLinkAdExtension, String>() {
                    @Override
                    public String apply(BulkFilterLinkAdExtension c) {
                        return StringExtensions.toCustomParaBulkString(c.getAdExtension().getUrlCustomParameters(), c.getAdExtension().getId());
                    }
                },
                new BiConsumer<String, BulkFilterLinkAdExtension>() {
                    @Override
                    public void accept(String v, BulkFilterLinkAdExtension c) {
                        try {
                            c.getAdExtension().setUrlCustomParameters(StringExtensions.parseCustomParameters(v));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
        ));
        
        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        FilterLinkAdExtension extension = new FilterLinkAdExtension();

        extension.setType("FilterLinkAdExtension");
        
        setAdExtension(extension);

        super.processMappingsFromRowValues(values);

        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(this.getFilterLinkAdExtension(), "FilterLinkAdExtension");

        super.processMappingsToRowValues(values, excludeReadonlyData);
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }
}
