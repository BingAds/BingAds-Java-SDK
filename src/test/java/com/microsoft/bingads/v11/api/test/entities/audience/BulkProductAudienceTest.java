package com.microsoft.bingads.v11.api.test.entities.audience;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v11.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v11.api.test.entities.EqualityComparerWithDescription;
import com.microsoft.bingads.v11.bulk.entities.BulkProductAudience;
import com.microsoft.bingads.v11.campaignmanagement.ProductAudience;

public abstract class BulkProductAudienceTest extends BulkEntityTest<BulkProductAudience> {

    @Override
    protected void onEntityCreation(BulkProductAudience entity) {
        entity.setProductAudience(new ProductAudience());
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkProductAudience, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkProductAudience>() {
            @Override
            public BulkProductAudience get() {
                return new BulkProductAudience();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkProductAudience, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkProductAudience>() {
            @Override
            public BulkProductAudience get() {
                return new BulkProductAudience();
            }
        });
    }
    
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkProductAudience, TProperty> actualValueFunc, EqualityComparerWithDescription<TProperty> comparer) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkProductAudience>() {
            @Override
            public BulkProductAudience get() {
                return new BulkProductAudience();
            }
        }, comparer);
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkProductAudience, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkProductAudience>() {
            @Override
            public BulkProductAudience get() {
                return new BulkProductAudience();
            }
        });
    }
        
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkProductAudience, TProperty> actualValueFunc, EqualityComparerWithDescription<TProperty> comparer) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkProductAudience>() {
            @Override
            public BulkProductAudience get() {
                return new BulkProductAudience();
            }
        }, comparer);
    }
}
