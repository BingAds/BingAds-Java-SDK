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
 * Represents a Content Placement.
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
public class BulkContentPlacement extends SingleRecordBulkEntity {

    private Long id;
    
    private Long parentId;

    private String name;
    
    private String status;

    private static final List<BulkMapping<BulkContentPlacement>> MAPPINGS;

    static {
        List<BulkMapping<BulkContentPlacement>> m = new ArrayList<BulkMapping<BulkContentPlacement>>();

        m.add(new SimpleBulkMapping<BulkContentPlacement, Long>(StringTable.Id,
                new Function<BulkContentPlacement, Long>() {
                    @Override
                    public Long apply(BulkContentPlacement c) {
                        return c.getId();
                    }
                },
                new BiConsumer<String, BulkContentPlacement>() {
                    @Override
                    public void accept(String v, BulkContentPlacement c) {
                        c.setId(StringExtensions.nullOrLong(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkContentPlacement, Long>(StringTable.ParentId,
                new Function<BulkContentPlacement, Long>() {
                    @Override
                    public Long apply(BulkContentPlacement c) {
                        return c.getParentId();
                    }
                },
                new BiConsumer<String, BulkContentPlacement>() {
                    @Override
                    public void accept(String v, BulkContentPlacement c) {
                        c.setParentId(StringExtensions.nullOrLong(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkContentPlacement, String>(StringTable.Name,
                new Function<BulkContentPlacement, String>() {
                    @Override
                    public String apply(BulkContentPlacement c) {
                        return c.getName();
                    }
                },
                new BiConsumer<String, BulkContentPlacement>() {
                    @Override
                    public void accept(String v, BulkContentPlacement c) {
                        c.setName(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkContentPlacement, String>(StringTable.Status,
                new Function<BulkContentPlacement, String>() {
                    @Override
                    public String apply(BulkContentPlacement c) {
                        return c.getStatus();
                    }
                },
                new BiConsumer<String, BulkContentPlacement>() {
                    @Override
                    public void accept(String v, BulkContentPlacement c) {
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
