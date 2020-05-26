package com.microsoft.bingads.v13.api.test.entities.campaign_negative_store_criterion;

import java.util.List;
import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaignNegativeStoreCriterion;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfWebpageCondition;
import com.microsoft.bingads.v13.campaignmanagement.NegativeCampaignCriterion;
import com.microsoft.bingads.v13.campaignmanagement.StoreCriterion;
import com.microsoft.bingads.v13.campaignmanagement.WebpageCondition;
import com.microsoft.bingads.v13.campaignmanagement.WebpageConditionOperand;

public abstract class BulkCampaignNegativeStoreCriterionTest extends BulkEntityTest<BulkCampaignNegativeStoreCriterion> {

    private static final String[] CONDITION = {"Category", "PageContent", "PageTitle", "Url"};
    private static final String VALUE_PREFIX = "Test Value ";

    @Override
    protected void onEntityCreation(BulkCampaignNegativeStoreCriterion entity) {
        StoreCriterion criterion = new StoreCriterion();
        criterion.setType("StoreCriterion");

        NegativeCampaignCriterion negativeCampaignCriterion = new NegativeCampaignCriterion();
        negativeCampaignCriterion.setCriterion(criterion);
        negativeCampaignCriterion.setId(100L);
        negativeCampaignCriterion.setType("NegativeCampaignCriterion");

        entity.setNegativeCampaignCriterion(negativeCampaignCriterion);
    }

    @Override
    protected <TProperty> void testWriteProperty(
            String header,
            String expectedRowValue,
            TProperty propertyValue,
            BiConsumer<BulkCampaignNegativeStoreCriterion, TProperty> setFunc
    ) {
        testWriteProperty(
                header,
                expectedRowValue,
                propertyValue,
                setFunc,
                new Supplier<BulkCampaignNegativeStoreCriterion>() {
                    @Override
                    public BulkCampaignNegativeStoreCriterion get() {
                        return new BulkCampaignNegativeStoreCriterion();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<BulkCampaignNegativeStoreCriterion, TProperty> actualValueFunc
    ) {
        testReadProperty(
                header,
                input,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkCampaignNegativeStoreCriterion>() {
                    @Override
                    public BulkCampaignNegativeStoreCriterion get() {
                        return new BulkCampaignNegativeStoreCriterion();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<BulkCampaignNegativeStoreCriterion, TProperty> actualValueFunc
    ) {
        testReadProperty(
                rowValues,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkCampaignNegativeStoreCriterion>() {
                    @Override
                    public BulkCampaignNegativeStoreCriterion get() {
                        return new BulkCampaignNegativeStoreCriterion();
                    }
                }
        );
    }


    private static String[] generateInputArray(int length, String prefix) {
        String[] inputs = new String[length];

        for (int i = 1; i <= inputs.length; i++) {
            inputs[i - 1] = prefix + i;
        }

        return inputs;
    }
    
    private static String[] generateInputArray(int length, String[] prefix) {
        String[] inputs = new String[length];

        for (int i = 1; i <= inputs.length; i++) {
            inputs[i - 1] = prefix[i%4];
        }

        return inputs;
    }

}
