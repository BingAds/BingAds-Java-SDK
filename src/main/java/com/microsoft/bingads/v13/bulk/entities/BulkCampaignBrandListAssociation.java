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
 * Represents a Campaign Brand List Association.
 * <p/>
 * <p>
 * This class exposes the {@link #setCampaignBrandListAssociation} and {@link #getCampaignBrandListAssociation} that can be used to read and write
 * fields of the Campaign Brand List Association record in a bulk file.
 * </p>
 * <p/>
 * <p>
 * For more information, see Campaign Brand List Association at
 * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkCampaignBrandListAssociation extends SingleRecordBulkEntity {

    private Long id;
    
    private Long campaignId;
    
    private String name;
    
    private Boolean isExcluded;

    private static final List<BulkMapping<BulkCampaignBrandListAssociation>> MAPPINGS;

    static {
        List<BulkMapping<BulkCampaignBrandListAssociation>> m = new ArrayList<BulkMapping<BulkCampaignBrandListAssociation>>();

        m.add(new SimpleBulkMapping<BulkCampaignBrandListAssociation, Long>(StringTable.Id,
                new Function<BulkCampaignBrandListAssociation, Long>() {
                    @Override
                    public Long apply(BulkCampaignBrandListAssociation c) {
                        return c.getId();
                    }
                },
                new BiConsumer<String, BulkCampaignBrandListAssociation>() {
                    @Override
                    public void accept(String v, BulkCampaignBrandListAssociation c) {
                        c.setId(StringExtensions.nullOrLong(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkCampaignBrandListAssociation, Long>(StringTable.ParentId,
                new Function<BulkCampaignBrandListAssociation, Long>() {
                    @Override
                    public Long apply(BulkCampaignBrandListAssociation c) {
                        return c.getCampaignId();
                    }
                },
                new BiConsumer<String, BulkCampaignBrandListAssociation>() {
                    @Override
                    public void accept(String v, BulkCampaignBrandListAssociation c) {
                        c.setCampaignId(StringExtensions.nullOrLong(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkCampaignBrandListAssociation, String>(StringTable.Name,
                new Function<BulkCampaignBrandListAssociation, String>() {
                    @Override
                    public String apply(BulkCampaignBrandListAssociation c) {
                        return c.getName();
                    }
                },
                new BiConsumer<String, BulkCampaignBrandListAssociation>() {
                    @Override
                    public void accept(String v, BulkCampaignBrandListAssociation c) {
                        c.setName(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkCampaignBrandListAssociation, Boolean>(StringTable.IsExcluded,
                new Function<BulkCampaignBrandListAssociation, Boolean>() {
                    @Override
                    public Boolean apply(BulkCampaignBrandListAssociation t) {
                        return t.getIsExcluded();
                    }
                },
                new BiConsumer<String, BulkCampaignBrandListAssociation>() {
                    @Override
                    public void accept(String v, BulkCampaignBrandListAssociation c) {
                        c.setIsExcluded(v == null ? null : Boolean.parseBoolean(v));
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
	
	public Long getCampaignId() {
		return campaignId;
	}
	
	public void setCampaignId(Long campaignId) {
		this.campaignId = campaignId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Boolean getIsExcluded() {
		return isExcluded;
	}
	
	public void setIsExcluded(Boolean isExcluded) {
		this.isExcluded = isExcluded;
	}
	
}
