package com.microsoft.bingads.v13.api.test.entities.asset_group_search_theme;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.api.test.entities.EqualityComparerWithDescription;
import com.microsoft.bingads.v13.bulk.entities.BulkAssetGroupSearchTheme;
import com.microsoft.bingads.v13.campaignmanagement.AssetGroupSearchTheme;

public abstract class BulkAssetGroupSearchThemeTest extends BulkEntityTest<BulkAssetGroupSearchTheme> {

    @Override
    protected void onEntityCreation(BulkAssetGroupSearchTheme entity) {
        AssetGroupSearchTheme AssetGroupSearchTheme = new AssetGroupSearchTheme();
        AssetGroupSearchTheme.setId(100L);
        entity.setAssetGroupSearchTheme(AssetGroupSearchTheme);
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkAssetGroupSearchTheme, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkAssetGroupSearchTheme>() {
            @Override
            public BulkAssetGroupSearchTheme get() {
                return new BulkAssetGroupSearchTheme();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkAssetGroupSearchTheme, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkAssetGroupSearchTheme>() {
            @Override
            public BulkAssetGroupSearchTheme get() {
                return new BulkAssetGroupSearchTheme();
            }
        });
    }
    
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkAssetGroupSearchTheme, TProperty> actualValueFunc, EqualityComparerWithDescription<TProperty> comparer) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkAssetGroupSearchTheme>() {
            @Override
            public BulkAssetGroupSearchTheme get() {
                return new BulkAssetGroupSearchTheme();
            }
        }, comparer);
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkAssetGroupSearchTheme, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkAssetGroupSearchTheme>() {
            @Override
            public BulkAssetGroupSearchTheme get() {
                return new BulkAssetGroupSearchTheme();
            }
        });
    }
        
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkAssetGroupSearchTheme, TProperty> actualValueFunc, EqualityComparerWithDescription<TProperty> comparer) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkAssetGroupSearchTheme>() {
            @Override
            public BulkAssetGroupSearchTheme get() {
                return new BulkAssetGroupSearchTheme();
            }
        }, comparer);
    }
}
