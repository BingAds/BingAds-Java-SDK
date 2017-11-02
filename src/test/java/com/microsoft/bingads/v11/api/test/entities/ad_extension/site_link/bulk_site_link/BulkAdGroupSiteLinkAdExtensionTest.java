package com.microsoft.bingads.v11.api.test.entities.ad_extension.site_link.bulk_site_link;

import com.microsoft.bingads.v11.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupSiteLinkAdExtension;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;

import java.util.Map;

public abstract class BulkAdGroupSiteLinkAdExtensionTest extends BulkEntityTest<BulkAdGroupSiteLinkAdExtension> {
    @Override
    protected void onEntityCreation(BulkAdGroupSiteLinkAdExtension entity) {
    }

    @Override
    protected <TProperty> void testWriteProperty(
            String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkAdGroupSiteLinkAdExtension, TProperty> setFunc
    ) {
        this.testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkAdGroupSiteLinkAdExtension>() {
            @Override
            public BulkAdGroupSiteLinkAdExtension get() {
                return new BulkAdGroupSiteLinkAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<BulkAdGroupSiteLinkAdExtension, TProperty> actualValueFunc
    ) {
        this.testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkAdGroupSiteLinkAdExtension>() {
            @Override
            public BulkAdGroupSiteLinkAdExtension get() {
                return new BulkAdGroupSiteLinkAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<BulkAdGroupSiteLinkAdExtension, TProperty> actualValueFunc
    ) {
        this.testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkAdGroupSiteLinkAdExtension>() {
            @Override
            public BulkAdGroupSiteLinkAdExtension get() {
                return new BulkAdGroupSiteLinkAdExtension();
            }
        });
    }
}
