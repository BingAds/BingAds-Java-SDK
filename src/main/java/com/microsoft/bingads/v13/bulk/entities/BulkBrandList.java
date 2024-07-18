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
import com.microsoft.bingads.v13.campaignmanagement.BrandList;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;
import com.microsoft.bingads.v13.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * Represents a Brand List.
 * <p/>
 * <p>
 * This class exposes the {@link #setBrandList} and {@link #getBrandList} that can be used to read and write
 * fields of the Brand List record in a bulk file.
 * </p>
 * <p/>
 * <p>
 * For more information, see Brand List at
 * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkBrandList extends SingleRecordBulkEntity {

    private Long accountId;
    
    private BrandList brandList;

    private static final List<BulkMapping<BulkBrandList>> MAPPINGS;

    static {
        List<BulkMapping<BulkBrandList>> m = new ArrayList<BulkMapping<BulkBrandList>>();

        m.add(new SimpleBulkMapping<BulkBrandList, Long>(StringTable.Id,
                new Function<BulkBrandList, Long>() {
                    @Override
                    public Long apply(BulkBrandList c) {
                        return c.getBrandList().getId();
                    }
                },
                new BiConsumer<String, BulkBrandList>() {
                    @Override
                    public void accept(String v, BulkBrandList c) {
                        c.getBrandList().setId(StringExtensions.nullOrLong(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkBrandList, Long>(StringTable.ParentId,
                new Function<BulkBrandList, Long>() {
                    @Override
                    public Long apply(BulkBrandList c) {
                        return c.getAccountId();
                    }
                },
                new BiConsumer<String, BulkBrandList>() {
                    @Override
                    public void accept(String v, BulkBrandList c) {
                        c.setAccountId(StringExtensions.nullOrLong(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkBrandList, String>(StringTable.Name,
                new Function<BulkBrandList, String>() {
                    @Override
                    public String apply(BulkBrandList c) {
                        return c.getBrandList().getName();
                    }
                },
                new BiConsumer<String, BulkBrandList>() {
                    @Override
                    public void accept(String v, BulkBrandList c) {
                        c.getBrandList().setName(v);
                    }
                }
        ));
        

        
   
        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
    	BrandList BrandList = new BrandList();
        this.setBrandList(BrandList);
        
        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getBrandList(), "BrandList");

        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }
    
    public BrandList getBrandList() {
		return brandList;
	}
	
	public void setBrandList(BrandList brandList) {
		this.brandList = brandList;
	}
	
	public Long getAccountId() {
		return accountId;
	}
	
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}
	
}
