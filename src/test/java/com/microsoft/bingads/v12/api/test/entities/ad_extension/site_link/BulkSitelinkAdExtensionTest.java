package com.microsoft.bingads.v12.api.test.entities.ad_extension.site_link;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v12.campaignmanagement.SitelinkAdExtension;
import com.microsoft.bingads.v12.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v12.bulk.entities.BulkSitelinkAdExtension;

public abstract class BulkSitelinkAdExtensionTest extends BulkEntityTest<BulkSitelinkAdExtension> {

    @Override
    protected void onEntityCreation(BulkSitelinkAdExtension entity) {
        entity.setSitelinkAdExtension(new SitelinkAdExtension());
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
                                                 String expectedRowValue, TProperty propertyValue,
                                                 BiConsumer<BulkSitelinkAdExtension, TProperty> setFunc) {
        this.testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkSitelinkAdExtension>() {
            @Override
            public BulkSitelinkAdExtension get() {
                return new BulkSitelinkAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkSitelinkAdExtension, TProperty> actualValueFunc) {
        this.testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkSitelinkAdExtension>() {
            @Override
            public BulkSitelinkAdExtension get() {
                return new BulkSitelinkAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkSitelinkAdExtension, TProperty> actualValueFunc) {
        this.testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkSitelinkAdExtension>() {
            @Override
            public BulkSitelinkAdExtension get() {
                return new BulkSitelinkAdExtension();
            }
        });
    }

}
