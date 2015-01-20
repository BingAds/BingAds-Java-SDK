package com.microsoft.bingads.api.test.entities.ads.text;

import java.util.Map;
import com.microsoft.bingads.internal.functionalInterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalInterfaces.Function;
import com.microsoft.bingads.internal.functionalInterfaces.Supplier;

import com.microsoft.bingads.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.bulk.entities.BulkTextAd;
import com.microsoft.bingads.campaignmanagement.TextAd;

public abstract class BulkTextAdTest extends BulkEntityTest<BulkTextAd> {

    @Override
    protected void onEntityCreation(BulkTextAd entity) {
        entity.setTextAd(new TextAd());
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkTextAd, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkTextAd>() {
            @Override
            public BulkTextAd get() {
                return new BulkTextAd();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkTextAd, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkTextAd>() {
            @Override
            public BulkTextAd get() {
                return new BulkTextAd();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkTextAd, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkTextAd>() {
            @Override
            public BulkTextAd get() {
                return new BulkTextAd();
            }
        });
    }
}
