package com.microsoft.bingads.v13.api.test.entities.ad_extension.flyer;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupFlyerAdExtension;

public abstract class BulkAdGroupFlyerAdExtensionTest extends BulkEntityTest<BulkAdGroupFlyerAdExtension> {
    @Override
    protected void onEntityCreation(BulkAdGroupFlyerAdExtension entity) {
    }

    @Override
    protected <TProperty> void testWriteProperty(
            String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkAdGroupFlyerAdExtension, TProperty> setFunc
    ) {
        this.testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkAdGroupFlyerAdExtension>() {
            @Override
            public BulkAdGroupFlyerAdExtension get() {
                return new BulkAdGroupFlyerAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<BulkAdGroupFlyerAdExtension, TProperty> actualValueFunc
    ) {
        this.testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkAdGroupFlyerAdExtension>() {
            @Override
            public BulkAdGroupFlyerAdExtension get() {
                return new BulkAdGroupFlyerAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<BulkAdGroupFlyerAdExtension, TProperty> actualValueFunc
    ) {
        this.testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkAdGroupFlyerAdExtension>() {
            @Override
            public BulkAdGroupFlyerAdExtension get() {
                return new BulkAdGroupFlyerAdExtension();
            }
        });
    }
}
