package com.microsoft.bingads.v13.api.test.entities.ad_extension.app;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAppAdExtension;
import com.microsoft.bingads.v13.campaignmanagement.AppAdExtension;

public abstract class BulkAppAdExtensionTest extends BulkEntityTest<BulkAppAdExtension> {

    @Override
    protected void onEntityCreation(BulkAppAdExtension entity) {
        AppAdExtension e = new AppAdExtension();
        e.setId(100L);
        entity.setAppAdExtension(e);
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkAppAdExtension, TProperty> setFunc) {
        this.testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkAppAdExtension>() {
            @Override
            public BulkAppAdExtension get() {
                return new BulkAppAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkAppAdExtension, TProperty> actualValueFunc) {
        this.testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkAppAdExtension>() {
            @Override
            public BulkAppAdExtension get() {
                return new BulkAppAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkAppAdExtension, TProperty> actualValueFunc) {
        this.testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkAppAdExtension>() {
            @Override
            public BulkAppAdExtension get() {
                return new BulkAppAdExtension();
            }
        });
    }

}
