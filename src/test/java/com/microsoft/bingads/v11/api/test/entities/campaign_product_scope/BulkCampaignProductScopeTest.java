package com.microsoft.bingads.v11.api.test.entities.campaign_product_scope;

import com.microsoft.bingads.v11.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaignProductScope;
import com.microsoft.bingads.v11.campaignmanagement.ArrayOfProductCondition;
import com.microsoft.bingads.v11.campaignmanagement.BiddableCampaignCriterion;
import com.microsoft.bingads.v11.campaignmanagement.CampaignCriterion;
import com.microsoft.bingads.v11.campaignmanagement.ProductCondition;
import com.microsoft.bingads.v11.campaignmanagement.ProductScope;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;

import java.util.List;
import java.util.Map;

public abstract class BulkCampaignProductScopeTest extends BulkEntityTest<BulkCampaignProductScope> {

    private static final String CONDITION_PREFIX = "Test Condition ";
    private static final String VALUE_PREFIX = "Test Value ";

    @Override
    protected void onEntityCreation(BulkCampaignProductScope entity) {
        ProductScope criterion = new ProductScope();
        criterion.setType("ProductScope");

        BiddableCampaignCriterion biddableCampaignCriterion = new BiddableCampaignCriterion();
        biddableCampaignCriterion.setCriterion(criterion);
        biddableCampaignCriterion.setType("BiddableCampaignCriterion");

        entity.setBiddableCampaignCriterion(biddableCampaignCriterion);
    }

    @Override
    protected <TProperty> void testWriteProperty(
            String header,
            String expectedRowValue,
            TProperty propertyValue,
            BiConsumer<BulkCampaignProductScope, TProperty> setFunc
    ) {
        testWriteProperty(
                header,
                expectedRowValue,
                propertyValue,
                setFunc,
                new Supplier<BulkCampaignProductScope>() {
                    @Override
                    public BulkCampaignProductScope get() {
                        return new BulkCampaignProductScope();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<BulkCampaignProductScope, TProperty> actualValueFunc
    ) {
        testReadProperty(
                header,
                input,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkCampaignProductScope>() {
                    @Override
                    public BulkCampaignProductScope get() {
                        return new BulkCampaignProductScope();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<BulkCampaignProductScope, TProperty> actualValueFunc
    ) {
        testReadProperty(
                rowValues,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkCampaignProductScope>() {
                    @Override
                    public BulkCampaignProductScope get() {
                        return new BulkCampaignProductScope();
                    }
                }
        );
    }

    private static ArrayOfProductCondition generateProductConditionArray(int length) {
        ArrayOfProductCondition arrayProductConditions = new ArrayOfProductCondition();
        List<ProductCondition> productConditions = arrayProductConditions.getProductConditions();

        for (int i = 1; i <= length; i++) {
            ProductCondition productCondition = new ProductCondition();
            productCondition.setAttribute(VALUE_PREFIX + i);
            productCondition.setOperand(CONDITION_PREFIX + i);
            productConditions.add(productCondition);
        }

        return arrayProductConditions;
    }

    private static String[] generateInputArray(int length, String prefix) {
        String[] inputs = new String[length];

        for (int i = 1; i <= inputs.length; i++) {
            inputs[i - 1] = prefix + i;
        }

        return inputs;
    }

    protected static Object[] generateTestData(int lengthProductCondition, int lengthConditions, int lengthValues) {
        ArrayOfProductCondition productConditions = generateProductConditionArray(lengthProductCondition);
        String[] conditions = generateInputArray(lengthConditions, CONDITION_PREFIX);
        String[] values = generateInputArray(lengthValues, VALUE_PREFIX);

        return new Object[]{null, productConditions, conditions, values};
    }
}
