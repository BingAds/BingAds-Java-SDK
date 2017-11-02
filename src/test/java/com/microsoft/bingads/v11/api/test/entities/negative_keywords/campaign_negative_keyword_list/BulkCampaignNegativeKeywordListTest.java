package com.microsoft.bingads.v11.api.test.entities.negative_keywords.campaign_negative_keyword_list;

import com.microsoft.bingads.v11.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaignNegativeKeywordList;
import com.microsoft.bingads.v11.campaignmanagement.SharedEntityAssociation;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;

import java.util.Map;

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
