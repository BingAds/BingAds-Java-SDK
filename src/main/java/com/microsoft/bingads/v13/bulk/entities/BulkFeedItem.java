package com.microsoft.bingads.v13.bulk.entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.TimeZone;

import com.microsoft.bingads.internal.UncheckedParseException;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.bulk.BulkFileReader;
import com.microsoft.bingads.v13.bulk.BulkFileWriter;
import com.microsoft.bingads.v13.bulk.BulkOperation;
import com.microsoft.bingads.v13.bulk.BulkServiceManager;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfDayTime;
import com.microsoft.bingads.v13.campaignmanagement.IntentOption;
import com.microsoft.bingads.v13.campaignmanagement.MatchType;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;
import com.microsoft.bingads.v13.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * Represents a Feed Item that can be read or written in a bulk file.
 *
 * <p>
 * Properties of this class and of classes that it is derived from, correspond to fields of the Feed Item record in a bulk file.
 * For more information, see Feed Item at
 * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkFeedItem extends SingleRecordBulkEntity {
	
	private Long id;
	
	private Long feedId;

    private Long audienceId;

    private Long locationId;
    
    private Long devicePreference;
	
	private String campaignName;
	
	private String adGroupName;
	
    private String customAttributes;

    private String keyword;

    private MatchType matchType;
	
	private Status status;
	
	private IntentOption intentOption;
	
    private ArrayOfDayTime dayTimeRanges;
	
	private Calendar startDate;
	
	private Calendar endDate;

    private static final List<BulkMapping<BulkFeedItem>> MAPPINGS;

    static {
        List<BulkMapping<BulkFeedItem>> m = new ArrayList<BulkMapping<BulkFeedItem>>();

        m.add(new SimpleBulkMapping<BulkFeedItem, Long>(StringTable.Id,
                new Function<BulkFeedItem, Long>() {
                    @Override
                    public Long apply(BulkFeedItem t) {
                        return t.getId();
                    }
                },
                new BiConsumer<String, BulkFeedItem>() {
                    @Override
                    public void accept(String v, BulkFeedItem c) {
                        c.setId(StringExtensions.nullOrLong(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkFeedItem, Long>(StringTable.ParentId,
                new Function<BulkFeedItem, Long>() {
                    @Override
                    public Long apply(BulkFeedItem c) {
                        return c.getFeedId();
                    }
                },
                new BiConsumer<String, BulkFeedItem>() {
                    @Override
                    public void accept(String v, BulkFeedItem c) {
                    	c.setFeedId(StringExtensions.nullOrLong(v));
                    }
                }
        ));
        

        m.add(new SimpleBulkMapping<BulkFeedItem, Long>(StringTable.AudienceId,
                new Function<BulkFeedItem, Long>() {
                    @Override
                    public Long apply(BulkFeedItem c) {
                        return c.getAudienceId();
                    }
                },
                new BiConsumer<String, BulkFeedItem>() {
                    @Override
                    public void accept(String v, BulkFeedItem c) {
                        c.setAudienceId(StringExtensions.nullOrLong(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkFeedItem, Long>(StringTable.Target,
                new Function<BulkFeedItem, Long>() {
                    @Override
                    public Long apply(BulkFeedItem c) {
                        return c.getLocationId();
                    }
                },
                new BiConsumer<String, BulkFeedItem>() {
                    @Override
                    public void accept(String v, BulkFeedItem c) {
                        c.setLocationId(StringExtensions.nullOrLong(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkFeedItem, String>(StringTable.DevicePreference,
                new Function<BulkFeedItem, String>() {
                    @Override
                    public String apply(BulkFeedItem c) {
                        return StringExtensions.toDevicePreferenceBulkString(c.getDevicePreference());
                    }
                },
                new BiConsumer<String, BulkFeedItem>() {
                    @Override
                    public void accept(String v, BulkFeedItem c) {
                        c.setDevicePreference(StringExtensions.parseDevicePreference(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkFeedItem, String>(StringTable.Status,
                new Function<BulkFeedItem, String>() {
                    @Override
                    public String apply(BulkFeedItem t) {
                        return t.getStatus() != null ? t.getStatus().value() : null;
                    }
                },
                new BiConsumer<String, BulkFeedItem>() {
                    @Override
                    public void accept(String v, BulkFeedItem c) {
                    	c.setStatus(StringExtensions.parseOptional(v, new Function<String, Status>() {
                            @Override
                            public Status apply(String value) {
                                return Status.fromValue(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkFeedItem, String>(StringTable.Campaign,
                new Function<BulkFeedItem, String>() {
                    @Override
                    public String apply(BulkFeedItem t) {
                        return t.getCampaignName();
                    }
                },
                new BiConsumer<String, BulkFeedItem>() {
                    @Override
                    public void accept(String v, BulkFeedItem c) {
                        c.setCampaignName(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkFeedItem, String>(StringTable.AdGroup,
                new Function<BulkFeedItem, String>() {
                    @Override
                    public String apply(BulkFeedItem t) {
                        return t.getAdGroupName();
                    }
                },
                new BiConsumer<String, BulkFeedItem>() {
                    @Override
                    public void accept(String v, BulkFeedItem c) {
                        c.setAdGroupName(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkFeedItem, String>(StringTable.Keyword,
                new Function<BulkFeedItem, String>() {
                    @Override
                    public String apply(BulkFeedItem t) {
                        return t.getKeyword();
                    }
                },
                new BiConsumer<String, BulkFeedItem>() {
                    @Override
                    public void accept(String v, BulkFeedItem c) {
                        c.setKeyword(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkFeedItem, String>(StringTable.CustomAttributes,
                new Function<BulkFeedItem, String>() {
                    @Override
                    public String apply(BulkFeedItem t) {
                        return t.getCustomAttributes();
                    }
                },
                new BiConsumer<String, BulkFeedItem>() {
                    @Override
                    public void accept(String v, BulkFeedItem c) {
                        c.setCustomAttributes(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkFeedItem, String>(StringTable.MatchType,
                new Function<BulkFeedItem, String>() {
                    @Override
                    public String apply(BulkFeedItem c) {
                        return StringExtensions.toMatchTypeBulkString(c.getMatchType());
                    }
                },
                new BiConsumer<String, BulkFeedItem>() {
                    @Override
                    public void accept(String v, BulkFeedItem c) {
                        c.setMatchType(StringExtensions.<MatchType>parseOptional(v, new Function<String, MatchType>() {
                            @Override
                            public MatchType apply(String value) {
                                return MatchType.fromValue(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkFeedItem, String>(StringTable.PhysicalIntent,
                new Function<BulkFeedItem, String>() {
                    @Override
                    public String apply(BulkFeedItem c) {
                        return c.getIntentOption() == null ? null : c.getIntentOption().value();
                    }
                },
                new BiConsumer<String, BulkFeedItem>() {
                    @Override
                    public void accept(String v, BulkFeedItem c) {
                        c.setIntentOption(StringExtensions.<IntentOption>parseOptional(v, new Function<String, IntentOption>() {
                            @Override
                            public IntentOption apply(String value) {
                                return IntentOption.fromValue(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkFeedItem, String>(StringTable.StartDate,
                new Function<BulkFeedItem, String>() {
                    @Override
                    public String apply(BulkFeedItem t) {
                        if (t.getStartDate() == null) {
                            return null;
                        }

                        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                        format.setTimeZone(TimeZone.getTimeZone("UTC"));

                        return format.format(t.getStartDate().getTime());
                    }
                },
                new BiConsumer<String, BulkFeedItem>() {
                    @Override
                    public void accept(String v, BulkFeedItem c) {
                        c.setStartDate(StringExtensions.parseOptional(v, new Function<String, Calendar>() {
                            @Override
                            public Calendar apply(String t) {
                                Calendar c = new GregorianCalendar();
                                try {
                                    SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                                    format.setTimeZone(TimeZone.getTimeZone("UTC"));

                                    c.setTime(format.parse(t));
                                } catch (ParseException ex) {
                                    throw new UncheckedParseException(ex);
                                }

                                return c;
                            }
                        }));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkFeedItem, String>(StringTable.EndDate,
                new Function<BulkFeedItem, String>() {
                    @Override
                    public String apply(BulkFeedItem t) {
                        if (t.getEndDate() == null) {
                            return null;
                        }

                        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                        format.setTimeZone(TimeZone.getTimeZone("UTC"));

                        return format.format(t.getEndDate().getTime());
                    }
                },
                new BiConsumer<String, BulkFeedItem>() {
                    @Override
                    public void accept(String v, BulkFeedItem c) {
                        c.setEndDate(StringExtensions.parseOptional(v, new Function<String, Calendar>() {
                            @Override
                            public Calendar apply(String t) {
                                Calendar c = new GregorianCalendar();
                                try {
                                    SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                                    format.setTimeZone(TimeZone.getTimeZone("UTC"));

                                    c.setTime(format.parse(t));
                                } catch (ParseException ex) {
                                    throw new UncheckedParseException(ex);
                                }

                                return c;
                            }
                        }));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkFeedItem, String>(StringTable.AdSchedule,
                new Function<BulkFeedItem, String>() {
                    @Override
                    public String apply(BulkFeedItem t) {
                        if (t.getDayTimeRanges() == null) {
                            return null;
                        }
                        
                        return StringExtensions.toDayTimeRangesBulkString(t.getDayTimeRanges(), t.getId());
                    }
                },
                new BiConsumer<String, BulkFeedItem>() {
                    @Override
                    public void accept(String v, BulkFeedItem c) {
                        c.setDayTimeRanges(StringExtensions.parseDayTimeRanges(v));
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }


	/**
     * Gets the status
     * */
	public Status getStatus() {
		return status;
	}

	/**
     * Sets the status
     * */
	public void setStatus(Status status) {
		this.status = status;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getFeedId() {
        return feedId;
    }

    public void setFeedId(Long feedId) {
        this.feedId = feedId;
    }

    public Long getAudienceId() {
        return audienceId;
    }

    public void setAudienceId(Long audienceId) {
        this.audienceId = audienceId;
    }

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public Long getDevicePreference() {
        return devicePreference;
    }

    public void setDevicePreference(Long devicePreference) {
        this.devicePreference = devicePreference;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public String getAdGroupName() {
        return adGroupName;
    }

    public void setAdGroupName(String adGroupName) {
        this.adGroupName = adGroupName;
    }

    public String getCustomAttributes() {
        return customAttributes;
    }

    public void setCustomAttributes(String customAttributes) {
        this.customAttributes = customAttributes;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public MatchType getMatchType() {
        return matchType;
    }

    public void setMatchType(MatchType matchType) {
        this.matchType = matchType;
    }

    public IntentOption getIntentOption() {
        return intentOption;
    }

    public void setIntentOption(IntentOption intentOption) {
        this.intentOption = intentOption;
    }

    public ArrayOfDayTime getDayTimeRanges() {
        return dayTimeRanges;
    }

    public void setDayTimeRanges(ArrayOfDayTime dayTimeRanges) {
        this.dayTimeRanges = dayTimeRanges;
    }

    public Calendar getStartDate() {
        return startDate;
    }

    public void setStartDate(Calendar startDate) {
        this.startDate = startDate;
    }

    public Calendar getEndDate() {
        return endDate;
    }

    public void setEndDate(Calendar endDate) {
        this.endDate = endDate;
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        MappingHelpers.<BulkFeedItem>convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }
}
