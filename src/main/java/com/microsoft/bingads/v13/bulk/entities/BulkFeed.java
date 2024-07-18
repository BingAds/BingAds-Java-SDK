package com.microsoft.bingads.v13.bulk.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.bulk.BulkFileReader;
import com.microsoft.bingads.v13.bulk.BulkFileWriter;
import com.microsoft.bingads.v13.bulk.BulkOperation;
import com.microsoft.bingads.v13.bulk.BulkServiceManager;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;
import com.microsoft.bingads.v13.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * Represents a Feed that can be read or written in a bulk file.
 *
 * <p>
 * Properties of this class and of classes that it is derived from, correspond to fields of the Feed record in a bulk file.
 * For more information, see Feed at
 * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkFeed extends SingleRecordBulkEntity {
	
	private Long id;
	
	private Long accountId;
	
	private String name;
	
	private Status status;
	
	private String subType;
	
	private String schedule;
	
	private List<FeedCustomAttribute> customAttributes;

    private static final List<BulkMapping<BulkFeed>> MAPPINGS;

    static {
        List<BulkMapping<BulkFeed>> m = new ArrayList<BulkMapping<BulkFeed>>();

        m.add(new SimpleBulkMapping<BulkFeed, Long>(StringTable.Id,
                new Function<BulkFeed, Long>() {
                    @Override
                    public Long apply(BulkFeed t) {
                        return t.getId();
                    }
                },
                new BiConsumer<String, BulkFeed>() {
                    @Override
                    public void accept(String v, BulkFeed c) {
                        c.setId(StringExtensions.nullOrLong(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkFeed, Long>(StringTable.ParentId,
                new Function<BulkFeed, Long>() {
                    @Override
                    public Long apply(BulkFeed c) {
                        return c.getAccountId();
                    }
                },
                new BiConsumer<String, BulkFeed>() {
                    @Override
                    public void accept(String v, BulkFeed c) {
                    	c.setAccountId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkFeed, String>(StringTable.Status,
                new Function<BulkFeed, String>() {
                    @Override
                    public String apply(BulkFeed t) {
                        return t.getStatus() != null ? t.getStatus().value() : null;
                    }
                },
                new BiConsumer<String, BulkFeed>() {
                    @Override
                    public void accept(String v, BulkFeed c) {
                    	c.setStatus(StringExtensions.parseOptional(v, new Function<String, Status>() {
                            @Override
                            public Status apply(String value) {
                                return StringExtensions.fromValueOptional(value, Status.class);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkFeed, String>(StringTable.FeedName,
                new Function<BulkFeed, String>() {
                    @Override
                    public String apply(BulkFeed t) {
                        return t.getName();
                    }
                },
                new BiConsumer<String, BulkFeed>() {
                    @Override
                    public void accept(String v, BulkFeed c) {
                        c.setName(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkFeed, String>(StringTable.SubType,
                new Function<BulkFeed, String>() {
                    @Override
                    public String apply(BulkFeed t) {
                        return t.getSubType();
                    }
                },
                new BiConsumer<String, BulkFeed>() {
                    @Override
                    public void accept(String v, BulkFeed c) {
                        c.setSubType(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkFeed, String>(StringTable.CustomAttributes,
                new Function<BulkFeed, String>() {
                    @Override
                    public String apply(BulkFeed t) {
                        return StringExtensions.ToFeedCustomAttributesBulkString(t.getCustomAttributes());
                    }
                },
                new BiConsumer<String, BulkFeed>() {
                    @Override
                    public void accept(String v, BulkFeed c) {
                        c.setCustomAttributes(StringExtensions.parseFeedCustomAttributes(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkFeed, String>(StringTable.Schedule,
                new Function<BulkFeed, String>() {
                    @Override
                    public String apply(BulkFeed t) {
                        return t.getSchedule();
                    }
                },
                new BiConsumer<String, BulkFeed>() {
                    @Override
                    public void accept(String v, BulkFeed c) {
                        c.setSchedule(v);
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }
    
    public List<FeedCustomAttribute> getCustomAttributes() {
        return customAttributes;
    }

    public void setCustomAttributes(List<FeedCustomAttribute> customAttributes) {
        this.customAttributes = customAttributes;
    }
    
    public String getSchedule()
    {
    	return schedule;
    }

    public void setSchedule(String schedule)
    {
    	this.schedule = schedule;
    }
    @Override
    public void processMappingsFromRowValues(RowValues values) {
        MappingHelpers.<BulkFeed>convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)

    public static class FeedCustomAttribute
    {
        // The Feed attribute type
        private String feedAttributeType;

        // The Feed Name
        private String name;

        // The Feed isPartOfKey
        private boolean isPartOfKey;

        public String getFeedAttributeType() {
            return feedAttributeType;
        }

        public void setFeedAttributeType(String feedAttributeType) {
            this.feedAttributeType = feedAttributeType;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public boolean getIsPartOfKey() {
            return isPartOfKey;
        }

        public void setIsPartOfKey(boolean isPartOfKey) {
            this.isPartOfKey = isPartOfKey;
        }
        
        
    }
}
