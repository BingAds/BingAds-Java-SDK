package com.microsoft.bingads.v13.api.test.entities.content_placement;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.api.test.entities.EqualityComparerWithDescription;
import com.microsoft.bingads.v13.bulk.entities.BulkContentPlacement;

public abstract class BulkContentPlacementTest extends BulkEntityTest<BulkContentPlacement> {

    @Override
    protected void onEntityCreation(BulkContentPlacement entity) {

    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkContentPlacement, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkContentPlacement>() {
            @Override
            public BulkContentPlacement get() {
                return new BulkContentPlacement();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkContentPlacement, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkContentPlacement>() {
            @Override
            public BulkContentPlacement get() {
                return new BulkContentPlacement();
            }
        });
    }
    
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkContentPlacement, TProperty> actualValueFunc, EqualityComparerWithDescription<TProperty> comparer) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkContentPlacement>() {
            @Override
            public BulkContentPlacement get() {
                return new BulkContentPlacement();
            }
        }, comparer);
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkContentPlacement, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkContentPlacement>() {
            @Override
            public BulkContentPlacement get() {
                return new BulkContentPlacement();
            }
        });
    }
        
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkContentPlacement, TProperty> actualValueFunc, EqualityComparerWithDescription<TProperty> comparer) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkContentPlacement>() {
            @Override
            public BulkContentPlacement get() {
                return new BulkContentPlacement();
            }
        }, comparer);
    }
}
