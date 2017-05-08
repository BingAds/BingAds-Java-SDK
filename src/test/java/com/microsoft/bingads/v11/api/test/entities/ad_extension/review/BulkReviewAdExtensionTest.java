package com.microsoft.bingads.v11.api.test.entities.ad_extension.review;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v11.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v11.bulk.entities.BulkReviewAdExtension;
import com.microsoft.bingads.v11.campaignmanagement.ReviewAdExtension;

import java.util.Map;

public abstract class BulkReviewAdExtensionTest extends BulkEntityTest<BulkReviewAdExtension> {

    @Override
    protected void onEntityCreation(BulkReviewAdExtension entity) {
        entity.setReviewAdExtension(new ReviewAdExtension());
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
                                                 String expectedRowValue, TProperty propertyValue,
                                                 BiConsumer<BulkReviewAdExtension, TProperty> setFunc) {
        this.testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkReviewAdExtension>() {
            @Override
            public BulkReviewAdExtension get() {
                return new BulkReviewAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkReviewAdExtension, TProperty> actualValueFunc) {
        this.testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkReviewAdExtension>() {
            @Override
            public BulkReviewAdExtension get() {
                return new BulkReviewAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkReviewAdExtension, TProperty> actualValueFunc) {
        this.testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkReviewAdExtension>() {
            @Override
            public BulkReviewAdExtension get() {
                return new BulkReviewAdExtension();
            }
        });
    }

}
