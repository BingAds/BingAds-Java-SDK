package com.microsoft.bingads.v13.api.test.entities.ad_extension.disclaimer;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.bulk.entities.BulkDisclaimerAdExtension;
import com.microsoft.bingads.v13.campaignmanagement.DisclaimerAdExtension;

public abstract class BulkDisclaimerAdExtensionTest extends BulkEntityTest<BulkDisclaimerAdExtension> {

    @Override
    protected void onEntityCreation(BulkDisclaimerAdExtension entity) {
        DisclaimerAdExtension e =  new DisclaimerAdExtension();
        e.setId(100L);
        entity.setDisclaimerAdExtension(e);
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkDisclaimerAdExtension, TProperty> setFunc) {
        this.testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkDisclaimerAdExtension>() {
            @Override
            public BulkDisclaimerAdExtension get() {
                return new BulkDisclaimerAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkDisclaimerAdExtension, TProperty> actualValueFunc) {
        this.testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkDisclaimerAdExtension>() {
            @Override
            public BulkDisclaimerAdExtension get() {
                return new BulkDisclaimerAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkDisclaimerAdExtension, TProperty> actualValueFunc) {
        this.testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkDisclaimerAdExtension>() {
            @Override
            public BulkDisclaimerAdExtension get() {
                return new BulkDisclaimerAdExtension();
            }
        });
    }

}
