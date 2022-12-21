package com.microsoft.bingads.v13.api.test.entities.online_conversion_adjustment;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.bulk.entities.BulkOnlineConversionAdjustment;
import com.microsoft.bingads.v13.campaignmanagement.OnlineConversionAdjustment;

public abstract class BulkOnlineConversionAdjustmentTest extends BulkEntityTest<BulkOnlineConversionAdjustment> {

    @Override
    protected void onEntityCreation(BulkOnlineConversionAdjustment entity) {
        entity.setOnlineConversionAdjustment(new OnlineConversionAdjustment());
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
                                                 String expectedRowValue, TProperty propertyValue,
                                                 BiConsumer<BulkOnlineConversionAdjustment, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkOnlineConversionAdjustment>() {
            @Override
            public BulkOnlineConversionAdjustment get() {
                return new BulkOnlineConversionAdjustment();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkOnlineConversionAdjustment, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkOnlineConversionAdjustment>() {
            @Override
            public BulkOnlineConversionAdjustment get() {
                return new BulkOnlineConversionAdjustment();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkOnlineConversionAdjustment, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkOnlineConversionAdjustment>() {
            @Override
            public BulkOnlineConversionAdjustment get() {
                return new BulkOnlineConversionAdjustment();
            }
        });
    }
}
