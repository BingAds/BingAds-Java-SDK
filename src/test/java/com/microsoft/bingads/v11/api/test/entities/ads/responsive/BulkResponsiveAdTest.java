package com.microsoft.bingads.v11.api.test.entities.ads.responsive;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v11.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v11.bulk.entities.BulkResponsiveAd;
import com.microsoft.bingads.v11.campaignmanagement.ResponsiveAd;

public abstract class BulkResponsiveAdTest extends BulkEntityTest<BulkResponsiveAd> {

    @Override
    protected void onEntityCreation(BulkResponsiveAd entity) {
        entity.setResponsiveAd(new ResponsiveAd());
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkResponsiveAd, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkResponsiveAd>() {
            @Override
            public BulkResponsiveAd get() {
                return new BulkResponsiveAd();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkResponsiveAd, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkResponsiveAd>() {
            @Override
            public BulkResponsiveAd get() {
                return new BulkResponsiveAd();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkResponsiveAd, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkResponsiveAd>() {
            @Override
            public BulkResponsiveAd get() {
                return new BulkResponsiveAd();
            }
        });
    }
}
