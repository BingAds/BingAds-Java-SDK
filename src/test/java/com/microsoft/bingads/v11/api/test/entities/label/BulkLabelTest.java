package com.microsoft.bingads.v11.api.test.entities.label;

import com.microsoft.bingads.v11.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v11.bulk.entities.BulkLabel;
import com.microsoft.bingads.v11.bulk.entities.Status;
import com.microsoft.bingads.v11.campaignmanagement.AdGroupStatus;
import com.microsoft.bingads.v11.campaignmanagement.Label;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;

import java.util.Map;

public abstract class BulkLabelTest extends BulkEntityTest<BulkLabel> {

    @Override
    protected void onEntityCreation(BulkLabel entity) {
        entity.setLabel(new Label());
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
                                                 String expectedRowValue, TProperty propertyValue,
                                                 BiConsumer<BulkLabel, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkLabel>() {
            @Override
            public BulkLabel get() {
                return new BulkLabel();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkLabel, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkLabel>() {
            @Override
            public BulkLabel get() {
                return new BulkLabel();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkLabel, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkLabel>() {
            @Override
            public BulkLabel get() {
                return new BulkLabel();
            }
        });
    }
}
