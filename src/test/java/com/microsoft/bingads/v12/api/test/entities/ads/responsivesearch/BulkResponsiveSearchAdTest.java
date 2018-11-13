package com.microsoft.bingads.v12.api.test.entities.ads.responsivesearch;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v12.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v12.bulk.entities.BulkResponsiveSearchAd;
import com.microsoft.bingads.v12.campaignmanagement.ResponsiveSearchAd;

public abstract class BulkResponsiveSearchAdTest extends BulkEntityTest<BulkResponsiveSearchAd> {

    @Override
    protected void onEntityCreation(BulkResponsiveSearchAd entity) {
        entity.setResponsiveSearchAd(new ResponsiveSearchAd());
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkResponsiveSearchAd, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkResponsiveSearchAd>() {
            @Override
            public BulkResponsiveSearchAd get() {
                return new BulkResponsiveSearchAd();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkResponsiveSearchAd, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkResponsiveSearchAd>() {
            @Override
            public BulkResponsiveSearchAd get() {
                return new BulkResponsiveSearchAd();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkResponsiveSearchAd, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkResponsiveSearchAd>() {
            @Override
            public BulkResponsiveSearchAd get() {
                return new BulkResponsiveSearchAd();
            }
        });
    }
}
