package com.microsoft.bingads.v11.api.test.entities.ad_extension.app;

import com.microsoft.bingads.v11.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAppAdExtension;
import com.microsoft.bingads.v11.campaignmanagement.AppAdExtension;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;

import java.util.Map;

public abstract class BulkAppAdExtensionTest extends BulkEntityTest<BulkAppAdExtension> {

    @Override
    protected void onEntityCreation(BulkAppAdExtension entity) {
        entity.setAppAdExtension(new AppAdExtension());
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
