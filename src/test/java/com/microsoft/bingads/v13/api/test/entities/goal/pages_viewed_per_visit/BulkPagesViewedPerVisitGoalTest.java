package com.microsoft.bingads.v13.api.test.entities.goal.pages_viewed_per_visit;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.api.test.entities.EqualityComparerWithDescription;
import com.microsoft.bingads.v13.bulk.entities.BulkPagesViewedPerVisitGoal;
import com.microsoft.bingads.v13.campaignmanagement.PagesViewedPerVisitGoal;

public abstract class BulkPagesViewedPerVisitGoalTest extends BulkEntityTest<BulkPagesViewedPerVisitGoal> {

    @Override
    protected void onEntityCreation(BulkPagesViewedPerVisitGoal entity) {
        entity.setPagesViewedPerVisitGoal(new PagesViewedPerVisitGoal());
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkPagesViewedPerVisitGoal, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkPagesViewedPerVisitGoal>() {
            @Override
            public BulkPagesViewedPerVisitGoal get() {
                return new BulkPagesViewedPerVisitGoal();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkPagesViewedPerVisitGoal, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkPagesViewedPerVisitGoal>() {
            @Override
            public BulkPagesViewedPerVisitGoal get() {
                return new BulkPagesViewedPerVisitGoal();
            }
        });
    }
    
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkPagesViewedPerVisitGoal, TProperty> actualValueFunc, EqualityComparerWithDescription<TProperty> comparer) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkPagesViewedPerVisitGoal>() {
            @Override
            public BulkPagesViewedPerVisitGoal get() {
                return new BulkPagesViewedPerVisitGoal();
            }
        }, comparer);
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkPagesViewedPerVisitGoal, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkPagesViewedPerVisitGoal>() {
            @Override
            public BulkPagesViewedPerVisitGoal get() {
                return new BulkPagesViewedPerVisitGoal();
            }
        });
    }
        
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkPagesViewedPerVisitGoal, TProperty> actualValueFunc, EqualityComparerWithDescription<TProperty> comparer) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkPagesViewedPerVisitGoal>() {
            @Override
            public BulkPagesViewedPerVisitGoal get() {
                return new BulkPagesViewedPerVisitGoal();
            }
        }, comparer);
    }
}
