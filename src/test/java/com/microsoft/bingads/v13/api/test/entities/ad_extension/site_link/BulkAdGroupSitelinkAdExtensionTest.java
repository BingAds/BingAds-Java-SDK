package com.microsoft.bingads.v13.api.test.entities.ad_extension.site_link;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupSitelinkAdExtension;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;

public abstract class BulkAdGroupSitelinkAdExtensionTest extends BulkEntityTest<BulkAdGroupSitelinkAdExtension> {
    @Override
    protected void onEntityCreation(BulkAdGroupSitelinkAdExtension entity) {
    }

    @Override
    protected <TProperty> void testWriteProperty(
            String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkAdGroupSitelinkAdExtension, TProperty> setFunc
    ) {
        this.testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkAdGroupSitelinkAdExtension>() {
            @Override
            public BulkAdGroupSitelinkAdExtension get() {
                return new BulkAdGroupSitelinkAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<BulkAdGroupSitelinkAdExtension, TProperty> actualValueFunc
    ) {
        this.testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkAdGroupSitelinkAdExtension>() {
            @Override
            public BulkAdGroupSitelinkAdExtension get() {
                return new BulkAdGroupSitelinkAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<BulkAdGroupSitelinkAdExtension, TProperty> actualValueFunc
    ) {
        this.testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkAdGroupSitelinkAdExtension>() {
            @Override
            public BulkAdGroupSitelinkAdExtension get() {
                return new BulkAdGroupSitelinkAdExtension();
            }
        });
    }
}
