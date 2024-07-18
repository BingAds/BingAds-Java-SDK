package com.microsoft.bingads.v13.api.test.entities.brand_list;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.api.test.entities.EqualityComparerWithDescription;
import com.microsoft.bingads.v13.bulk.entities.BulkBrandList;
import com.microsoft.bingads.v13.campaignmanagement.BrandList;

public abstract class BulkBrandListTest extends BulkEntityTest<BulkBrandList> {

    @Override
    protected void onEntityCreation(BulkBrandList entity) {
        BrandList BrandList = new BrandList();
        BrandList.setId(100L);
        entity.setBrandList(BrandList);
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkBrandList, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkBrandList>() {
            @Override
            public BulkBrandList get() {
                return new BulkBrandList();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkBrandList, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkBrandList>() {
            @Override
            public BulkBrandList get() {
                return new BulkBrandList();
            }
        });
    }
    
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkBrandList, TProperty> actualValueFunc, EqualityComparerWithDescription<TProperty> comparer) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkBrandList>() {
            @Override
            public BulkBrandList get() {
                return new BulkBrandList();
            }
        }, comparer);
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkBrandList, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkBrandList>() {
            @Override
            public BulkBrandList get() {
                return new BulkBrandList();
            }
        });
    }
        
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkBrandList, TProperty> actualValueFunc, EqualityComparerWithDescription<TProperty> comparer) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkBrandList>() {
            @Override
            public BulkBrandList get() {
                return new BulkBrandList();
            }
        }, comparer);
    }
}
