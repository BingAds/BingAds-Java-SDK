package com.microsoft.bingads.v11.api.test.entities.ad_extension.image;

import com.microsoft.bingads.v11.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupImageAdExtension;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;

import java.util.Map;

public abstract class BulkAdGroupImageAdExtensionTest extends BulkEntityTest<BulkAdGroupImageAdExtension> {
    @Override
    protected void onEntityCreation(BulkAdGroupImageAdExtension entity) {
    }

    @Override
    protected <TProperty> void testWriteProperty(
            String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkAdGroupImageAdExtension, TProperty> setFunc
    ) {
        this.testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkAdGroupImageAdExtension>() {
            @Override
            public BulkAdGroupImageAdExtension get() {
                return new BulkAdGroupImageAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<BulkAdGroupImageAdExtension, TProperty> actualValueFunc
    ) {
        this.testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkAdGroupImageAdExtension>() {
            @Override
            public BulkAdGroupImageAdExtension get() {
                return new BulkAdGroupImageAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<BulkAdGroupImageAdExtension, TProperty> actualValueFunc
    ) {
        this.testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkAdGroupImageAdExtension>() {
            @Override
            public BulkAdGroupImageAdExtension get() {
                return new BulkAdGroupImageAdExtension();
            }
        });
    }
}
