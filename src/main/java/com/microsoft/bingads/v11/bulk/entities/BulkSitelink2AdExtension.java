package com.microsoft.bingads.v11.bulk.entities;

import com.microsoft.bingads.v11.internal.bulk.StringTable;
import com.microsoft.bingads.v11.bulk.BulkFileReader;
import com.microsoft.bingads.v11.bulk.BulkFileWriter;
import com.microsoft.bingads.v11.bulk.BulkOperation;
import com.microsoft.bingads.v11.bulk.BulkServiceManager;
import com.microsoft.bingads.v11.campaignmanagement.ArrayOfstring;
import com.microsoft.bingads.v11.campaignmanagement.Sitelink2AdExtension;
import com.microsoft.bingads.v11.internal.bulk.BulkMapping;
import com.microsoft.bingads.v11.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v11.internal.bulk.RowValues;
import com.microsoft.bingads.v11.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v11.internal.bulk.StringExtensions;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents a sitelink2 ad extension that can be read or written in a bulk file.
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
public class BulkSitelink2AdExtension extends BulkAdExtension<Sitelink2AdExtension> {
	/**
     * Gets the sitelink2 ad extension.
     */
    public Sitelink2AdExtension getSitelink2AdExtension() {
        return getAdExtension();
    }

    /**
     * Sets the sitelink2 ad extension.
     */
    public void setSitelink2AdExtension(Sitelink2AdExtension sitelink2AdExtension) {
        setAdExtension(sitelink2AdExtension);
    }

    private static final List<BulkMapping<BulkSitelink2AdExtension>> MAPPINGS;

    static {
        List<BulkMapping<BulkSitelink2AdExtension>> m = new ArrayList<BulkMapping<BulkSitelink2AdExtension>>();

        m.add(new SimpleBulkMapping<BulkSitelink2AdExtension, String>(StringTable.SiteLinkDestinationUrl,
                new Function<BulkSitelink2AdExtension, String>() {
                    @Override
                    public String apply(BulkSitelink2AdExtension c) {
                        return StringExtensions.toOptionalBulkString(c.getSitelink2AdExtension().getDestinationUrl());
                    }
                },
                new BiConsumer<String, BulkSitelink2AdExtension>() {
                    @Override
                    public void accept(String v, BulkSitelink2AdExtension c) {
                        c.getSitelink2AdExtension().setDestinationUrl(StringExtensions.getValueOrEmptyString(v));
                    }
                },
                true
        ));
        
        m.add(new SimpleBulkMapping<BulkSitelink2AdExtension, String>(StringTable.SiteLinkDescription1,
                new Function<BulkSitelink2AdExtension, String>() {
                    @Override
                    public String apply(BulkSitelink2AdExtension c) {
                        return c.getSitelink2AdExtension().getDescription1();
                    }
                },
                new BiConsumer<String, BulkSitelink2AdExtension>() {
                    @Override
                    public void accept(String v, BulkSitelink2AdExtension c) {
                        c.getSitelink2AdExtension().setDescription1(v);
                    }
                },
                true
        ));
        
        m.add(new SimpleBulkMapping<BulkSitelink2AdExtension, String>(StringTable.SiteLinkDescription2,
                new Function<BulkSitelink2AdExtension, String>() {
                    @Override
                    public String apply(BulkSitelink2AdExtension c) {
                        return c.getSitelink2AdExtension().getDescription2();
                    }
                },
                new BiConsumer<String, BulkSitelink2AdExtension>() {
                    @Override
                    public void accept(String v, BulkSitelink2AdExtension c) {
                        c.getSitelink2AdExtension().setDescription2(v);
                    }
                },
                true
        ));
        
        m.add(new SimpleBulkMapping<BulkSitelink2AdExtension, String>(StringTable.SiteLinkDisplayText,
                new Function<BulkSitelink2AdExtension, String>() {
                    @Override
                    public String apply(BulkSitelink2AdExtension c) {
                        return c.getSitelink2AdExtension().getDisplayText();
                    }
                },
                new BiConsumer<String, BulkSitelink2AdExtension>() {
                    @Override
                    public void accept(String v, BulkSitelink2AdExtension c) {
                        c.getSitelink2AdExtension().setDisplayText(v);;
                    }
                },
                true
        ));
        
        m.add(new SimpleBulkMapping<BulkSitelink2AdExtension, String>(StringTable.FinalUrl,
                new Function<BulkSitelink2AdExtension, String>() {
                    @Override
                    public String apply(BulkSitelink2AdExtension c) {
                        return StringExtensions.writeUrls("; ", c.getAdExtension().getFinalUrls());
                    }
                },
                new BiConsumer<String, BulkSitelink2AdExtension>() {
                    @Override
                    public void accept(String v, BulkSitelink2AdExtension c) {
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
        
        m.add(new SimpleBulkMapping<BulkSitelink2AdExtension, String>(StringTable.FinalMobileUrl,
                new Function<BulkSitelink2AdExtension, String>() {
                    @Override
                    public String apply(BulkSitelink2AdExtension c) {
                        return StringExtensions.writeUrls("; ", c.getAdExtension().getFinalMobileUrls());
                    }
                },
                new BiConsumer<String, BulkSitelink2AdExtension>() {
                    @Override
                    public void accept(String v, BulkSitelink2AdExtension c) {
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
        
        m.add(new SimpleBulkMapping<BulkSitelink2AdExtension, String>(StringTable.TrackingTemplate,
                new Function<BulkSitelink2AdExtension, String>() {
                    @Override
                    public String apply(BulkSitelink2AdExtension c) {
                        return StringExtensions.toOptionalBulkString(c.getAdExtension().getTrackingUrlTemplate());
                    }
                },
                new BiConsumer<String, BulkSitelink2AdExtension>() {
                    @Override
                    public void accept(String v, BulkSitelink2AdExtension c) {
                        c.getAdExtension().setTrackingUrlTemplate(StringExtensions.getValueOrEmptyString(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkSitelink2AdExtension, String>(StringTable.CustomParameter,
                new Function<BulkSitelink2AdExtension, String>() {
                    @Override
                    public String apply(BulkSitelink2AdExtension c) {
                        return StringExtensions.toCustomParaBulkString(c.getAdExtension().getUrlCustomParameters());
                    }
                },
                new BiConsumer<String, BulkSitelink2AdExtension>() {
                    @Override
                    public void accept(String v, BulkSitelink2AdExtension c) {
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
    	Sitelink2AdExtension extension = new Sitelink2AdExtension();

        extension.setType("Sitelink2AdExtension");
        
        setAdExtension(extension);

        super.processMappingsFromRowValues(values);

        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(this.getAdExtension(), "Sitelink2AdExtension");

        super.processMappingsToRowValues(values, excludeReadonlyData);
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }
}
