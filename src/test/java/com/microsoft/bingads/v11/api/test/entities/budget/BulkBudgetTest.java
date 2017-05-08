package com.microsoft.bingads.v11.api.test.entities.budget;

import com.microsoft.bingads.v11.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v11.api.test.entities.EqualityComparerWithDescription;
import com.microsoft.bingads.v11.bulk.entities.BulkBudget;
import com.microsoft.bingads.v11.campaignmanagement.Budget;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;

import java.util.Map;

public abstract class BulkBudgetTest extends BulkEntityTest<BulkBudget> {

    @Override
    protected void onEntityCreation(BulkBudget entity) {
        entity.setBudget(new Budget());
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkBudget, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkBudget>() {
            @Override
            public BulkBudget get() {
                return new BulkBudget();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkBudget, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkBudget>() {
            @Override
            public BulkBudget get() {
                return new BulkBudget();
            }
        });
    }
    
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkBudget, TProperty> actualValueFunc, EqualityComparerWithDescription<TProperty> comparer) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkBudget>() {
            @Override
            public BulkBudget get() {
                return new BulkBudget();
            }
        }, comparer);
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkBudget, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkBudget>() {
            @Override
            public BulkBudget get() {
                return new BulkBudget();
            }
        });
    }
}
