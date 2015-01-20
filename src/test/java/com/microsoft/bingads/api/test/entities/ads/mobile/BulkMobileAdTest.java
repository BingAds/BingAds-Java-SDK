package com.microsoft.bingads.api.test.entities.ads.mobile;

import java.util.Map;
import com.microsoft.bingads.internal.functionalInterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalInterfaces.Function;
import com.microsoft.bingads.internal.functionalInterfaces.Supplier;

import com.microsoft.bingads.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.bulk.entities.BulkMobileAd;
import com.microsoft.bingads.campaignmanagement.MobileAd;

public abstract class BulkMobileAdTest extends BulkEntityTest<BulkMobileAd> {

    @Override
    protected void onEntityCreation(BulkMobileAd entity) {
        entity.setMobileAd(new MobileAd());
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkMobileAd, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkMobileAd>() {
            @Override
            public BulkMobileAd get() {
                return new BulkMobileAd();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkMobileAd, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkMobileAd>() {
            @Override
            public BulkMobileAd get() {
                return new BulkMobileAd();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkMobileAd, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkMobileAd>() {
            @Override
            public BulkMobileAd get() {
                return new BulkMobileAd();
            }
        });
    }
}
