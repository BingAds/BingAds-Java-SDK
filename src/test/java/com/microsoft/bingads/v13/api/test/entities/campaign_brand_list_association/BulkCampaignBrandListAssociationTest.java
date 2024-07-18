package com.microsoft.bingads.v13.api.test.entities.campaign_brand_list_association;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.api.test.entities.EqualityComparerWithDescription;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaignBrandListAssociation;

public abstract class BulkCampaignBrandListAssociationTest extends BulkEntityTest<BulkCampaignBrandListAssociation> {

    @Override
    protected void onEntityCreation(BulkCampaignBrandListAssociation entity) {

    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkCampaignBrandListAssociation, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkCampaignBrandListAssociation>() {
            @Override
            public BulkCampaignBrandListAssociation get() {
                return new BulkCampaignBrandListAssociation();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkCampaignBrandListAssociation, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkCampaignBrandListAssociation>() {
            @Override
            public BulkCampaignBrandListAssociation get() {
                return new BulkCampaignBrandListAssociation();
            }
        });
    }
    
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkCampaignBrandListAssociation, TProperty> actualValueFunc, EqualityComparerWithDescription<TProperty> comparer) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkCampaignBrandListAssociation>() {
            @Override
            public BulkCampaignBrandListAssociation get() {
                return new BulkCampaignBrandListAssociation();
            }
        }, comparer);
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkCampaignBrandListAssociation, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkCampaignBrandListAssociation>() {
            @Override
            public BulkCampaignBrandListAssociation get() {
                return new BulkCampaignBrandListAssociation();
            }
        });
    }
        
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkCampaignBrandListAssociation, TProperty> actualValueFunc, EqualityComparerWithDescription<TProperty> comparer) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkCampaignBrandListAssociation>() {
            @Override
            public BulkCampaignBrandListAssociation get() {
                return new BulkCampaignBrandListAssociation();
            }
        }, comparer);
    }
}
