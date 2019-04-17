package com.microsoft.bingads.v13.api.test.entities.offline_conversion;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.bulk.entities.BulkOfflineConversion;
import com.microsoft.bingads.v13.campaignmanagement.OfflineConversion;

public abstract class BulkOfflineConversionTest extends BulkEntityTest<BulkOfflineConversion> {

    @Override
    protected void onEntityCreation(BulkOfflineConversion entity) {
        entity.setOfflineConversion(new OfflineConversion());
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
                                                 String expectedRowValue, TProperty propertyValue,
                                                 BiConsumer<BulkOfflineConversion, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkOfflineConversion>() {
            @Override
            public BulkOfflineConversion get() {
                return new BulkOfflineConversion();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkOfflineConversion, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkOfflineConversion>() {
            @Override
            public BulkOfflineConversion get() {
                return new BulkOfflineConversion();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkOfflineConversion, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkOfflineConversion>() {
            @Override
            public BulkOfflineConversion get() {
                return new BulkOfflineConversion();
            }
        });
    }
}
