package com.microsoft.bingads.v13.api.test.entities.negative_keywords.account_content_negative_keyword_list;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAccountContentNegativeKeywordList;
import com.microsoft.bingads.v13.campaignmanagement.AccountContentNegativeKeywordList;

public abstract class BulkAccountContentNegativeKeywordListTest extends BulkEntityTest<BulkAccountContentNegativeKeywordList> {

    @Override
    protected void onEntityCreation(BulkAccountContentNegativeKeywordList entity) {
        entity.setAccountContentNegativeKeywordList(new AccountContentNegativeKeywordList());
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkAccountContentNegativeKeywordList, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkAccountContentNegativeKeywordList>() {
            @Override
            public BulkAccountContentNegativeKeywordList get() {
                return new BulkAccountContentNegativeKeywordList();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkAccountContentNegativeKeywordList, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkAccountContentNegativeKeywordList>() {
            @Override
            public BulkAccountContentNegativeKeywordList get() {
                return new BulkAccountContentNegativeKeywordList();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkAccountContentNegativeKeywordList, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkAccountContentNegativeKeywordList>() {
            @Override
            public BulkAccountContentNegativeKeywordList get() {
                return new BulkAccountContentNegativeKeywordList();
            }
        });
    }
}
