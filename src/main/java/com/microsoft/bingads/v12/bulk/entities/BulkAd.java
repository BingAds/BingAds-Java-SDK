package com.microsoft.bingads.v12.bulk.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v12.campaignmanagement.Ad;
import com.microsoft.bingads.v12.campaignmanagement.AdEditorialStatus;
import com.microsoft.bingads.v12.campaignmanagement.AdStatus;
import com.microsoft.bingads.v12.campaignmanagement.ArrayOfstring;
import com.microsoft.bingads.v12.campaignmanagement.TextAd;
import com.microsoft.bingads.v12.internal.bulk.BulkMapping;
import com.microsoft.bingads.v12.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v12.internal.bulk.RowValues;
import com.microsoft.bingads.v12.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v12.internal.bulk.StringExtensions;
import com.microsoft.bingads.v12.internal.bulk.StringTable;
import com.microsoft.bingads.v12.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * This abstract base class provides properties that are shared by all bulk ad classes.
 *
 * @param <T> the type of ad from the {@link com.microsoft.bingads.campaignmanagement} namespace, for example
 *           {@link TextAd} object.
 *
 * @see BulkProductAd
 * @see BulkTextAd
 * @see BulkAppInstallAd
 * @see BulkExpandedTextAd
 * @see BulkDynamicSearchAd
 */
class BulkAd<T extends Ad> extends SingleRecordBulkEntity {

    private Long adGroupId;

    private String campaignName;

    private String adGroupName;

    protected T ad;

    private PerformanceData performanceData;

    private static final List<BulkMapping<BulkAd>> MAPPINGS;

    static {
        List<BulkMapping<BulkAd>> m = new ArrayList<BulkMapping<BulkAd>>();

        m.add(new SimpleBulkMapping<BulkAd, String>(StringTable.Status,
                new Function<BulkAd, String>() {
                    @Override
                    public String apply(BulkAd c) {
                        return c.getAd().getStatus() != null ? c.getAd().getStatus().value() : null;
                    }
                },
                new BiConsumer<String, BulkAd>() {
                    @Override
                    public void accept(String v, BulkAd c) {
                        c.getAd().setStatus(StringExtensions.<AdStatus>parseOptional(v, new Function<String, AdStatus>() {
                            @Override
                            public AdStatus apply(String value) {
                                return AdStatus.fromValue(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAd, Long>(StringTable.Id,
                new Function<BulkAd, Long>() {
                    @Override
                    public Long apply(BulkAd c) {
                        return c.getAd().getId();
                    }
                },
                new BiConsumer<String, BulkAd>() {
                    @Override
                    public void accept(String v, BulkAd c) {
                        c.getAd().setId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAd, Long>(StringTable.ParentId,
                new Function<BulkAd, Long>() {
                    @Override
                    public Long apply(BulkAd c) {
                        return c.getAdGroupId();
                    }
                },
                new BiConsumer<String, BulkAd>() {
                    @Override
                    public void accept(String v, BulkAd c) {
                        c.setAdGroupId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAd, String>(StringTable.Campaign,
                new Function<BulkAd, String>() {
                    @Override
                    public String apply(BulkAd c) {
                        return c.getCampaignName();
                    }
                },
                new BiConsumer<String, BulkAd>() {
                    @Override
                    public void accept(String v, BulkAd c) {
                        c.setCampaignName(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAd, String>(StringTable.AdGroup,
                new Function<BulkAd, String>() {
                    @Override
                    public String apply(BulkAd c) {
                        return c.getAdGroupName();
                    }
                },
                new BiConsumer<String, BulkAd>() {
                    @Override
                    public void accept(String v, BulkAd c) {
                        c.setAdGroupName(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAd, String>(StringTable.EditorialStatus,
                new Function<BulkAd, String>() {
                    @Override
                    public String apply(BulkAd t) {
                        return t.getAd().getEditorialStatus() != null ? t.getAd().getEditorialStatus().value() : null;
                    }
                },
                new BiConsumer<String, BulkAd>() {
                    @Override
                    public void accept(String v, BulkAd c) {
                        c.getAd().setEditorialStatus(StringExtensions.<AdEditorialStatus>parseOptional(v, new Function<String, AdEditorialStatus>() {
                            @Override
                            public AdEditorialStatus apply(String value) {
                                return AdEditorialStatus.fromValue(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAd, String>(StringTable.DevicePreference,
                new Function<BulkAd, String>() {
                    @Override
                    public String apply(BulkAd c) {
                        return StringExtensions.toDevicePreferenceBulkString(c.getAd().getDevicePreference());
                    }
                },
                new BiConsumer<String, BulkAd>() {
                    @Override
                    public void accept(String v, BulkAd c) {
                        c.getAd().setDevicePreference(StringExtensions.parseDevicePreference(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAd, String>(StringTable.FinalUrl,
                new Function<BulkAd, String>() {
                    @Override
                    public String apply(BulkAd c) {
                        return StringExtensions.writeUrls("; ", c.getAd().getFinalUrls(), c.getAd().getId());
                    }
                },
                new BiConsumer<String, BulkAd>() {
                    @Override
                    public void accept(String v, BulkAd c) {
                    	ArrayOfstring urls = new ArrayOfstring();
                    	List<String> urlArray = StringExtensions.parseUrls(v);
                    	if(urlArray == null) {
                    		urls = null;
                    	} else {
                    		urls.getStrings().addAll(urlArray);
                    	}
                    	c.getAd().setFinalUrls(urls);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAd, String>(StringTable.FinalMobileUrl,
                new Function<BulkAd, String>() {
                    @Override
                    public String apply(BulkAd c) {
                        return StringExtensions.writeUrls("; ", c.getAd().getFinalMobileUrls(), c.getAd().getId());
                    }
                },
                new BiConsumer<String, BulkAd>() {
                    @Override
                    public void accept(String v, BulkAd c) {
                    	ArrayOfstring urls = new ArrayOfstring();
                    	List<String> urlArray = StringExtensions.parseUrls(v);
                    	if(urlArray == null) {
                    		urls = null;
                    	} else {
                    		urls.getStrings().addAll(urlArray);
                    	}
                		c.getAd().setFinalMobileUrls(urls);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAd, String>(StringTable.TrackingTemplate,
                new Function<BulkAd, String>() {
                    @Override
                    public String apply(BulkAd c) {
                        return StringExtensions.toOptionalBulkString(c.getAd().getTrackingUrlTemplate(), c.getAd().getId());
                    }
                },
                new BiConsumer<String, BulkAd>() {
                    @Override
                    public void accept(String v, BulkAd c) {
                        c.getAd().setTrackingUrlTemplate(StringExtensions.getValueOrEmptyString(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAd, String>(StringTable.CustomParameter,
                new Function<BulkAd, String>() {
                    @Override
                    public String apply(BulkAd c) {
                        return StringExtensions.toCustomParaBulkString(c.getAd().getUrlCustomParameters(), c.getAd().getId());
                    }
                },
                new BiConsumer<String, BulkAd>() {
                    @Override
                    public void accept(String v, BulkAd c) {
                        try {
                                c.getAd().setUrlCustomParameters(StringExtensions.parseCustomParameters(v));
                        } catch (Exception e) {
                                e.printStackTrace();
                        }
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAd, String>(StringTable.AdFormatPreference, new Function<BulkAd, String>() {
                @Override
                public String apply(BulkAd c) {
                    return c.getAd().getAdFormatPreference();
                }
        }, new BiConsumer<String, BulkAd>() {
                @Override
                public void accept(String v, BulkAd c) {
                	c.getAd().setAdFormatPreference(StringExtensions.getValueOrEmptyString(v));
                }
        }, true));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    ;
    
    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        MappingHelpers.<BulkAd>convertToValues(this, values, MAPPINGS);

        if (!excludeReadonlyData) {
            PerformanceData.writeToRowValuesIfNotNull(performanceData, values);
        }
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        MappingHelpers.<BulkAd>convertToEntity(values, MAPPINGS, this);

        performanceData = PerformanceData.readFromRowValuesOrNull(values);
    }

    /**
     * Gets the identifier of the ad group that contains the ad.
     *
     * <p>
     *     Corresponds to the 'Parent Id' field in the bulk file.
     * </p>
     */
    public Long getAdGroupId() {
        return adGroupId;
    }

    /**
     * Gets the name of the campaign that contains the ad.
     *
     * <p>
     *     Corresponds to the 'Campaign' field in the bulk file.
     * </p>
     */
    public String getCampaignName() {
        return campaignName;
    }

    /**
     * Gets the name of the ad group that contains the ad.
     *
     * <p>
     *     Corresponds to the 'Ad Group' field in the bulk file.
     * </p>
     */
    public String getAdGroupName() {
        return adGroupName;
    }

    /**
     * Gets the ad from the {@link com.microsoft.bingads.campaignmanagement} namespace,
     */
    public T getAd() {
        return ad;
    }

    /**
     * Gets the historical performance data for the ad.
     */
    public PerformanceData getPerformanceData() {
        return performanceData;
    }

    /**
     * Sets the identifier of the ad group that contains the ad.
     *
     * <p>
     *     Corresponds to the 'Parent Id' field in the bulk file.
     * </p>
     */
    public void setAdGroupId(Long adGroupId) {
        this.adGroupId = adGroupId;
    }

    /**
     * Sets the ad from the {@link com.microsoft.bingads.campaignmanagement} namespace,
     */
    public void setAd(T ad) {
        this.ad = ad;
    }

    /**
     * Sets the name of the campaign that contains the ad.
     *
     * <p>
     *     Corresponds to the 'Campaign' field in the bulk file.
     * </p>
     */
    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    /**
     * Sets the name of the ad group that contains the ad.
     *
     * <p>
     *     Corresponds to the 'Ad Group' field in the bulk file.
     * </p>
     */
    public void setAdGroupName(String adGroupName) {
        this.adGroupName = adGroupName;
    }

}
