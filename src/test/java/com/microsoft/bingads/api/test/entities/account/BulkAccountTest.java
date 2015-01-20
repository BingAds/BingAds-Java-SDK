package com.microsoft.bingads.api.test.entities.account;

import java.util.Map;
import com.microsoft.bingads.internal.functionalInterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalInterfaces.Function;
import com.microsoft.bingads.internal.functionalInterfaces.Supplier;

import com.microsoft.bingads.bulk.entities.BulkAccount;
import com.microsoft.bingads.customermanagement.Account;
import com.microsoft.bingads.api.test.entities.BulkEntityTest;

public abstract class BulkAccountTest extends BulkEntityTest<BulkAccount> {

    @Override
    protected void onEntityCreation(BulkAccount entity) {
        entity.setAccount(new Account());
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkAccount, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkAccount>() {
            @Override
            public BulkAccount get() {
                return new BulkAccount();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkAccount, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkAccount>() {
            @Override
            public BulkAccount get() {
                return new BulkAccount();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkAccount, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkAccount>() {
            @Override
            public BulkAccount get() {
                return new BulkAccount();
            }
        });
    }
}
