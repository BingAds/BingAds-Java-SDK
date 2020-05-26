package com.microsoft.bingads.v13.api.test.entities.ad_extension.promotion;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.bulk.entities.BulkPromotionAdExtension;
import com.microsoft.bingads.v13.campaignmanagement.PromotionAdExtension;

public abstract class BulkPromotionAdExtensionTest extends BulkEntityTest<BulkPromotionAdExtension> {

    @Override
    protected void onEntityCreation(BulkPromotionAdExtension entity) {
        PromotionAdExtension e =  new PromotionAdExtension();
        e.setId(100L);
        entity.setPromotionAdExtension(e);
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkPromotionAdExtension, TProperty> setFunc) {
        this.testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkPromotionAdExtension>() {
            @Override
            public BulkPromotionAdExtension get() {
                return new BulkPromotionAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkPromotionAdExtension, TProperty> actualValueFunc) {
        this.testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkPromotionAdExtension>() {
            @Override
            public BulkPromotionAdExtension get() {
                return new BulkPromotionAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkPromotionAdExtension, TProperty> actualValueFunc) {
        this.testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkPromotionAdExtension>() {
            @Override
            public BulkPromotionAdExtension get() {
                return new BulkPromotionAdExtension();
            }
        });
    }

}
