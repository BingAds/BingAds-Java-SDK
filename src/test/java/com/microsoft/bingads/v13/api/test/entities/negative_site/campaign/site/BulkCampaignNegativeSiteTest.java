package com.microsoft.bingads.v13.api.test.entities.negative_site.campaign.site;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaignNegativeSite;

public abstract class BulkCampaignNegativeSiteTest extends BulkEntityTest<BulkCampaignNegativeSite> {

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkCampaignNegativeSite, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkCampaignNegativeSite>() {
            @Override
            public BulkCampaignNegativeSite get() {
                return new BulkCampaignNegativeSite();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkCampaignNegativeSite, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkCampaignNegativeSite>() {
            @Override
            public BulkCampaignNegativeSite get() {
                return new BulkCampaignNegativeSite();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkCampaignNegativeSite, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkCampaignNegativeSite>() {
            @Override
            public BulkCampaignNegativeSite get() {
                return new BulkCampaignNegativeSite();
            }
        });
    }

    @Override
    protected void onEntityCreation(BulkCampaignNegativeSite entity) {

    }

}
