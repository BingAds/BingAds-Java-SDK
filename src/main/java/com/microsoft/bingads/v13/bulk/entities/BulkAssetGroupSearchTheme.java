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
import com.microsoft.bingads.v13.campaignmanagement.AssetGroupSearchTheme;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;
import com.microsoft.bingads.v13.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * Represents an Asset Group Search Theme.
 * <p/>
 * <p>
 * This class exposes the {@link #setAssetGroupSearchTheme} and {@link #getAssetGroupSearchTheme} that can be used to read and write
 * fields of the Audience Group Asset Group Association record in a bulk file.
 * </p>
 * <p/>
 * <p>
 * For more information, see Asset Group Search Theme at
 * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkAssetGroupSearchTheme extends SingleRecordBulkEntity {
    
    private AssetGroupSearchTheme AssetGroupSearchTheme;
    
    private Long assetGroupId;

    private static final List<BulkMapping<BulkAssetGroupSearchTheme>> MAPPINGS;

    static {
        List<BulkMapping<BulkAssetGroupSearchTheme>> m = new ArrayList<BulkMapping<BulkAssetGroupSearchTheme>>();

        m.add(new SimpleBulkMapping<BulkAssetGroupSearchTheme, Long>(StringTable.Id,
                new Function<BulkAssetGroupSearchTheme, Long>() {
                    @Override
                    public Long apply(BulkAssetGroupSearchTheme c) {
                        return c.getAssetGroupSearchTheme().getId();
                    }
                },
                new BiConsumer<String, BulkAssetGroupSearchTheme>() {
                    @Override
                    public void accept(String v, BulkAssetGroupSearchTheme c) {
                        c.getAssetGroupSearchTheme().setId(StringExtensions.nullOrLong(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAssetGroupSearchTheme, Long>(StringTable.ParentId,
                new Function<BulkAssetGroupSearchTheme, Long>() {
                    @Override
                    public Long apply(BulkAssetGroupSearchTheme c) {
                        return c.getAssetGroupId();
                    }
                },
                new BiConsumer<String, BulkAssetGroupSearchTheme>() {
                    @Override
                    public void accept(String v, BulkAssetGroupSearchTheme c) {
                        c.setAssetGroupId(StringExtensions.nullOrLong(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAssetGroupSearchTheme, String>(StringTable.SearchTheme,
                new Function<BulkAssetGroupSearchTheme, String>() {
                    @Override
                    public String apply(BulkAssetGroupSearchTheme c) {
                        return c.getAssetGroupSearchTheme().getSearchTheme();
                    }
                },
                new BiConsumer<String, BulkAssetGroupSearchTheme>() {
                    @Override
                    public void accept(String v, BulkAssetGroupSearchTheme c) {
                        c.getAssetGroupSearchTheme().setSearchTheme(v);
                    }
                }
        ));
        
        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
    	AssetGroupSearchTheme AssetGroupSearchTheme = new AssetGroupSearchTheme();
        this.setAssetGroupSearchTheme(AssetGroupSearchTheme);
        
        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getAssetGroupSearchTheme(), "AssetGroupSearchTheme");

        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    public AssetGroupSearchTheme getAssetGroupSearchTheme() {
        return AssetGroupSearchTheme;
    }

    public void setAssetGroupSearchTheme(AssetGroupSearchTheme AssetGroupSearchTheme) {
        this.AssetGroupSearchTheme = AssetGroupSearchTheme;
    }
    
    public Long getAssetGroupId() {
		return assetGroupId;
	}
	
	public void setAssetGroupId(Long assetGroupId) {
		this.assetGroupId = assetGroupId;
	}
}
