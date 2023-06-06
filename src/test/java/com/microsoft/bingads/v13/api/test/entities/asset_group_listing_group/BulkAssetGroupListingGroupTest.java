package com.microsoft.bingads.v13.api.test.entities.asset_group_listing_group;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.api.test.entities.EqualityComparerWithDescription;
import com.microsoft.bingads.v13.bulk.entities.BulkAssetGroupListingGroup;
import com.microsoft.bingads.v13.campaignmanagement.AssetGroupListingGroup;
import com.microsoft.bingads.v13.campaignmanagement.ProductCondition;
import com.microsoft.bingads.v13.campaignmanagement.ProductPartition;

public abstract class BulkAssetGroupListingGroupTest extends BulkEntityTest<BulkAssetGroupListingGroup> {

    @Override
    protected void onEntityCreation(BulkAssetGroupListingGroup entity) {
        AssetGroupListingGroup AssetGroupListingGroup = new AssetGroupListingGroup();
        AssetGroupListingGroup.setId(100L);
        AssetGroupListingGroup.setDimension(new ProductCondition());
        entity.setAssetGroupListingGroup(AssetGroupListingGroup);
    }
    
    private BulkAssetGroupListingGroup CreateEntity()
    {
    	BulkAssetGroupListingGroup bulkAssetGroupListingGroup = new BulkAssetGroupListingGroup();
    	return bulkAssetGroupListingGroup;
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkAssetGroupListingGroup, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkAssetGroupListingGroup>() {
            @Override
            public BulkAssetGroupListingGroup get() {
                return CreateEntity();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkAssetGroupListingGroup, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkAssetGroupListingGroup>() {
            @Override
            public BulkAssetGroupListingGroup get() {
                return CreateEntity();
            }
        });
    }
    
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkAssetGroupListingGroup, TProperty> actualValueFunc, EqualityComparerWithDescription<TProperty> comparer) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkAssetGroupListingGroup>() {
            @Override
            public BulkAssetGroupListingGroup get() {
                return CreateEntity();
            }
        }, comparer);
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkAssetGroupListingGroup, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkAssetGroupListingGroup>() {
            @Override
            public BulkAssetGroupListingGroup get() {
                return CreateEntity();
            }
        });
    }
        
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkAssetGroupListingGroup, TProperty> actualValueFunc, EqualityComparerWithDescription<TProperty> comparer) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkAssetGroupListingGroup>() {
            @Override
            public BulkAssetGroupListingGroup get() {
                return CreateEntity();
            }
        }, comparer);
    }
}
