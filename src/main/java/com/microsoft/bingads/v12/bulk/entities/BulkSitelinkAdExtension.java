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
import com.microsoft.bingads.v12.campaignmanagement.ArrayOfstring;
import com.microsoft.bingads.v12.campaignmanagement.SitelinkAdExtension;
import com.microsoft.bingads.v12.internal.bulk.BulkMapping;
import com.microsoft.bingads.v12.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v12.internal.bulk.RowValues;
import com.microsoft.bingads.v12.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v12.internal.bulk.StringExtensions;
import com.microsoft.bingads.v12.internal.bulk.StringTable;

/**
 * Represents a sitelink ad extension that can be read or written in a bulk file.
 * This class exposes the properties
 * that can be read and written as fields of the Sitelink2 Ad Extension record in a
 * bulk file.
 * <p/>
 * For more information, see Sitelink2 Ad Extension at
 * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkSitelinkAdExtension extends BulkAdExtension<SitelinkAdExtension> {
	/**
     * Gets the sitelink ad extension.
     */
    public SitelinkAdExtension getSitelinkAdExtension() {
        return getAdExtension();
    }

    /**
     * Sets the sitelink ad extension.
     */
    public void setSitelinkAdExtension(SitelinkAdExtension SitelinkAdExtension) {
        setAdExtension(SitelinkAdExtension);
    }

    private static final List<BulkMapping<BulkSitelinkAdExtension>> MAPPINGS;

    static {
        List<BulkMapping<BulkSitelinkAdExtension>> m = new ArrayList<BulkMapping<BulkSitelinkAdExtension>>();

        m.add(new SimpleBulkMapping<BulkSitelinkAdExtension, String>(StringTable.SiteLinkDestinationUrl,
                new Function<BulkSitelinkAdExtension, String>() {
                    @Override
                    public String apply(BulkSitelinkAdExtension c) {
                        return StringExtensions.toOptionalBulkString(c.getSitelinkAdExtension().getDestinationUrl());
                    }
                },
                new BiConsumer<String, BulkSitelinkAdExtension>() {
                    @Override
                    public void accept(String v, BulkSitelinkAdExtension c) {
                        c.getSitelinkAdExtension().setDestinationUrl(StringExtensions.getValueOrEmptyString(v));
                    }
                },
                true
        ));
        
        m.add(new SimpleBulkMapping<BulkSitelinkAdExtension, String>(StringTable.SiteLinkDescription1,
                new Function<BulkSitelinkAdExtension, String>() {
                    @Override
                    public String apply(BulkSitelinkAdExtension c) {
                        return c.getSitelinkAdExtension().getDescription1();
                    }
                },
                new BiConsumer<String, BulkSitelinkAdExtension>() {
                    @Override
                    public void accept(String v, BulkSitelinkAdExtension c) {
                        c.getSitelinkAdExtension().setDescription1(v);
                    }
                },
                true
        ));
        
        m.add(new SimpleBulkMapping<BulkSitelinkAdExtension, String>(StringTable.SiteLinkDescription2,
                new Function<BulkSitelinkAdExtension, String>() {
                    @Override
                    public String apply(BulkSitelinkAdExtension c) {
                        return c.getSitelinkAdExtension().getDescription2();
                    }
                },
                new BiConsumer<String, BulkSitelinkAdExtension>() {
                    @Override
                    public void accept(String v, BulkSitelinkAdExtension c) {
                        c.getSitelinkAdExtension().setDescription2(v);
                    }
                },
                true
        ));
        
        m.add(new SimpleBulkMapping<BulkSitelinkAdExtension, String>(StringTable.SiteLinkDisplayText,
                new Function<BulkSitelinkAdExtension, String>() {
                    @Override
                    public String apply(BulkSitelinkAdExtension c) {
                        return c.getSitelinkAdExtension().getDisplayText();
                    }
                },
                new BiConsumer<String, BulkSitelinkAdExtension>() {
                    @Override
                    public void accept(String v, BulkSitelinkAdExtension c) {
                        c.getSitelinkAdExtension().setDisplayText(v);;
                    }
                },
                true
        ));
        
        m.add(new SimpleBulkMapping<BulkSitelinkAdExtension, String>(StringTable.FinalUrl,
                new Function<BulkSitelinkAdExtension, String>() {
                    @Override
                    public String apply(BulkSitelinkAdExtension c) {
                        return StringExtensions.writeUrls("; ", c.getAdExtension().getFinalUrls());
                    }
                },
                new BiConsumer<String, BulkSitelinkAdExtension>() {
                    @Override
                    public void accept(String v, BulkSitelinkAdExtension c) {
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
        
        m.add(new SimpleBulkMapping<BulkSitelinkAdExtension, String>(StringTable.FinalMobileUrl,
                new Function<BulkSitelinkAdExtension, String>() {
                    @Override
                    public String apply(BulkSitelinkAdExtension c) {
                        return StringExtensions.writeUrls("; ", c.getAdExtension().getFinalMobileUrls());
                    }
                },
                new BiConsumer<String, BulkSitelinkAdExtension>() {
                    @Override
                    public void accept(String v, BulkSitelinkAdExtension c) {
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
        
        m.add(new SimpleBulkMapping<BulkSitelinkAdExtension, String>(StringTable.TrackingTemplate,
                new Function<BulkSitelinkAdExtension, String>() {
                    @Override
                    public String apply(BulkSitelinkAdExtension c) {
                        return StringExtensions.toOptionalBulkString(c.getAdExtension().getTrackingUrlTemplate());
                    }
                },
                new BiConsumer<String, BulkSitelinkAdExtension>() {
                    @Override
                    public void accept(String v, BulkSitelinkAdExtension c) {
                        c.getAdExtension().setTrackingUrlTemplate(StringExtensions.getValueOrEmptyString(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkSitelinkAdExtension, String>(StringTable.CustomParameter,
                new Function<BulkSitelinkAdExtension, String>() {
                    @Override
                    public String apply(BulkSitelinkAdExtension c) {
                        return StringExtensions.toCustomParaBulkString(c.getAdExtension().getUrlCustomParameters());
                    }
                },
                new BiConsumer<String, BulkSitelinkAdExtension>() {
                    @Override
                    public void accept(String v, BulkSitelinkAdExtension c) {
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
    	SitelinkAdExtension extension = new SitelinkAdExtension();

        extension.setType("SitelinkAdExtension");
        
        setAdExtension(extension);

        super.processMappingsFromRowValues(values);

        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(this.getAdExtension(), "SitelinkAdExtension");

        super.processMappingsToRowValues(values, excludeReadonlyData);
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }
}
