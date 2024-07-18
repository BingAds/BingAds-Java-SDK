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
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;
import com.microsoft.bingads.v13.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * Represents a image that can be read or written in a bulk file.
 *
 * <p>
 * Properties of this class and of classes that it is derived from, correspond to fields of the Image record in a bulk file.
 * For more information, see Image at
 * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkImage extends SingleRecordBulkEntity {
	
	private Long id;
	
	private Long accountId;
	
	private Status status;
	
	private String text;
	
	private String subType;
	
	private String url;
	
	private Integer width;
	
	private Integer height;
	

    private static final List<BulkMapping<BulkImage>> MAPPINGS;

    static {
        List<BulkMapping<BulkImage>> m = new ArrayList<BulkMapping<BulkImage>>();

        m.add(new SimpleBulkMapping<BulkImage, Long>(StringTable.Id,
                new Function<BulkImage, Long>() {
                    @Override
                    public Long apply(BulkImage t) {
                        return t.getId();
                    }
                },
                new BiConsumer<String, BulkImage>() {
                    @Override
                    public void accept(String v, BulkImage c) {
                        c.setId(StringExtensions.nullOrLong(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkImage, Long>(StringTable.ParentId,
                new Function<BulkImage, Long>() {
                    @Override
                    public Long apply(BulkImage c) {
                        return c.getAccountId();
                    }
                },
                new BiConsumer<String, BulkImage>() {
                    @Override
                    public void accept(String v, BulkImage c) {
                    	c.setAccountId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkImage, String>(StringTable.Status,
                new Function<BulkImage, String>() {
                    @Override
                    public String apply(BulkImage t) {
                        return t.getStatus() != null ? t.getStatus().value() : null;
                    }
                },
                new BiConsumer<String, BulkImage>() {
                    @Override
                    public void accept(String v, BulkImage c) {
                    	c.setStatus(StringExtensions.parseOptional(v, new Function<String, Status>() {
                            @Override
                            public Status apply(String value) {
                                return StringExtensions.fromValueOptional(value, Status.class);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkImage, String>(StringTable.Text,
                new Function<BulkImage, String>() {
                    @Override
                    public String apply(BulkImage t) {
                        return t.getText();
                    }
                },
                new BiConsumer<String, BulkImage>() {
                    @Override
                    public void accept(String v, BulkImage c) {
                        c.setText(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkImage, String>(StringTable.Url,
                new Function<BulkImage, String>() {
                    @Override
                    public String apply(BulkImage t) {
                        return t.getUrl();
                    }
                },
                new BiConsumer<String, BulkImage>() {
                    @Override
                    public void accept(String v, BulkImage c) {
                        c.setUrl(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkImage, String>(StringTable.SubType,
                new Function<BulkImage, String>() {
                    @Override
                    public String apply(BulkImage t) {
                        return t.getSubType();
                    }
                },
                new BiConsumer<String, BulkImage>() {
                    @Override
                    public void accept(String v, BulkImage c) {
                        c.setSubType(v);
                    }
                }
        ));
        

        m.add(new SimpleBulkMapping<BulkImage, Integer>(StringTable.Width,
                new Function<BulkImage, Integer>() {
                    @Override
                    public Integer apply(BulkImage c) {
                        return c.getWidth();
                    }
                },
                new BiConsumer<String, BulkImage>() {
                    @Override
                    public void accept(String v, BulkImage c) {
                        c.setWidth(StringExtensions.<Integer>parseOptional(v, new Function<String, Integer>() {
                            @Override
                            public Integer apply(String value) {
                                return Integer.parseInt(value);
                            }
                        }));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkImage, Integer>(StringTable.Height,
                new Function<BulkImage, Integer>() {
                    @Override
                    public Integer apply(BulkImage c) {
                        return c.getHeight();
                    }
                },
                new BiConsumer<String, BulkImage>() {
                    @Override
                    public void accept(String v, BulkImage c) {
                        c.setHeight(StringExtensions.<Integer>parseOptional(v, new Function<String, Integer>() {
                            @Override
                            public Integer apply(String value) {
                                return Integer.parseInt(value);
                            }
                        }));
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        MappingHelpers.<BulkImage>convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }
}
