package com.microsoft.bingads.v11.api.test.entities.ad_extension.site_link2;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v11.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupSitelink2AdExtension;

import java.util.Map;

public abstract class BulkAdGroupSitelink2AdExtensionTest extends BulkEntityTest<BulkAdGroupSitelink2AdExtension> {
    @Override
    protected void onEntityCreation(BulkAdGroupSitelink2AdExtension entity) {
    }

    @Override
    protected <TProperty> void testWriteProperty(
            String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkAdGroupSitelink2AdExtension, TProperty> setFunc
    ) {
        this.testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkAdGroupSitelink2AdExtension>() {
            @Override
            public BulkAdGroupSitelink2AdExtension get() {
                return new BulkAdGroupSitelink2AdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<BulkAdGroupSitelink2AdExtension, TProperty> actualValueFunc
    ) {
        this.testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkAdGroupSitelink2AdExtension>() {
            @Override
            public BulkAdGroupSitelink2AdExtension get() {
                return new BulkAdGroupSitelink2AdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<BulkAdGroupSitelink2AdExtension, TProperty> actualValueFunc
    ) {
        this.testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkAdGroupSitelink2AdExtension>() {
            @Override
            public BulkAdGroupSitelink2AdExtension get() {
                return new BulkAdGroupSitelink2AdExtension();
            }
        });
    }
}
