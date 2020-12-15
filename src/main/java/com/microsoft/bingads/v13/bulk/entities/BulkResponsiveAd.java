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
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfstring;
import com.microsoft.bingads.v13.campaignmanagement.CallToAction;
import com.microsoft.bingads.v13.campaignmanagement.ResponsiveAd;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;

/**
 * Represents a responsive ad.
 *
 * This class exposes the {@link #setResponsiveAd} and {@link #getResponsiveAd} methods
 * that can be used to read and write fields of the Responsive Ad record in a bulk file.
 *
 * <p>
 *     For more information, see Responsive Ad at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkResponsiveAd extends BulkAd<ResponsiveAd> {

    private static final List<BulkMapping<BulkResponsiveAd>> MAPPINGS;

    static {
        List<BulkMapping<BulkResponsiveAd>> m = new ArrayList<BulkMapping<BulkResponsiveAd>>();

        m.add(new SimpleBulkMapping<BulkResponsiveAd, String>(StringTable.BusinessName,
                new Function<BulkResponsiveAd, String>() {
                    @Override
                    public String apply(BulkResponsiveAd c) {
                        return c.getAd().getBusinessName();
                    }
                },
                new BiConsumer<String, BulkResponsiveAd>() {
                    @Override
                    public void accept(String v, BulkResponsiveAd c) {
                        c.getAd().setBusinessName(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkResponsiveAd, String>(StringTable.CallToAction,
                new Function<BulkResponsiveAd, String>() {
                    @Override
                    public String apply(BulkResponsiveAd c) {
                        return c.getAd().getCallToAction() != null ? c.getAd().getCallToAction().value() : null;
                    }
                },
                new BiConsumer<String, BulkResponsiveAd>() {
                    @Override
                    public void accept(String v, BulkResponsiveAd c) {
                        c.getAd().setCallToAction(StringExtensions.parseOptional(v, new Function<String, CallToAction>() {
                            @Override
                            public CallToAction apply(String value) {
                                return CallToAction.fromValue(value);
                            }
                        }));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkResponsiveAd, String>(StringTable.Headline,
                new Function<BulkResponsiveAd, String>() {
                    @Override
                    public String apply(BulkResponsiveAd c) {
                        return c.getAd().getHeadline();
                    }
                },
                new BiConsumer<String, BulkResponsiveAd>() {
                    @Override
                    public void accept(String v, BulkResponsiveAd c) {
                        c.getAd().setHeadline(v);
                    }
                }
        ));
        

        m.add(new SimpleBulkMapping<BulkResponsiveAd, String>(StringTable.Images,
                new Function<BulkResponsiveAd, String>() {
                    @Override
                    public String apply(BulkResponsiveAd c) {
                        return StringExtensions.toImageAssetLinksBulkString(c.getAd().getImages());
                    }
                },
                new BiConsumer<String, BulkResponsiveAd>() {
                    @Override
                    public void accept(String v, BulkResponsiveAd c) {
                        c.getAd().setImages(StringExtensions.parseImageAssetLinks(v));
                    }
                }
        ));
        

        m.add(new SimpleBulkMapping<BulkResponsiveAd, String>(StringTable.LongHeadline,
                new Function<BulkResponsiveAd, String>() {
                    @Override
                    public String apply(BulkResponsiveAd c) {
                        return c.getAd().getLongHeadlineString();
                    }
                },
                new BiConsumer<String, BulkResponsiveAd>() {
                    @Override
                    public void accept(String v, BulkResponsiveAd c) {
                        c.getAd().setLongHeadlineString(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkResponsiveAd, String>(StringTable.Text,
                new Function<BulkResponsiveAd, String>() {
                    @Override
                    public String apply(BulkResponsiveAd c) {
                        return c.getAd().getText();
                    }
                },
                new BiConsumer<String, BulkResponsiveAd>() {
                    @Override
                    public void accept(String v, BulkResponsiveAd c) {
                        c.getAd().setText(v);
                    }
                }
        ));
        

        m.add(new SimpleBulkMapping<BulkResponsiveAd, String>(StringTable.ImpressionTrackingUrls,
                new Function<BulkResponsiveAd, String>() {
                    @Override
                    public String apply(BulkResponsiveAd c) {
                        return StringExtensions.writeUrls("; ", c.getAd().getImpressionTrackingUrls(), c.getAd().getId());
                    }
                },
                new BiConsumer<String, BulkResponsiveAd>() {
                    @Override
                    public void accept(String v, BulkResponsiveAd c) {
                        ArrayOfstring urls = new ArrayOfstring();
                        List<String> urlArray = StringExtensions.parseUrls(v);
                        if(urlArray == null) {
                            urls = null;
                        } else {
                            urls.getStrings().addAll(urlArray);
                        }
                        c.getAd().setImpressionTrackingUrls(urls);
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getResponsiveAd(), getAd().getClass().getName());

        super.processMappingsToRowValues(values, excludeReadonlyData);

        MappingHelpers.<BulkResponsiveAd>convertToValues(this, values, MAPPINGS);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        setAd(new ResponsiveAd());
        
        getAd().setType(AdType.RESPONSIVE_AD);
        
        super.processMappingsFromRowValues(values);
        MappingHelpers.<BulkResponsiveAd>convertToEntity(values, MAPPINGS, this);
    }

    /**
     * Gets the responsive ad.
     */
    public ResponsiveAd getResponsiveAd() {
        return ad;
    }

    /**
     * Sets the responsive ad.
     */
    public void setResponsiveAd(ResponsiveAd ad) {
        this.setAd(ad);
    }
}
