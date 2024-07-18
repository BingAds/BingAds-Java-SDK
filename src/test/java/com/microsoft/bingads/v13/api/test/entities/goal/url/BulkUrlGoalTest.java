package com.microsoft.bingads.v13.api.test.entities.goal.url;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.api.test.entities.EqualityComparerWithDescription;
import com.microsoft.bingads.v13.bulk.entities.BulkUrlGoal;
import com.microsoft.bingads.v13.campaignmanagement.UrlGoal;

public abstract class BulkUrlGoalTest extends BulkEntityTest<BulkUrlGoal> {

    @Override
    protected void onEntityCreation(BulkUrlGoal entity) {
        entity.setUrlGoal(new UrlGoal());
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkUrlGoal, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkUrlGoal>() {
            @Override
            public BulkUrlGoal get() {
                return new BulkUrlGoal();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkUrlGoal, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkUrlGoal>() {
            @Override
            public BulkUrlGoal get() {
                return new BulkUrlGoal();
            }
        });
    }
    
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkUrlGoal, TProperty> actualValueFunc, EqualityComparerWithDescription<TProperty> comparer) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkUrlGoal>() {
            @Override
            public BulkUrlGoal get() {
                return new BulkUrlGoal();
            }
        }, comparer);
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkUrlGoal, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkUrlGoal>() {
            @Override
            public BulkUrlGoal get() {
                return new BulkUrlGoal();
            }
        });
    }
        
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkUrlGoal, TProperty> actualValueFunc, EqualityComparerWithDescription<TProperty> comparer) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkUrlGoal>() {
            @Override
            public BulkUrlGoal get() {
                return new BulkUrlGoal();
            }
        }, comparer);
    }
}
