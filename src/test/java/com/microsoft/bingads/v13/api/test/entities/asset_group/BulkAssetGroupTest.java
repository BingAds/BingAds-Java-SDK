package com.microsoft.bingads.v13.api.test.entities.asset_group;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.api.test.entities.EqualityComparerWithDescription;
import com.microsoft.bingads.v13.bulk.entities.BulkAssetGroup;
import com.microsoft.bingads.v13.campaignmanagement.AssetGroup;

public abstract class BulkAssetGroupTest extends BulkEntityTest<BulkAssetGroup> {

    @Override
    protected void onEntityCreation(BulkAssetGroup entity) {
        AssetGroup AssetGroup = new AssetGroup();
        AssetGroup.setId(100L);
        entity.setAssetGroup(AssetGroup);
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkAssetGroup, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkAssetGroup>() {
            @Override
            public BulkAssetGroup get() {
                return new BulkAssetGroup();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkAssetGroup, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkAssetGroup>() {
            @Override
            public BulkAssetGroup get() {
                return new BulkAssetGroup();
            }
        });
    }
    
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkAssetGroup, TProperty> actualValueFunc, EqualityComparerWithDescription<TProperty> comparer) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkAssetGroup>() {
            @Override
            public BulkAssetGroup get() {
                return new BulkAssetGroup();
            }
        }, comparer);
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkAssetGroup, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkAssetGroup>() {
            @Override
            public BulkAssetGroup get() {
                return new BulkAssetGroup();
            }
        });
    }
        
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkAssetGroup, TProperty> actualValueFunc, EqualityComparerWithDescription<TProperty> comparer) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkAssetGroup>() {
            @Override
            public BulkAssetGroup get() {
                return new BulkAssetGroup();
            }
        }, comparer);
    }
}
