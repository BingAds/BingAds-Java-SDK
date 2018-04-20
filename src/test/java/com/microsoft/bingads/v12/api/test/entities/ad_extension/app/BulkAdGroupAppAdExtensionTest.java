package com.microsoft.bingads.v12.api.test.entities.ad_extension.app;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v12.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v12.bulk.entities.BulkAdGroupAppAdExtension;

public abstract class BulkAdGroupAppAdExtensionTest extends BulkEntityTest<BulkAdGroupAppAdExtension> {
    @Override
    protected void onEntityCreation(BulkAdGroupAppAdExtension entity) {
    }

    @Override
    protected <TProperty> void testWriteProperty(
            String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkAdGroupAppAdExtension, TProperty> setFunc
    ) {
        this.testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkAdGroupAppAdExtension>() {
            @Override
            public BulkAdGroupAppAdExtension get() {
                return new BulkAdGroupAppAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<BulkAdGroupAppAdExtension, TProperty> actualValueFunc
    ) {
        this.testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkAdGroupAppAdExtension>() {
            @Override
            public BulkAdGroupAppAdExtension get() {
                return new BulkAdGroupAppAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<BulkAdGroupAppAdExtension, TProperty> actualValueFunc
    ) {
        this.testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkAdGroupAppAdExtension>() {
            @Override
            public BulkAdGroupAppAdExtension get() {
                return new BulkAdGroupAppAdExtension();
            }
        });
    }
}
