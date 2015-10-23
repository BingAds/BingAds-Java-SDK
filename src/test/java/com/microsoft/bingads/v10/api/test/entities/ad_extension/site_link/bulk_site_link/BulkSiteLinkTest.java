package com.microsoft.bingads.v10.api.test.entities.ad_extension.site_link.bulk_site_link;

import com.microsoft.bingads.v10.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v10.bulk.entities.BulkSiteLink;
import com.microsoft.bingads.v10.campaignmanagement.SiteLink;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;

import java.util.Map;

public abstract class BulkSiteLinkTest extends BulkEntityTest<BulkSiteLink> {

    private static final String CONDITION_PREFIX = "Test Condition ";
    private static final String VALUE_PREFIX = "Test Value ";

    @Override
    protected void onEntityCreation(BulkSiteLink entity) {
        entity.setSiteLink(new SiteLink());
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkSiteLink, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkSiteLink>() {
            @Override
            public BulkSiteLink get() {
                return new BulkSiteLink();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkSiteLink, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkSiteLink>() {
            @Override
            public BulkSiteLink get() {
                return new BulkSiteLink();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkSiteLink, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkSiteLink>() {
            @Override
            public BulkSiteLink get() {
                return new BulkSiteLink();
            }
        });
    }
}
