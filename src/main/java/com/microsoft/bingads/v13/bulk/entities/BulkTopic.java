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
 * Represents a Topic.
 * <p/>
 * <p>
 * </p>
 * <p/>
 * <p>
 * For more information, see Brand Item at
 * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkTopic extends SingleRecordBulkEntity {

    private Long id;
    
    private Long parentId;

    private Long topicParentId;
    
    private String name;
    
    private String status;

    private static final List<BulkMapping<BulkTopic>> MAPPINGS;

    static {
        List<BulkMapping<BulkTopic>> m = new ArrayList<BulkMapping<BulkTopic>>();

        m.add(new SimpleBulkMapping<BulkTopic, Long>(StringTable.Id,
                new Function<BulkTopic, Long>() {
                    @Override
                    public Long apply(BulkTopic c) {
                        return c.getId();
                    }
                },
                new BiConsumer<String, BulkTopic>() {
                    @Override
                    public void accept(String v, BulkTopic c) {
                        c.setId(StringExtensions.nullOrLong(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkTopic, Long>(StringTable.ParentId,
                new Function<BulkTopic, Long>() {
                    @Override
                    public Long apply(BulkTopic c) {
                        return c.getParentId();
                    }
                },
                new BiConsumer<String, BulkTopic>() {
                    @Override
                    public void accept(String v, BulkTopic c) {
                        c.setParentId(StringExtensions.nullOrLong(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkTopic, Long>(StringTable.TopicParentId,
                new Function<BulkTopic, Long>() {
                    @Override
                    public Long apply(BulkTopic c) {
                        return c.getTopicParentId();
                    }
                },
                new BiConsumer<String, BulkTopic>() {
                    @Override
                    public void accept(String v, BulkTopic c) {
                        c.setTopicParentId(StringExtensions.nullOrLong(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkTopic, String>(StringTable.Name,
                new Function<BulkTopic, String>() {
                    @Override
                    public String apply(BulkTopic c) {
                        return c.getName();
                    }
                },
                new BiConsumer<String, BulkTopic>() {
                    @Override
                    public void accept(String v, BulkTopic c) {
                        c.setName(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkTopic, String>(StringTable.Status,
                new Function<BulkTopic, String>() {
                    @Override
                    public String apply(BulkTopic c) {
                        return c.getStatus();
                    }
                },
                new BiConsumer<String, BulkTopic>() {
                    @Override
                    public void accept(String v, BulkTopic c) {
                        c.setStatus(v);
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
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getParentId() {
		return parentId;
	}
	
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

    public Long getTopicParentId() {
        return topicParentId;
    }

    public void setTopicParentId(Long topicParentId) {
        this.topicParentId = topicParentId;
    }
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
        this.status = status;
    }
}
