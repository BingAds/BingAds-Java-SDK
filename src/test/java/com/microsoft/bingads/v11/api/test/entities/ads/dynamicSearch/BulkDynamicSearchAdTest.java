package com.microsoft.bingads.v11.api.test.entities.ads.dynamicSearch;

import com.microsoft.bingads.v11.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v11.bulk.entities.BulkDynamicSearchAd;
import com.microsoft.bingads.v11.campaignmanagement.DynamicSearchAd;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;

import java.util.Map;

public abstract class BulkDynamicSearchAdTest extends BulkEntityTest<BulkDynamicSearchAd> {

    @Override
    protected void onEntityCreation(BulkDynamicSearchAd entity) {
        entity.setDynamicSearchAd(new DynamicSearchAd());
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkDynamicSearchAd, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkDynamicSearchAd>() {
            @Override
            public BulkDynamicSearchAd get() {
                return new BulkDynamicSearchAd();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkDynamicSearchAd, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkDynamicSearchAd>() {
            @Override
            public BulkDynamicSearchAd get() {
                return new BulkDynamicSearchAd();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkDynamicSearchAd, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkDynamicSearchAd>() {
            @Override
            public BulkDynamicSearchAd get() {
                return new BulkDynamicSearchAd();
            }
        });
    }
}
