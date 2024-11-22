package com.microsoft.bingads.v13.api.test.entities.asset_group_url_target;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.api.test.entities.EqualityComparerWithDescription;
import com.microsoft.bingads.v13.bulk.entities.BulkAssetGroupUrlTarget;
import com.microsoft.bingads.v13.campaignmanagement.ProductCondition;
import com.microsoft.bingads.v13.campaignmanagement.ProductPartition;

public abstract class BulkAssetGroupUrlTargetTest extends BulkEntityTest<BulkAssetGroupUrlTarget> {

    @Override
    protected void onEntityCreation(BulkAssetGroupUrlTarget entity) {
    }
    
    private BulkAssetGroupUrlTarget CreateEntity()
    {
    	BulkAssetGroupUrlTarget bulkAssetGroupUrlTarget = new BulkAssetGroupUrlTarget();
    	return bulkAssetGroupUrlTarget;
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkAssetGroupUrlTarget, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkAssetGroupUrlTarget>() {
            @Override
            public BulkAssetGroupUrlTarget get() {
                return CreateEntity();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkAssetGroupUrlTarget, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkAssetGroupUrlTarget>() {
            @Override
            public BulkAssetGroupUrlTarget get() {
                return CreateEntity();
            }
        });
    }
    
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkAssetGroupUrlTarget, TProperty> actualValueFunc, EqualityComparerWithDescription<TProperty> comparer) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkAssetGroupUrlTarget>() {
            @Override
            public BulkAssetGroupUrlTarget get() {
                return CreateEntity();
            }
        }, comparer);
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkAssetGroupUrlTarget, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkAssetGroupUrlTarget>() {
            @Override
            public BulkAssetGroupUrlTarget get() {
                return CreateEntity();
            }
        });
    }
        
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkAssetGroupUrlTarget, TProperty> actualValueFunc, EqualityComparerWithDescription<TProperty> comparer) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkAssetGroupUrlTarget>() {
            @Override
            public BulkAssetGroupUrlTarget get() {
                return CreateEntity();
            }
        }, comparer);
    }
}
