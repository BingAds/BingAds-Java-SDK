package com.microsoft.bingads.v11.api.test.entities.ad_extension.review;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v11.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupReviewAdExtension;

public abstract class BulkAdGroupReviewAdExtensionTest extends BulkEntityTest<BulkAdGroupReviewAdExtension> {
    @Override
    protected void onEntityCreation(BulkAdGroupReviewAdExtension entity) {
    }

    @Override
    protected <TProperty> void testWriteProperty(
            String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkAdGroupReviewAdExtension, TProperty> setFunc
    ) {
        this.testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkAdGroupReviewAdExtension>() {
            @Override
            public BulkAdGroupReviewAdExtension get() {
                return new BulkAdGroupReviewAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<BulkAdGroupReviewAdExtension, TProperty> actualValueFunc
    ) {
        this.testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkAdGroupReviewAdExtension>() {
            @Override
            public BulkAdGroupReviewAdExtension get() {
                return new BulkAdGroupReviewAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<BulkAdGroupReviewAdExtension, TProperty> actualValueFunc
    ) {
        this.testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkAdGroupReviewAdExtension>() {
            @Override
            public BulkAdGroupReviewAdExtension get() {
                return new BulkAdGroupReviewAdExtension();
            }
        });
    }
}
