package com.microsoft.bingads.v11.api.test.entities.negative_keywords.negative_keyword_list;

import com.microsoft.bingads.v11.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v11.bulk.entities.BulkNegativeKeywordList;
import com.microsoft.bingads.v11.campaignmanagement.NegativeKeywordList;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;

import java.util.Map;

public abstract class BulkNegativeKeywordListTest extends BulkEntityTest<BulkNegativeKeywordList> {

    @Override
    protected void onEntityCreation(BulkNegativeKeywordList entity) {
        entity.setNegativeKeywordList(new NegativeKeywordList());;
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkNegativeKeywordList, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkNegativeKeywordList>() {
            @Override
            public BulkNegativeKeywordList get() {
                return new BulkNegativeKeywordList();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkNegativeKeywordList, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkNegativeKeywordList>() {
            @Override
            public BulkNegativeKeywordList get() {
                return new BulkNegativeKeywordList();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkNegativeKeywordList, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkNegativeKeywordList>() {
            @Override
            public BulkNegativeKeywordList get() {
                return new BulkNegativeKeywordList();
            }
        });
    }
}
