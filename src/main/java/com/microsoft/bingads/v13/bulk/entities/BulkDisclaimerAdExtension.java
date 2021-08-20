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
import com.microsoft.bingads.v13.campaignmanagement.DisclaimerAdExtension;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfstring;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;

/**
 * Represents a disclaimer ad extension that can be read or written in a bulk file.
 * This class exposes the properties
 * that can be read and written as fields of the Disclaimer Ad Extension record in a
 * bulk file.
 *
 * For more information, see Disclaimer Ad Extension at
 * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */

public class BulkDisclaimerAdExtension extends BulkAdExtension<DisclaimerAdExtension> {
	
	/**
     * Gets the disclaimer ad extension.
     */
    public DisclaimerAdExtension getDisclaimerAdExtension() {
        return getAdExtension();
    }
    
    /**
     * Sets the disclaimer ad extension.
     */
    public void setDisclaimerAdExtension(DisclaimerAdExtension disclaimerAdExtension) {
        setAdExtension(disclaimerAdExtension);
    }
    
    private static final List<BulkMapping<BulkDisclaimerAdExtension>> MAPPINGS;
    
    static {
        List<BulkMapping<BulkDisclaimerAdExtension>> m = new ArrayList<BulkMapping<BulkDisclaimerAdExtension>>();
        
        m.add(new SimpleBulkMapping<BulkDisclaimerAdExtension, String>(
                StringTable.DisclaimerName,
                new Function<BulkDisclaimerAdExtension, String>() {
                    @Override
                    public String apply(BulkDisclaimerAdExtension c) {
                        return StringExtensions.toOptionalBulkString(c.getAdExtension().getName(), c.getAdExtension().getId());
                    }
                },
                new BiConsumer<String, BulkDisclaimerAdExtension>() {
                    @Override
                    public void accept(String v, BulkDisclaimerAdExtension c) {
                        c.getAdExtension().setName(StringExtensions.getValueOrEmptyString(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkDisclaimerAdExtension, String>(StringTable.DisclaimerLayout,
                new Function<BulkDisclaimerAdExtension, String>() {
                    @Override
                    public String apply(BulkDisclaimerAdExtension t) {
                        return t.getDisclaimerAdExtension().getDisclaimerLayout();
                    }
                },
                new BiConsumer<String, BulkDisclaimerAdExtension>() {
                    @Override
                    public void accept(String v, BulkDisclaimerAdExtension c) {
                        c.getDisclaimerAdExtension().setDisclaimerLayout(StringExtensions.getValueOrEmptyString(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkDisclaimerAdExtension, String>(StringTable.DisclaimerLineText,
                new Function<BulkDisclaimerAdExtension, String>() {
                    @Override
                    public String apply(BulkDisclaimerAdExtension t) {
                        return t.getDisclaimerAdExtension().getLineText();
                    }
                },
                new BiConsumer<String, BulkDisclaimerAdExtension>() {
                    @Override
                    public void accept(String v, BulkDisclaimerAdExtension c) {
                        c.getDisclaimerAdExtension().setLineText(StringExtensions.getValueOrEmptyString(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkDisclaimerAdExtension, String>(StringTable.DisclaimerPopupText,
                new Function<BulkDisclaimerAdExtension, String>() {
                    @Override
                    public String apply(BulkDisclaimerAdExtension t) {
                        return t.getDisclaimerAdExtension().getPopupText();
                    }
                },
                new BiConsumer<String, BulkDisclaimerAdExtension>() {
                    @Override
                    public void accept(String v, BulkDisclaimerAdExtension c) {
                        c.getDisclaimerAdExtension().setPopupText(StringExtensions.getValueOrEmptyString(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkDisclaimerAdExtension, String>(StringTable.DisclaimerTitle,
                new Function<BulkDisclaimerAdExtension, String>() {
                    @Override
                    public String apply(BulkDisclaimerAdExtension t) {
                        return t.getDisclaimerAdExtension().getTitle();
                    }
                },
                new BiConsumer<String, BulkDisclaimerAdExtension>() {
                    @Override
                    public void accept(String v, BulkDisclaimerAdExtension c) {
                        c.getDisclaimerAdExtension().setTitle(StringExtensions.getValueOrEmptyString(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkDisclaimerAdExtension, String>(StringTable.FinalUrl,
                new Function<BulkDisclaimerAdExtension, String>() {
                    @Override
                    public String apply(BulkDisclaimerAdExtension c) {
                        return StringExtensions.writeUrls("; ", c.getDisclaimerAdExtension().getFinalUrls(), c.getDisclaimerAdExtension().getId());
                    }
                },
                new BiConsumer<String, BulkDisclaimerAdExtension>() {
                    @Override
                    public void accept(String v, BulkDisclaimerAdExtension c) {
                        ArrayOfstring urls = new ArrayOfstring();
                        List<String> urlArray = StringExtensions.parseUrls(v);
                        if(urlArray == null) {
                            urls = null;
                        } else {
                            urls.getStrings().addAll(urlArray);
                        }
                        c.getDisclaimerAdExtension().setFinalUrls(urls);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkDisclaimerAdExtension, String>(StringTable.FinalMobileUrl,
                new Function<BulkDisclaimerAdExtension, String>() {
                    @Override
                    public String apply(BulkDisclaimerAdExtension c) {
                        return StringExtensions.writeUrls("; ", c.getDisclaimerAdExtension().getFinalMobileUrls(), c.getDisclaimerAdExtension().getId());
                    }
                },
                new BiConsumer<String, BulkDisclaimerAdExtension>() {
                    @Override
                    public void accept(String v, BulkDisclaimerAdExtension c) {
                        ArrayOfstring urls = new ArrayOfstring();
                        List<String> urlArray = StringExtensions.parseUrls(v);
                        if(urlArray == null) {
                            urls = null;
                        } else {
                            urls.getStrings().addAll(urlArray);
                        }
                        c.getDisclaimerAdExtension().setFinalMobileUrls(urls);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkDisclaimerAdExtension, String>(StringTable.TrackingTemplate,
                new Function<BulkDisclaimerAdExtension, String>() {
                    @Override
                    public String apply(BulkDisclaimerAdExtension t) {
                        return StringExtensions.toOptionalBulkString(t.getDisclaimerAdExtension().getTrackingUrlTemplate(), t.getDisclaimerAdExtension().getId());
                    }
                },
                new BiConsumer<String, BulkDisclaimerAdExtension>() {
                    @Override
                    public void accept(String v, BulkDisclaimerAdExtension c) {
                        c.getDisclaimerAdExtension().setTrackingUrlTemplate(StringExtensions.getValueOrEmptyString(v));
                    }
                }
        ));


        m.add(new SimpleBulkMapping<BulkDisclaimerAdExtension, String>(StringTable.CustomParameter,
                new Function<BulkDisclaimerAdExtension, String>() {
                    @Override
                    public String apply(BulkDisclaimerAdExtension c) {
                        return StringExtensions.toCustomParaBulkString(c.getDisclaimerAdExtension().getUrlCustomParameters(), c.getDisclaimerAdExtension().getId());
                    }
                },
                new BiConsumer<String, BulkDisclaimerAdExtension>() {
                    @Override
                    public void accept(String v, BulkDisclaimerAdExtension c) {
                        try {
                                c.getDisclaimerAdExtension().setUrlCustomParameters(StringExtensions.parseCustomParameters(v));
                        } catch (Exception e) {
                                e.printStackTrace();
                        }
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkDisclaimerAdExtension, String>(StringTable.FinalUrlSuffix,
                new Function<BulkDisclaimerAdExtension, String>() {
                    @Override
                    public String apply(BulkDisclaimerAdExtension c) {
                        return StringExtensions.toOptionalBulkString(c.getAdExtension().getFinalUrlSuffix(), c.getAdExtension().getId());
                    }
                },
                new BiConsumer<String, BulkDisclaimerAdExtension>() {
                    @Override
                    public void accept(String v, BulkDisclaimerAdExtension c) {
                        c.getAdExtension().setFinalUrlSuffix(StringExtensions.getValueOrEmptyString(v));
                    }
                }
        ));
        
        MAPPINGS = Collections.unmodifiableList(m);
    }
    
    @Override
    public void processMappingsFromRowValues(RowValues values) {
    	DisclaimerAdExtension extension = new DisclaimerAdExtension();

        extension.setType("DisclaimerAdExtension");

        setAdExtension(extension);

        super.processMappingsFromRowValues(values);

        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(this.getDisclaimerAdExtension(), "DisclaimerAdExtension");

        super.processMappingsToRowValues(values, excludeReadonlyData);
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }
}
