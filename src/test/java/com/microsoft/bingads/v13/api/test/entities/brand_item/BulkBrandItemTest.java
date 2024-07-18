package com.microsoft.bingads.v13.api.test.entities.brand_item;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.api.test.entities.EqualityComparerWithDescription;
import com.microsoft.bingads.v13.bulk.entities.BulkBrandItem;
import com.microsoft.bingads.v13.campaignmanagement.BrandItem;

public abstract class BulkBrandItemTest extends BulkEntityTest<BulkBrandItem> {

    @Override
    protected void onEntityCreation(BulkBrandItem entity) {
        BrandItem BrandItem = new BrandItem();
        BrandItem.setBrandId(100L);
        entity.setBrandItem(BrandItem);
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkBrandItem, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkBrandItem>() {
            @Override
            public BulkBrandItem get() {
                return new BulkBrandItem();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkBrandItem, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkBrandItem>() {
            @Override
            public BulkBrandItem get() {
                return new BulkBrandItem();
            }
        });
    }
    
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkBrandItem, TProperty> actualValueFunc, EqualityComparerWithDescription<TProperty> comparer) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkBrandItem>() {
            @Override
            public BulkBrandItem get() {
                return new BulkBrandItem();
            }
        }, comparer);
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkBrandItem, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkBrandItem>() {
            @Override
            public BulkBrandItem get() {
                return new BulkBrandItem();
            }
        });
    }
        
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkBrandItem, TProperty> actualValueFunc, EqualityComparerWithDescription<TProperty> comparer) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkBrandItem>() {
            @Override
            public BulkBrandItem get() {
                return new BulkBrandItem();
            }
        }, comparer);
    }
}
