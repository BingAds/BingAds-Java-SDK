package com.microsoft.bingads.v13.api.test.entities.new_customer_acquisition_goal;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.api.test.entities.EqualityComparerWithDescription;
import com.microsoft.bingads.v13.bulk.entities.BulkNewCustomerAcquisitionGoal;
import com.microsoft.bingads.v13.campaignmanagement.NewCustomerAcquisitionGoal;

public abstract class BulkNewCustomerAcquisitionGoalTest extends BulkEntityTest<BulkNewCustomerAcquisitionGoal> {

    @Override
    protected void onEntityCreation(BulkNewCustomerAcquisitionGoal entity) {
        entity.setNewCustomerAcquisitionGoal(new NewCustomerAcquisitionGoal());
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkNewCustomerAcquisitionGoal, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkNewCustomerAcquisitionGoal>() {
            @Override
            public BulkNewCustomerAcquisitionGoal get() {
                return new BulkNewCustomerAcquisitionGoal();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkNewCustomerAcquisitionGoal, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkNewCustomerAcquisitionGoal>() {
            @Override
            public BulkNewCustomerAcquisitionGoal get() {
                return new BulkNewCustomerAcquisitionGoal();
            }
        });
    }
    
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkNewCustomerAcquisitionGoal, TProperty> actualValueFunc, EqualityComparerWithDescription<TProperty> comparer) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkNewCustomerAcquisitionGoal>() {
            @Override
            public BulkNewCustomerAcquisitionGoal get() {
                return new BulkNewCustomerAcquisitionGoal();
            }
        }, comparer);
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkNewCustomerAcquisitionGoal, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkNewCustomerAcquisitionGoal>() {
            @Override
            public BulkNewCustomerAcquisitionGoal get() {
                return new BulkNewCustomerAcquisitionGoal();
            }
        });
    }
}
