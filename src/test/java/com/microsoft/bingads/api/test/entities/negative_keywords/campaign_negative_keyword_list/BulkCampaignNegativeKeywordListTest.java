package com.microsoft.bingads.api.test.entities.negative_keywords.campaign_negative_keyword_list;

import java.util.Map;
import com.microsoft.bingads.internal.functionalInterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalInterfaces.Function;
import com.microsoft.bingads.internal.functionalInterfaces.Supplier;

import com.microsoft.bingads.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.bulk.entities.BulkCampaignNegativeKeywordList;
import com.microsoft.bingads.campaignmanagement.SharedEntityAssociation;

public abstract class BulkCampaignNegativeKeywordListTest extends BulkEntityTest<BulkCampaignNegativeKeywordList> {

    @Override
    protected void onEntityCreation(BulkCampaignNegativeKeywordList entity) {
        entity.setSharedEntityAssociation(new SharedEntityAssociation());;
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkCampaignNegativeKeywordList, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkCampaignNegativeKeywordList>() {
            @Override
            public BulkCampaignNegativeKeywordList get() {
                return new BulkCampaignNegativeKeywordList();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkCampaignNegativeKeywordList, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkCampaignNegativeKeywordList>() {
            @Override
            public BulkCampaignNegativeKeywordList get() {
                return new BulkCampaignNegativeKeywordList();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkCampaignNegativeKeywordList, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkCampaignNegativeKeywordList>() {
            @Override
            public BulkCampaignNegativeKeywordList get() {
                return new BulkCampaignNegativeKeywordList();
            }
        });
    }
}
