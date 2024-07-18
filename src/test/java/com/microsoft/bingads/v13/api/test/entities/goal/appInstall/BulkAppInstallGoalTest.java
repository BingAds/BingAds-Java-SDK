package com.microsoft.bingads.v13.api.test.entities.goal.appInstall;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.api.test.entities.EqualityComparerWithDescription;
import com.microsoft.bingads.v13.bulk.entities.BulkAppInstallGoal;
import com.microsoft.bingads.v13.campaignmanagement.AppInstallGoal;

public abstract class BulkAppInstallGoalTest extends BulkEntityTest<BulkAppInstallGoal> {

    @Override
    protected void onEntityCreation(BulkAppInstallGoal entity) {
        entity.setAppInstallGoal(new AppInstallGoal());
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkAppInstallGoal, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkAppInstallGoal>() {
            @Override
            public BulkAppInstallGoal get() {
                return new BulkAppInstallGoal();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkAppInstallGoal, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkAppInstallGoal>() {
            @Override
            public BulkAppInstallGoal get() {
                return new BulkAppInstallGoal();
            }
        });
    }
    
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkAppInstallGoal, TProperty> actualValueFunc, EqualityComparerWithDescription<TProperty> comparer) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkAppInstallGoal>() {
            @Override
            public BulkAppInstallGoal get() {
                return new BulkAppInstallGoal();
            }
        }, comparer);
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkAppInstallGoal, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkAppInstallGoal>() {
            @Override
            public BulkAppInstallGoal get() {
                return new BulkAppInstallGoal();
            }
        });
    }
        
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkAppInstallGoal, TProperty> actualValueFunc, EqualityComparerWithDescription<TProperty> comparer) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkAppInstallGoal>() {
            @Override
            public BulkAppInstallGoal get() {
                return new BulkAppInstallGoal();
            }
        }, comparer);
    }
}
