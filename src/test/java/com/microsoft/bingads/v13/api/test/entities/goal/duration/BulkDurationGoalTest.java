package com.microsoft.bingads.v13.api.test.entities.goal.duration;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.api.test.entities.EqualityComparerWithDescription;
import com.microsoft.bingads.v13.bulk.entities.BulkDurationGoal;
import com.microsoft.bingads.v13.campaignmanagement.DurationGoal;

public abstract class BulkDurationGoalTest extends BulkEntityTest<BulkDurationGoal> {

    @Override
    protected void onEntityCreation(BulkDurationGoal entity) {
        entity.setDurationGoal(new DurationGoal());
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkDurationGoal, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkDurationGoal>() {
            @Override
            public BulkDurationGoal get() {
                return new BulkDurationGoal();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkDurationGoal, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkDurationGoal>() {
            @Override
            public BulkDurationGoal get() {
                return new BulkDurationGoal();
            }
        });
    }
    
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkDurationGoal, TProperty> actualValueFunc, EqualityComparerWithDescription<TProperty> comparer) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkDurationGoal>() {
            @Override
            public BulkDurationGoal get() {
                return new BulkDurationGoal();
            }
        }, comparer);
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkDurationGoal, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkDurationGoal>() {
            @Override
            public BulkDurationGoal get() {
                return new BulkDurationGoal();
            }
        });
    }
        
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkDurationGoal, TProperty> actualValueFunc, EqualityComparerWithDescription<TProperty> comparer) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkDurationGoal>() {
            @Override
            public BulkDurationGoal get() {
                return new BulkDurationGoal();
            }
        }, comparer);
    }
}
