package com.microsoft.bingads.v13.api.test.entities.negative_keywords.account_negative_keyword_list;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAccountNegativeKeywordList;
import com.microsoft.bingads.v13.campaignmanagement.AccountNegativeKeywordList;

public abstract class BulkAccountNegativeKeywordListTest extends BulkEntityTest<BulkAccountNegativeKeywordList> {

    @Override
    protected void onEntityCreation(BulkAccountNegativeKeywordList entity) {
        entity.setAccountNegativeKeywordList(new AccountNegativeKeywordList());;
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkAccountNegativeKeywordList, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkAccountNegativeKeywordList>() {
            @Override
            public BulkAccountNegativeKeywordList get() {
                return new BulkAccountNegativeKeywordList();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkAccountNegativeKeywordList, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkAccountNegativeKeywordList>() {
            @Override
            public BulkAccountNegativeKeywordList get() {
                return new BulkAccountNegativeKeywordList();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkAccountNegativeKeywordList, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkAccountNegativeKeywordList>() {
            @Override
            public BulkAccountNegativeKeywordList get() {
                return new BulkAccountNegativeKeywordList();
            }
        });
    }
}
