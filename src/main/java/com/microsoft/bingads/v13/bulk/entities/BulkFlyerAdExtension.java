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
import com.microsoft.bingads.v13.campaignmanagement.ArrayOflong;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfstring;
import com.microsoft.bingads.v13.campaignmanagement.FlyerAdExtension;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;

/**
 * Represents an flyer ad extension that can be read or written in a bulk file.
 * This class exposes the properties
 * that can be read and written as fields of the Flyer Ad Extension record in a
 * bulk file.
 *
 * For more information, see Flyer Ad Extension at
 * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkFlyerAdExtension extends BulkAdExtension<FlyerAdExtension> {

    /**
     * Gets the flyer ad extension.
     */
    public FlyerAdExtension getFlyerAdExtension() {
        return getAdExtension();
    }

    /**
     * Sets the flyer ad extension.
     */
    public void setFlyerAdExtension(FlyerAdExtension FlyerAdExtension) {
        setAdExtension(FlyerAdExtension);
    }

    private static final List<BulkMapping<BulkFlyerAdExtension>> MAPPINGS;

    static {
        List<BulkMapping<BulkFlyerAdExtension>> m = new ArrayList<BulkMapping<BulkFlyerAdExtension>>();

        m.add(new SimpleBulkMapping<BulkFlyerAdExtension, String>(StringTable.FlyerName,
                new Function<BulkFlyerAdExtension, String>() {
                    @Override
                    public String apply(BulkFlyerAdExtension c) {
                        return c.getFlyerAdExtension().getFlyerName();
                    }
                },
                new BiConsumer<String, BulkFlyerAdExtension>() {
                    @Override
                    public void accept(String v, BulkFlyerAdExtension c) {
                        c.getFlyerAdExtension().setFlyerName(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkFlyerAdExtension, String>(StringTable.Description,
                new Function<BulkFlyerAdExtension, String>() {
                    @Override
                    public String apply(BulkFlyerAdExtension c) {
                        return c.getFlyerAdExtension().getDescription();
                    }
                },
                new BiConsumer<String, BulkFlyerAdExtension>() {
                    @Override
                    public void accept(String v, BulkFlyerAdExtension c) {
                        c.getFlyerAdExtension().setDescription(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkFlyerAdExtension, Long>(StringTable.MerchantCenterId,
                new Function<BulkFlyerAdExtension, Long>() {
                    @Override
                    public Long apply(BulkFlyerAdExtension c) {
                        return c.getFlyerAdExtension().getStoreId();
                    }
                },
                new BiConsumer<String, BulkFlyerAdExtension>() {
                    @Override
                    public void accept(String v, BulkFlyerAdExtension c) {
                        c.getFlyerAdExtension().setStoreId(StringExtensions.parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkFlyerAdExtension, String>(StringTable.MediaIds,
                new Function<BulkFlyerAdExtension, String>() {
                    @Override
                    public String apply(BulkFlyerAdExtension c) {
                        return StringExtensions.toIdListBulkString(";", c.getFlyerAdExtension().getImageMediaIds());
                    }
                },
                new BiConsumer<String, BulkFlyerAdExtension>() {
                    @Override
                    public void accept(String v, BulkFlyerAdExtension c) {
                    	ArrayOflong ids = new ArrayOflong();
                    	List<Long> idArray = StringExtensions.parseIdList(v);
                    	
                    	if (idArray == null) {
                    		ids = null;
                    	} else {
                    		ids.getLongs().addAll(idArray);
                		}
                    	
                        c.getFlyerAdExtension().setImageMediaIds(ids);
                    }
                }
        ));        

        m.add(new SimpleBulkMapping<BulkFlyerAdExtension, String>(StringTable.MediaUrls,
                new Function<BulkFlyerAdExtension, String>() {
                    @Override
                    public String apply(BulkFlyerAdExtension c) {
                        return StringExtensions.writeUrls("; ", c.getAdExtension().getImageMediaUrls(), c.getAdExtension().getId());
                    }
                },
                new BiConsumer<String, BulkFlyerAdExtension>() {
                    @Override
                    public void accept(String v, BulkFlyerAdExtension c) {
                        ArrayOfstring urls = new ArrayOfstring();
                        List<String> urlArray = StringExtensions.parseUrls(v);
                        if(urlArray == null) {
                            urls = null;
                        } else {
                            urls.getStrings().addAll(urlArray);
                        }
                        c.getAdExtension().setImageMediaUrls(urls);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkFlyerAdExtension, String>(StringTable.FinalUrl,
                new Function<BulkFlyerAdExtension, String>() {
                    @Override
                    public String apply(BulkFlyerAdExtension c) {
                        return StringExtensions.writeUrls("; ", c.getAdExtension().getFinalUrls(), c.getAdExtension().getId());
                    }
                },
                new BiConsumer<String, BulkFlyerAdExtension>() {
                    @Override
                    public void accept(String v, BulkFlyerAdExtension c) {
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

        m.add(new SimpleBulkMapping<BulkFlyerAdExtension, String>(StringTable.FinalMobileUrl,
                new Function<BulkFlyerAdExtension, String>() {
                    @Override
                    public String apply(BulkFlyerAdExtension c) {
                        return StringExtensions.writeUrls("; ", c.getAdExtension().getFinalMobileUrls(), c.getAdExtension().getId());
                    }
                },
                new BiConsumer<String, BulkFlyerAdExtension>() {
                    @Override
                    public void accept(String v, BulkFlyerAdExtension c) {
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
        
        m.add(new SimpleBulkMapping<BulkFlyerAdExtension, String>(StringTable.TrackingTemplate,
                new Function<BulkFlyerAdExtension, String>() {
                    @Override
                    public String apply(BulkFlyerAdExtension c) {
                        return StringExtensions.toOptionalBulkString(c.getAdExtension().getTrackingUrlTemplate(), c.getAdExtension().getId());
                    }
                },
                new BiConsumer<String, BulkFlyerAdExtension>() {
                    @Override
                    public void accept(String v, BulkFlyerAdExtension c) {
                        c.getAdExtension().setTrackingUrlTemplate(StringExtensions.getValueOrEmptyString(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkFlyerAdExtension, String>(StringTable.CustomParameter,
                new Function<BulkFlyerAdExtension, String>() {
                    @Override
                    public String apply(BulkFlyerAdExtension c) {
                        return StringExtensions.toCustomParaBulkString(c.getAdExtension().getUrlCustomParameters(), c.getAdExtension().getId());
                    }
                },
                new BiConsumer<String, BulkFlyerAdExtension>() {
                    @Override
                    public void accept(String v, BulkFlyerAdExtension c) {
                        try {
                            c.getAdExtension().setUrlCustomParameters(StringExtensions.parseCustomParameters(v));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkFlyerAdExtension, String>(StringTable.FinalUrlSuffix,
                new Function<BulkFlyerAdExtension, String>() {
                    @Override
                    public String apply(BulkFlyerAdExtension c) {
                        return StringExtensions.toOptionalBulkString(c.getAdExtension().getFinalUrlSuffix(), c.getAdExtension().getId());
                    }
                },
                new BiConsumer<String, BulkFlyerAdExtension>() {
                    @Override
                    public void accept(String v, BulkFlyerAdExtension c) {
                        c.getAdExtension().setFinalUrlSuffix(StringExtensions.getValueOrEmptyString(v));
                    }
                }
        ));
        
        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        FlyerAdExtension extension = new FlyerAdExtension();

        extension.setType("FlyerAdExtension");
        
        setAdExtension(extension);

        super.processMappingsFromRowValues(values);

        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(this.getFlyerAdExtension(), "FlyerAdExtension");

        super.processMappingsToRowValues(values, excludeReadonlyData);
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }
}
