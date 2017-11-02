package com.microsoft.bingads.v11.bulk.entities;

import com.microsoft.bingads.v11.internal.bulk.StringExtensions;
import com.microsoft.bingads.v11.internal.bulk.StringTable;
import com.microsoft.bingads.v11.campaignmanagement.AdExtension;
import com.microsoft.bingads.v11.campaignmanagement.AdExtensionStatus;
import com.microsoft.bingads.v11.campaignmanagement.CallAdExtension;
import com.microsoft.bingads.v11.campaignmanagement.Schedule;
import com.microsoft.bingads.v11.internal.bulk.BulkMapping;
import com.microsoft.bingads.v11.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v11.internal.bulk.RowValues;
import com.microsoft.bingads.v11.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v11.internal.bulk.entities.SingleRecordBulkEntity;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This base class provides properties that are shared by all bulk ad extension classes.
 *
 * @param <T> the type of ad extension from the {@link com.microsoft.bingads.campaignmanagement} namespace,
 *           for example a {@link CallAdExtension} object.
 *
 * @see BulkCallAdExtension
 * @see BulkImageAdExtension
 * @see BulkLocationAdExtension
 * @see BulkProductAdExtension
 * @see BulkSiteLinkAdExtension
 */
class BulkAdExtension<T extends AdExtension> extends SingleRecordBulkEntity {

    private Long accountId;

    /**
     * Gets the ad extension's parent account identifier.
     *
     * <p>
     *     Corresponds to the 'Parent Id' field in the bulk file.
     * </p>
     */
    public Long getAccountId() {
        return accountId;
    }

    /**
     * Sets the ad extension's parent account identifier.
     *
     * <p>
     *     Corresponds to the 'Parent Id' field in the bulk file.
     * </p>
     */
    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    /**
     * The type of ad extension from the com.microsoft.bing_ads.api.client.CampaignManagement namespace, for example a {@link CallAdExtension} object.
     */
    private T adExtension;

    protected T getAdExtension() {
        return adExtension;
    }

    protected void setAdExtension(T adExtension) {
        this.adExtension = adExtension;
    }

    private static final List<BulkMapping<BulkAdExtension>> MAPPINGS;

    static {
        List<BulkMapping<BulkAdExtension>> m = new ArrayList<BulkMapping<BulkAdExtension>>();

        m.add(new SimpleBulkMapping<BulkAdExtension, String>(StringTable.Status,
                new Function<BulkAdExtension, String>() {
                    @Override
                    public String apply(BulkAdExtension c) {
                        return StringExtensions.toAdExtensionStatusBulkString(c.getAdExtension().getStatus());
                    }
                },
                new BiConsumer<String, BulkAdExtension>() {
                    @Override
                    public void accept(String v, BulkAdExtension c) {
                        c.getAdExtension().setStatus(StringExtensions.parseOptional(v, new Function<String, AdExtensionStatus>() {
                            @Override
                            public AdExtensionStatus apply(String value) {
                                return AdExtensionStatus.fromValue(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdExtension, Long>(StringTable.Id,
                new Function<BulkAdExtension, Long>() {
                    @Override
                    public Long apply(BulkAdExtension c) {
                        return c.getAdExtension().getId();
                    }
                },
                new BiConsumer<String, BulkAdExtension>() {
                    @Override
                    public void accept(String v, BulkAdExtension c) {
                        c.getAdExtension().setId(StringExtensions.parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdExtension, Long>(StringTable.ParentId,
                new Function<BulkAdExtension, Long>() {
                    @Override
                    public Long apply(BulkAdExtension c) {
                        return c.getAccountId();
                    }
                },
                new BiConsumer<String, BulkAdExtension>() {
                    @Override
                    public void accept(String v, BulkAdExtension c) {
                        c.setAccountId(StringExtensions.parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdExtension, Integer>(StringTable.Version,
                new Function<BulkAdExtension, Integer>() {
                    @Override
                    public Integer apply(BulkAdExtension t) {
                        return t.getAdExtension().getVersion();
                    }
                },
                new BiConsumer<String, BulkAdExtension>() {
                    @Override
                    public void accept(String v, BulkAdExtension c) {
                        c.getAdExtension().setVersion(StringExtensions.<Integer>parseOptional(v, new Function<String, Integer>() {
                            @Override
                            public Integer apply(String value) {
                                return Integer.parseInt(value);
                            }
                        }));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdExtension, String>(StringTable.AdSchedule,
                new Function<BulkAdExtension, String>() {
                    @Override
                    public String apply(BulkAdExtension t) {
                        if (t.getAdExtension().getScheduling() == null) {
                        	return null;
                        }
                        
                        return StringExtensions.toDayTimeRangesBulkString(t.getAdExtension().getScheduling().getDayTimeRanges());
                    }
                },
                new BiConsumer<String, BulkAdExtension>() {
                    @Override
                    public void accept(String v, BulkAdExtension c) {
                    	if (c.getAdExtension().getScheduling() == null) {
                    		c.getAdExtension().setScheduling(new Schedule());
                    	}
                    	
                    	c.getAdExtension().getScheduling().setDayTimeRanges(StringExtensions.parseDayTimeRanges(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdExtension, String>(StringTable.StartDate,
                new Function<BulkAdExtension, String>() {
                    @Override
                    public String apply(BulkAdExtension t) {
                        if (t.getAdExtension().getScheduling() == null) {
                        	return null;
                        }                        
                        return StringExtensions.toScheduleDateBulkString(t.getAdExtension().getScheduling().getStartDate());
                    }
                },
                new BiConsumer<String, BulkAdExtension>() {
                    @Override
                    public void accept(String v, BulkAdExtension c) {
                    	if (c.getAdExtension().getScheduling() == null) {
                    		c.getAdExtension().setScheduling(new Schedule());
                    	}                    	
                        try {
							c.getAdExtension().getScheduling().setStartDate(StringExtensions.parseDate(v));
						} catch (ParseException e) {
							e.printStackTrace();
						}
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdExtension, String>(StringTable.EndDate,
                new Function<BulkAdExtension, String>() {
                    @Override
                    public String apply(BulkAdExtension t) {
                        if (t.getAdExtension().getScheduling() == null) {
                        	return null;
                        }                       
                        return StringExtensions.toScheduleDateBulkString(t.getAdExtension().getScheduling().getEndDate());
                    }
                },
                new BiConsumer<String, BulkAdExtension>() {
                    @Override
                    public void accept(String v, BulkAdExtension c) {
                    	if (c.getAdExtension().getScheduling() == null) {
                    		c.getAdExtension().setScheduling(new Schedule());
                    	}                   	
                        try {     	
							c.getAdExtension().getScheduling().setEndDate(StringExtensions.parseDate(v));
						} catch (ParseException e) {
							e.printStackTrace();
						}
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdExtension, String>(StringTable.UseSearcherTimeZone,
                new Function<BulkAdExtension, String>() {
                    @Override
                    public String apply(BulkAdExtension t) {
                        if (t.getAdExtension().getScheduling() == null) {
                        	return null;
                        }

                        return StringExtensions.toUseSearcherTimeZoneBulkString(t.getAdExtension().getScheduling().getUseSearcherTimeZone());
                    }
                },
                new BiConsumer<String, BulkAdExtension>() {
                    @Override
                    public void accept(String v, BulkAdExtension c) {
                    	if (c.getAdExtension().getScheduling() == null) {
                    		c.getAdExtension().setScheduling(new Schedule());
                    	}

                    	c.getAdExtension().getScheduling().setUseSearcherTimeZone(StringExtensions.parseUseSearcherTimeZone(v));       
                    }
                },
                true
        ));

        m.add(new SimpleBulkMapping<BulkAdExtension, String>(StringTable.DevicePreference,
                new Function<BulkAdExtension, String>() {
                    @Override
                    public String apply(BulkAdExtension c) {
                        return StringExtensions.toDevicePreferenceBulkString(c.getAdExtension().getDevicePreference());
                    }
                },
                new BiConsumer<String, BulkAdExtension>() {
                    @Override
                    public void accept(String v, BulkAdExtension c) {
                        c.getAdExtension().setDevicePreference(StringExtensions.parseDevicePreference(v));
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

}
