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
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfstring;
import com.microsoft.bingads.v13.campaignmanagement.VideoAdExtension;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;

/**
 * Represents a video ad extension that can be read or written in a bulk file.
 * This class exposes the properties
 * that can be read and written as fields of the Video Ad Extension record in a
 * bulk file.
 *
 * For more information, see Video Ad Extension at
 * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */

public class BulkVideoAdExtension extends BulkAdExtension<VideoAdExtension> {

	/**
     * Gets the video ad extension.
     */
    public VideoAdExtension getVideoAdExtension() {
        return getAdExtension();
    }

    /**
     * Sets the video ad extension.
     */
    public void setVideoAdExtension(VideoAdExtension videoAdExtension) {
        setAdExtension(videoAdExtension);
    }

    private static final List<BulkMapping<BulkVideoAdExtension>> MAPPINGS;

    static {
        List<BulkMapping<BulkVideoAdExtension>> m = new ArrayList<BulkMapping<BulkVideoAdExtension>>();

        m.add(new SimpleBulkMapping<BulkVideoAdExtension, String>(
                StringTable.Name,
                new Function<BulkVideoAdExtension, String>() {
                    @Override
                    public String apply(BulkVideoAdExtension c) {
                        return StringExtensions.toOptionalBulkString(c.getAdExtension().getName(), c.getAdExtension().getId());
                    }
                },
                new BiConsumer<String, BulkVideoAdExtension>() {
                    @Override
                    public void accept(String v, BulkVideoAdExtension c) {
                        c.getAdExtension().setName(StringExtensions.getValueOrEmptyString(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkVideoAdExtension, String>(StringTable.DisplayText,
                new Function<BulkVideoAdExtension, String>() {
                    @Override
                    public String apply(BulkVideoAdExtension c) {
                        return StringExtensions.toOptionalBulkString(c.getAdExtension().getDisplayText(), c.getAdExtension().getId());
                    }
                },
                new BiConsumer<String, BulkVideoAdExtension>() {
                    @Override
                    public void accept(String v, BulkVideoAdExtension c) {
                        c.getAdExtension().setDisplayText(StringExtensions.getValueOrEmptyString(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkVideoAdExtension, String>(StringTable.AltText,
                new Function<BulkVideoAdExtension, String>() {
                    @Override
                    public String apply(BulkVideoAdExtension c) {
                        return StringExtensions.toOptionalBulkString(c.getAdExtension().getAlternativeText(), c.getAdExtension().getId());
                    }
                },
                new BiConsumer<String, BulkVideoAdExtension>() {
                    @Override
                    public void accept(String v, BulkVideoAdExtension c) {
                        c.getAdExtension().setAlternativeText(StringExtensions.getValueOrEmptyString(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkVideoAdExtension, String>(StringTable.ActionText,
                new Function<BulkVideoAdExtension, String>() {
                    @Override
                    public String apply(BulkVideoAdExtension c) {
                        return StringExtensions.toOptionalBulkString(c.getAdExtension().getActionText(), c.getAdExtension().getId());
                    }
                },
                new BiConsumer<String, BulkVideoAdExtension>() {
                    @Override
                    public void accept(String v, BulkVideoAdExtension c) {
                        c.getAdExtension().setActionText(StringExtensions.getValueOrEmptyString(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkVideoAdExtension, String>(StringTable.ThumbnailUrl,
                new Function<BulkVideoAdExtension, String>() {
                    @Override
                    public String apply(BulkVideoAdExtension t) {
                        return t.getVideoAdExtension().getThumbnailUrl();
                    }
                },
                new BiConsumer<String, BulkVideoAdExtension>() {
                    @Override
                    public void accept(String v, BulkVideoAdExtension c) {
                        c.getVideoAdExtension().setThumbnailUrl(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkVideoAdExtension, String>(StringTable.ThumbnailId,
                new Function<BulkVideoAdExtension, String>() {
                    @Override
                    public String apply(BulkVideoAdExtension c) {
                    	return StringExtensions.toBulkString(c.getAdExtension().getThumbnailId());
                    }
                },
                new BiConsumer<String, BulkVideoAdExtension>() {
                    @Override
                    public void accept(String v, BulkVideoAdExtension c) {
                        c.getAdExtension().setThumbnailId(StringExtensions.nullOrLong(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkVideoAdExtension, String>(StringTable.VideoId,
                new Function<BulkVideoAdExtension, String>() {
                    @Override
                    public String apply(BulkVideoAdExtension c) {
                    	return StringExtensions.toBulkString(c.getAdExtension().getVideoId());
                    }
                },
                new BiConsumer<String, BulkVideoAdExtension>() {
                    @Override
                    public void accept(String v, BulkVideoAdExtension c) {
                        c.getAdExtension().setVideoId(StringExtensions.nullOrLong(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkVideoAdExtension, String>(StringTable.FinalUrl,
                new Function<BulkVideoAdExtension, String>() {
                    @Override
                    public String apply(BulkVideoAdExtension c) {
                        return StringExtensions.writeUrls("; ", c.getAdExtension().getFinalUrls(), c.getAdExtension().getId());
                    }
                },
                new BiConsumer<String, BulkVideoAdExtension>() {
                    @Override
                    public void accept(String v, BulkVideoAdExtension c) {
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

        m.add(new SimpleBulkMapping<BulkVideoAdExtension, String>(StringTable.FinalMobileUrl,
                new Function<BulkVideoAdExtension, String>() {
                    @Override
                    public String apply(BulkVideoAdExtension c) {
                        return StringExtensions.writeUrls("; ", c.getAdExtension().getFinalMobileUrls(), c.getAdExtension().getId());
                    }
                },
                new BiConsumer<String, BulkVideoAdExtension>() {
                    @Override
                    public void accept(String v, BulkVideoAdExtension c) {
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
        
        m.add(new SimpleBulkMapping<BulkVideoAdExtension, String>(StringTable.TrackingTemplate,
                new Function<BulkVideoAdExtension, String>() {
                    @Override
                    public String apply(BulkVideoAdExtension t) {
                        return StringExtensions.toOptionalBulkString(t.getAdExtension().getTrackingUrlTemplate(), t.getAdExtension().getId());
                    }
                },
                new BiConsumer<String, BulkVideoAdExtension>() {
                    @Override
                    public void accept(String v, BulkVideoAdExtension c) {
                        c.getAdExtension().setTrackingUrlTemplate(StringExtensions.getValueOrEmptyString(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkVideoAdExtension, String>(StringTable.CustomParameter,
                new Function<BulkVideoAdExtension, String>() {
                    @Override
                    public String apply(BulkVideoAdExtension c) {
                        return StringExtensions.toCustomParaBulkString(c.getAdExtension().getUrlCustomParameters(), c.getAdExtension().getId());
                    }
                },
                new BiConsumer<String, BulkVideoAdExtension>() {
                    @Override
                    public void accept(String v, BulkVideoAdExtension c) {
                        try {
                            c.getAdExtension().setUrlCustomParameters(StringExtensions.parseCustomParameters(v));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkVideoAdExtension, String>(StringTable.FinalUrlSuffix,
                new Function<BulkVideoAdExtension, String>() {
                    @Override
                    public String apply(BulkVideoAdExtension c) {
                        return StringExtensions.toOptionalBulkString(c.getAdExtension().getFinalUrlSuffix(), c.getAdExtension().getId());
                    }
                },
                new BiConsumer<String, BulkVideoAdExtension>() {
                    @Override
                    public void accept(String v, BulkVideoAdExtension c) {
                        c.getAdExtension().setFinalUrlSuffix(StringExtensions.getValueOrEmptyString(v));
                    }
                }
        ));


        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        VideoAdExtension extension = new VideoAdExtension();

        extension.setType("VideoAdExtension");

        setAdExtension(extension);

        super.processMappingsFromRowValues(values);

        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(this.getVideoAdExtension(), "VideoAdExtension");

        super.processMappingsToRowValues(values, excludeReadonlyData);
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }
	
}
