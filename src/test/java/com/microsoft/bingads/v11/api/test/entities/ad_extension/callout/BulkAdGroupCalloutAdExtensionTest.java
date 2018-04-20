package com.microsoft.bingads.v11.api.test.entities.ad_extension.callout;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v11.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupCalloutAdExtension;

public abstract class BulkAdGroupCalloutAdExtensionTest extends BulkEntityTest<BulkAdGroupCalloutAdExtension> {
    @Override
    protected void onEntityCreation(BulkAdGroupCalloutAdExtension entity) {
    }

    @Override
    protected <TProperty> void testWriteProperty(
            String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkAdGroupCalloutAdExtension, TProperty> setFunc
    ) {
        this.testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkAdGroupCalloutAdExtension>() {
            @Override
            public BulkAdGroupCalloutAdExtension get() {
                return new BulkAdGroupCalloutAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<BulkAdGroupCalloutAdExtension, TProperty> actualValueFunc
    ) {
        this.testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkAdGroupCalloutAdExtension>() {
            @Override
            public BulkAdGroupCalloutAdExtension get() {
                return new BulkAdGroupCalloutAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<BulkAdGroupCalloutAdExtension, TProperty> actualValueFunc
    ) {
        this.testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkAdGroupCalloutAdExtension>() {
            @Override
            public BulkAdGroupCalloutAdExtension get() {
                return new BulkAdGroupCalloutAdExtension();
            }
        });
    }
}
