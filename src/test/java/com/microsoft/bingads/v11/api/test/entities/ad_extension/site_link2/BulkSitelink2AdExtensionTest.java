package com.microsoft.bingads.v11.api.test.entities.ad_extension.site_link2;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v11.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v11.bulk.entities.BulkSitelink2AdExtension;
import com.microsoft.bingads.v11.campaignmanagement.Sitelink2AdExtension;

import java.util.Map;

public abstract class BulkSitelink2AdExtensionTest extends BulkEntityTest<BulkSitelink2AdExtension> {

    @Override
    protected void onEntityCreation(BulkSitelink2AdExtension entity) {
        entity.setSitelink2AdExtension(new Sitelink2AdExtension());
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
                                                 String expectedRowValue, TProperty propertyValue,
                                                 BiConsumer<BulkSitelink2AdExtension, TProperty> setFunc) {
        this.testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkSitelink2AdExtension>() {
            @Override
            public BulkSitelink2AdExtension get() {
                return new BulkSitelink2AdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkSitelink2AdExtension, TProperty> actualValueFunc) {
        this.testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkSitelink2AdExtension>() {
            @Override
            public BulkSitelink2AdExtension get() {
                return new BulkSitelink2AdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkSitelink2AdExtension, TProperty> actualValueFunc) {
        this.testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkSitelink2AdExtension>() {
            @Override
            public BulkSitelink2AdExtension get() {
                return new BulkSitelink2AdExtension();
            }
        });
    }

}
