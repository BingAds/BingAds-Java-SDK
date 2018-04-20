package com.microsoft.bingads.v11.api.test.entities.ad_extension.review;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v11.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaignReviewAdExtension;

public abstract class BulkCampaignReviewAdExtensionTest extends BulkEntityTest<BulkCampaignReviewAdExtension> {
    @Override
    protected void onEntityCreation(BulkCampaignReviewAdExtension entity) {
    }

    @Override
    protected <TProperty> void testWriteProperty(
            String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkCampaignReviewAdExtension, TProperty> setFunc
    ) {
        this.testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkCampaignReviewAdExtension>() {
            @Override
            public BulkCampaignReviewAdExtension get() {
                return new BulkCampaignReviewAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<BulkCampaignReviewAdExtension, TProperty> actualValueFunc
    ) {
        this.testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkCampaignReviewAdExtension>() {
            @Override
            public BulkCampaignReviewAdExtension get() {
                return new BulkCampaignReviewAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<BulkCampaignReviewAdExtension, TProperty> actualValueFunc
    ) {
        this.testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkCampaignReviewAdExtension>() {
            @Override
            public BulkCampaignReviewAdExtension get() {
                return new BulkCampaignReviewAdExtension();
            }
        });
    }
}
