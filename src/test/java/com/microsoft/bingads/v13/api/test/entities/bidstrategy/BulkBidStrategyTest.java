package com.microsoft.bingads.v13.api.test.entities.bidstrategy;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.api.test.entities.EqualityComparerWithDescription;
import com.microsoft.bingads.v13.bulk.entities.BulkBidStrategy;
import com.microsoft.bingads.v13.campaignmanagement.BidStrategy;

public abstract class BulkBidStrategyTest extends BulkEntityTest<BulkBidStrategy> {

    @Override
    protected void onEntityCreation(BulkBidStrategy entity) {
        entity.setBidStrategy(new BidStrategy());
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkBidStrategy, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkBidStrategy>() {
            @Override
            public BulkBidStrategy get() {
                return new BulkBidStrategy();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkBidStrategy, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkBidStrategy>() {
            @Override
            public BulkBidStrategy get() {
                return new BulkBidStrategy();
            }
        });
    }
    
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkBidStrategy, TProperty> actualValueFunc, EqualityComparerWithDescription<TProperty> comparer) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkBidStrategy>() {
            @Override
            public BulkBidStrategy get() {
                return new BulkBidStrategy();
            }
        }, comparer);
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkBidStrategy, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkBidStrategy>() {
            @Override
            public BulkBidStrategy get() {
                return new BulkBidStrategy();
            }
        });
    }
}
