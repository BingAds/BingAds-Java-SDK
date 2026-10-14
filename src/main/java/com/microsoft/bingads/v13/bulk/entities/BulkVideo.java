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
import com.microsoft.bingads.v13.campaignmanagement.Video;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;
import com.microsoft.bingads.v13.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * Represents a video that can be read or written in a bulk file.
 *
 * <p>
 * Properties of this class and of classes that it is derived from, correspond to fields of the Video record in a bulk file.
 * For more information, see Video at
 * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkVideo extends SingleRecordBulkEntity {
	
	private Long accountId;
	
	private Video video;

	private String advertiserAILabel;

	private String systemAIDetectionSignal;
	
    private static final List<BulkMapping<BulkVideo>> MAPPINGS;
    
    static {
        List<BulkMapping<BulkVideo>> m = new ArrayList<BulkMapping<BulkVideo>>();

        m.add(new SimpleBulkMapping<BulkVideo, Long>(StringTable.Id,
                new Function<BulkVideo, Long>() {
                    @Override
                    public Long apply(BulkVideo t) {
                        return t.getVideo().getId();
                    }
                },
                new BiConsumer<String, BulkVideo>() {
                    @Override
                    public void accept(String v, BulkVideo c) {
                        c.getVideo().setId(StringExtensions.nullOrLong(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkVideo, Long>(StringTable.ParentId,
                new Function<BulkVideo, Long>() {
                    @Override
                    public Long apply(BulkVideo t) {
                        return t.getAccountId();
                    }
                },
                new BiConsumer<String, BulkVideo>() {
                    @Override
                    public void accept(String v, BulkVideo c) {
                    	c.setAccountId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkVideo, String>(StringTable.Status,
                new Function<BulkVideo, String>() {
                    @Override
                    public String apply(BulkVideo t) {
                        return t.getVideo().getStatus();
                    }
                },
                new BiConsumer<String, BulkVideo>() {
                    @Override
                    public void accept(String v, BulkVideo c) {
                    	c.getVideo().setStatus(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkVideo, String>(StringTable.Description,
                new Function<BulkVideo, String>() {
                    @Override
                    public String apply(BulkVideo t) {
                        return t.getVideo().getDescription();
                    }
                },
                new BiConsumer<String, BulkVideo>() {
                    @Override
                    public void accept(String v, BulkVideo c) {
                        c.getVideo().setDescription(v);
                    }
                }
        ));


        m.add(new SimpleBulkMapping<BulkVideo, String>(StringTable.AspectRatio,
                new Function<BulkVideo, String>() {
                    @Override
                    public String apply(BulkVideo t) {
                        return t.getVideo().getAspectRatio();
                    }
                },
                new BiConsumer<String, BulkVideo>() {
                    @Override
                    public void accept(String v, BulkVideo c) {
                        c.getVideo().setAspectRatio(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkVideo, String>(StringTable.Url,
                new Function<BulkVideo, String>() {
                    @Override
                    public String apply(BulkVideo t) {
                        return t.getVideo().getUrl();
                    }
                },
                new BiConsumer<String, BulkVideo>() {
                    @Override
                    public void accept(String v, BulkVideo c) {
                        c.getVideo().setUrl(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkVideo, String>(StringTable.SourceUrl,
                new Function<BulkVideo, String>() {
                    @Override
                    public String apply(BulkVideo t) {
                        return t.getVideo().getSourceUrl();
                    }
                },
                new BiConsumer<String, BulkVideo>() {
                    @Override
                    public void accept(String v, BulkVideo c) {
                        c.getVideo().setSourceUrl(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkVideo, String>(StringTable.ThumbnailUrl,
                new Function<BulkVideo, String>() {
                    @Override
                    public String apply(BulkVideo t) {
                        return t.getVideo().getThumbnailUrl();
                    }
                },
                new BiConsumer<String, BulkVideo>() {
                    @Override
                    public void accept(String v, BulkVideo c) {
                        c.getVideo().setThumbnailUrl(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkVideo, Integer>(StringTable.DurationInMillionSeconds,
                new Function<BulkVideo, Integer>() {
                    @Override
                    public Integer apply(BulkVideo t) {
                        return t.getVideo().getDurationInMilliseconds();
                    }
                },
                new BiConsumer<String, BulkVideo>() {
                    @Override
                    public void accept(String v, BulkVideo c) {
                    	c.getVideo().setDurationInMilliseconds(StringExtensions.<Integer>parseOptional(v, new Function<String, Integer>() {
                            @Override
                            public Integer apply(String value) {
                                return Integer.parseInt(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkVideo, String>(StringTable.AdvertiserAILabel,
                new Function<BulkVideo, String>() {
                    @Override
                    public String apply(BulkVideo entity) {
                        return entity.getAdvertiserAILabel();
                    }
                },
                new BiConsumer<String, BulkVideo>() {
                    @Override
                    public void accept(String value, BulkVideo entity) {
                        entity.setAdvertiserAILabel(value);
                    }
                }
        ));
        
        MAPPINGS = Collections.unmodifiableList(m);
    }

    private static final List<BulkMapping<BulkVideo>> READ_ONLY_MAPPINGS;

    static {
        List<BulkMapping<BulkVideo>> mappings = new ArrayList<BulkMapping<BulkVideo>>();
        mappings.add(new SimpleBulkMapping<BulkVideo, String>(StringTable.SystemAIDetectionSignal,
                new Function<BulkVideo, String>() {
                    @Override
                    public String apply(BulkVideo entity) {
                        return entity.getSystemAIDetectionSignal();
                    }
                },
                new BiConsumer<String, BulkVideo>() {
                    @Override
                    public void accept(String value, BulkVideo entity) {
                        entity.setSystemAIDetectionSignal(value);
                    }
                }
        ));
        READ_ONLY_MAPPINGS = Collections.unmodifiableList(mappings);
    }

    /**
     * Gets the account id 
     * */
    public Long getAccountId() {
		return accountId;
	}

    /**
     * Sets the account id
     * */
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}	
	
    /**
     * Gets the video.
     */
    public Video getVideo() {
        return video;
    }

    /**
     * Sets the video.
     */
    public void setVideo(Video video) {
        this.video = video;
    }

    /**
     * Gets the Advertiser AI Label field.
     */
    public String getAdvertiserAILabel() {
        return advertiserAILabel;
    }

    /**
     * Sets the Advertiser AI Label field.
     */
    public void setAdvertiserAILabel(String advertiserAILabel) {
        this.advertiserAILabel = advertiserAILabel;
    }

    /**
     * Gets the read-only System AI Detection Signal field.
     */
    public String getSystemAIDetectionSignal() {
        return systemAIDetectionSignal;
    }

    /**
     * Sets the read-only System AI Detection Signal field.
     */
    public void setSystemAIDetectionSignal(String systemAIDetectionSignal) {
        this.systemAIDetectionSignal = systemAIDetectionSignal;
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
    	this.setVideo(new Video());
        MappingHelpers.<BulkVideo>convertToEntity(values, MAPPINGS, this);
        MappingHelpers.<BulkVideo>convertToEntity(values, READ_ONLY_MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getVideo(), "Video");
        MappingHelpers.convertToValues(this, values, MAPPINGS);
        if (!excludeReadonlyData) {
            MappingHelpers.convertToValues(this, values, READ_ONLY_MAPPINGS);
        }
    }
}
