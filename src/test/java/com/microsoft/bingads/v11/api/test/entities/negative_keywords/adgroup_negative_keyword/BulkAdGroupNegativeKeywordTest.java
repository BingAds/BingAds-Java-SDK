package com.microsoft.bingads.v11.api.test.entities.negative_keywords.adgroup_negative_keyword;

import com.microsoft.bingads.v11.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupNegativeKeyword;
import com.microsoft.bingads.v11.campaignmanagement.NegativeKeyword;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;

import java.util.Map;

public abstract class BulkAdGroupNegativeKeywordTest extends BulkEntityTest<BulkAdGroupNegativeKeyword> {

    @Override
    protected void onEntityCreation(BulkAdGroupNegativeKeyword entity) {
        entity.setNegativeKeyword(new NegativeKeyword());
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkAdGroupNegativeKeyword, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkAdGroupNegativeKeyword>() {
            @Override
            public BulkAdGroupNegativeKeyword get() {
                return new BulkAdGroupNegativeKeyword();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkAdGroupNegativeKeyword, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkAdGroupNegativeKeyword>() {
            @Override
            public BulkAdGroupNegativeKeyword get() {
                return new BulkAdGroupNegativeKeyword();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkAdGroupNegativeKeyword, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkAdGroupNegativeKeyword>() {
            @Override
            public BulkAdGroupNegativeKeyword get() {
                return new BulkAdGroupNegativeKeyword();
            }
        });
    }
}
