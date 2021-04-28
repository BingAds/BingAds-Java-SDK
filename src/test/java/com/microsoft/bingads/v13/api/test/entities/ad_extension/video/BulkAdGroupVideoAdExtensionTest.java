package com.microsoft.bingads.v13.api.test.entities.ad_extension.video;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupVideoAdExtension;

public abstract class BulkAdGroupVideoAdExtensionTest extends BulkEntityTest<BulkAdGroupVideoAdExtension> {
    @Override
    protected void onEntityCreation(BulkAdGroupVideoAdExtension entity) {
    }

    @Override
    protected <TProperty> void testWriteProperty(
            String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkAdGroupVideoAdExtension, TProperty> setFunc
    ) {
        this.testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkAdGroupVideoAdExtension>() {
            @Override
            public BulkAdGroupVideoAdExtension get() {
                return new BulkAdGroupVideoAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<BulkAdGroupVideoAdExtension, TProperty> actualValueFunc
    ) {
        this.testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkAdGroupVideoAdExtension>() {
            @Override
            public BulkAdGroupVideoAdExtension get() {
                return new BulkAdGroupVideoAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<BulkAdGroupVideoAdExtension, TProperty> actualValueFunc
    ) {
        this.testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkAdGroupVideoAdExtension>() {
            @Override
            public BulkAdGroupVideoAdExtension get() {
                return new BulkAdGroupVideoAdExtension();
            }
        });
    }
}
