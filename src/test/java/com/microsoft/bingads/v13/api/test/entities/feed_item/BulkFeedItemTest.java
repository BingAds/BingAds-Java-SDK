package com.microsoft.bingads.v13.api.test.entities.feed_item;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.api.test.entities.EqualityComparerWithDescription;
import com.microsoft.bingads.v13.bulk.entities.BulkFeedItem;

public abstract class BulkFeedItemTest extends BulkEntityTest<BulkFeedItem> {

    @Override
    protected void onEntityCreation(BulkFeedItem entity) {
        entity.setId(100L);
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkFeedItem, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkFeedItem>() {
            @Override
            public BulkFeedItem get() {
                return new BulkFeedItem();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkFeedItem, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkFeedItem>() {
            @Override
            public BulkFeedItem get() {
                return new BulkFeedItem();
            }
        });
    }
    
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkFeedItem, TProperty> actualValueFunc, EqualityComparerWithDescription<TProperty> comparer) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkFeedItem>() {
            @Override
            public BulkFeedItem get() {
                return new BulkFeedItem();
            }
        }, comparer);
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkFeedItem, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkFeedItem>() {
            @Override
            public BulkFeedItem get() {
                return new BulkFeedItem();
            }
        });
    }
}
