package com.microsoft.bingads.v13.api.test.entities.combined_list;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.api.test.entities.EqualityComparerWithDescription;
import com.microsoft.bingads.v13.bulk.entities.BulkCombinedList;
import com.microsoft.bingads.v13.campaignmanagement.CombinedList;

public abstract class BulkCombinedListTest extends BulkEntityTest<BulkCombinedList> {

	@Override
    protected void onEntityCreation(BulkCombinedList entity) {
        entity.setCombinedList(new CombinedList());
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkCombinedList, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkCombinedList>() {
            @Override
            public BulkCombinedList get() {
                return new BulkCombinedList();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkCombinedList, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkCombinedList>() {
            @Override
            public BulkCombinedList get() {
                return new BulkCombinedList();
            }
        });
    }
    
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkCombinedList, TProperty> actualValueFunc, EqualityComparerWithDescription<TProperty> comparer) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkCombinedList>() {
            @Override
            public BulkCombinedList get() {
                return new BulkCombinedList();
            }
        }, comparer);
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkCombinedList, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkCombinedList>() {
            @Override
            public BulkCombinedList get() {
                return new BulkCombinedList();
            }
        });
    }
}
